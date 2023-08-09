package com.example.quanlynhansu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class Database extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="qlns_list";
    // bảng nhân viên
    public static final String TblNV = "employee";
    public static final String ID_NV = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_PHONE_NUMBER = "phone_number";
    public static final String COLUMN_POSITION = "position";
    public static final String COLUMN_PHOTO ="photo";
    public static final String COLUMN_SALARY = "salary";
    public static final String COLUMN_START_DATE = "start_date";
    //Bảng phòng ban
    public static final String TblPB = "department";
    public static final String ID_PB = "id";
    public static final String NAME_PB = "department_name";
    public static final String DESCRIPTION = "description";
    //Bảng lương
    public static final String TblLuong = "salary";
    public static final String ID_Luong = "id";
    public static final String ID_nv = "employee_id";
    public static final String COLUMN_MONTH = "month";
    public static final String COLUMN_YEAR = "year";
    public static final String COLUMN_WORKING_DAYS = "working_days";
    public static final String COLUMN_BASE_SALARY = "base_salary";
    public static final String COLUMN_TOTAL_SALARY = "total_salary";
    //Bảng accout
    public static final String Tbl_Accout = "account";
    public static final String ID_Accout = "id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_ACCESS_LEVEL = "access_level";
    private Context context;
    public Database(Context context) {
        super(context, DATABASE_NAME,null, 1); //tạo csdl
        Log.d("Database", "Database: ");
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Bảng Nhân viên
        String CREATE_TABLE_EMPLOYEE = "CREATE TABLE " +
                TblNV + "(" +
                ID_NV + " INTEGER PRIMARY KEY," +
                COLUMN_NAME + " TEXT," +
                //xóa tuổi
                COLUMN_AGE + " INTEGER," +
                COLUMN_GENDER + " TEXT," +
                COLUMN_ADDRESS + " TEXT," +
                COLUMN_PHONE_NUMBER + " INTEGER," +
                COLUMN_PHOTO + " TEXT," +
                COLUMN_POSITION + " INTEGER," +
                COLUMN_SALARY + " INTEGER," +
                COLUMN_START_DATE + " TEXT" +
                ")";
        // BẢNG PHÒNG BAN
        String CREATE_TABLE_DEPARTMENT = "CREATE TABLE " +
                TblPB + "(" +
                ID_PB + " INTEGER PRIMARY KEY," +
                NAME_PB + " TEXT," +
                DESCRIPTION + " TEXT" +
                ")";
        //BẢNG LƯƠNG
        String CREATE_TABLE_SALARY = "CREATE TABLE " +
                TblLuong + "(" +
                ID_Luong + "INTEGER PRIMARY KEY," +
                ID_nv + "INTEGER," +
                COLUMN_MONTH + "INTEGER," +
                COLUMN_YEAR +"INTEGER,"+
                COLUMN_WORKING_DAYS +"INTEGER,"+
                COLUMN_BASE_SALARY +"INTEGER,"+
                COLUMN_TOTAL_SALARY + "REAL" +
                ")";
        String CREATE_TABLE_ACCOUNT = "CREATE TABLE " +
                Tbl_Accout + "(" +
                ID_Accout + " INTEGER PRIMARY KEY," +
                COLUMN_USERNAME + " TEXT," +
                COLUMN_PASSWORD + " TEXT," +
                COLUMN_ACCESS_LEVEL + "INTEGER" +
                ")";

        sqLiteDatabase.execSQL(CREATE_TABLE_EMPLOYEE);
        sqLiteDatabase.execSQL(CREATE_TABLE_DEPARTMENT);
        sqLiteDatabase.execSQL(CREATE_TABLE_SALARY);
        sqLiteDatabase.execSQL(CREATE_TABLE_ACCOUNT);
        Toast.makeText(context, "Create successfylly",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TblNV);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TblPB);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TblLuong);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Tbl_Accout);
        onCreate(sqLiteDatabase);
        Toast.makeText(context, "Drop successfylly",
                Toast.LENGTH_SHORT).show();
    }
}

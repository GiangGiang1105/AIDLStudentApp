package com.example.serverstudent.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.serverstudent.model.dao.IStudentDao
import com.example.serverstudent.model.entity.StudentDetail

@Database(entities = [StudentDetail::class], version = 1, exportSchema = false)
abstract class StudentDatabase : RoomDatabase() {

    abstract fun getStudentDao(): IStudentDao
}
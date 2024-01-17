package com.mchafer.shieldpass.dat

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface PasswordDao {

    @Insert(entity = PasswordDat::class,onConflict = OnConflictStrategy.REPLACE)
    fun insert(contacto: PasswordDat)

    @Delete(entity = PasswordDat::class)
    fun delete(contacto: PasswordDat?): Int

    @Update
    fun update(contacto: PasswordDat)

    @Query("SELECT * FROM contacto")
    fun getTodosLosContactos(): List<PasswordDat?>

}
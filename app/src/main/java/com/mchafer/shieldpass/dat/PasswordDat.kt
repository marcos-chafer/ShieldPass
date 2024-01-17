package com.mchafer.shieldpass.dat

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contacto")
data class PasswordDat(val nombre:String, val apellidos:String, var telefono:Int, val fotoperfil:String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    override fun toString():String{
        return "${this.nombre} - ${this.apellidos}";
    }

}
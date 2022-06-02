package com.francesc.application

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.net.Socket
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBManager(
    var database: String
    ) {
    private lateinit var conn: Connection
    fun connect() {
        conn = DriverManager.getConnection(database)
        var s: Socket = Socket("", 1)
        var ois : ObjectInputStream = ObjectInputStream(s.getInputStream())
        ois.readObject()

    }
}
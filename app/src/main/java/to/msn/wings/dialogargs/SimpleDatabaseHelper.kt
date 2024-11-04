package to.msn.wings.dialogargs

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.sql.SQLException

class SimpleDatabaseHelper(context: Context?) : SQLiteOpenHelper(context, DBNAME, null, VERSION) {

    companion object {
        private const val DBNAME = "sample.sqlite"
        private const val VERSION = 1
    }

    // データベース作成時にテーブルとテストデータを作成
    override fun onCreate(db: SQLiteDatabase?) {
        db?.let {
            it.execSQL("CREATE TABLE books (" + "isbn TEXT PRIMARY KEY, title TEXT, price INTEGER)")

            // データベースに登録する値を準備
            val data = listOf(
                mapOf("isbn" to "978-4-7980-4512-2", "title" to "はじめてのASP.NET", "price" to "3000"),
                mapOf("isbn" to "978-4-7980-4512-3", "title" to "独習PHP", "price" to "3000")
            )

            // トランザクションを開始
            it.beginTransaction()
            try {
                // SQL命令を準備
                val sql = it.compileStatement(
                    "INSERT INTO books(isbn, title, price) VALUES(?, ?, ?)"
                )
                // 値を順に代入しながら、SQL命令を実行
                data.forEach {
                    sql.bindString(1, it["isbn"])
                    sql.bindString(2, it["title"])
                    sql.bindString(3, it["price"])
                    sql.executeInsert()
                }
                it.setTransactionSuccessful()
            } catch (e: SQLException) {
                e.printStackTrace()
            } finally {
                it.endTransaction()
            }
        }
    }

    // データベースをバージョンアップした時、テーブルを再作成
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.let {
            it.execSQL("DROP TABLE IF EXISTS books")
            onCreate(it)
        }
    }

    override fun onOpen(db: SQLiteDatabase?) {
        super.onOpen(db)
    }
}
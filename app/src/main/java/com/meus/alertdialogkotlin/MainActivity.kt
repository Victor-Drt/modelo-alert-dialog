package com.meus.alertdialogkotlin

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAlertDialogBtn = findViewById<Button>(R.id.btMostrarAlertDialog)

        mAlertDialogBtn.setOnClickListener{
            val mAlertDialog = AlertDialog.Builder(this@MainActivity)
            mAlertDialog.setTitle("Title")//titulo do alert dialog
            mAlertDialog.setMessage("Mensagem do Alert Dialog...")//messagem do alert dialog
            mAlertDialog.setIcon(R.mipmap.ic_launcher)//icone do alert dialog
            //add positive button to alert dialog
            mAlertDialog.setPositiveButton("SIM"){dialog: DialogInterface, id ->
                //Executa quando o usuario clica "Sim"
                Toast.makeText(this@MainActivity, "SIM", Toast.LENGTH_SHORT).show()
            }
            //add negative button to alert dialog
            mAlertDialog.setNegativeButton("NÃO"){dialog: DialogInterface, id ->
                dialog.dismiss() //libera o dialog quando usuario clica nao
            }
            mAlertDialog.show()//mostra a alert dialog
        }
    }
}
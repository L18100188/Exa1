package com.example.exa1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var navegation: BottomNavigationView

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemReselectedListener { item ->




        when(item.itemId) {
            R.id.Dollar -> {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Aviso")
                builder.setMessage("Esta seguro(a) que desea cambiar?")
                builder.setPositiveButton(android.R.string.ok) {
                        dialog, which ->

                    Toast.makeText(this@MainActivity, "Dolar", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {

                        replace<PrimerFragment>(R.id.frameContainer)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")
                    }



                }
                builder.setNegativeButton("No",null)
                builder.show()

                return@OnNavigationItemReselectedListener
            }

            R.id.Euro -> {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Aviso")
                builder.setMessage("Esta seguro(a) que desea cambiar?")
                builder.setPositiveButton(android.R.string.ok) {
                        dialog, which ->
                    Toast.makeText(this@MainActivity, "Euros", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {

                        replace<SegundoFragment>(R.id.frameContainer)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")
                    }

                }



                builder.setNegativeButton("No",null)
                builder.show()
                return@OnNavigationItemReselectedListener

            }

            R.id.Hist -> {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Aviso")
                builder.setMessage("Esta seguro(a) que desea cambiar??")

                builder.setPositiveButton(android.R.string.ok) {
                        dialog, which ->
                    Toast.makeText(this@MainActivity, "Historial", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.commit {

                        replace<TercerFragment>(R.id.frameContainer)
                        setReorderingAllowed(true)
                        addToBackStack("replacement")
                    }

                }


                builder.setNegativeButton("No",null)
                builder.show()

                return@OnNavigationItemReselectedListener
            }
        }

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setSupportActionBar(findViewById(R.id.main_toolbar))
        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemReselectedListener(mOnNavMenu)
        supportFragmentManager.commit {

           replace<PrimerFragment>(R.id.frameContainer)
            setReorderingAllowed(true)
            addToBackStack("replacement")
       }

    }




}




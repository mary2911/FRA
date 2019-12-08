package garcia.maria.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_primer.*

class MainActivity : AppCompatActivity(),OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        var f:Fragment?=null

        when(p0!!.id){//!!boton existe y no esta vacio
            R.id.btn1 -> {
                f= primerFragment.newInstance("","")
            }
            R.id.btn2 ->{
                f=segundoFragment.newInstance("","")
            }
            R.id.btn3 ->{
                f=tercerFragment.newInstance("","")
            }

        }
        supportFragmentManager.beginTransaction().replace(R.id.container,f!!).commitNow()
    }

}

package garcia.maria.fragmentos


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
var btn:Button?=null;
var id1:EditText?=null;
var id2:EditText?=null;

/**
 * A simple [Fragment] subclass.
 * Use the [segundoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class segundoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_segundo, container, false)
        val btn: Button = vista.findViewById(R.id.btn)
        val id1: TextView= vista.findViewById(R.id.id1)

        val id2: TextView= vista.findViewById(R.id.id2)
        btn.setOnClickListener {
            if (id1!!.text.toString().equals("") && id2!!.text.toString().equals("") ){

                Toast.makeText(activity,
                    "Ingresa los 2 numeros", Toast.LENGTH_SHORT).show();

            }else{
                val id1 = Integer.parseInt(id1!!.getText().toString());
                val id2 = Integer.parseInt(id2!!.getText().toString());

                val suma = id1+id2;

                Toast.makeText(activity,
                    "Resultado "+suma, Toast.LENGTH_SHORT).show();


            }


        }



    return vista
}








    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment segundoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            segundoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

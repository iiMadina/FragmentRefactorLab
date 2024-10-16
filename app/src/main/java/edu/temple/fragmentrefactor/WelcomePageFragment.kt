package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomePageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomePageFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_page, container, false).apply {

            // The recycler view is the root element of the Fragment's layout
            // as such the view argument passed to onViewCreated() is the RecyclerView
            val displayTextView = findViewById<TextView>(R.id.displayTextView)
            val nameEditText = findViewById<EditText>(R.id.nameEditText)
            val changeButton = findViewById<Button>(R.id.changeButton)

            changeButton.setOnClickListener {
                val name = nameEditText.text

                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}
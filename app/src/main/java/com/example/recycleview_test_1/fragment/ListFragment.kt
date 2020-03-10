package com.example.recycleview_test_1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_test_1.R
import com.example.recycleview_test_1.adapter.Shoes_Adapter
import com.example.recycleview_test_1.model.Shoes
import kotlinx.android.synthetic.main.fragment_list.view.*

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var root = inflater.inflate(R.layout.fragment_list, container, false)

        var shoesArray = ArrayList<Shoes>()
        shoesArray.add(Shoes("Emotion 1", "Cute", "$100", R.drawable.ic_smart_cart, R.drawable.img_kid_25, "001"))
        shoesArray.add(Shoes("Emotion 2", "Cute", "$200", R.drawable.ic_smart_cart, R.drawable.img_kid_27, "002"))
        shoesArray.add(Shoes("Emotion 3", "Cute", "$300", R.drawable.ic_smart_cart, R.drawable.img_kid_33, "003"))
        shoesArray.add(Shoes("Emotion 4", "Cute", "$400", R.drawable.ic_smart_cart, R.drawable.img_kid_29, "004"))
        shoesArray.add(Shoes("Emotion 5", "Cute", "$500", R.drawable.ic_smart_cart, R.drawable.img_kid_34, "005"))
        shoesArray.add(Shoes("Emotion 6", "Cute", "$600", R.drawable.ic_smart_cart, R.drawable.img_kid_28, "006"))


        var shoesAdapter = Shoes_Adapter(shoesArray)

        root.recyclerView.layoutManager = LinearLayoutManager(context)
        root.recyclerView.adapter = shoesAdapter

        return root
    }


}

package org.bitbucket.tomeees.mondriaanpois.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


// common parent fragment to remove duplications concerning creating the data binding for fragments
open class DataBindingFragment<ViewDataBindingType: ViewDataBinding>
    (private val layoutResourceId: Int)
    : BindingFragment<ViewDataBindingType>()
{

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?) {
        _binding = DataBindingUtil.inflate(inflater, layoutResourceId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
    }

}

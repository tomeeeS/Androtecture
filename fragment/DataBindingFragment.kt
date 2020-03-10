package org.bitbucket.tomeees.mondriaanpois.view.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class DataBindingFragment<ViewDataBindingType: ViewDataBinding>(
    private val layoutResourceId: Int
) : BindingFragment() {

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?): View {
        val binding = DataBindingUtil.inflate<ViewDataBindingType>(inflater, layoutResourceId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

}

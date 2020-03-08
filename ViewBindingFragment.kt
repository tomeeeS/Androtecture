package org.bitbucket.tomeees.mondriaanpois.view.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import org.bitbucket.tomeees.mondriaanpois.R

open class ViewBindingFragment(@LayoutRes val layoutRes: Int)
    : BindingFragment()
{

    override fun inflate(inflater: LayoutInflater, container: ViewGroup?) =
        inflater.inflate(layoutRes, container, false)

}

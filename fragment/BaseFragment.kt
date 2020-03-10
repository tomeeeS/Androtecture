package org.bitbucket.tomeees.mondriaanpois.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(
    @LayoutRes val layoutRes: Int = 0
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflate(inflater, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onLayoutInit()
    }

    open fun inflate(inflater: LayoutInflater, container: ViewGroup?) =
        inflater.inflate(layoutRes, container, false)

    // callback to initialize our layout and views exactly when necessary
    open fun onLayoutInit() {}
}

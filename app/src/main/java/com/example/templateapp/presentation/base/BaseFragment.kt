package com.example.templateapp.presentation.base

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

abstract class BaseFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    var listener: BaseFragmentListener? = null

    override fun onAttach(activity: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(activity)
        if (context is BaseFragmentListener) {
            listener = context as BaseFragmentListener
        } else {
            throw RuntimeException(context.toString() + " must implement MainFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}

interface BaseFragmentListener {
}

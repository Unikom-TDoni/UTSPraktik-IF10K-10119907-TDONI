package com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.core

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.R
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.databinding.FragmentCheckFormBinding
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.module.ViewBindingFragment

// 3/6/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
class CheckFormViewBindingFragment : ViewBindingFragment<FragmentCheckFormBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding =
        FragmentCheckFormBinding::inflate

    private val args: CheckFormViewBindingFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initNavigation()
        initButtonEvent()
        initTextField()
    }

    private fun initNavigation() {
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_checkFormViewBindingFragment2_to_registerFormViewBindingFragment)
        }
    }

    private fun initButtonEvent() {
        binding.btnUbah.setOnClickListener {
            findNavController().navigate(R.id.action_checkFormViewBindingFragment2_to_registerFormViewBindingFragment)
        }
    }

    private fun initTextField() {
        binding.txtFieldHubungan.text =
            Editable.Factory.getInstance().newEditable(args.data.hubungan)
        binding.txtFieldJenisKelamin.text =
            Editable.Factory.getInstance().newEditable(args.data.jenisKelamin)
        binding.txtFieldJenisTest.text =
            Editable.Factory.getInstance().newEditable(args.data.jenisTest)
        binding.txtFieldNama.text = Editable.Factory.getInstance().newEditable(args.data.nama)
        binding.txtFieldNik.text = Editable.Factory.getInstance().newEditable(args.data.nik)
        binding.txtFieldTanggalLahir.text =
            Editable.Factory.getInstance().newEditable(args.data.tanggalLahir)
        binding.txtFieldTanggalTerkonfirmasi.text =
            Editable.Factory.getInstance().newEditable(args.data.tanggalKonfirmasi)
    }
}
package com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.Data
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.databinding.FragmentRegisterBinding
import com.tdoni_10119907.utspraktik_if10k_10119907_tdoni.module.ViewBindingFragment

// 3/6/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K

class RegisterFormViewBindingFragment : ViewBindingFragment<FragmentRegisterBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding = FragmentRegisterBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initNavigation()
        initButtonEvent()
    }

    private fun initNavigation() {
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().finish()
        }
    }

    private fun initButtonEvent() {
        binding.btnNext.setOnClickListener {
            when {
                binding.txtFieldNama.text.isNullOrEmpty() -> binding.txtFieldNama.error =
                    "Field Tidak Boleh Kosong"
                binding.txtFieldTanggalTerkonfirmasi.text.isNullOrEmpty() -> binding.txtFieldTanggalLahir.error =
                    "Field Tidak Boleh Kosong"
                binding.txtFieldTanggalTerkonfirmasi.text.isNullOrEmpty() -> binding.txtFieldTanggalTerkonfirmasi.error =
                    "Field Tidak Boleh Kosong"
                else -> findNavController().navigate(
                    RegisterFormViewBindingFragmentDirections.actionRegisterFormViewBindingFragmentToCheckFormViewBindingFragment2(
                        Data(
                            getData(binding.radioJenisTest),
                            binding.txtFieldTanggalTerkonfirmasi.text.toString(),
                            binding.txtFieldNik.text.toString(),
                            binding.txtFieldNama.text.toString(),
                            binding.txtFieldTanggalLahir.text.toString(),
                            getData(binding.radioJenisKelamin),
                            getData(binding.radioHubungan)
                        )
                    )
                )
            }
        }
    }

    private fun getData(radioGroup: RadioGroup): String {
        val genid: Int = radioGroup.getCheckedRadioButtonId()
        val radioButton = requireView().findViewById(genid) as RadioButton
        return radioButton.text.toString()
    }
}
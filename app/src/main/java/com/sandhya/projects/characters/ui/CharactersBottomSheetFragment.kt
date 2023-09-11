package com.sandhya.projects.characters.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sandhya.projects.characters.data.CharactersData
import com.sandhya.projects.databinding.FragmentCharactersBottomSheetBinding

class CharactersBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentCharactersBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val characterData: CharactersData? = arguments?.getParcelable("charactersData")

        characterData?.let {
            binding.valueName.text = it.name
            binding.valueGender.text = it.gender
            binding.valueSpecies.text = it.species
            binding.valueHouse.text = it.house
            binding.valueWizard.text = it.wizard.toString()
            binding.valueAncestry.text = it.ancestry
            binding.valuePatronus.text = it.patronus
            binding.valueEyeColor.text = it.eyeColour
            binding.valueHairColor.text = it.hairColour
            binding.valueHogwartsStudent.text = it.hogwartsStudent.toString()
            binding.valueHogwartsStaff.text = it.hogwartsStaff.toString()
            binding.valueAlive.text = it.alive.toString()
            binding.valueWood.text = it.wand.wood
            binding.valueCore.text = it.wand.core
            binding.valueLength.text = it.wand.length.toString()
        }
    }
}

package tk.juniorcesarabreu.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tk.juniorcesarabreu.santanderdevweek.data.Conta
import tk.juniorcesarabreu.santanderdevweek.data.local.FakeData

// desacopla os dados da activity

// Extende viewModel
class MainViewModel : ViewModel() {

    // Define livedata mutável
    // responsável por setar um dado que será observado no futuro
    // livedata só repassa dados, mutablelivedata permite mudar a informação
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente() : LiveData<Conta> {

        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}
package tk.juniorcesarabreu.santanderdevweek.data.local

import tk.juniorcesarabreu.santanderdevweek.data.Cartao
import tk.juniorcesarabreu.santanderdevweek.data.Cliente
import tk.juniorcesarabreu.santanderdevweek.data.Conta

// Dados mockados
class FakeData() {

    fun getLocalData() : Conta {
        val cliente = Cliente("Júnior")
        val cartao = Cartao("951357")

        return Conta(
                "00112233-4",
                "445566-7",
                "R$ 2.450,00",
                "R$ 4.120,00",
                cliente,
                cartao
        )
    }
}
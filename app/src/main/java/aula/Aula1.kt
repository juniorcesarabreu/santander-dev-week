package aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tk.juniorcesarabreu.santanderdevweek.R

class Aula1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaração variáveis
        // val - valor constante e imutável
        // var - valor variavel

        var contador: Int = 10
        contador = 11

        val contador2: Int = 11

        // Segurança Nula
        // val languageName: String = null // kotlin não consegue identificar uma string como nula
        val languageName: String? = null // adicione o ponto de interrogação para permitir a nulabilidade

        // Condicionais
        var idade = 20
        if (idade > 18) {
            print("Você é maior de idade")
        } else {
            println("Você é menor de idade")
        }

        val minhaIdade = if (idade > 18) {
            "Você é maior de idade"
        } else {
            "Você é menor de idade"
        }

        // when
        val minhaIdade2 = when {
            idade > 18 -> "Você é maior de idade"
            else -> "Você é menor de idade"
        }

        // Funções
        minhaIdade() // chamando função

        minhaIdade2()

        // Classes

        val medicamento = Medicamento("Teste 1", "2 x ao dia")

        medicamento.formula = "Teste 2"
    }

    // Declaração de função
    fun minhaIdade() : String {
        return "Minha idade é 18"
    }

    fun minhaIdade2() : String = "Minha idade é 18"
}

// Fonte de ícones
// https://fonts.google.com/icons
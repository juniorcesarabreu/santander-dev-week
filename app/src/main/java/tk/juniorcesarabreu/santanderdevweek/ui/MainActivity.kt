package tk.juniorcesarabreu.santanderdevweek.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import tk.juniorcesarabreu.santanderdevweek.R
import tk.juniorcesarabreu.santanderdevweek.data.Conta

class MainActivity : AppCompatActivity() {

    // lateinit permite carregar no futuro, de forma atrasada
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Adição da toolbar */
        setSupportActionBar(findViewById(R.id.toolbar))

        /* Remove o título */
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // instancia MainViewModel
        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)

        buscarContaCliente()

        // throw RuntimeException("Test crash") // Force a crash
    }

    private fun bindOnView(conta: Conta) {

        findViewById<TextView>(R.id.tv_usuario).text =
            getString(R.string.txt_usuario, conta.cliente.nome)
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite).text = conta.limite

        findViewById<TextView>(R.id.tv_cartao_numero).text = conta.cartao.numeroCartao
    }

    private fun buscarContaCliente() {

        // adicona um observador
        mainViewModel.buscarContaCliente().observe(this, Observer { result ->
            bindOnView(result)
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // É necessário inflar o menu

        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                Toast.makeText(
                    this,
                    "Nenhuma mensagem nova",
                    Toast.LENGTH_LONG
                ).show()

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
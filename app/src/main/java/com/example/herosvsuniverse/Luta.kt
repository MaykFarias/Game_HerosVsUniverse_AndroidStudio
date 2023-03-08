package com.example.herosvsuniverse
/*
class Luta {
    private fun danoHeroi() {
        if (null == numeroGolpeHeroi) {
            println("ERRO")
        } else {
            when (numeroGolpeHeroi) {
                IntensidadeAtaque.ATAQUE_FRACO -> ataqueHeroi = when (escolhaHeroi?.categoria) {
                    "Leve" -> 30
                    "Médio" -> 20
                    else -> 10
                }

                IntensidadeAtaque.ATAQUE_FORTE -> ataqueHeroi = when (escolhaHeroi?.categoria) {
                    "Leve" -> 40
                    "Médio" -> 30
                    else -> 20
                }

                IntensidadeAtaque.ATAQUE_CRITICO -> ataqueHeroi = when (escolhaHeroi?.categoria) {
                    "Leve" -> 50
                    "Médio" -> 40
                    else -> 30
                }

                IntensidadeAtaque.DEFESA -> {
                    if (numeroGolpeHeroi === IntensidadeAtaque.DEFESA && numeroGolpeVilao === IntensidadeAtaque.DEFESA) {
                        println("Os dois se defenderam")

                    } else if (numeroGolpeHeroi === IntensidadeAtaque.DEFESA && numeroGolpeVilao !== IntensidadeAtaque.DEFESA) {
                        escolhaVilao?.vida = (escolhaVilao?.vida?.minus(ataqueVilao)!!)
                        println("O  ${escolhaVilao?.nome}  recebeu  $ataqueVilao  de dano porque o  ${escolhaHeroi?.nome}  se defendeu")

                    } else if (numeroGolpeHeroi !== IntensidadeAtaque.DEFESA && numeroGolpeVilao === IntensidadeAtaque.DEFESA) {
                        escolhaHeroi?.vida = (escolhaHeroi?.vida?.minus(ataqueHeroi)!!)
                        println("O " + escolhaHeroi?.nome + " recebeu " + ataqueHeroi + " de dano porque o " + escolhaVilao?.nome + " se defendeu")
                    }
                }

                else -> println("ERRO")
            }
        }
    }

    private fun danoVilao() {
        if (null == numeroGolpeVilao) {
            println("ERRO")
        } else {
            when (numeroGolpeVilao) {
                IntensidadeAtaque.ATAQUE_FRACO -> ataqueVilao = when (escolhaVilao?.categoria) {
                    "Leve" -> 10
                    "Médio" -> 20
                    else -> 30
                }

                IntensidadeAtaque.ATAQUE_FORTE -> ataqueVilao = when (escolhaVilao?.categoria) {
                    "Leve" -> 10
                    "Médio" -> 20
                    else -> 40
                }

                IntensidadeAtaque.ATAQUE_CRITICO -> ataqueVilao = when (escolhaVilao?.categoria) {
                    "Leve" -> 10
                    "Médio" -> 20
                    else -> 50
                }

                IntensidadeAtaque.DEFESA -> {
                    if (numeroGolpeHeroi === IntensidadeAtaque.DEFESA && numeroGolpeVilao === IntensidadeAtaque.DEFESA) {
                        println("Os dois se defenderam")
                    } else if (numeroGolpeHeroi === IntensidadeAtaque.DEFESA && numeroGolpeVilao !== IntensidadeAtaque.DEFESA) {
                        escolhaVilao?.vida = (escolhaVilao?.vida!! - ataqueVilao)
                        println("O " + escolhaVilao?.nome + " recebeu " + ataqueVilao + " de dano porque o " + escolhaHeroi?.nome + " se defendeu")
                    } else if (numeroGolpeHeroi !== IntensidadeAtaque.DEFESA && numeroGolpeVilao === IntensidadeAtaque.DEFESA) {
                        escolhaHeroi?.vida = (escolhaHeroi?.vida!! - ataqueHeroi)
                        println("O " + escolhaHeroi?.nome + " recebeu " + ataqueHeroi + " de dano porque o " + escolhaVilao?.nome + " se defendeu")
                    }
                }

                else -> println("ERRO")
            }
        }
    }

    fun luta() {
        rounds()
        apresentacao()
        while (escolhaRounds > 0) {
            escolhaAtaqueHeroi()
            escolhaAtaqueVilao()
            println("")
            if (numeroGolpeHeroi !== IntensidadeAtaque.DEFESA && numeroGolpeVilao !== IntensidadeAtaque.DEFESA) {
                danoHeroi()
                escolhaVilao?.vida = (escolhaVilao!!.vida - ataqueHeroi)
                println("O " + escolhaHeroi!!.nome + " causou " + ataqueHeroi + " de dano no " + escolhaVilao?.nome)
                println("------------------------------------")
                danoVilao()
                escolhaHeroi?.vida = (escolhaHeroi?.vida!! - ataqueVilao)
                println("O " + escolhaVilao?.nome + " causou " + ataqueVilao + " de dano no " + escolhaHeroi?.nome)
                println("------------------------------------")
            } else {
                println("DEFESA !.")
                danoHeroi()
                danoVilao()
            }
            println(escolhaHeroi?.nome + " VIDA: " + escolhaHeroi?.vida)
            println(escolhaVilao?.nome + " VIDA: " + escolhaVilao?.vida)
            if (escolhaHeroi?.vida!! <= 0 || escolhaVilao?.vida!! <= 0) {
                println("OS HOUNDS ACABARAM !!!")
                break
            }
            escolhaRounds -= 1
        }
        if (escolhaHeroi?.vida!! > escolhaVilao?.vida!!) {
            escolhaHeroi?.ganharLuta()
            escolhaVilao?.perderLuta()
        } else if (escolhaHeroi!!.vida < escolhaVilao?.vida!!) {
            escolhaHeroi?.perderLuta()
            escolhaVilao?.ganharLuta()
        } else {
            escolhaHeroi?.empatarLuta()
            escolhaVilao?.empatarLuta()
        }
        println("")
        println("")

        println("   STATUS ATUAL ")
        escolhaHeroi?.status()
        println("VIDA " + escolhaHeroi?.nome + " :" + escolhaHeroi?.vida)
        println("")
        escolhaVilao?.status()
        println("VIDA " + escolhaVilao?.nome + " :" + escolhaVilao?.vida)
    }
}
*/
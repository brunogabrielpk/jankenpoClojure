(ns jankenclojure.core
  (:gen-class))

(defn opts []
  (println "1 - Pedra")
  (println "2 - Papel")
  (println "3 - Tesoura"))

(defn opt1 []
  (println "=========================")
  (println "JOGADOR A x JOGADOR B")
  (opts)
  (println "Digite a jogada do jogador A")
  (let [playA (Integer/parseInt(read-line))]
    (println "Digite a jogada do jogador B")
    (let [playB (Integer/parseInt(read-line))]
      (let [plays [playA playB]]
      (case plays
        ([1 2]) (println "Jogador B Venceu !!!")
        ([1 3]) (println "Jogador A Venceu !!!")
        ([2 1]) (println "Jogador A Venceu !!!")
        ([2 3]) (println "Jogador B Venceu !!!")
        ([3 1]) (println "Jogador B Venceu !!!")
        ([3 2]) (println "Jogador A Venceu !!!")
        (println "Empate"))
        (println "=========================")))))

(defn opt2 []
  (println "=========================")
  (println "JOGADOR A x MÁQUINA")
  (opts)
  (println "Digite a jogada do jogador A")
  (let [playA (Integer/parseInt(read-line))]
    (let [playB (+ 1 (rand-int 2))]
      (case playB
        1 (println "A MÁQUINA JOGOU PEDRA!!")
        2 (println "A MÁQUINA JOGOU PAPEL!!")
        3 (println "A MÁQUINA JOGOU TESOURA!!")
        )
      (let [plays [playA playB]]
      (case plays
        ([1 2]) (println "Máquina Venceu !!!")
        ([1 3]) (println "Jogador A Venceu !!!")
        ([2 1]) (println "Jogador A Venceu !!!")
        ([2 3]) (println "Máquina Venceu !!!")
        ([3 1]) (println "Máquina Venceu !!!")
        ([3 2]) (println "Jogador A Venceu !!!")
        (println "Empate"))
        (println "=========================")))))
s
(defn opt3 []
  (println "Até uma próxima partida..."))
(defn invalid []
  (println "invalid option"))

(defn menu []
  (println "Por favor, digite a opção desejada")
  (println "1 - Jogador x Jogador")
  (println "2 - Jogador x Máquina")
  (println "3 - Sair")
  (let [guess (Integer/parseInt(read-line))] guess))

(defn -main [& args] 
  (println "Bem vindo ao JankenClojure")
  (loop []
  (def guess (menu))
    (case guess
      1 (opt1)
      2 (opt2)
      3 (opt3)
    (invalid))
    (if-not (= guess 3) (recur))))
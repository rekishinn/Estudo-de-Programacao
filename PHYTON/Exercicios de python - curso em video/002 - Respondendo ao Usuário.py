### Teste 1

nome = input("Qual o seu nome? ")
print("Prazer em te conhecer", nome + "!")

### Teste 2
print("Segunda forma:")

nome = input("Qual o seu nome? ")
print("Prazer em te conhecer {}!".format(nome))
                        ###  ^ É uma mascara ou um bloco que vai substituido após a string com o .format

### Teste 3

print("Mais um teste.")

nome = input("Qual o seu nome? ")
idade = input("E a sua idade? ")

print("Prazer em te conhecer {}!".format(nome), "você tem {} anos?".format(idade), "Interessante.")

### Teste 4

print("Ultimo teste!")

nome=input("Qual o seu nome? ")
idade=input("Qual sua idade? ")
peso=input("Qual o seu peso? ")

print(f"Prazer em te conhecer {nome}!", f"Você tem {idade} anos???", f"você tem {peso}kg, precisa se alimentar melhor porra.")
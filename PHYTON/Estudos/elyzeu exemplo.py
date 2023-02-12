nome = input("Digite seu nome: ")
idade = int(input("olá " + nome + "! " + "Qual sua idade? "))

print(nome, "tem", idade)

if idade >= 18:
    print("você é maior de idade!")


print("não declarou else")
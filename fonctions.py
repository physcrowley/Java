# Les fonctions viennent d'abord en Python, pour les charger 
# en mémoire lors de l'interprétation du script afin que les
# mots soient reconnus plus bas

def pas_d_argument():
    print("Je suis une fonction sans arguments ni valeur de retour")


def un_argument(msg):
    print("J'imprime le message passé en argument :", msg)


def multiplier_par_3(num):
    return num * 3


def multiplier_deux_valeurs(a, b):
    return a * b


# Script utilisant les fonctions définies plus haut
print("print() est une fonction pré-définie dans Python")

pas_d_argument()
un_argument("coucou")
res1 = multiplier_par_3(9)
print(res1)
res2 = multiplier_deux_valeurs(6, 7)
print(res2)

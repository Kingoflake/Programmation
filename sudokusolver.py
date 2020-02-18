# -*- coding: utf-8 -*-
"""
Éditeur de Spyder

@author: jb
"""

# initialisation d'une problème de sudoku
import numpy as np

def init():
    t = np.random.randint(9,size=(9,9))
    return t

#on marque sur chaque case le nombre de possiblité
    
def classement(grille):
    ' on classe chaque case de la grille'
    parcour=[]#liste des positions des numéros de départ
    possiblité=[]
    for i in range(len(grille)):
        for j in range(len(grille)):
            
            if grille[i][j] != 0:
                
                for k in grille[i]: # nombre de chiffre dans la ligne
                    
                    if k !=0:
                        
                        possiblite.append(i)
                
                for l in range(len(grille)): # nombre de chiffre dans la colonne
                    
                    if grille[l][j] != 0:
                        
                        possiblite.append(grille[l][j])
                
                
# Exame-PO1---java-numeros-aleatorios

#Sobre
A linguagem Java disponibiliza funcionalidades para a geração de números aleatórios 
em uma classe denominada “Random” do pacote “java.util” (import java.util.Random;). 

Os números aleatórios são utilizados de diversas formas em programas de computador. 
Eles são importantes no desenvolvimento de jogos, na área de segurança de informações 
(ex: para gerar senhas ou textos de campos captcha) e em programas de mineração de dados 
e análise estatística, apenas para citar alguns exemplos.

#O Problema
Precisa se gerar um número aleatório entre 1 e 6 
Se simplesmente se usar o método nextInt(6), se obterá números entre 0 e 5. 
Resolver a situação aplicando o seguinte recurso: int num = gerador.nextInt(6) + 1.

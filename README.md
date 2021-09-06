# springcache
Pessoal, esse é um exemplo bem simples para usar um cache de chamada de método, a idéia não é usar grandes chaches, embora seja possível, mas em casos que queremos evitar alguma coisa hardcoded como uma chave que muda uma vez a cada seis meses,  ou quando temos 30 possiveis casos como TALVEZ no método de pagamento, ou quando queremos evitar o cálculo repetitico da lib de cálculo, etc.... 
Aou executar este exemplo, primeiro faça uma chamada com um parametro nome e repita a chama, o service será executado apenas uma vez
depois mude o parametro e se divirta.

http://localhost:8080/greeting/?name=munif

http://localhost:8080/greeting/?name=joao


so vai executar o service quando mudar o nome

https://www.baeldung.com/spring-cache-tutorial



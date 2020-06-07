package com.debyam.exercice1311;

/**
 * Il faut déclarer les attributs de la classe A « protected » . Il faut redéfinir la
 * méthode decrisToi() dans la classe B vu qu’elle est abstraite dans la classe A. Il faut faire appel au
 * constructeur de la classe A pour l’initialisation des attributs hérités de A : super (a,b,c) ;.
 */
abstract	class	A	extends	Object	{
    protected 	int	a,b	;
    protected 	String	c	;

    public A(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public	abstract	void	decrisToi()	;
}
class	B	extends	A	{
    private	String	d	;
    public 	B(int	a,	int	b,	String	c,	String	d)	{
        super(a,b,c);
        this.d=d	;
    }

    @Override
    public void decrisToi() {
        System.out.print(a +", " + b +","+ c + "," + d );
    }
}
class	Correction1	{
    public	static	void	main(String[]	args)	{
        B	b=new	B(1,2,"trois","quatre")	;
        b.decrisToi()	;
    }
}

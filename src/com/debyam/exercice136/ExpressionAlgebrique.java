package com.debyam.exercice136;

abstract class ExpressionAlgebrique {
    protected String c ;

    public ExpressionAlgebrique(String c) {
        this.c = c;
    }

    public	abstract	void	evalue()	;
}

class Addition extends ExpressionAlgebrique {
    private String b;

    public Addition(String c, String b) {
        super(c);
        this.b = b;
    }


    @Override
    public void evalue() {
        System.out.print(c + "+" + b);
    }
}

class Multiplication extends ExpressionAlgebrique {
    private String a;

    public Multiplication(String c, String a) {
        super(c);
        this.a = a;
    }


    @Override
    public void evalue() {
        System.out.print(c + "*" + a);
    }
}

class Division extends ExpressionAlgebrique {
    private String d;

    public Division(String c, String d) {
        super(c);
        this.d = d;
    }

    @Override
    public void evalue() {
        System.out.print(c + "/" + d);
    }
}
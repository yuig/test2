package ul2;

/* loaded from: classes2.dex */
public abstract class i1 extends t implements rl2.g {
    @Override // rl2.g
    public final boolean isExternal() {
        return ((dm2.o0) u()).f55473f;
    }

    @Override // rl2.g
    public final boolean isInfix() {
        u().getClass();
        return false;
    }

    @Override // rl2.g
    public final boolean isInline() {
        return ((dm2.o0) u()).f55476i;
    }

    @Override // rl2.g
    public final boolean isOperator() {
        u().getClass();
        return false;
    }

    @Override // rl2.c
    public final boolean isSuspend() {
        u().getClass();
        return false;
    }

    @Override // ul2.t
    public final i0 j() {
        return v().f122567g;
    }

    @Override // ul2.t
    public final vl2.g l() {
        return null;
    }

    @Override // ul2.t
    public final boolean t() {
        return v().t();
    }

    public abstract am2.q0 u();

    public abstract o1 v();
}

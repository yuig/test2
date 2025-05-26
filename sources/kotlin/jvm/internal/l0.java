package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class l0 {
    public rl2.g a(o oVar) {
        return oVar;
    }

    public rl2.d b(Class cls) {
        return new i(cls);
    }

    public rl2.f c(Class cls, String str) {
        return new z(cls, str);
    }

    public rl2.j d(u uVar) {
        return uVar;
    }

    public rl2.l e(w wVar) {
        return wVar;
    }

    public rl2.r f(a0 a0Var) {
        return a0Var;
    }

    public rl2.t g(c0 c0Var) {
        return c0Var;
    }

    public String h(n nVar) {
        String obj = nVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String i(s sVar) {
        return h(sVar);
    }
}

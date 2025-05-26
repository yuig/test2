package ao2;

/* loaded from: classes2.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f20188a = new ThreadLocal();

    public static f1 a() {
        ThreadLocal threadLocal = f20188a;
        f1 f1Var = (f1) threadLocal.get();
        if (f1Var != null) {
            return f1Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}

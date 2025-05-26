package do2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final os.d f55741a = new os.d(7);

    /* renamed from: b, reason: collision with root package name */
    public static final ao2.b0 f55742b = new ao2.b0(2);

    public static final i a(i iVar, Function1 function1) {
        ao2.b0 b0Var = f55742b;
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.f55793b == function1 && gVar.f55794c == b0Var) {
                return iVar;
            }
        }
        return new g(iVar, function1);
    }
}

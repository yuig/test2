package h3;

import k1.s2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f66614a;

    public abstract void a(d3.h hVar);

    public Function1 b() {
        return this.f66614a;
    }

    public final void c() {
        Function1 b13 = b();
        if (b13 != null) {
            b13.invoke(this);
        }
    }

    public void d(s2 s2Var) {
        this.f66614a = s2Var;
    }
}

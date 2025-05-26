package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f17260a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17261b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f17262c = new c1();

    /* renamed from: d, reason: collision with root package name */
    public b1 f17263d;

    public l0(d1 d1Var, Function1 function1) {
        this.f17260a = d1Var;
        this.f17261b = function1;
    }

    public final k0 a(int i13, long j13) {
        b1 b1Var = this.f17263d;
        if (b1Var == null) {
            return e.f17234a;
        }
        a1 a1Var = new a1(b1Var, i13, j13, this.f17262c);
        b1Var.f17223c.d(a1Var);
        return a1Var;
    }
}

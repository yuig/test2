package r1;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class c0 implements androidx.compose.foundation.lazy.layout.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f105869a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.c0 f105870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105871c;

    public c0(o oVar, androidx.compose.foundation.lazy.layout.c0 c0Var, int i13) {
        this.f105869a = oVar;
        this.f105870b = c0Var;
        this.f105871c = i13;
    }

    public final b0 a(int i13, int i14, int i15, int i16, long j13) {
        int i17;
        o oVar = this.f105869a;
        Object c13 = oVar.c(i13);
        Object k13 = oVar.f105947b.k(i13);
        List a13 = ((androidx.compose.foundation.lazy.layout.d0) this.f105870b).a(i13, j13);
        if (n4.a.f(j13)) {
            i17 = n4.a.j(j13);
        } else {
            if (!n4.a.e(j13)) {
                throw new IllegalArgumentException("does not have fixed height".toString());
            }
            i17 = n4.a.i(j13);
        }
        int i18 = i17;
        u uVar = (u) this;
        n4.k layoutDirection = ((androidx.compose.foundation.lazy.layout.d0) uVar.f105990d).f17231b.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.u uVar2 = uVar.f105991e.f105964k;
        return new b0(i13, c13, uVar.f105992f, i18, i16, uVar.f105993g, layoutDirection, uVar.f105994h, uVar.f105995i, a13, uVar.f105996j, k13, uVar2, j13, i14, i15);
    }
}

package x1;

import kotlin.jvm.functions.Function0;
import n3.f0;
import n3.h0;
import n3.j;
import n3.k;
import n3.o0;
import s3.f2;
import s3.n;
import z2.x;

/* loaded from: classes2.dex */
public abstract class c extends n implements f2, z2.d {

    /* renamed from: p, reason: collision with root package name */
    public Function0 f131559p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f131560q;

    /* renamed from: r, reason: collision with root package name */
    public final h0 f131561r;

    public c(Function0 function0) {
        this.f131559p = function0;
        b bVar = new b(this, null);
        j jVar = f0.f89054a;
        o0 o0Var = new o0(null, null, null, bVar);
        M0(o0Var);
        this.f131561r = o0Var;
    }

    @Override // s3.f2
    public final void W(j jVar, k kVar, long j13) {
        ((o0) this.f131561r).W(jVar, kVar, j13);
    }

    @Override // s3.f2
    public final void c0() {
        ((o0) this.f131561r).c0();
    }

    @Override // z2.d
    public final void x(x xVar) {
        this.f131560q = xVar.isFocused();
    }
}

package aq;

import kotlin.jvm.internal.Intrinsics;
import v.q1;
import zp.n0;

/* loaded from: classes3.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f20350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20351b;

    public k(q1 q1Var, m mVar) {
        this.f20350a = mVar;
        this.f20351b = q1Var;
    }

    @Override // aq.h
    public final void a(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        m mVar = this.f20350a;
        fk2.l h10 = mVar.f20355d.e(mVar.B()).l(tk2.e.f118017c).h(wj2.c.a());
        f fVar = this.f20351b;
        h10.i(new fp.a(2, fVar, mVar), new n0(13, new z3.m(fVar, 19)));
    }

    @Override // aq.h
    public final void onError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ((q1) this.f20351b).a(throwable);
    }
}

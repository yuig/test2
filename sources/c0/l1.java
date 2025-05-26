package c0;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class l1 implements g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.c0 f24281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4.i f24282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24283c;

    public l1(com.google.common.util.concurrent.c0 c0Var, r4.i iVar, String str) {
        this.f24281a = c0Var;
        this.f24282b = iVar;
        this.f24283c = str;
    }

    @Override // g0.c
    public final void onFailure(Throwable th3) {
        boolean z13 = th3 instanceof CancellationException;
        r4.i iVar = this.f24282b;
        if (z13) {
            com.bumptech.glide.d.v(null, iVar.d(new n1(a.a.p(new StringBuilder(), this.f24283c, " cancelled."), th3)));
        } else {
            iVar.b(null);
        }
    }

    @Override // g0.c
    public final void onSuccess(Object obj) {
        g0.m.g(this.f24281a, this.f24282b);
    }
}

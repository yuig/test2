package ads_mobile_sdk;

import android.content.Context;
import bj.n;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class vf1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12488a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f12490c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f12491d;

    /* renamed from: e, reason: collision with root package name */
    public final a.o8 f12492e;

    public vf1(xv0 xv0Var, a.o8 o8Var, a.o8 o8Var2, pj1 pj1Var, a.o8 o8Var3) {
        this.f12488a = xv0Var;
        this.f12489b = o8Var;
        this.f12490c = o8Var2;
        this.f12491d = pj1Var;
        this.f12492e = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new uf1((Context) this.f12488a.get(), (CoroutineContext) this.f12489b.get(), (dj1) this.f12490c.get(), (oj1) this.f12491d.get(), (n) this.f12492e.get());
    }
}

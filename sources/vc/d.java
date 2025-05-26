package vc;

import com.apollographql.apollo3.exception.ApolloException;
import m60.f0;
import pc.d0;

/* loaded from: classes.dex */
public final class d implements pc.c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final f0 f125517h = new f0();

    /* renamed from: b, reason: collision with root package name */
    public final long f125518b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125519c;

    /* renamed from: d, reason: collision with root package name */
    public final long f125520d;

    /* renamed from: e, reason: collision with root package name */
    public final long f125521e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125522f;

    /* renamed from: g, reason: collision with root package name */
    public final ApolloException f125523g;

    public d(long j13, long j14, long j15, long j16, boolean z13, ApolloException apolloException) {
        this.f125518b = j13;
        this.f125519c = j14;
        this.f125520d = j15;
        this.f125521e = j16;
        this.f125522f = z13;
        this.f125523g = apolloException;
    }

    @Override // pc.f0
    public final pc.c0 a(d0 d0Var) {
        return tb.f.M(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 b(d0 d0Var) {
        return tb.f.W(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 c(pc.f0 f0Var) {
        return tb.f.Z(this, f0Var);
    }

    @Override // pc.f0
    public final Object d(Object obj) {
        return tb.f.K(this, obj);
    }

    public final c e() {
        c cVar = new c();
        cVar.f125509a = this.f125518b;
        cVar.f125510b = this.f125519c;
        cVar.f125511c = this.f125520d;
        cVar.f125512d = this.f125521e;
        cVar.f125513e = this.f125522f;
        cVar.f125514f = this.f125523g;
        return cVar;
    }

    @Override // pc.c0
    public final f0 getKey() {
        return f125517h;
    }
}

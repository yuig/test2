package jl;

import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public final class g extends bl.w {

    /* renamed from: c, reason: collision with root package name */
    public final e f76844c;

    /* renamed from: d, reason: collision with root package name */
    public final ECPoint f76845d;

    /* renamed from: e, reason: collision with root package name */
    public final ml.a f76846e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f76847f;

    public g(e eVar, ECPoint eCPoint, ml.a aVar, Integer num) {
        super(3);
        this.f76844c = eVar;
        this.f76845d = eCPoint;
        this.f76846e = aVar;
        this.f76847f = num;
    }

    @Override // bl.w
    public final Integer j() {
        return this.f76847f;
    }

    @Override // bl.w
    public final ml.a k() {
        return this.f76846e;
    }
}

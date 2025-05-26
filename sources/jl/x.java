package jl;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class x extends bl.w {

    /* renamed from: c, reason: collision with root package name */
    public final v f76917c;

    /* renamed from: d, reason: collision with root package name */
    public final BigInteger f76918d;

    /* renamed from: e, reason: collision with root package name */
    public final ml.a f76919e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f76920f;

    public x(v vVar, BigInteger bigInteger, ml.a aVar, Integer num) {
        super(3);
        this.f76917c = vVar;
        this.f76918d = bigInteger;
        this.f76919e = aVar;
        this.f76920f = num;
    }

    @Override // bl.w
    public final Integer j() {
        return this.f76920f;
    }

    @Override // bl.w
    public final ml.a k() {
        return this.f76919e;
    }
}

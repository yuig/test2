package m60;

import df.j1;

/* loaded from: classes.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85905a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85907c;

    /* renamed from: d, reason: collision with root package name */
    public final String f85908d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85909e;

    public h0(boolean z13) {
        int r03 = j1.r0(z13);
        this.f85905a = r03;
        int i13 = r03 * 6;
        this.f85907c = i13;
        this.f85908d = String.valueOf(i13);
        this.f85909e = String.valueOf(r03 * 12);
        this.f85906b = String.valueOf(r03 * 25);
    }

    @Override // m60.g0
    public final int a() {
        return this.f85907c;
    }

    @Override // m60.g0
    public final String b() {
        return this.f85906b;
    }

    @Override // m60.g0
    public final String c() {
        return this.f85906b;
    }

    @Override // m60.g0
    public final String d() {
        return this.f85908d;
    }

    @Override // m60.g0
    public final String e() {
        return this.f85909e;
    }
}

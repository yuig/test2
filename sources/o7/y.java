package o7;

import d7.n0;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.b f93207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f93208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f93210d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93211e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93212f;

    /* renamed from: g, reason: collision with root package name */
    public final int f93213g;

    /* renamed from: h, reason: collision with root package name */
    public final int f93214h;

    /* renamed from: i, reason: collision with root package name */
    public final b7.d f93215i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f93216j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f93217k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f93218l;

    public y(androidx.media3.common.b bVar, int i13, int i14, int i15, int i16, int i17, int i18, int i19, b7.d dVar, boolean z13, boolean z14, boolean z15) {
        this.f93207a = bVar;
        this.f93208b = i13;
        this.f93209c = i14;
        this.f93210d = i15;
        this.f93211e = i16;
        this.f93212f = i17;
        this.f93213g = i18;
        this.f93214h = i19;
        this.f93215i = dVar;
        this.f93216j = z13;
        this.f93217k = z14;
        this.f93218l = z15;
    }

    public final m a() {
        boolean z13 = this.f93209c == 1;
        m mVar = new m();
        mVar.f93145b = this.f93213g;
        mVar.f93146c = this.f93211e;
        mVar.f93148e = this.f93212f;
        mVar.f93144a = this.f93218l;
        mVar.f93147d = z13;
        mVar.f93149f = this.f93214h;
        return mVar;
    }

    public final boolean b(y yVar) {
        return yVar.f93209c == this.f93209c && yVar.f93213g == this.f93213g && yVar.f93211e == this.f93211e && yVar.f93212f == this.f93212f && yVar.f93210d == this.f93210d && yVar.f93216j == this.f93216j && yVar.f93217k == this.f93217k;
    }

    public final y c() {
        return new y(this.f93207a, this.f93208b, this.f93209c, this.f93210d, this.f93211e, this.f93212f, this.f93213g, 1000000, this.f93215i, this.f93216j, this.f93217k, this.f93218l);
    }

    public final long d(long j13) {
        return n0.e0(this.f93211e, j13);
    }

    public final long e(long j13) {
        return n0.e0(this.f93207a.F, j13);
    }

    public final boolean f() {
        return this.f93209c == 1;
    }
}

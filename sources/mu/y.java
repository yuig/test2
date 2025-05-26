package mu;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements m21.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f88260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88262c;

    /* renamed from: d, reason: collision with root package name */
    public final bc2.q f88263d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88264e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88265f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88266g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88267h;

    /* renamed from: i, reason: collision with root package name */
    public final String f88268i;

    /* renamed from: j, reason: collision with root package name */
    public final String f88269j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f88270k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f88271l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f88272m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f88273n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f88274o;

    /* renamed from: p, reason: collision with root package name */
    public final String f88275p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f88276q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f88277r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f88278s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f88279t;

    public y(m21.a viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        int j13 = viewModel.j();
        int i13 = viewModel.i();
        String url = viewModel.a();
        bc2.q n13 = viewModel.n();
        String c13 = viewModel.c();
        String d2 = viewModel.d();
        String k13 = viewModel.k();
        String title = viewModel.getTitle();
        String description = viewModel.getDescription();
        String pinId = viewModel.getPinId();
        Long f13 = viewModel.f();
        Long r13 = viewModel.r();
        boolean h10 = viewModel.h();
        boolean q13 = viewModel.q();
        boolean e13 = viewModel.e();
        String b13 = viewModel.b();
        boolean o13 = viewModel.o();
        boolean l13 = viewModel.l();
        Long s13 = viewModel.s();
        Boolean p13 = viewModel.p();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f88260a = j13;
        this.f88261b = i13;
        this.f88262c = url;
        this.f88263d = n13;
        this.f88264e = c13;
        this.f88265f = d2;
        this.f88266g = k13;
        this.f88267h = title;
        this.f88268i = description;
        this.f88269j = pinId;
        this.f88270k = f13;
        this.f88271l = r13;
        this.f88272m = h10;
        this.f88273n = q13;
        this.f88274o = e13;
        this.f88275p = b13;
        this.f88276q = o13;
        this.f88277r = l13;
        this.f88278s = s13;
        this.f88279t = p13;
    }

    @Override // m21.a
    public final String a() {
        return this.f88262c;
    }

    @Override // m21.a
    public final String b() {
        return this.f88275p;
    }

    @Override // m21.a
    public final String c() {
        return this.f88264e;
    }

    @Override // m21.a
    public final String d() {
        return this.f88265f;
    }

    @Override // m21.a
    public final boolean e() {
        return this.f88274o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f88260a == yVar.f88260a && this.f88261b == yVar.f88261b && Intrinsics.d(this.f88262c, yVar.f88262c) && Intrinsics.d(this.f88263d, yVar.f88263d) && Intrinsics.d(this.f88264e, yVar.f88264e) && Intrinsics.d(this.f88265f, yVar.f88265f) && Intrinsics.d(this.f88266g, yVar.f88266g) && Intrinsics.d(this.f88267h, yVar.f88267h) && Intrinsics.d(this.f88268i, yVar.f88268i) && Intrinsics.d(this.f88269j, yVar.f88269j) && Intrinsics.d(this.f88270k, yVar.f88270k) && Intrinsics.d(this.f88271l, yVar.f88271l) && this.f88272m == yVar.f88272m && this.f88273n == yVar.f88273n && this.f88274o == yVar.f88274o && Intrinsics.d(this.f88275p, yVar.f88275p) && this.f88276q == yVar.f88276q && this.f88277r == yVar.f88277r && Intrinsics.d(this.f88278s, yVar.f88278s) && Intrinsics.d(this.f88279t, yVar.f88279t) && Intrinsics.d(null, null);
    }

    @Override // m21.a
    public final Long f() {
        return this.f88270k;
    }

    @Override // m21.a
    public final String g() {
        return null;
    }

    @Override // m21.a
    public final String getDescription() {
        return this.f88268i;
    }

    @Override // m21.a
    public final String getPinId() {
        return this.f88269j;
    }

    @Override // m21.a
    public final String getTitle() {
        return this.f88267h;
    }

    @Override // m21.a
    public final boolean h() {
        return this.f88272m;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f88262c, ep.b.b(this.f88261b, Integer.hashCode(this.f88260a) * 31, 31), 31);
        bc2.q qVar = this.f88263d;
        int hashCode = (d2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str = this.f88264e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88265f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88266g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88267h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f88268i;
        int d13 = cb.d(this.f88269j, (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        Long l13 = this.f88270k;
        int hashCode6 = (d13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f88271l;
        int e13 = ep.b.e(this.f88274o, ep.b.e(this.f88273n, ep.b.e(this.f88272m, (hashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31, 31), 31), 31);
        String str6 = this.f88275p;
        int e14 = ep.b.e(this.f88277r, ep.b.e(this.f88276q, (e13 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        Long l15 = this.f88278s;
        int hashCode7 = (e14 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.f88279t;
        return Boolean.hashCode(false) + ((hashCode7 + (bool == null ? 0 : bool.hashCode())) * 961);
    }

    @Override // m21.a
    public final int i() {
        return this.f88261b;
    }

    @Override // m21.a
    public final int j() {
        return this.f88260a;
    }

    @Override // m21.a
    public final String k() {
        return this.f88266g;
    }

    @Override // m21.a
    public final boolean l() {
        return this.f88277r;
    }

    @Override // m21.a
    public final boolean m() {
        return false;
    }

    @Override // m21.a
    public final bc2.q n() {
        return this.f88263d;
    }

    @Override // m21.a
    public final boolean o() {
        return this.f88276q;
    }

    @Override // m21.a
    public final Boolean p() {
        return this.f88279t;
    }

    @Override // m21.a
    public final boolean q() {
        return this.f88273n;
    }

    @Override // m21.a
    public final Long r() {
        return this.f88271l;
    }

    @Override // m21.a
    public final Long s() {
        return this.f88278s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsCarouselItemDisplayState(width=");
        sb3.append(this.f88260a);
        sb3.append(", height=");
        sb3.append(this.f88261b);
        sb3.append(", url=");
        sb3.append(this.f88262c);
        sb3.append(", videoTracks=");
        sb3.append(this.f88263d);
        sb3.append(", imageSignature=");
        sb3.append(this.f88264e);
        sb3.append(", destinationUrl=");
        sb3.append(this.f88265f);
        sb3.append(", domain=");
        sb3.append(this.f88266g);
        sb3.append(", title=");
        sb3.append(this.f88267h);
        sb3.append(", description=");
        sb3.append(this.f88268i);
        sb3.append(", pinId=");
        sb3.append(this.f88269j);
        sb3.append(", slotId=");
        sb3.append(this.f88270k);
        sb3.append(", carouselId=");
        sb3.append(this.f88271l);
        sb3.append(", promoted=");
        sb3.append(this.f88272m);
        sb3.append(", isVTO=");
        sb3.append(this.f88273n);
        sb3.append(", isProductVideo=");
        sb3.append(this.f88274o);
        sb3.append(", dominantColor=");
        sb3.append(this.f88275p);
        sb3.append(", shouldForceMute=");
        sb3.append(this.f88276q);
        sb3.append(", isVideoTappableAllowed=");
        sb3.append(this.f88277r);
        sb3.append(", internalItemId=");
        sb3.append(this.f88278s);
        sb3.append(", isCollections=");
        return a.c.h(sb3, this.f88279t, ", imageUrlMediumResolution=null, isOnGrid=false)");
    }
}

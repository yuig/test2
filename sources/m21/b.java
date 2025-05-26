package m21;

import bc2.q;
import kotlin.jvm.internal.Intrinsics;
import tb.f;

/* loaded from: classes.dex */
public final class b extends f implements a {
    public final Boolean A;
    public final String B;
    public final boolean C;

    /* renamed from: h, reason: collision with root package name */
    public final int f85693h;

    /* renamed from: i, reason: collision with root package name */
    public final int f85694i;

    /* renamed from: j, reason: collision with root package name */
    public final String f85695j;

    /* renamed from: k, reason: collision with root package name */
    public final q f85696k;

    /* renamed from: l, reason: collision with root package name */
    public final String f85697l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85698m;

    /* renamed from: n, reason: collision with root package name */
    public final String f85699n;

    /* renamed from: o, reason: collision with root package name */
    public final String f85700o;

    /* renamed from: p, reason: collision with root package name */
    public final String f85701p;

    /* renamed from: q, reason: collision with root package name */
    public final String f85702q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f85703r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f85704s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f85705t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f85706u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f85707v;

    /* renamed from: w, reason: collision with root package name */
    public final String f85708w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f85709x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f85710y;

    /* renamed from: z, reason: collision with root package name */
    public final Long f85711z;

    public b(int i13, int i14, String url, q qVar, String str, String str2, String str3, String str4, String str5, String pinId, Long l13, Long l14, boolean z13, boolean z14, String str6, boolean z15, boolean z16, Long l15, Boolean bool, String str7, boolean z17, int i15) {
        Long l16 = (i15 & 1024) != 0 ? null : l13;
        Long l17 = (i15 & 2048) != 0 ? null : l14;
        boolean z18 = (i15 & 4096) != 0 ? false : z13;
        boolean z19 = (i15 & 16384) != 0 ? false : z14;
        String str8 = (32768 & i15) != 0 ? null : str6;
        boolean z23 = (65536 & i15) != 0 ? false : z15;
        boolean z24 = (131072 & i15) != 0 ? false : z16;
        Long l18 = (262144 & i15) != 0 ? null : l15;
        Boolean bool2 = (524288 & i15) != 0 ? Boolean.FALSE : bool;
        String str9 = (1048576 & i15) == 0 ? str7 : null;
        boolean z25 = (i15 & 2097152) != 0 ? false : z17;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f85693h = i13;
        this.f85694i = i14;
        this.f85695j = url;
        this.f85696k = qVar;
        this.f85697l = str;
        this.f85698m = str2;
        this.f85699n = str3;
        this.f85700o = str4;
        this.f85701p = str5;
        this.f85702q = pinId;
        this.f85703r = l16;
        this.f85704s = l17;
        this.f85705t = z18;
        this.f85706u = false;
        this.f85707v = z19;
        this.f85708w = str8;
        this.f85709x = z23;
        this.f85710y = z24;
        this.f85711z = l18;
        this.A = bool2;
        this.B = str9;
        this.C = z25;
    }

    @Override // m21.a
    public final String a() {
        return this.f85695j;
    }

    @Override // m21.a
    public final String b() {
        return this.f85708w;
    }

    @Override // m21.a
    public final String c() {
        return this.f85697l;
    }

    @Override // m21.a
    public final String d() {
        return this.f85698m;
    }

    @Override // m21.a
    public final boolean e() {
        return this.f85707v;
    }

    @Override // m21.a
    public final Long f() {
        return this.f85703r;
    }

    @Override // m21.a
    public final String g() {
        return this.B;
    }

    @Override // m21.a
    public final String getDescription() {
        return this.f85701p;
    }

    @Override // m21.a
    public final String getPinId() {
        return this.f85702q;
    }

    @Override // m21.a
    public final String getTitle() {
        return this.f85700o;
    }

    @Override // m21.a
    public final boolean h() {
        return this.f85705t;
    }

    @Override // m21.a
    public final int i() {
        return this.f85694i;
    }

    @Override // m21.a
    public final int j() {
        return this.f85693h;
    }

    @Override // m21.a
    public final String k() {
        return this.f85699n;
    }

    @Override // m21.a
    public final boolean l() {
        return this.f85710y;
    }

    @Override // m21.a
    public final boolean m() {
        return this.C;
    }

    @Override // m21.a
    public final q n() {
        return this.f85696k;
    }

    @Override // m21.a
    public final boolean o() {
        return this.f85709x;
    }

    @Override // m21.a
    public final Boolean p() {
        return this.A;
    }

    @Override // m21.a
    public final boolean q() {
        return this.f85706u;
    }

    @Override // m21.a
    public final Long r() {
        return this.f85704s;
    }

    @Override // m21.a
    public final Long s() {
        return this.f85711z;
    }
}

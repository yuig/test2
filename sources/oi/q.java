package oi;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f95045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95046b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95047c;

    /* renamed from: d, reason: collision with root package name */
    public final long f95048d;

    /* renamed from: e, reason: collision with root package name */
    public final long f95049e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95050f;

    /* renamed from: g, reason: collision with root package name */
    public final long f95051g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f95052h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f95053i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f95054j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f95055k;

    public q(String str, String str2, long j13) {
        this(str, str2, 0L, 0L, 0L, j13, 0L, null, null, null, null);
    }

    public final q a(Long l13, Long l14, Boolean bool) {
        return new q(this.f95045a, this.f95046b, this.f95047c, this.f95048d, this.f95049e, this.f95050f, this.f95051g, this.f95052h, l13, l14, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public q(String str, String str2, long j13, long j14, long j15, long j16, long j17, Long l13, Long l14, Long l15, Boolean bool) {
        com.bumptech.glide.d.o(str);
        com.bumptech.glide.d.o(str2);
        com.bumptech.glide.d.j(j13 >= 0);
        com.bumptech.glide.d.j(j14 >= 0);
        com.bumptech.glide.d.j(j15 >= 0);
        com.bumptech.glide.d.j(j17 >= 0);
        this.f95045a = str;
        this.f95046b = str2;
        this.f95047c = j13;
        this.f95048d = j14;
        this.f95049e = j15;
        this.f95050f = j16;
        this.f95051g = j17;
        this.f95052h = l13;
        this.f95053i = l14;
        this.f95054j = l15;
        this.f95055k = bool;
    }
}

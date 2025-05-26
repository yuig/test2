package x81;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final int f134230h;

    /* renamed from: i, reason: collision with root package name */
    public final int f134231i;

    /* renamed from: j, reason: collision with root package name */
    public final int f134232j;

    /* renamed from: k, reason: collision with root package name */
    public final int f134233k;

    /* renamed from: l, reason: collision with root package name */
    public final int f134234l;

    /* renamed from: m, reason: collision with root package name */
    public final int f134235m;

    /* renamed from: n, reason: collision with root package name */
    public final int f134236n;

    /* renamed from: o, reason: collision with root package name */
    public final int f134237o;

    /* renamed from: p, reason: collision with root package name */
    public final int f134238p;

    /* renamed from: q, reason: collision with root package name */
    public final int f134239q;

    /* renamed from: r, reason: collision with root package name */
    public final int f134240r;

    /* renamed from: s, reason: collision with root package name */
    public final int f134241s;

    /* renamed from: t, reason: collision with root package name */
    public final int f134242t;

    /* renamed from: u, reason: collision with root package name */
    public final String f134243u;

    /* renamed from: v, reason: collision with root package name */
    public final f42.c f134244v;

    public h(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25, int i26, int i27, int i28, String str, f42.c makeupCategory) {
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        this.f134230h = i13;
        this.f134231i = i14;
        this.f134232j = i15;
        this.f134233k = i16;
        this.f134234l = i17;
        this.f134235m = i18;
        this.f134236n = i19;
        this.f134237o = i23;
        this.f134238p = i24;
        this.f134239q = i25;
        this.f134240r = i26;
        this.f134241s = i27;
        this.f134242t = i28;
        this.f134243u = str;
        this.f134244v = makeupCategory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f134230h == hVar.f134230h && this.f134231i == hVar.f134231i && this.f134232j == hVar.f134232j && this.f134233k == hVar.f134233k && this.f134234l == hVar.f134234l && this.f134235m == hVar.f134235m && this.f134236n == hVar.f134236n && this.f134237o == hVar.f134237o && this.f134238p == hVar.f134238p && this.f134239q == hVar.f134239q && this.f134240r == hVar.f134240r && this.f134241s == hVar.f134241s && this.f134242t == hVar.f134242t && Intrinsics.d(this.f134243u, hVar.f134243u) && this.f134244v == hVar.f134244v;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f134242t, ep.b.b(this.f134241s, ep.b.b(this.f134240r, ep.b.b(this.f134239q, ep.b.b(this.f134238p, ep.b.b(this.f134237o, ep.b.b(this.f134236n, ep.b.b(this.f134235m, ep.b.b(this.f134234l, ep.b.b(this.f134233k, ep.b.b(this.f134232j, ep.b.b(this.f134231i, Integer.hashCode(this.f134230h) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str = this.f134243u;
        return this.f134244v.hashCode() + ((b13 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MakeupProductViewModel(color=" + this.f134230h + ", amount=" + this.f134231i + ", glitter=" + this.f134232j + ", gloss=" + this.f134233k + ", glossDetail=" + this.f134234l + ", wetness=" + this.f134235m + ", envMappingIntensity=" + this.f134236n + ", glitterColor=" + this.f134237o + ", glitterDensity=" + this.f134238p + ", glitterSize=" + this.f134239q + ", glitterBaseReflectivity=" + this.f134240r + ", glitterColorVariation=" + this.f134241s + ", glitterSizeVariation=" + this.f134242t + ", placement=" + this.f134243u + ", makeupCategory=" + this.f134244v + ")";
    }
}

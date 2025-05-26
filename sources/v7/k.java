package v7;

import androidx.media3.common.DrmInitData;
import java.util.List;
import java.util.Map;
import pk.c1;
import pk.h1;

/* loaded from: classes3.dex */
public final class k extends o {

    /* renamed from: d, reason: collision with root package name */
    public final int f124301d;

    /* renamed from: e, reason: collision with root package name */
    public final long f124302e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f124303f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f124304g;

    /* renamed from: h, reason: collision with root package name */
    public final long f124305h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f124306i;

    /* renamed from: j, reason: collision with root package name */
    public final int f124307j;

    /* renamed from: k, reason: collision with root package name */
    public final long f124308k;

    /* renamed from: l, reason: collision with root package name */
    public final int f124309l;

    /* renamed from: m, reason: collision with root package name */
    public final long f124310m;

    /* renamed from: n, reason: collision with root package name */
    public final long f124311n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f124312o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f124313p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f124314q;

    /* renamed from: r, reason: collision with root package name */
    public final c1 f124315r;

    /* renamed from: s, reason: collision with root package name */
    public final c1 f124316s;

    /* renamed from: t, reason: collision with root package name */
    public final h1 f124317t;

    /* renamed from: u, reason: collision with root package name */
    public final long f124318u;

    /* renamed from: v, reason: collision with root package name */
    public final j f124319v;

    /* renamed from: w, reason: collision with root package name */
    public final c1 f124320w;

    public k(int i13, String str, List list, long j13, boolean z13, long j14, boolean z14, int i14, long j15, int i15, long j16, long j17, boolean z15, boolean z16, boolean z17, DrmInitData drmInitData, List list2, List list3, j jVar, Map map, List list4) {
        super(str, list, z15);
        this.f124301d = i13;
        this.f124305h = j14;
        this.f124304g = z13;
        this.f124306i = z14;
        this.f124307j = i14;
        this.f124308k = j15;
        this.f124309l = i15;
        this.f124310m = j16;
        this.f124311n = j17;
        this.f124312o = z16;
        this.f124313p = z17;
        this.f124314q = drmInitData;
        this.f124315r = c1.r(list2);
        this.f124316s = c1.r(list3);
        this.f124317t = h1.c(map);
        this.f124320w = c1.r(list4);
        if (!list3.isEmpty()) {
            f fVar = (f) com.bumptech.glide.c.P(list3);
            this.f124318u = fVar.f124289e + fVar.f124287c;
        } else if (list2.isEmpty()) {
            this.f124318u = 0L;
        } else {
            h hVar = (h) com.bumptech.glide.c.P(list2);
            this.f124318u = hVar.f124289e + hVar.f124287c;
        }
        this.f124302e = j13 != -9223372036854775807L ? j13 >= 0 ? Math.min(this.f124318u, j13) : Math.max(0L, this.f124318u + j13) : -9223372036854775807L;
        this.f124303f = j13 >= 0;
        this.f124319v = jVar;
    }

    @Override // z7.n
    public final Object a(List list) {
        return this;
    }
}

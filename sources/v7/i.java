package v7;

import androidx.media3.common.DrmInitData;

/* loaded from: classes3.dex */
public abstract class i implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f124285a;

    /* renamed from: b, reason: collision with root package name */
    public final h f124286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f124287c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124288d;

    /* renamed from: e, reason: collision with root package name */
    public final long f124289e;

    /* renamed from: f, reason: collision with root package name */
    public final DrmInitData f124290f;

    /* renamed from: g, reason: collision with root package name */
    public final String f124291g;

    /* renamed from: h, reason: collision with root package name */
    public final String f124292h;

    /* renamed from: i, reason: collision with root package name */
    public final long f124293i;

    /* renamed from: j, reason: collision with root package name */
    public final long f124294j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f124295k;

    public i(String str, h hVar, long j13, int i13, long j14, DrmInitData drmInitData, String str2, String str3, long j15, long j16, boolean z13) {
        this.f124285a = str;
        this.f124286b = hVar;
        this.f124287c = j13;
        this.f124288d = i13;
        this.f124289e = j14;
        this.f124290f = drmInitData;
        this.f124291g = str2;
        this.f124292h = str3;
        this.f124293i = j15;
        this.f124294j = j16;
        this.f124295k = z13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l13 = (Long) obj;
        long longValue = l13.longValue();
        long j13 = this.f124289e;
        if (j13 > longValue) {
            return 1;
        }
        return j13 < l13.longValue() ? -1 : 0;
    }
}

package jc0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f75439a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75440b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75441c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75442d;

    /* renamed from: e, reason: collision with root package name */
    public final long f75443e;

    public v(b bVar) {
        this(bVar, false, 0L, 30);
    }

    public v(a0 a0Var, boolean z13, long j13, int i13) {
        z13 = (i13 & 2) != 0 ? false : z13;
        j13 = (i13 & 16) != 0 ? 200L : j13;
        this.f75439a = a0Var;
        this.f75440b = z13;
        this.f75441c = false;
        this.f75442d = true;
        this.f75443e = j13;
    }
}

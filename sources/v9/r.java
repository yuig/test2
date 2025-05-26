package v9;

import q8.k0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f124737a;

    /* renamed from: b, reason: collision with root package name */
    public long f124738b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f124739c;

    /* renamed from: d, reason: collision with root package name */
    public int f124740d;

    /* renamed from: e, reason: collision with root package name */
    public long f124741e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124742f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124743g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f124744h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124745i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124746j;

    /* renamed from: k, reason: collision with root package name */
    public long f124747k;

    /* renamed from: l, reason: collision with root package name */
    public long f124748l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124749m;

    public r(k0 k0Var) {
        this.f124737a = k0Var;
    }

    public final void a(int i13) {
        long j13 = this.f124748l;
        if (j13 != -9223372036854775807L) {
            long j14 = this.f124738b;
            long j15 = this.f124747k;
            if (j14 == j15) {
                return;
            }
            boolean z13 = this.f124749m;
            this.f124737a.a(j13, z13 ? 1 : 0, (int) (j14 - j15), i13, null);
        }
    }
}

package k9;

import d7.n0;
import q8.e0;

/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final f f78660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f78661b;

    /* renamed from: c, reason: collision with root package name */
    public final long f78662c;

    /* renamed from: d, reason: collision with root package name */
    public final i f78663d;

    /* renamed from: e, reason: collision with root package name */
    public int f78664e;

    /* renamed from: f, reason: collision with root package name */
    public long f78665f;

    /* renamed from: g, reason: collision with root package name */
    public long f78666g;

    /* renamed from: h, reason: collision with root package name */
    public long f78667h;

    /* renamed from: i, reason: collision with root package name */
    public long f78668i;

    /* renamed from: j, reason: collision with root package name */
    public long f78669j;

    /* renamed from: k, reason: collision with root package name */
    public long f78670k;

    /* renamed from: l, reason: collision with root package name */
    public long f78671l;

    public b(i iVar, long j13, long j14, long j15, long j16, boolean z13) {
        bf.b.i(j13 >= 0 && j14 > j13);
        this.f78663d = iVar;
        this.f78661b = j13;
        this.f78662c = j14;
        if (j15 == j14 - j13 || z13) {
            this.f78665f = j16;
            this.f78664e = 4;
        } else {
            this.f78664e = 0;
        }
        this.f78660a = new f();
    }

    @Override // k9.g
    public final e0 J() {
        if (this.f78665f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // k9.g
    public final void R(long j13) {
        this.f78667h = n0.j(j13, 0L, this.f78665f - 1);
        this.f78664e = 2;
        this.f78668i = this.f78661b;
        this.f78669j = this.f78662c;
        this.f78670k = 0L;
        this.f78671l = this.f78665f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // k9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(q8.t r25) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.f(q8.t):long");
    }
}

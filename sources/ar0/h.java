package ar0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20386d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20387e;

    /* renamed from: f, reason: collision with root package name */
    public int f20388f;

    /* renamed from: g, reason: collision with root package name */
    public int f20389g;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (kotlin.text.z.p(r0, "enabled", false) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.lang.String r4, lh0.o r5) {
        /*
            r3 = this;
            java.lang.String r0 = "experimentName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "experimentHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.<init>()
            lh0.z3 r0 = lh0.z3.ACTIVATE_EXPERIMENT
            java.lang.String r0 = r5.e(r4, r0)
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.String r2 = "enabled"
            boolean r0 = kotlin.text.z.p(r0, r2, r1)
            r2 = 1
            if (r0 != r2) goto L20
            goto L21
        L20:
            r2 = r1
        L21:
            r3.f20383a = r2
            lh0.z3 r0 = lh0.z3.DO_NOT_ACTIVATE_EXPERIMENT
            java.lang.String r2 = "acc"
            int r2 = r5.j(r4, r2, r1, r0)
            r3.f20384b = r2
            java.lang.String r2 = "decc"
            int r1 = r5.j(r4, r2, r1, r0)
            r3.f20385c = r1
            java.lang.String r1 = "max"
            r2 = 9
            int r1 = r5.j(r4, r1, r2, r0)
            r3.f20386d = r1
            java.lang.String r1 = "min"
            int r1 = r5.j(r4, r1, r2, r0)
            r3.f20387e = r1
            java.lang.String r1 = "init"
            int r4 = r5.j(r4, r1, r2, r0)
            r3.f20388f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ar0.h.<init>(java.lang.String, lh0.o):void");
    }

    public final void a() {
        if (this.f20383a) {
            if (this.f20389g > 0) {
                this.f20389g = 0;
            }
            int max = Math.max(this.f20389g - this.f20385c, -4);
            int i13 = this.f20388f;
            int i14 = i13 + max;
            int i15 = this.f20387e;
            if (i14 <= i15) {
                this.f20388f = i15;
            } else {
                this.f20389g = max;
                this.f20388f = i13 + max;
            }
        }
    }

    public final void b() {
        if (this.f20383a) {
            if (this.f20389g < 0) {
                this.f20389g = 0;
            }
            int min = Math.min(this.f20389g + this.f20384b, 4);
            int i13 = this.f20388f;
            int i14 = i13 + min;
            int i15 = this.f20386d;
            if (i14 >= i15) {
                this.f20388f = i15;
            } else {
                this.f20389g = min;
                this.f20388f = i13 + min;
            }
        }
    }
}

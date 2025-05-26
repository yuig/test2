package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f130740a;

    /* renamed from: b, reason: collision with root package name */
    public final j f130741b;

    /* renamed from: c, reason: collision with root package name */
    public z f130742c;

    /* renamed from: d, reason: collision with root package name */
    public int f130743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f130744e;

    /* renamed from: f, reason: collision with root package name */
    public long f130745f;

    public w(l upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f130740a = upstream;
        j l13 = upstream.l();
        this.f130741b = l13;
        z zVar = l13.f130710a;
        this.f130742c = zVar;
        this.f130743d = zVar != null ? zVar.f130753b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f130744e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 == r5.f130753b) goto L15;
     */
    @Override // wo2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(wo2.j r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L77
            boolean r3 = r8.f130744e
            r3 = r3 ^ 1
            if (r3 == 0) goto L6b
            wo2.z r3 = r8.f130742c
            wo2.j r4 = r8.f130741b
            if (r3 == 0) goto L32
            wo2.z r5 = r4.f130710a
            if (r3 != r5) goto L26
            int r3 = r8.f130743d
            kotlin.jvm.internal.Intrinsics.f(r5)
            int r5 = r5.f130753b
            if (r3 != r5) goto L26
            goto L32
        L26:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L32:
            if (r2 != 0) goto L35
            return r0
        L35:
            long r0 = r8.f130745f
            r2 = 1
            long r0 = r0 + r2
            wo2.l r2 = r8.f130740a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L45
            r9 = -1
            return r9
        L45:
            wo2.z r0 = r8.f130742c
            if (r0 != 0) goto L53
            wo2.z r0 = r4.f130710a
            if (r0 == 0) goto L53
            r8.f130742c = r0
            int r0 = r0.f130753b
            r8.f130743d = r0
        L53:
            long r0 = r4.f130711b
            long r2 = r8.f130745f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            wo2.j r2 = r8.f130741b
            long r3 = r8.f130745f
            r5 = r10
            r7 = r9
            r2.h(r3, r5, r7)
            long r0 = r8.f130745f
            long r0 = r0 + r10
            r8.f130745f = r0
            return r10
        L6b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L77:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = a.a.g(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.w.read(wo2.j, long):long");
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return this.f130740a.timeout();
    }
}

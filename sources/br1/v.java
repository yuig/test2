package br1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f0 f23823i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n4.e f23824j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f23825k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f0 f0Var, n4.e eVar, boolean z13) {
        super(3);
        this.f23823i = f0Var;
        this.f23824j = eVar;
        this.f23825k = z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if ((r8.d() / (r6 != null ? r6.f89175a : Integer.MAX_VALUE)) < 1.4f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        r8 = u2.n.f120041b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r5 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (((n4.e) r10.getValue()) == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r3.f23783d == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        r8 = androidx.compose.foundation.layout.b.d(r8, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r9.W(641868591);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r5 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        r9.W(641872797);
        r4 = r9.h(r6);
        r5 = r9.J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r4 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r5 != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r9.r(false);
        i2.u.e(r6, (kotlin.jvm.functions.Function2) r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        r5 = new br1.u(r6, r10, null);
        r9.g0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        r9.r(false);
        br1.e0.m(r3, r8, r9, 8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r8 = br1.e0.f23779a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        r4 = (n4.e) r10.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r4 = r4.f89175a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        r8 = androidx.compose.foundation.layout.e.e(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        if (r7.f23825k == false) goto L30;
     */
    @Override // kl2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            androidx.compose.foundation.layout.d r8 = (androidx.compose.foundation.layout.d) r8
            i2.o r9 = (i2.o) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.String r0 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r10 & 14
            if (r0 != 0) goto L20
            r0 = r9
            i2.s r0 = (i2.s) r0
            boolean r0 = r0.h(r8)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r10 = r10 | r0
        L20:
            r10 = r10 & 91
            r0 = 18
            if (r10 != r0) goto L35
            r10 = r9
            i2.s r10 = (i2.s) r10
            boolean r0 = r10.z()
            if (r0 != 0) goto L30
            goto L35
        L30:
            r10.Q()
            goto Ld9
        L35:
            i2.s r9 = (i2.s) r9
            r10 = 641847077(0x2641cf25, float:6.724106E-16)
            r9.W(r10)
            java.lang.Object r10 = r9.J()
            am.d r0 = i2.n.f71185a
            r1 = 0
            if (r10 != r0) goto L4f
            i2.y3 r10 = i2.y3.f71400a
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = bs1.c.u1(r1, r10)
            r9.g0(r10)
        L4f:
            i2.q1 r10 = (i2.q1) r10
            r2 = 0
            r9.r(r2)
            br1.f0 r3 = r7.f23823i
            boolean r4 = r3.f23784e
            r5 = 1
            n4.e r6 = r7.f23824j
            if (r4 == 0) goto L76
            float r8 = r8.d()
            if (r6 == 0) goto L67
            float r4 = r6.f89175a
            goto L6b
        L67:
            r4 = 2147483647(0x7fffffff, float:NaN)
            float r4 = (float) r4
        L6b:
            float r8 = r8 / r4
            r4 = 1068708659(0x3fb33333, float:1.4)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L74
            goto L7a
        L74:
            r5 = r2
            goto L7a
        L76:
            boolean r8 = r7.f23825k
            if (r8 != 0) goto L74
        L7a:
            u2.n r8 = u2.n.f120041b
            if (r5 != 0) goto L95
            java.lang.Object r4 = r10.getValue()
            n4.e r4 = (n4.e) r4
            if (r4 == 0) goto L87
            goto L95
        L87:
            boolean r4 = r3.f23783d
            if (r4 == 0) goto L92
            r4 = 1065353216(0x3f800000, float:1.0)
            u2.q r8 = androidx.compose.foundation.layout.b.d(r8, r4)
            goto La5
        L92:
            u2.q r8 = br1.e0.f23779a
            goto La5
        L95:
            java.lang.Object r4 = r10.getValue()
            n4.e r4 = (n4.e) r4
            if (r4 == 0) goto La0
            float r4 = r4.f89175a
            goto La1
        La0:
            float r4 = (float) r2
        La1:
            u2.q r8 = androidx.compose.foundation.layout.e.e(r8, r4)
        La5:
            r4 = 641868591(0x2642232f, float:6.7354954E-16)
            r9.W(r4)
            if (r5 == 0) goto Ld1
            if (r6 == 0) goto Ld1
            r4 = 641872797(0x2642339d, float:6.737722E-16)
            r9.W(r4)
            boolean r4 = r9.h(r6)
            java.lang.Object r5 = r9.J()
            if (r4 != 0) goto Lc1
            if (r5 != r0) goto Lc9
        Lc1:
            br1.u r5 = new br1.u
            r5.<init>(r6, r10, r1)
            r9.g0(r5)
        Lc9:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r9.r(r2)
            i2.u.e(r6, r5, r9)
        Ld1:
            r9.r(r2)
            r10 = 8
            br1.e0.m(r3, r8, r9, r10, r2)
        Ld9:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.v.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}

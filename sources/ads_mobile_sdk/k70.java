package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class k70 implements a.cd {

    /* renamed from: b */
    public int f7143b;

    /* renamed from: a */
    public final mo2.a f7142a = mo2.d.a();

    /* renamed from: c */
    public final kl0 f7144c = kl0.GMSG_DELAY_PAGE_CLOSED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:26:0x0064, B:28:0x006d, B:29:0x0082, B:31:0x0086, B:34:0x008c, B:40:0x0073, B:42:0x007c), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:26:0x0064, B:28:0x006d, B:29:0x0082, B:31:0x0086, B:34:0x008c, B:40:0x0073, B:42:0x007c), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:26:0x0064, B:28:0x006d, B:29:0x0082, B:31:0x0086, B:34:0x008c, B:40:0x0073, B:42:0x007c), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v13, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [mo2.a] */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r8, java.util.Map r9, bl2.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.j70
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.j70 r0 = (ads_mobile_sdk.j70) r0
            int r1 = r0.f6714g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6714g = r1
            goto L18
        L13:
            ads_mobile_sdk.j70 r0 = new ads_mobile_sdk.j70
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f6712e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6714g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f6708a
            mo2.a r8 = (mo2.a) r8
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L30
            goto La0
        L30:
            r9 = move-exception
            goto La8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            mo2.a r8 = r0.f6711d
            java.util.Map r9 = r0.f6710c
            ads_mobile_sdk.ym0 r2 = r0.f6709b
            java.lang.Object r6 = r0.f6708a
            ads_mobile_sdk.k70 r6 = (ads_mobile_sdk.k70) r6
            ue.c.H(r10)
            r10 = r8
            r8 = r2
            goto L64
        L4b:
            ue.c.H(r10)
            mo2.a r10 = r7.f7142a
            r0.f6708a = r7
            r0.f6709b = r8
            r0.f6710c = r9
            r0.f6711d = r10
            r0.f6714g = r4
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r2 = r10.f(r5, r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r7
        L64:
            java.lang.String r2 = "start"
            boolean r2 = r9.containsKey(r2)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L73
            int r9 = r6.f7143b     // Catch: java.lang.Throwable -> L9d
            int r9 = r9 + r4
            r6.f7143b = r9     // Catch: java.lang.Throwable -> L9d
            goto L82
        L73:
            java.lang.String r2 = "stop"
            boolean r9 = r9.containsKey(r2)     // Catch: java.lang.Throwable -> L9d
            if (r9 == 0) goto L82
            int r9 = r6.f7143b     // Catch: java.lang.Throwable -> L9d
            int r9 = r9 + (-1)
            r6.f7143b = r9     // Catch: java.lang.Throwable -> L9d
        L82:
            a.d3 r8 = r8.f14327m     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L9f
            int r9 = r6.f7143b     // Catch: java.lang.Throwable -> L9d
            if (r9 <= 0) goto L8b
            goto L8c
        L8b:
            r4 = 0
        L8c:
            r0.f6708a = r10     // Catch: java.lang.Throwable -> L9d
            r0.f6709b = r5     // Catch: java.lang.Throwable -> L9d
            r0.f6710c = r5     // Catch: java.lang.Throwable -> L9d
            r0.f6711d = r5     // Catch: java.lang.Throwable -> L9d
            r0.f6714g = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r8 = r8.a(r4, r0)     // Catch: java.lang.Throwable -> L9d
            if (r8 != r1) goto L9f
            return r1
        L9d:
            r8 = move-exception
            goto Laa
        L9f:
            r8 = r10
        La0:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L30
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            return r9
        La8:
            r10 = r8
            goto Lab
        Laa:
            r9 = r8
        Lab:
            mo2.c r10 = (mo2.c) r10
            r10.i(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.k70.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return this.f7144c;
    }
}

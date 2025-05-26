package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ol1 {

    /* renamed from: a, reason: collision with root package name */
    public final sb2 f9355a;

    /* renamed from: b, reason: collision with root package name */
    public final lz2 f9356b;

    /* renamed from: c, reason: collision with root package name */
    public final a.e2 f9357c;

    /* renamed from: d, reason: collision with root package name */
    public ym0 f9358d;

    public ol1(sb2 rootTraceCreator, lz2 webViewFactory, a.e2 nativeOnePointFiveClickOverlayConfigurator) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(nativeOnePointFiveClickOverlayConfigurator, "nativeOnePointFiveClickOverlayConfigurator");
        this.f9355a = rootTraceCreator;
        this.f9356b = webViewFactory;
        this.f9357c = nativeOnePointFiveClickOverlayConfigurator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0177 A[Catch: all -> 0x0187, TryCatch #5 {all -> 0x0187, blocks: (B:23:0x0170, B:25:0x0177, B:27:0x017e, B:29:0x0182, B:31:0x0186, B:32:0x018a, B:33:0x018f, B:34:0x0190, B:35:0x0197, B:36:0x0198, B:37:0x019f, B:38:0x01a0), top: B:22:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a0 A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #5 {all -> 0x0187, blocks: (B:23:0x0170, B:25:0x0177, B:27:0x017e, B:29:0x0182, B:31:0x0186, B:32:0x018a, B:33:0x018f, B:34:0x0190, B:35:0x0197, B:36:0x0198, B:37:0x019f, B:38:0x01a0), top: B:22:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1 A[Catch: all -> 0x0101, TryCatch #1 {all -> 0x0101, blocks: (B:69:0x00ea, B:71:0x00f1, B:73:0x00f8, B:75:0x00fc, B:77:0x0100, B:78:0x0104, B:79:0x0109, B:80:0x010a, B:81:0x0111, B:82:0x0112, B:83:0x0119, B:84:0x011a), top: B:68:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011a A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #1 {all -> 0x0101, blocks: (B:69:0x00ea, B:71:0x00f1, B:73:0x00f8, B:75:0x00fc, B:77:0x0100, B:78:0x0104, B:79:0x0109, B:80:0x010a, B:81:0x0111, B:82:0x0112, B:83:0x0119, B:84:0x011a), top: B:68:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d5  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v25, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r6v10, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ads_mobile_sdk.cs2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ol1 r16, bl2.c r17) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ol1.a(ads_mobile_sdk.ol1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.ol1 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.nl1
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.nl1 r0 = (ads_mobile_sdk.nl1) r0
            int r1 = r0.f8861d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8861d = r1
            goto L18
        L13:
            ads_mobile_sdk.nl1 r0 = new ads_mobile_sdk.nl1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8859b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8861d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.ol1 r4 = r0.f8858a
            ue.c.H(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r5)
            ads_mobile_sdk.ym0 r5 = r4.f9358d
            if (r5 == 0) goto L43
            r0.f8858a = r4
            r0.f8861d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r5 = 0
            r4.f9358d = r5
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ol1.b(ads_mobile_sdk.ol1, bl2.c):java.lang.Object");
    }
}

package ads_mobile_sdk;

import ao2.j0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sy0 implements a.n8 {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f11280a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f11281b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f11282c;

    /* renamed from: d, reason: collision with root package name */
    public final mo2.a f11283d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11284e;

    /* renamed from: f, reason: collision with root package name */
    public int f11285f;

    public sy0(ym0 webView, j0 backgroundScope, sb2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f11280a = webView;
        this.f11281b = backgroundScope;
        this.f11282c = rootTraceCreator;
        this.f11283d = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0164 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #4 {all -> 0x0039, blocks: (B:12:0x0034, B:13:0x015e, B:15:0x0164), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017a A[Catch: all -> 0x018a, TryCatch #5 {all -> 0x018a, blocks: (B:23:0x0173, B:25:0x017a, B:27:0x0181, B:29:0x0185, B:31:0x0189, B:32:0x018d, B:33:0x0192, B:34:0x0193, B:35:0x019a, B:36:0x019b, B:37:0x01a2, B:38:0x01a3), top: B:22:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a3 A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #5 {all -> 0x018a, blocks: (B:23:0x0173, B:25:0x017a, B:27:0x0181, B:29:0x0185, B:31:0x0189, B:32:0x018d, B:33:0x0192, B:34:0x0193, B:35:0x019a, B:36:0x019b, B:37:0x01a2, B:38:0x01a3), top: B:22:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #7 {all -> 0x004d, blocks: (B:51:0x0048, B:52:0x00c9, B:54:0x00cf), top: B:50:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:60:0x00df, B:62:0x00e6, B:64:0x00ed, B:66:0x00f1, B:68:0x00f5, B:69:0x00f9, B:70:0x00fe, B:71:0x00ff, B:72:0x0106, B:73:0x0107, B:74:0x010e, B:75:0x010f), top: B:59:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #3 {all -> 0x00f6, blocks: (B:60:0x00df, B:62:0x00e6, B:64:0x00ed, B:66:0x00f1, B:68:0x00f5, B:69:0x00f9, B:70:0x00fe, B:71:0x00ff, B:72:0x0106, B:73:0x0107, B:74:0x010e, B:75:0x010f), top: B:59:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.sy0 r16, java.lang.String r17, java.lang.String r18, java.util.UUID r19, bl2.c r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy0.a(ads_mobile_sdk.sy0, java.lang.String, java.lang.String, java.util.UUID, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ny0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ny0 r0 = (ads_mobile_sdk.ny0) r0
            int r1 = r0.f9054e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9054e = r1
            goto L18
        L13:
            ads_mobile_sdk.ny0 r0 = new ads_mobile_sdk.ny0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f9052c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9054e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r8)
            goto L6a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            mo2.a r2 = r0.f9051b
            ads_mobile_sdk.sy0 r6 = r0.f9050a
            ue.c.H(r8)
            goto L51
        L3b:
            ue.c.H(r8)
            mo2.a r8 = r7.f11283d
            r0.f9050a = r7
            r0.f9051b = r8
            r0.f9054e = r4
            r2 = r8
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r8 = r2.f(r5, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r6 = r7
        L51:
            int r8 = r6.f11285f     // Catch: java.lang.Throwable -> L6d
            int r8 = r8 - r4
            r6.f11285f = r8     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6d
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            r0.f9050a = r5
            r0.f9051b = r5
            r0.f9054e = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L6d:
            r8 = move-exception
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy0.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.oy0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.oy0 r0 = (ads_mobile_sdk.oy0) r0
            int r1 = r0.f9489e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9489e = r1
            goto L18
        L13:
            ads_mobile_sdk.oy0 r0 = new ads_mobile_sdk.oy0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f9487c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9489e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            mo2.a r2 = r0.f9486b
            ads_mobile_sdk.sy0 r6 = r0.f9485a
            ue.c.H(r8)
            goto L51
        L3b:
            ue.c.H(r8)
            mo2.a r8 = r7.f11283d
            r0.f9485a = r7
            r0.f9486b = r8
            r0.f9489e = r4
            r2 = r8
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r8 = r2.f(r5, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r6 = r7
        L51:
            r6.f11284e = r4     // Catch: java.lang.Throwable -> L6a
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6a
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            r0.f9485a = r5
            r0.f9486b = r5
            r0.f9489e = r3
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L6a:
            r8 = move-exception
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy0.c(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.py0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.py0 r0 = (ads_mobile_sdk.py0) r0
            int r1 = r0.f9856e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9856e = r1
            goto L18
        L13:
            ads_mobile_sdk.py0 r0 = new ads_mobile_sdk.py0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9854c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9856e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f9853b
            ads_mobile_sdk.sy0 r0 = r0.f9852a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f11283d
            r0.f9852a = r5
            r0.f9853b = r6
            r0.f9856e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            int r6 = r0.f11285f     // Catch: java.lang.Throwable -> L57
            int r6 = r6 + r3
            r0.f11285f = r6     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L57
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L57:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy0.d(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.qy0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.qy0 r0 = (ads_mobile_sdk.qy0) r0
            int r1 = r0.f10322e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10322e = r1
            goto L18
        L13:
            ads_mobile_sdk.qy0 r0 = new ads_mobile_sdk.qy0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10320c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10322e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            mo2.a r1 = r0.f10319b
            ads_mobile_sdk.sy0 r0 = r0.f10318a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f11283d
            r0.f10318a = r5
            r0.f10319b = r6
            r0.f10322e = r4
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r3, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            boolean r6 = r0.f11284e     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            int r6 = r0.f11285f     // Catch: java.lang.Throwable -> L5e
            if (r6 > 0) goto L60
            ao2.j0 r6 = r0.f11281b     // Catch: java.lang.Throwable -> L5e
            ads_mobile_sdk.ry0 r2 = new ads_mobile_sdk.ry0     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L5e
            r0 = 3
            kotlin.jvm.internal.j.z(r6, r3, r3, r2, r0)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L68
        L60:
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L5e
            mo2.c r1 = (mo2.c) r1
            r1.i(r3)
            return r6
        L68:
            mo2.c r1 = (mo2.c) r1
            r1.i(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sy0.e(bl2.c):java.lang.Object");
    }

    @Override // a.n8
    public final Object a(String str, String str2, bl2.c cVar) {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        return a(this, str, str2, randomUUID, cVar);
    }

    @Override // a.n8
    public final Object a(nm.u uVar, String str, bl2.c cVar) {
        Object a13 = this.f11280a.a(uVar, str, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}

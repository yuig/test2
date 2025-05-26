package ads_mobile_sdk;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class kb0 implements a.n8 {

    /* renamed from: a, reason: collision with root package name */
    public final mo2.a f7205a = mo2.d.a();

    /* renamed from: b, reason: collision with root package name */
    public sy0 f7206b;

    public abstract Object a(String str, bl2.c cVar);

    @Override // a.n8
    public final Object a(String str, String str2, bl2.c cVar) {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        return a(new cb0(str, str2, randomUUID, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ads_mobile_sdk.sy0 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.ab0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.ab0 r0 = (ads_mobile_sdk.ab0) r0
            int r1 = r0.f2347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2347e = r1
            goto L18
        L13:
            ads_mobile_sdk.ab0 r0 = new ads_mobile_sdk.ab0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2345c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2347e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ads_mobile_sdk.sy0 r6 = r0.f2344b
            ads_mobile_sdk.kb0 r2 = r0.f2343a
            ue.c.H(r7)
            goto L51
        L3a:
            ue.c.H(r7)
            ads_mobile_sdk.sy0 r7 = r5.f7206b
            r5.f7206b = r6
            if (r7 == 0) goto L50
            r0.f2343a = r5
            r0.f2344b = r6
            r0.f2347e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            r7 = 0
            r0.f2343a = r7
            r0.f2344b = r7
            r0.f2347e = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.b(ads_mobile_sdk.sy0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v11, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ads_mobile_sdk.sy0 r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.bb0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.bb0 r0 = (ads_mobile_sdk.bb0) r0
            int r1 = r0.f2812f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2812f = r1
            goto L18
        L13:
            ads_mobile_sdk.bb0 r0 = new ads_mobile_sdk.bb0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f2810d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2812f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f2807a
            mo2.a r8 = (mo2.a) r8
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r9 = move-exception
            goto L7a
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            mo2.a r8 = r0.f2809c
            ads_mobile_sdk.sy0 r2 = r0.f2808b
            java.lang.Object r4 = r0.f2807a
            ads_mobile_sdk.kb0 r4 = (ads_mobile_sdk.kb0) r4
            ue.c.H(r9)
            r9 = r8
            r8 = r2
            goto L5e
        L47:
            ue.c.H(r9)
            mo2.a r9 = r7.f7205a
            r0.f2807a = r7
            r0.f2808b = r8
            r0.f2809c = r9
            r0.f2812f = r4
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r2 = r9.f(r5, r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r4 = r7
        L5e:
            r0.f2807a = r9     // Catch: java.lang.Throwable -> L76
            r0.f2808b = r5     // Catch: java.lang.Throwable -> L76
            r0.f2809c = r5     // Catch: java.lang.Throwable -> L76
            r0.f2812f = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = r4.b(r8, r0)     // Catch: java.lang.Throwable -> L76
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r8 = r9
        L6e:
            kotlin.Unit r9 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L2f
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            return r9
        L76:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7a:
            mo2.c r8 = (mo2.c) r8
            r8.i(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.c(ads_mobile_sdk.sy0, bl2.c):java.lang.Object");
    }

    @Override // a.n8
    public final Object a(nm.u uVar, String str, bl2.c cVar) {
        Object a13 = a(new db0(uVar, str, null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v10, types: [ads_mobile_sdk.sy0] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.cb0 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.a(ads_mobile_sdk.cb0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:28:0x0047, B:29:0x0095, B:31:0x009b, B:32:0x009e), top: B:27:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #1 {all -> 0x00c6, blocks: (B:28:0x0047, B:29:0x0095, B:31:0x009b, B:32:0x009e), top: B:27:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v13, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r10) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.fb0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.fb0 r0 = (ads_mobile_sdk.fb0) r0
            int r1 = r0.f5096e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5096e = r1
            goto L18
        L13:
            ads_mobile_sdk.fb0 r0 = new ads_mobile_sdk.fb0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f5094c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5096e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f5093b
            ads_mobile_sdk.kb0 r0 = r0.f5092a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f7205a
            r0.f5092a = r5
            r0.f5093b = r6
            r0.f5096e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            ads_mobile_sdk.sy0 r6 = r0.f7206b     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L5b
            ads_mobile_sdk.ym0 r6 = r6.f11280a     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.f14324j     // Catch: java.lang.Throwable -> L59
            boolean r6 = r6.get()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L5b
            goto L5c
        L59:
            r6 = move-exception
            goto L66
        L5b:
            r3 = 0
        L5c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L59
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L66:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.c(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.db0 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kb0.a(ads_mobile_sdk.db0, bl2.c):java.lang.Object");
    }

    public Object a(sy0 sy0Var, bl2.c cVar) {
        return Unit.f80348a;
    }
}

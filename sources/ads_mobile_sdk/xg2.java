package ads_mobile_sdk;

import a.zb;
import android.os.Bundle;
import ao2.j0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xg2 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f13655a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f13656b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f13657c;

    /* renamed from: d, reason: collision with root package name */
    public final sb2 f13658d;

    /* renamed from: e, reason: collision with root package name */
    public final a.v7 f13659e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13660f;

    /* renamed from: g, reason: collision with root package name */
    public final mo2.a f13661g;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f13662i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f13663j;

    public xg2(j0 backgroundScope, oh0 flags, zb clock, sb2 rootTraceCreator, a.o8 signalComponentProvider) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(signalComponentProvider, "signalComponentProvider");
        this.f13655a = backgroundScope;
        this.f13656b = flags;
        this.f13657c = clock;
        this.f13658d = rootTraceCreator;
        this.f13659e = signalComponentProvider;
        this.f13661g = mo2.d.a();
        this.f13662i = new LinkedHashMap();
        this.f13663j = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #6 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x0134, B:16:0x0136, B:18:0x013a, B:26:0x004b, B:27:0x011e), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #4 {all -> 0x0058, blocks: (B:29:0x0054, B:30:0x00ba, B:31:0x00bc, B:33:0x00c0, B:37:0x005f, B:38:0x00a5), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r16v0, types: [ads_mobile_sdk.xg2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v24, types: [ads_mobile_sdk.cs2, ads_mobile_sdk.p12] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v19, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v20, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r3v22, types: [ads_mobile_sdk.cs2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.xg2 r16, boolean r17, bl2.c r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xg2.b(ads_mobile_sdk.xg2, boolean, bl2.c):java.lang.Object");
    }

    public final Object a(boolean z13, dl2.d dVar) {
        Bundle extraBundle = new Bundle();
        extraBundle.putBoolean("accept_3p_cookie", z13);
        Intrinsics.checkNotNullParameter("requester_type_6", "signalType");
        Intrinsics.checkNotNullParameter("requester_type_6", "signalType");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        Intrinsics.checkNotNullParameter(extraBundle, "extraBundle");
        Bundle deepCopy = extraBundle.deepCopy();
        Intrinsics.f(deepCopy);
        vi.e eVar = new vi.e("requester_type_6", null, linkedHashSet, linkedHashMap, deepCopy, hashSet, hashSet2, linkedHashMap2, null, q0Var);
        vi2 a13 = ((a.z6) this.f13659e.get()).a((wi.k) eVar).a((dj.e) eVar).b().a().a();
        a13.getClass();
        return vi2.a(a13, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da A[PHI: r11
      0x00da: PHI (r11v13 java.lang.Object) = (r11v11 java.lang.Object), (r11v1 java.lang.Object) binds: [B:22:0x00d7, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:17:0x005e, B:19:0x00b0, B:20:0x00b8), top: B:16:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.rg2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.rg2 r0 = (ads_mobile_sdk.rg2) r0
            int r1 = r0.f10620g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10620g = r1
            goto L18
        L13:
            ads_mobile_sdk.rg2 r0 = new ads_mobile_sdk.rg2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f10618e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10620g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ue.c.H(r11)
            goto Lda
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            boolean r10 = r0.f10617d
            mo2.a r2 = r0.f10616c
            ao2.v r4 = r0.f10615b
            ads_mobile_sdk.xg2 r6 = r0.f10614a
            ue.c.H(r11)
            goto L5e
        L40:
            ue.c.H(r11)
            ao2.w r11 = ue.c.a()
            mo2.a r2 = r9.f13661g
            r0.f10614a = r9
            r0.f10615b = r11
            r0.f10616c = r2
            r0.f10617d = r10
            r0.f10620g = r4
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r4 = r2.f(r5, r0)
            if (r4 != r1) goto L5c
            return r1
        L5c:
            r6 = r9
            r4 = r11
        L5e:
            java.util.LinkedHashMap r11 = r6.f13662i     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r11 = r11.get(r7)     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(r11)     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.cs2 r11 = ads_mobile_sdk.qs2.a()     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.jw1 r11 = r11.f()     // Catch: java.lang.Throwable -> Lb6
            a.hg r7 = ads_mobile_sdk.zg2.r()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "newBuilder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)     // Catch: java.lang.Throwable -> Lb6
            r7.b()     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.sj0 r8 = r7.f10110b     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.zg2 r8 = (ads_mobile_sdk.zg2) r8     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.zg2.s(r8, r10)     // Catch: java.lang.Throwable -> Lb6
            r7.b()     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.sj0 r8 = r7.f10110b     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.zg2 r8 = (ads_mobile_sdk.zg2) r8     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.zg2.r(r8)     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.sj0 r7 = r7.a()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Throwable -> Lb6
            ads_mobile_sdk.zg2 r7 = (ads_mobile_sdk.zg2) r7     // Catch: java.lang.Throwable -> Lb6
            r11.f7003y = r7     // Catch: java.lang.Throwable -> Lb6
            java.util.LinkedHashMap r11 = r6.f13663j     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r11 = r11.get(r7)     // Catch: java.lang.Throwable -> Lb6
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> Lb6
            if (r11 != 0) goto Lb8
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb6
            r11.<init>()     // Catch: java.lang.Throwable -> Lb6
            goto Lb8
        Lb6:
            r10 = move-exception
            goto Ldb
        Lb8:
            r11.add(r4)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> Lb6
            java.util.LinkedHashMap r6 = r6.f13663j     // Catch: java.lang.Throwable -> Lb6
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> Lb6
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> Lb6
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            r0.f10614a = r5
            r0.f10615b = r5
            r0.f10616c = r5
            r0.f10620g = r3
            java.lang.Object r11 = r4.await(r0)
            if (r11 != r1) goto Lda
            return r1
        Lda:
            return r11
        Ldb:
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xg2.b(boolean, bl2.c):java.lang.Object");
    }
}

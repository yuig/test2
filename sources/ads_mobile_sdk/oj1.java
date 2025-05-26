package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class oj1 {

    /* renamed from: a, reason: collision with root package name */
    public final dj1 f9323a;

    public oj1(dj1 nativeAssetsLoader) {
        Intrinsics.checkNotNullParameter(nativeAssetsLoader, "nativeAssetsLoader");
        this.f9323a = nativeAssetsLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.oj1 r8, nm.u r9, bl2.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof ads_mobile_sdk.kj1
            if (r0 == 0) goto L16
            r0 = r10
            ads_mobile_sdk.kj1 r0 = (ads_mobile_sdk.kj1) r0
            int r1 = r0.f7341d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f7341d = r1
            goto L1b
        L16:
            ads_mobile_sdk.kj1 r0 = new ads_mobile_sdk.kj1
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f7339b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7341d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r8 = r0.f7338a
            ue.c.H(r10)
            goto L95
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            ue.c.H(r10)
            java.lang.String r10 = "name"
            java.lang.String r2 = ""
            java.lang.String r10 = ads_mobile_sdk.k41.a(r9, r10, r2)
            int r5 = r10.length()
            if (r5 != 0) goto L47
            goto L9f
        L47:
            java.lang.String r5 = "type"
            java.lang.String r5 = ads_mobile_sdk.k41.a(r9, r5, r2)
            java.lang.String r6 = "string"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r6 == 0) goto L64
            ads_mobile_sdk.kz r1 = new ads_mobile_sdk.kz
            java.lang.String r8 = "string_value"
            java.lang.String r8 = ads_mobile_sdk.k41.a(r9, r8, r2)
            r1.<init>(r10, r8)
            goto La0
        L64:
            java.lang.String r2 = "image"
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r5, r2)
            if (r2 == 0) goto L9f
            ads_mobile_sdk.dj1 r8 = r8.f9323a
            r0.f7338a = r10
            r0.f7341d = r4
            r8.getClass()
            java.lang.String r2 = "image_value"
            java.lang.String r4 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            if (r9 != 0) goto L7f
            goto L84
        L7f:
            nm.u r9 = r9.x(r2)     // Catch: java.lang.Exception -> L84
            goto L85
        L84:
            r9 = r3
        L85:
            bj.n r2 = r8.f4305a
            boolean r2 = r2.i()
            java.lang.Object r8 = r8.a(r9, r2, r0)
            if (r8 != r1) goto L92
            goto La0
        L92:
            r7 = r10
            r10 = r8
            r8 = r7
        L95:
            ads_mobile_sdk.rz0 r10 = (ads_mobile_sdk.rz0) r10
            if (r10 == 0) goto L9f
            ads_mobile_sdk.jz r1 = new ads_mobile_sdk.jz
            r1.<init>(r8, r10)
            goto La0
        L9f:
            r1 = r3
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oj1.a(ads_mobile_sdk.oj1, nm.u, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0084 -> B:11:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.u r7, java.lang.String r8, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.lj1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.lj1 r0 = (ads_mobile_sdk.lj1) r0
            int r1 = r0.f7862e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7862e = r1
            goto L18
        L13:
            ads_mobile_sdk.lj1 r0 = new ads_mobile_sdk.lj1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f7860c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7862e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r7 = r0.f7859b
            java.util.Collection r8 = r0.f7858a
            ue.c.H(r9)
            goto L87
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            ue.c.H(r9)
            goto L60
        L3a:
            ue.c.H(r9)
            nm.q r7 = ads_mobile_sdk.k41.d(r7, r8)
            if (r7 != 0) goto L46
            kotlin.collections.q0 r7 = kotlin.collections.q0.f80391a
            return r7
        L46:
            java.util.ArrayList r8 = r7.f91364a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L51
            kotlin.collections.q0 r7 = kotlin.collections.q0.f80391a
            return r7
        L51:
            ads_mobile_sdk.nj1 r8 = new ads_mobile_sdk.nj1
            r9 = 0
            r8.<init>(r7, r6, r9)
            r0.f7862e = r4
            java.lang.Object r9 = dl2.b.O(r8, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r9.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L6e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r7.next()
            ao2.p0 r9 = (ao2.p0) r9
            r0.f7858a = r8
            r0.f7859b = r7
            r0.f7862e = r3
            java.lang.Object r9 = r9.await(r0)
            if (r9 != r1) goto L87
            return r1
        L87:
            a.r7 r9 = (a.r7) r9
            if (r9 == 0) goto L6e
            r8.add(r9)
            goto L6e
        L8f:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.oj1.a(nm.u, java.lang.String, bl2.c):java.lang.Object");
    }
}

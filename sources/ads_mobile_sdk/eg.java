package ads_mobile_sdk;

import a.zb;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f4844a;

    /* renamed from: b, reason: collision with root package name */
    public final jf f4845b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f4846c;

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f4847d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f4848e;

    /* renamed from: f, reason: collision with root package name */
    public gf f4849f;

    /* renamed from: g, reason: collision with root package name */
    public nm.u f4850g;

    public eg(CoroutineContext backgroundContext, jf appSettingsDataStore, zb clock, oh0 flags) {
        Intrinsics.checkNotNullParameter(backgroundContext, "backgroundContext");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f4844a = backgroundContext;
        this.f4845b = appSettingsDataStore;
        this.f4846c = clock;
        this.f4847d = flags;
        fi.b bVar = mo2.d.f87812a;
        this.f4848e = new mo2.c(false);
        this.f4849f = gf.z();
        this.f4850g = new nm.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v8, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.eg r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.tf
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.tf r0 = (ads_mobile_sdk.tf) r0
            int r1 = r0.f11525e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11525e = r1
            goto L18
        L13:
            ads_mobile_sdk.tf r0 = new ads_mobile_sdk.tf
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f11523c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11525e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            mo2.a r9 = r0.f11522b
            ads_mobile_sdk.eg r0 = r0.f11521a
            ue.c.H(r10)
            goto L9c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ads_mobile_sdk.eg r9 = r0.f11521a
            ue.c.H(r10)
            goto L89
        L40:
            mo2.a r9 = r0.f11522b
            ads_mobile_sdk.eg r2 = r0.f11521a
            ue.c.H(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L4a:
            ue.c.H(r10)
            mo2.a r10 = r9.f4848e
            r0.f11521a = r9
            r0.f11522b = r10
            r0.f11525e = r5
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r2 = r10.f(r6, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            ads_mobile_sdk.gf r2 = r9.f4849f     // Catch: java.lang.Throwable -> Lab
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            ads_mobile_sdk.oh0 r10 = r9.f4847d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r7 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r8 = "gads:app_settings_expiry_check_in_getter:enabled"
            java.lang.Object r10 = r10.a(r8, r5, r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L89
            kotlin.jvm.internal.Intrinsics.f(r2)
            r0.f11521a = r9
            r0.f11522b = r6
            r0.f11525e = r4
            java.lang.Object r10 = r9.a(r2, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            mo2.a r10 = r9.f4848e
            r0.f11521a = r9
            r0.f11522b = r10
            r0.f11525e = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r0 = r10.f(r6, r0)
            if (r0 != r1) goto L9a
            return r1
        L9a:
            r0 = r9
            r9 = r10
        L9c:
            nm.u r10 = r0.f4850g     // Catch: java.lang.Throwable -> La4
            mo2.c r9 = (mo2.c) r9
            r9.i(r6)
            return r10
        La4:
            r10 = move-exception
            mo2.c r9 = (mo2.c) r9
            r9.i(r6)
            throw r10
        Lab:
            r9 = move-exception
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.b(ads_mobile_sdk.eg, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, java.lang.String r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, java.lang.String r7, bl2.c r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.c(java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.xf
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xf r0 = (ads_mobile_sdk.xf) r0
            int r1 = r0.f13632g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13632g = r1
            goto L18
        L13:
            ads_mobile_sdk.xf r0 = new ads_mobile_sdk.xf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f13630e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13632g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mo2.a r6 = r0.f13629d
            java.lang.String r7 = r0.f13628c
            java.lang.String r1 = r0.f13627b
            ads_mobile_sdk.eg r0 = r0.f13626a
            ue.c.H(r8)
            goto L6a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ue.c.H(r8)
            if (r6 != 0) goto L3e
            return r4
        L3e:
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.String r6 = r6.toLowerCase(r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            mo2.a r8 = r5.f4848e
            r0.f13626a = r5
            r0.f13627b = r7
            r0.f13628c = r6
            r0.f13629d = r8
            r0.f13632g = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r0 = r5
            r1 = r7
            r7 = r6
            r6 = r8
        L6a:
            ads_mobile_sdk.gf r8 = r0.f4849f     // Catch: java.lang.Throwable -> Lb1
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            java.util.Map r6 = r8.t()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r2 = ","
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L92
            return r6
        L92:
            java.lang.String r6 = a(r8, r7, r1)
            java.util.Map r7 = r8.t()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r2)
            r8.append(r1)
            java.lang.String r6 = r8.toString()
            java.lang.Object r6 = r7.get(r6)
            return r6
        Lb1:
            r7 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.b(java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v8, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.eg r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.sf
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.sf r0 = (ads_mobile_sdk.sf) r0
            int r1 = r0.f11075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11075e = r1
            goto L18
        L13:
            ads_mobile_sdk.sf r0 = new ads_mobile_sdk.sf
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f11073c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11075e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            mo2.a r9 = r0.f11072b
            ads_mobile_sdk.eg r0 = r0.f11071a
            ue.c.H(r10)
            goto L9c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            ads_mobile_sdk.eg r9 = r0.f11071a
            ue.c.H(r10)
            goto L89
        L40:
            mo2.a r9 = r0.f11072b
            ads_mobile_sdk.eg r2 = r0.f11071a
            ue.c.H(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L4a:
            ue.c.H(r10)
            mo2.a r10 = r9.f4848e
            r0.f11071a = r9
            r0.f11072b = r10
            r0.f11075e = r5
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r2 = r10.f(r6, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            ads_mobile_sdk.gf r2 = r9.f4849f     // Catch: java.lang.Throwable -> Lae
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            ads_mobile_sdk.oh0 r10 = r9.f4847d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r7 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r8 = "gads:app_settings_expiry_check_in_getter:enabled"
            java.lang.Object r10 = r10.a(r8, r5, r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L89
            kotlin.jvm.internal.Intrinsics.f(r2)
            r0.f11071a = r9
            r0.f11072b = r6
            r0.f11075e = r4
            java.lang.Object r10 = r9.a(r2, r0)
            if (r10 != r1) goto L89
            return r1
        L89:
            mo2.a r10 = r9.f4848e
            r0.f11071a = r9
            r0.f11072b = r10
            r0.f11075e = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r0 = r10.f(r6, r0)
            if (r0 != r1) goto L9a
            return r1
        L9a:
            r0 = r9
            r9 = r10
        L9c:
            ads_mobile_sdk.gf r10 = r0.f4849f     // Catch: java.lang.Throwable -> La7
            mo2.c r9 = (mo2.c) r9
            r9.i(r6)
            kotlin.jvm.internal.Intrinsics.f(r10)
            return r10
        La7:
            r10 = move-exception
            mo2.c r9 = (mo2.c) r9
            r9.i(r6)
            throw r10
        Lae:
            r9 = move-exception
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(ads_mobile_sdk.eg, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.uf
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.uf r0 = (ads_mobile_sdk.uf) r0
            int r1 = r0.f12055e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12055e = r1
            goto L18
        L13:
            ads_mobile_sdk.uf r0 = new ads_mobile_sdk.uf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12053c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12055e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f12052b
            ads_mobile_sdk.eg r0 = r0.f12051a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f4848e
            r0.f12051a = r5
            r0.f12052b = r6
            r0.f12055e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            ads_mobile_sdk.gf r6 = r0.f4849f     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r6.y()     // Catch: java.lang.Throwable -> L5d
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L57
            r6 = r4
        L57:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L5d:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0023, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(ads_mobile_sdk.gf r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.util.Map r5 = r5.u()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.lang.Object r5 = r5.get(r7)
            ads_mobile_sdk.r5 r5 = (ads_mobile_sdk.r5) r5
            java.lang.String r7 = ""
            if (r5 != 0) goto L1b
            return r7
        L1b:
            java.util.List r5 = r5.r()
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r5.next()
            ads_mobile_sdk.n5 r1 = (ads_mobile_sdk.n5) r1
            java.util.List r2 = r1.t()
            java.lang.String r3 = "getIncludingRegexesList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L43
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L43
            goto L23
        L43:
            java.util.Iterator r2 = r2.iterator()
        L47:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            kotlin.jvm.internal.Intrinsics.f(r3)
            r4.<init>(r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r6.toLowerCase(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            boolean r3 = r4.e(r3)
            if (r3 == 0) goto L47
            java.util.List r2 = r1.s()
            java.lang.String r3 = "getExcludingRegexesList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L7e
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L7e
            goto La7
        L7e:
            java.util.Iterator r2 = r2.iterator()
        L82:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            kotlin.jvm.internal.Intrinsics.f(r3)
            r4.<init>(r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r6.toLowerCase(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            boolean r3 = r4.e(r3)
            if (r3 == 0) goto L82
            goto L23
        La7:
            java.lang.String r5 = r1.r()
            java.lang.String r6 = "getEffectiveAdUnitId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(ads_mobile_sdk.gf, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gf r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(ads_mobile_sdk.gf, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.eg r5, nm.u r6, long r7, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.ag
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ag r0 = (ads_mobile_sdk.ag) r0
            int r1 = r0.f2389e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2389e = r1
            goto L18
        L13:
            ads_mobile_sdk.ag r0 = new ads_mobile_sdk.ag
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f2387c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2389e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r9)
            goto L72
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ads_mobile_sdk.gf r5 = r0.f2386b
            ads_mobile_sdk.eg r6 = r0.f2385a
            ue.c.H(r9)
            r7 = r5
            r5 = r6
            goto L5d
        L3c:
            ue.c.H(r9)
            kotlin.Pair r6 = ads_mobile_sdk.pr0.a(r6, r7)
            if (r6 != 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L48:
            java.lang.Object r7 = r6.f80346a
            ads_mobile_sdk.gf r7 = (ads_mobile_sdk.gf) r7
            java.lang.Object r6 = r6.f80347b
            nm.u r6 = (nm.u) r6
            r0.f2385a = r5
            r0.f2386b = r7
            r0.f2389e = r4
            java.lang.Object r6 = r5.a(r7, r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            kotlin.coroutines.CoroutineContext r6 = r5.f4844a
            ads_mobile_sdk.bg r8 = new ads_mobile_sdk.bg
            r9 = 0
            r8.<init>(r5, r7, r9)
            r0.f2385a = r9
            r0.f2386b = r9
            r0.f2389e = r3
            java.lang.Object r5 = kotlin.jvm.internal.j.M(r0, r6, r8)
            if (r5 != r1) goto L72
            return r1
        L72:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(ads_mobile_sdk.eg, nm.u, long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.gf r6, nm.u r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.cg
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.cg r0 = (ads_mobile_sdk.cg) r0
            int r1 = r0.f3900g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3900g = r1
            goto L18
        L13:
            ads_mobile_sdk.cg r0 = new ads_mobile_sdk.cg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3898e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f3900g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r6 = r0.f3897d
            nm.u r7 = r0.f3896c
            ads_mobile_sdk.gf r1 = r0.f3895b
            ads_mobile_sdk.eg r0 = r0.f3894a
            ue.c.H(r8)
            r8 = r6
            r6 = r1
            goto L53
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r8)
            mo2.a r8 = r5.f4848e
            r0.f3894a = r5
            r0.f3895b = r6
            r0.f3896c = r7
            r0.f3897d = r8
            r0.f3900g = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            r0.f4849f = r6     // Catch: java.lang.Throwable -> L5f
            r0.f4850g = r7     // Catch: java.lang.Throwable -> L5f
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L5f
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            return r6
        L5f:
            r6 = move-exception
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg.a(ads_mobile_sdk.gf, nm.u, bl2.c):java.lang.Object");
    }
}

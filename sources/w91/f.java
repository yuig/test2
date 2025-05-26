package w91;

import ao2.j0;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ll.j;
import u50.r;
import v91.o;
import v91.q;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m f128602a;

    /* renamed from: b, reason: collision with root package name */
    public final e82.f f128603b;

    /* renamed from: c, reason: collision with root package name */
    public final j f128604c;

    public f(m userService, e82.f autoPublishManager, j navigator) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(autoPublishManager, "autoPublishManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f128602a = userService;
        this.f128603b = autoPublishManager;
        this.f128604c = navigator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(2:22|23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r5.a(new v91.c(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(w91.f r4, u50.r r5, bl2.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof w91.c
            if (r0 == 0) goto L16
            r0 = r6
            w91.c r0 = (w91.c) r0
            int r1 = r0.f128594u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128594u = r1
            goto L1b
        L16:
            w91.c r0 = new w91.c
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f128592s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f128594u
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            u50.r r5 = r0.f128591r
            ue.c.H(r6)     // Catch: java.lang.Exception -> L2c
            goto L4c
        L2c:
            r4 = move-exception
            goto L5a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            ue.c.H(r6)
            k22.m r4 = r4.f128602a     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = ""
            uj2.b0 r4 = r4.D(r6)     // Catch: java.lang.Exception -> L2c
            r0.f128591r = r5     // Catch: java.lang.Exception -> L2c
            r0.f128594u = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r6 = kh2.j.p(r4, r0)     // Catch: java.lang.Exception -> L2c
            if (r6 != r1) goto L4c
            goto L64
        L4c:
            com.pinterest.api.model.wy0 r6 = (com.pinterest.api.model.wy0) r6     // Catch: java.lang.Exception -> L2c
            v91.d r4 = new v91.d     // Catch: java.lang.Exception -> L2c
            kotlin.jvm.internal.Intrinsics.f(r6)     // Catch: java.lang.Exception -> L2c
            r4.<init>(r6)     // Catch: java.lang.Exception -> L2c
            r5.a(r4)     // Catch: java.lang.Exception -> L2c
            goto L62
        L5a:
            v91.c r6 = new v91.c
            r6.<init>(r4)
            r5.a(r6)
        L62:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w91.f.j(w91.f, u50.r, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(2:22|23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r7.a(new v91.c(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(w91.f r4, boolean r5, e82.w r6, u50.r r7, bl2.c r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof w91.d
            if (r0 == 0) goto L16
            r0 = r8
            w91.d r0 = (w91.d) r0
            int r1 = r0.f128600w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128600w = r1
            goto L1b
        L16:
            w91.d r0 = new w91.d
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.f128598u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f128600w
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            u50.r r7 = r0.f128597t
            e82.w r6 = r0.f128596s
            w91.f r4 = r0.f128595r
            ue.c.H(r8)     // Catch: java.lang.Exception -> L30
            goto L52
        L30:
            r4 = move-exception
            goto L5f
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            ue.c.H(r8)
            e82.f r8 = r4.f128603b     // Catch: java.lang.Exception -> L30
            kk2.b r5 = r8.c(r6, r5)     // Catch: java.lang.Exception -> L30
            r0.f128595r = r4     // Catch: java.lang.Exception -> L30
            r0.f128596s = r6     // Catch: java.lang.Exception -> L30
            r0.f128597t = r7     // Catch: java.lang.Exception -> L30
            r0.f128600w = r3     // Catch: java.lang.Exception -> L30
            java.lang.Object r5 = kh2.j.p(r5, r0)     // Catch: java.lang.Exception -> L30
            if (r5 != r1) goto L52
            goto L69
        L52:
            e82.f r5 = r4.f128603b     // Catch: java.lang.Exception -> L30
            r5.a(r6)     // Catch: java.lang.Exception -> L30
            ll.j r4 = r4.f128604c     // Catch: java.lang.Exception -> L30
            w91.e r5 = w91.e.f128601i     // Catch: java.lang.Exception -> L30
            r4.C(r5)     // Catch: java.lang.Exception -> L30
            goto L67
        L5f:
            v91.c r5 = new v91.c
            r5.<init>(r4)
            r7.a(r5)
        L67:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w91.f.k(w91.f, boolean, e82.w, u50.r, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        v91.r request = (v91.r) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof o) {
            kotlin.jvm.internal.j.z(scope, null, null, new a(this, eventIntake, null), 3);
        } else if (request instanceof q) {
            kotlin.jvm.internal.j.z(scope, null, null, new b(this, request, eventIntake, null), 3);
        }
    }
}

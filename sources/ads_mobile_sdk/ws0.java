package ads_mobile_sdk;

import a.hb;
import a.j4;
import a.zb;
import android.os.Bundle;
import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import nm.s;
import wi.i;

/* loaded from: classes2.dex */
public final class ws0 implements j4, hb {

    /* renamed from: a */
    public final ku0 f13203a;

    /* renamed from: b */
    public final h92 f13204b;

    /* renamed from: c */
    public final Optional f13205c;

    /* renamed from: d */
    public final String f13206d;

    /* renamed from: e */
    public final boolean f13207e;

    /* renamed from: f */
    public final zb f13208f;

    /* renamed from: g */
    public final nm.o f13209g;

    /* renamed from: h */
    public String f13210h;

    /* renamed from: i */
    public final mo2.a f13211i;

    /* renamed from: j */
    public os0 f13212j;

    /* renamed from: k */
    public boolean f13213k;

    /* renamed from: l */
    public boolean f13214l;

    /* renamed from: m */
    public nm.u f13215m;

    /* renamed from: n */
    public String f13216n;

    /* renamed from: o */
    public String f13217o;

    /* renamed from: p */
    public String f13218p;

    /* renamed from: q */
    public nm.u f13219q;

    /* renamed from: r */
    public nm.u f13220r;

    /* renamed from: s */
    public jk0 f13221s;

    /* renamed from: t */
    public wi.b0 f13222t;

    /* renamed from: u */
    public long f13223u;

    /* renamed from: v */
    public volatile boolean f13224v;

    public ws0(ku0 inspectorManager, h92 requestType, Optional baseRequest, String requestId, boolean z13, zb clock, nm.o gson) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f13203a = inspectorManager;
        this.f13204b = requestType;
        this.f13205c = baseRequest;
        this.f13206d = requestId;
        this.f13207e = z13;
        this.f13208f = clock;
        this.f13209g = gson;
        this.f13211i = mo2.d.a();
        this.f13212j = os0.f9420a;
        this.f13215m = new nm.u();
        this.f13216n = "";
        this.f13217o = "";
        this.f13218p = "";
        this.f13219q = new nm.u();
        this.f13220r = new nm.u();
        zn2.b.f142311b.getClass();
        this.f13223u = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ps0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ps0 r0 = (ads_mobile_sdk.ps0) r0
            int r1 = r0.f9795e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9795e = r1
            goto L18
        L13:
            ads_mobile_sdk.ps0 r0 = new ads_mobile_sdk.ps0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9793c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9795e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f9792b
            ads_mobile_sdk.ws0 r0 = r0.f9791a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f13211i
            r0.f9791a = r5
            r0.f9792b = r6
            r0.f9795e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            r0.f13214l = r3     // Catch: java.lang.Throwable -> L54
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L54
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L54:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.a(bl2.c):java.lang.Object");
    }

    @Override // a.j4
    public final Object b(bl2.c cVar) {
        return a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.us0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.us0 r0 = (ads_mobile_sdk.us0) r0
            int r1 = r0.f12182e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12182e = r1
            goto L18
        L13:
            ads_mobile_sdk.us0 r0 = new ads_mobile_sdk.us0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12180c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12182e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f12179b
            ads_mobile_sdk.ws0 r0 = r0.f12178a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f13211i
            r0.f12178a = r5
            r0.f12179b = r6
            r0.f12182e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            ads_mobile_sdk.os0 r6 = r0.f13212j     // Catch: java.lang.Throwable -> L5c
            ads_mobile_sdk.os0 r0 = ads_mobile_sdk.os0.f9420a     // Catch: java.lang.Throwable -> L5c
            if (r6 == r0) goto L51
            goto L52
        L51:
            r3 = 0
        L52:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L5c
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L5c:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.c(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x004a, B:13:0x007f, B:14:0x008e, B:16:0x0092), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x004a, B:13:0x007f, B:14:0x008e, B:16:0x0092), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.vs0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.vs0 r0 = (ads_mobile_sdk.vs0) r0
            int r1 = r0.f12626e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12626e = r1
            goto L18
        L13:
            ads_mobile_sdk.vs0 r0 = new ads_mobile_sdk.vs0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12624c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12626e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f12623b
            ads_mobile_sdk.ws0 r0 = r0.f12622a
            ue.c.H(r7)
            goto L4a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ue.c.H(r7)
            mo2.a r7 = r6.f13211i
            r0.f12622a = r6
            r0.f12623b = r7
            r0.f12626e = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r6
            r1 = r7
        L4a:
            nm.u r7 = new nm.u     // Catch: java.lang.Throwable -> L8c
            r7.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "state"
            ads_mobile_sdk.os0 r3 = r0.f13212j     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.name()     // Catch: java.lang.Throwable -> L8c
            r7.u(r2, r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "format"
            ads_mobile_sdk.h92 r3 = r0.f13204b     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.f5908a     // Catch: java.lang.Throwable -> L8c
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r3.toUpperCase(r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch: java.lang.Throwable -> L8c
            r7.u(r2, r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "isOutOfContext"
            boolean r3 = r0.f13207e     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8c
            r7.t(r2, r3)     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r0.f13207e     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L8e
            java.lang.String r2 = "shown"
            boolean r3 = r0.f13214l     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8c
            r7.t(r2, r3)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r7 = move-exception
            goto La1
        L8e:
            wi.b0 r2 = r0.f13222t     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L9b
            java.lang.String r3 = "responseInfo"
            nm.u r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L8c
            r7.r(r3, r0)     // Catch: java.lang.Throwable -> L8c
        L9b:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r7
        La1:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.d(bl2.c):java.lang.Object");
    }

    @Override // a.hb
    public final Object a(jk0 jk0Var, wi.b0 b0Var, bl2.c cVar) {
        return a(this, jk0Var, b0Var, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2 A[PHI: r10
      0x00b2: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:18:0x00af, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v7, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ws0 r7, ads_mobile_sdk.jk0 r8, wi.b0 r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.qs0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qs0 r0 = (ads_mobile_sdk.qs0) r0
            int r1 = r0.f10246g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10246g = r1
            goto L18
        L13:
            ads_mobile_sdk.qs0 r0 = new ads_mobile_sdk.qs0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f10244e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10246g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ue.c.H(r10)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ads_mobile_sdk.ws0 r7 = r0.f10240a
            ue.c.H(r10)
            goto La3
        L3d:
            mo2.a r7 = r0.f10243d
            wi.b0 r9 = r0.f10242c
            ads_mobile_sdk.jk0 r8 = r0.f10241b
            ads_mobile_sdk.ws0 r2 = r0.f10240a
            ue.c.H(r10)
            r10 = r7
            r7 = r2
            goto L6a
        L4b:
            ue.c.H(r10)
            boolean r10 = r7.f13224v
            if (r10 != 0) goto L55
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L55:
            mo2.a r10 = r7.f13211i
            r0.f10240a = r7
            r0.f10241b = r8
            r0.f10242c = r9
            r0.f10243d = r10
            r0.f10246g = r5
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r2 = r10.f(r6, r0)
            if (r2 != r1) goto L6a
            return r1
        L6a:
            ads_mobile_sdk.os0 r2 = ads_mobile_sdk.os0.f9422c     // Catch: java.lang.Throwable -> Lb9
            r7.f13212j = r2     // Catch: java.lang.Throwable -> Lb9
            r7.f13221s = r8     // Catch: java.lang.Throwable -> Lb9
            r7.f13222t = r9     // Catch: java.lang.Throwable -> Lb9
            zn2.a r8 = zn2.b.f142311b     // Catch: java.lang.Throwable -> Lb9
            a.zb r8 = r7.f13208f     // Catch: java.lang.Throwable -> Lb9
            r8.getClass()     // Catch: java.lang.Throwable -> Lb9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb9
            zn2.d r2 = zn2.d.MILLISECONDS     // Catch: java.lang.Throwable -> Lb9
            long r8 = dl2.b.Q2(r8, r2)     // Catch: java.lang.Throwable -> Lb9
            r7.f13223u = r8     // Catch: java.lang.Throwable -> Lb9
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> Lb9
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            ads_mobile_sdk.ku0 r8 = r7.f13203a
            java.lang.String r9 = r7.f13210h
            if (r9 == 0) goto Lb3
            r0.f10240a = r7
            r0.f10241b = r6
            r0.f10242c = r6
            r0.f10243d = r6
            r0.f10246g = r4
            java.lang.Object r8 = r8.a(r9, r7, r0)
            if (r8 != r1) goto La3
            return r1
        La3:
            ads_mobile_sdk.ku0 r7 = r7.f13203a
            r0.f10240a = r6
            r0.f10246g = r3
            wi.g r8 = ads_mobile_sdk.ku0.I
            java.lang.Object r10 = r7.b(r6, r0)
            if (r10 != r1) goto Lb2
            return r1
        Lb2:
            return r10
        Lb3:
            java.lang.String r7 = "adUnitId"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r6
        Lb9:
            r7 = move-exception
            mo2.c r10 = (mo2.c) r10
            r10.i(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.a(ads_mobile_sdk.ws0, ads_mobile_sdk.jk0, wi.b0, bl2.c):java.lang.Object");
    }

    @Override // a.hb
    public final Object a(cf2 cf2Var, r0 r0Var, wi.b0 b0Var, bl2.c cVar) {
        return a(this, b0Var, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa A[PHI: r11
      0x00aa: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v1 java.lang.Object) binds: [B:18:0x00a7, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v7, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ws0 r9, wi.b0 r10, bl2.c r11) {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.rs0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.rs0 r0 = (ads_mobile_sdk.rs0) r0
            int r1 = r0.f10772f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10772f = r1
            goto L18
        L13:
            ads_mobile_sdk.rs0 r0 = new ads_mobile_sdk.rs0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f10770d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10772f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ue.c.H(r11)
            goto Laa
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            ads_mobile_sdk.ws0 r9 = r0.f10767a
            ue.c.H(r11)
            goto L9b
        L3d:
            mo2.a r9 = r0.f10769c
            wi.b0 r10 = r0.f10768b
            ads_mobile_sdk.ws0 r2 = r0.f10767a
            ue.c.H(r11)
            r11 = r9
            r9 = r2
            goto L66
        L49:
            ue.c.H(r11)
            boolean r11 = r9.f13224v
            if (r11 != 0) goto L53
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L53:
            mo2.a r11 = r9.f13211i
            r0.f10767a = r9
            r0.f10768b = r10
            r0.f10769c = r11
            r0.f10772f = r5
            mo2.c r11 = (mo2.c) r11
            java.lang.Object r2 = r11.f(r6, r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            ads_mobile_sdk.os0 r2 = ads_mobile_sdk.os0.f9421b     // Catch: java.lang.Throwable -> Lb1
            r9.f13212j = r2     // Catch: java.lang.Throwable -> Lb1
            r9.f13222t = r10     // Catch: java.lang.Throwable -> Lb1
            zn2.a r10 = zn2.b.f142311b     // Catch: java.lang.Throwable -> Lb1
            a.zb r10 = r9.f13208f     // Catch: java.lang.Throwable -> Lb1
            r10.getClass()     // Catch: java.lang.Throwable -> Lb1
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb1
            zn2.d r10 = zn2.d.MILLISECONDS     // Catch: java.lang.Throwable -> Lb1
            long r7 = dl2.b.Q2(r7, r10)     // Catch: java.lang.Throwable -> Lb1
            r9.f13223u = r7     // Catch: java.lang.Throwable -> Lb1
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> Lb1
            mo2.c r11 = (mo2.c) r11
            r11.i(r6)
            ads_mobile_sdk.ku0 r10 = r9.f13203a
            java.lang.String r11 = r9.f13210h
            if (r11 == 0) goto Lab
            r0.f10767a = r9
            r0.f10768b = r6
            r0.f10769c = r6
            r0.f10772f = r4
            java.lang.Object r10 = r10.a(r11, r9, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            ads_mobile_sdk.ku0 r9 = r9.f13203a
            r0.f10767a = r6
            r0.f10772f = r3
            wi.g r10 = ads_mobile_sdk.ku0.I
            java.lang.Object r11 = r9.b(r6, r0)
            if (r11 != r1) goto Laa
            return r1
        Laa:
            return r11
        Lab:
            java.lang.String r9 = "adUnitId"
            kotlin.jvm.internal.Intrinsics.r(r9)
            throw r6
        Lb1:
            r9 = move-exception
            mo2.c r11 = (mo2.c) r11
            r11.i(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.a(ads_mobile_sdk.ws0, wi.b0, bl2.c):java.lang.Object");
    }

    @Override // a.j4
    public final Object a(cf2 cf2Var, bl2.c cVar) {
        return a(this, cf2Var, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00a4, B:15:0x00ac, B:16:0x00bb, B:21:0x00b9), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:13:0x00a4, B:15:0x00ac, B:16:0x00bb, B:21:0x00b9), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v10, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ws0 r9, ads_mobile_sdk.cf2 r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.a(ads_mobile_sdk.ws0, ads_mobile_sdk.cf2, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ws0 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ts0
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ts0 r0 = (ads_mobile_sdk.ts0) r0
            int r1 = r0.f11662e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11662e = r1
            goto L18
        L13:
            ads_mobile_sdk.ts0 r0 = new ads_mobile_sdk.ts0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11660c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11662e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f11659b
            ads_mobile_sdk.ws0 r0 = r0.f11658a
            ue.c.H(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            java.util.Optional r6 = r5.f13205c
            java.lang.Object r6 = kh2.m2.U0(r6)
            wi.k r6 = (wi.k) r6
            if (r6 == 0) goto L45
            java.lang.String r6 = r6.l()
            goto L46
        L45:
            r6 = 0
        L46:
            ads_mobile_sdk.ku0 r2 = r5.f13203a
            r0.f11658a = r5
            r0.f11659b = r6
            r0.f11662e = r3
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L59:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            if (r5 == 0) goto L67
            r0.f13210h = r5
            r0.f13224v = r3
        L67:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws0.a(ads_mobile_sdk.ws0, bl2.c):java.lang.Object");
    }

    public final nm.u a(wi.b0 b0Var) {
        s sVar;
        nm.u uVar;
        nm.u uVar2 = new nm.u();
        uVar2.u("winningAdapterClassName", b0Var.f129930a);
        long j13 = this.f13223u;
        zn2.a aVar = zn2.b.f142311b;
        uVar2.s(Long.valueOf(zn2.b.n(j13, zn2.d.SECONDS)), "responseSecsSinceEpoch");
        uVar2.u("responseId", b0Var.f129931b);
        uVar2.u("adRequestUrl", this.f13216n);
        uVar2.u("postBody", this.f13218p);
        uVar2.u("adResponseBody", this.f13217o);
        uVar2.t("hasExceededMemoryLimit", Boolean.valueOf(this.f13213k));
        uVar2.r("adResponseHeaders", this.f13220r);
        uVar2.r("transactionExtras", this.f13219q);
        uVar2.r("biddingData", this.f13215m);
        nm.q qVar = new nm.q();
        List list = b0Var.f129932c;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = nm.t.f91365a;
            if (!hasNext) {
                break;
            }
            i iVar = (i) it.next();
            nm.u uVar3 = new nm.u();
            uVar3.u("adapterClassName", iVar.f129943a);
            uVar3.s(Long.valueOf(iVar.f129944b), "latencyMillis");
            Bundle bundle = iVar.f129946d;
            try {
                nm.o oVar = this.f13209g;
                uVar = (nm.u) oVar.b(nm.u.class, oVar.k(bundle));
            } catch (Exception e13) {
                List list2 = c0.d.f(e13, e13).f6994p;
                String message = e13.getMessage();
                if (message == null) {
                    message = e13.getClass().getName();
                }
                list2.add(message);
                uVar = null;
            }
            if (uVar == null) {
                uVar = new nm.u();
            }
            uVar3.r("credentials", uVar);
            wi.s sVar2 = iVar.f129945c;
            if (sVar2 != null) {
                nm.u uVar4 = new nm.u();
                uVar4.u("errorDomain", sVar2.f129986c);
                uVar4.s(Integer.valueOf(sVar2.f129984a), "errorCode");
                uVar4.u("errorDescription", sVar2.f129985b);
                uVar4.r("underlyingError", sVar);
                sVar = uVar4;
            }
            uVar3.r("error", sVar);
            qVar.t(uVar3);
        }
        uVar2.r("adNetworks", qVar);
        jk0 jk0Var = this.f13221s;
        if (list.isEmpty() && jk0Var != null) {
            nm.q qVar2 = new nm.q();
            nm.u uVar5 = new nm.u();
            uVar5.u("errorDomain", AdError.GOOGLE_MOBILE_ADS_DOMAIN);
            uVar5.u("errorCode", jk0Var.a().a().name());
            uVar5.u("errorDescription", a.bb.d(jk0Var));
            uVar5.r("underlyingError", sVar);
            qVar2.t(uVar5);
            uVar2.r("errors", qVar2);
        }
        return uVar2;
    }
}

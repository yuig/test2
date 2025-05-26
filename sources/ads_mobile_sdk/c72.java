package ads_mobile_sdk;

import a.j4;
import a.z1;
import a.zb;
import android.os.SystemClock;
import ao2.j0;
import ao2.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c72 implements j4, z1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f3792a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f3793b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f3794c;

    /* renamed from: d, reason: collision with root package name */
    public o42 f3795d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f3796e;

    /* renamed from: f, reason: collision with root package name */
    public ao2.x f3797f;

    /* renamed from: g, reason: collision with root package name */
    public ao2.x f3798g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3799h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3800i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3801j;

    /* renamed from: k, reason: collision with root package name */
    public long f3802k;

    /* renamed from: l, reason: collision with root package name */
    public long f3803l;

    /* renamed from: m, reason: collision with root package name */
    public long f3804m;

    /* renamed from: n, reason: collision with root package name */
    public long f3805n;

    /* renamed from: o, reason: collision with root package name */
    public long f3806o;

    public c72(j0 backgroundScope, zb clock, oh0 flags) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f3792a = backgroundScope;
        this.f3793b = clock;
        this.f3794c = flags;
        this.f3796e = mo2.d.a();
        ao2.p1 b13 = m0.b();
        b13.e0();
        this.f3797f = b13;
        ao2.p1 b14 = m0.b();
        b14.e0();
        this.f3798g = b14;
        zn2.b.f142311b.getClass();
        this.f3802k = 0L;
        this.f3803l = 0L;
        this.f3804m = 0L;
        this.f3805n = flags.w();
        this.f3806o = flags.x();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[PHI: r12
      0x0033: PHI (r12v31 ads_mobile_sdk.c72) = (r12v0 ads_mobile_sdk.c72), (r12v32 ads_mobile_sdk.c72) binds: [B:7:0x0026, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0140 -> B:13:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.c72 r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(ads_mobile_sdk.c72, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0051, B:14:0x0058, B:16:0x005c, B:18:0x0060, B:20:0x0068, B:21:0x0089, B:26:0x0056), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x0051, B:14:0x0058, B:16:0x005c, B:18:0x0060, B:20:0x0068, B:21:0x0089, B:26:0x0056), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.v62
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.v62 r0 = (ads_mobile_sdk.v62) r0
            int r1 = r0.f12379f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12379f = r1
            goto L18
        L13:
            ads_mobile_sdk.v62 r0 = new ads_mobile_sdk.v62
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12377d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12379f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r6 = r0.f12376c
            mo2.a r1 = r0.f12375b
            ads_mobile_sdk.c72 r0 = r0.f12374a
            ue.c.H(r7)
            goto L4e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            ue.c.H(r7)
            mo2.a r7 = r5.f3796e
            r0.f12374a = r5
            r0.f12375b = r7
            r0.f12376c = r6
            r0.f12379f = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r7
        L4e:
            r7 = 0
            if (r6 == 0) goto L56
            r0.f3799h = r7     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r6 = move-exception
            goto L91
        L56:
            r0.f3800i = r7     // Catch: java.lang.Throwable -> L54
        L58:
            boolean r6 = r0.f3799h     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L89
            boolean r6 = r0.f3800i     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L89
            ao2.x r6 = r0.f3797f     // Catch: java.lang.Throwable -> L54
            boolean r6 = r6.isCompleted()     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L89
            long r6 = r0.a()     // Catch: java.lang.Throwable -> L54
            long r2 = r0.f3802k     // Catch: java.lang.Throwable -> L54
            long r6 = zn2.b.j(r6, r2)     // Catch: java.lang.Throwable -> L54
            long r2 = r0.f3804m     // Catch: java.lang.Throwable -> L54
            long r2 = zn2.b.k(r2, r6)     // Catch: java.lang.Throwable -> L54
            r0.f3804m = r2     // Catch: java.lang.Throwable -> L54
            long r2 = r0.f3803l     // Catch: java.lang.Throwable -> L54
            long r6 = zn2.b.k(r2, r6)     // Catch: java.lang.Throwable -> L54
            r0.f3803l = r6     // Catch: java.lang.Throwable -> L54
            ao2.x r6 = r0.f3797f     // Catch: java.lang.Throwable -> L54
            ao2.p1 r6 = (ao2.p1) r6     // Catch: java.lang.Throwable -> L54
            r6.e0()     // Catch: java.lang.Throwable -> L54
        L89:
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L54
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r6
        L91:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.b(boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:11:0x004e, B:13:0x0066, B:16:0x0077, B:17:0x009d, B:18:0x00b8, B:23:0x0082, B:26:0x009b, B:27:0x0091, B:28:0x00ae), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.o62
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.o62 r0 = (ads_mobile_sdk.o62) r0
            int r1 = r0.f9161f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9161f = r1
            goto L18
        L13:
            ads_mobile_sdk.o62 r0 = new ads_mobile_sdk.o62
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f9159d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9161f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r10 = r0.f9158c
            mo2.a r1 = r0.f9157b
            ads_mobile_sdk.c72 r0 = r0.f9156a
            ue.c.H(r11)
            goto L4e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            ue.c.H(r11)
            mo2.a r11 = r9.f3796e
            r0.f9156a = r9
            r0.f9157b = r11
            r0.f9158c = r10
            r0.f9161f = r3
            mo2.c r11 = (mo2.c) r11
            java.lang.Object r0 = r11.f(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r9
            r1 = r11
        L4e:
            long r2 = r0.a()     // Catch: java.lang.Throwable -> L80
            ads_mobile_sdk.oh0 r11 = r0.f3794c     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "gads:proactive_banner_refresh:enabled"
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L80
            ads_mobile_sdk.wg0 r7 = ads_mobile_sdk.oh0.f9281e     // Catch: java.lang.Throwable -> L80
            java.lang.Object r11 = r11.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L80
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L80
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r11 == 0) goto Lae
            long r5 = r0.f3806o     // Catch: java.lang.Throwable -> L80
            zn2.a r11 = zn2.b.f142311b     // Catch: java.lang.Throwable -> L80
            r11.getClass()     // Catch: java.lang.Throwable -> L80
            r7 = 0
            int r11 = zn2.b.c(r5, r7)     // Catch: java.lang.Throwable -> L80
            if (r11 <= 0) goto Lae
            if (r10 == 0) goto L82
            long r10 = r0.f3806o     // Catch: java.lang.Throwable -> L80
            long r10 = zn2.b.k(r2, r10)     // Catch: java.lang.Throwable -> L80
            r0.f3803l = r10     // Catch: java.lang.Throwable -> L80
            goto L9d
        L80:
            r10 = move-exception
            goto Lc0
        L82:
            long r10 = r0.f3804m     // Catch: java.lang.Throwable -> L80
            long r10 = zn2.b.j(r2, r10)     // Catch: java.lang.Throwable -> L80
            long r5 = r0.f3806o     // Catch: java.lang.Throwable -> L80
            int r5 = zn2.b.c(r10, r5)     // Catch: java.lang.Throwable -> L80
            if (r5 < 0) goto L91
            goto L9b
        L91:
            long r5 = r0.f3806o     // Catch: java.lang.Throwable -> L80
            long r2 = zn2.b.k(r2, r5)     // Catch: java.lang.Throwable -> L80
            long r2 = zn2.b.j(r2, r10)     // Catch: java.lang.Throwable -> L80
        L9b:
            r0.f3803l = r2     // Catch: java.lang.Throwable -> L80
        L9d:
            long r10 = r0.f3803l     // Catch: java.lang.Throwable -> L80
            long r2 = r0.f3805n     // Catch: java.lang.Throwable -> L80
            long r10 = zn2.b.k(r10, r2)     // Catch: java.lang.Throwable -> L80
            long r2 = r0.f3806o     // Catch: java.lang.Throwable -> L80
            long r10 = zn2.b.j(r10, r2)     // Catch: java.lang.Throwable -> L80
            r0.f3804m = r10     // Catch: java.lang.Throwable -> L80
            goto Lb8
        Lae:
            long r10 = r0.f3805n     // Catch: java.lang.Throwable -> L80
            long r10 = zn2.b.k(r2, r10)     // Catch: java.lang.Throwable -> L80
            r0.f3804m = r10     // Catch: java.lang.Throwable -> L80
            r0.f3803l = r10     // Catch: java.lang.Throwable -> L80
        Lb8:
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L80
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r10
        Lc0:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.c(boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r8.f9131p.a(r8.b(), false) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:12:0x0071, B:14:0x0076), top: B:11:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.y62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.y62 r0 = (ads_mobile_sdk.y62) r0
            int r1 = r0.f14113e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14113e = r1
            goto L18
        L13:
            ads_mobile_sdk.y62 r0 = new ads_mobile_sdk.y62
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14111c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14113e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            mo2.a r1 = r0.f14110b
            ads_mobile_sdk.c72 r0 = r0.f14109a
            ue.c.H(r8)
            goto L71
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            mo2.a r2 = r0.f14110b
            ads_mobile_sdk.c72 r6 = r0.f14109a
            ue.c.H(r8)
            goto L55
        L3f:
            ue.c.H(r8)
            mo2.a r8 = r7.f3796e
            r0.f14109a = r7
            r0.f14110b = r8
            r0.f14113e = r4
            r2 = r8
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r8 = r2.f(r5, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            r6 = r7
        L55:
            boolean r8 = r6.f3801j     // Catch: java.lang.Throwable -> Lb7
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            if (r8 != 0) goto Lb2
            mo2.a r8 = r6.f3796e
            r0.f14109a = r6
            r0.f14110b = r8
            r0.f14113e = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r5, r0)
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r1 = r8
            r0 = r6
        L71:
            boolean r8 = r0.f3799h     // Catch: java.lang.Throwable -> L7c
            r2 = 0
            if (r8 != 0) goto L7e
            boolean r8 = r0.f3800i     // Catch: java.lang.Throwable -> L7c
            if (r8 != 0) goto L7e
            r8 = r4
            goto L7f
        L7c:
            r8 = move-exception
            goto Lac
        L7e:
            r8 = r2
        L7f:
            mo2.c r1 = (mo2.c) r1
            r1.i(r5)
            if (r8 == 0) goto Laa
            ads_mobile_sdk.o42 r8 = r0.f3795d
            if (r8 == 0) goto La4
            ads_mobile_sdk.l92 r0 = r8.b()
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 != 0) goto L97
            goto Laa
        L97:
            ads_mobile_sdk.r90 r0 = r8.f9131p
            ads_mobile_sdk.l92 r8 = r8.b()
            boolean r8 = r0.a(r8, r2)
            if (r8 == 0) goto Laa
            goto Lb2
        La4:
            java.lang.String r8 = "adLoader"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r5
        Laa:
            r4 = r2
            goto Lb2
        Lac:
            mo2.c r1 = (mo2.c) r1
            r1.i(r5)
            throw r8
        Lb2:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        Lb7:
            r8 = move-exception
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.c(bl2.c):java.lang.Object");
    }

    public final long a() {
        zn2.a aVar = zn2.b.f142311b;
        this.f3793b.getClass();
        return dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v7, types: [mo2.a] */
    @Override // a.j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.cf2 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.s62
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.s62 r0 = (ads_mobile_sdk.s62) r0
            int r1 = r0.f10975f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10975f = r1
            goto L18
        L13:
            ads_mobile_sdk.s62 r0 = new ads_mobile_sdk.s62
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f10973d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10975f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mo2.a r6 = r0.f10972c
            ads_mobile_sdk.cf2 r1 = r0.f10971b
            ads_mobile_sdk.c72 r0 = r0.f10970a
            ue.c.H(r7)
            r7 = r6
            r6 = r1
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ue.c.H(r7)
            mo2.a r7 = r5.f3796e
            r0.f10970a = r5
            r0.f10971b = r6
            r0.f10972c = r7
            r0.f10975f = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            ads_mobile_sdk.ye2 r6 = r6.f3893b     // Catch: java.lang.Throwable -> L63
            ads_mobile_sdk.vo r6 = r6.f14212b     // Catch: java.lang.Throwable -> L63
            long r1 = r6.f12589n     // Catch: java.lang.Throwable -> L63
            r0.f3805n = r1     // Catch: java.lang.Throwable -> L63
            long r1 = r6.f12590o     // Catch: java.lang.Throwable -> L63
            r0.f3806o = r1     // Catch: java.lang.Throwable -> L63
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L63
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            return r6
        L63:
            r6 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(ads_mobile_sdk.cf2, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.t62
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.t62 r0 = (ads_mobile_sdk.t62) r0
            int r1 = r0.f11432e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11432e = r1
            goto L18
        L13:
            ads_mobile_sdk.t62 r0 = new ads_mobile_sdk.t62
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11430c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11432e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f11429b
            ads_mobile_sdk.c72 r0 = r0.f11428a
            ue.c.H(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            ue.c.H(r6)
            mo2.a r6 = r5.f3796e
            r0.f11428a = r5
            r0.f11429b = r6
            r0.f11432e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r5
            r1 = r6
        L4a:
            r6 = 0
            r0.f3799h = r6     // Catch: java.lang.Throwable -> L6f
            r0.f3800i = r6     // Catch: java.lang.Throwable -> L6f
            r0.f3801j = r3     // Catch: java.lang.Throwable -> L6f
            long r2 = r0.a()     // Catch: java.lang.Throwable -> L6f
            r0.f3803l = r2     // Catch: java.lang.Throwable -> L6f
            r0.f3804m = r2     // Catch: java.lang.Throwable -> L6f
            ao2.x r6 = r0.f3797f     // Catch: java.lang.Throwable -> L6f
            ao2.p1 r6 = (ao2.p1) r6     // Catch: java.lang.Throwable -> L6f
            r6.e0()     // Catch: java.lang.Throwable -> L6f
            ao2.x r6 = r0.f3798g     // Catch: java.lang.Throwable -> L6f
            ao2.p1 r6 = (ao2.p1) r6     // Catch: java.lang.Throwable -> L6f
            r6.e0()     // Catch: java.lang.Throwable -> L6f
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L6f:
            r6 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004e, B:13:0x0052, B:15:0x0056, B:17:0x0067, B:18:0x006c, B:23:0x006a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004e, B:13:0x0052, B:15:0x0056, B:17:0x0067, B:18:0x006c, B:23:0x006a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.u62
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.u62 r0 = (ads_mobile_sdk.u62) r0
            int r1 = r0.f11868f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11868f = r1
            goto L18
        L13:
            ads_mobile_sdk.u62 r0 = new ads_mobile_sdk.u62
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11866d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11868f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r8 = r0.f11865c
            mo2.a r1 = r0.f11864b
            ads_mobile_sdk.c72 r0 = r0.f11863a
            ue.c.H(r9)
            goto L4e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ue.c.H(r9)
            mo2.a r9 = r7.f3796e
            r0.f11863a = r7
            r0.f11864b = r9
            r0.f11865c = r8
            r0.f11868f = r3
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r0 = r9.f(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r7
            r1 = r9
        L4e:
            boolean r9 = r0.f3799h     // Catch: java.lang.Throwable -> L63
            if (r9 != 0) goto L65
            boolean r9 = r0.f3800i     // Catch: java.lang.Throwable -> L63
            if (r9 != 0) goto L65
            ao2.p1 r9 = ao2.m0.b()     // Catch: java.lang.Throwable -> L63
            r0.f3797f = r9     // Catch: java.lang.Throwable -> L63
            long r5 = r0.a()     // Catch: java.lang.Throwable -> L63
            r0.f3802k = r5     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r8 = move-exception
            goto L74
        L65:
            if (r8 == 0) goto L6a
            r0.f3799h = r3     // Catch: java.lang.Throwable -> L63
            goto L6c
        L6a:
            r0.f3800i = r3     // Catch: java.lang.Throwable -> L63
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L63
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            return r8
        L74:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.o42 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.w62
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.w62 r0 = (ads_mobile_sdk.w62) r0
            int r1 = r0.f12885e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12885e = r1
            goto L18
        L13:
            ads_mobile_sdk.w62 r0 = new ads_mobile_sdk.w62
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f12883c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12885e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            mo2.a r7 = r0.f12882b
            ads_mobile_sdk.c72 r0 = r0.f12881a
            ue.c.H(r8)
            goto L61
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ads_mobile_sdk.c72 r7 = r0.f12881a
            ue.c.H(r8)
            goto L4e
        L3d:
            ue.c.H(r8)
            r6.f3795d = r7
            r0.f12881a = r6
            r0.f12885e = r5
            java.lang.Object r7 = r6.c(r5, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            mo2.a r8 = r7.f3796e
            r0.f12881a = r7
            r0.f12882b = r8
            r0.f12885e = r4
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r3, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r0 = r7
            r7 = r8
        L61:
            ao2.j0 r8 = r0.f3792a     // Catch: java.lang.Throwable -> L89
            ads_mobile_sdk.x62 r1 = new ads_mobile_sdk.x62     // Catch: java.lang.Throwable -> L89
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L89
            kotlin.coroutines.j r0 = kotlin.coroutines.j.f80412a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)     // Catch: java.lang.Throwable -> L89
            ads_mobile_sdk.et2 r2 = new ads_mobile_sdk.et2     // Catch: java.lang.Throwable -> L89
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L89
            kotlin.jvm.internal.j.z(r8, r0, r3, r2, r4)     // Catch: java.lang.Throwable -> L89
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L89
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            return r8
        L89:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(ads_mobile_sdk.o42, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #2 {all -> 0x015f, blocks: (B:36:0x00cb, B:38:0x00cf), top: B:35:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0132 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r10, bl2.c r11) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c72.a(kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }
}

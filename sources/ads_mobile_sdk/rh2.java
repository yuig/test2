package ads_mobile_sdk;

import a.h4;
import a.zb;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class rh2 {

    /* renamed from: a, reason: collision with root package name */
    public final sb2 f10641a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f10642b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10643c;

    /* renamed from: d, reason: collision with root package name */
    public final mo2.a f10644d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10645e;

    /* renamed from: f, reason: collision with root package name */
    public final yb0 f10646f;

    public rh2(sb2 rootTraceCreator, zb clock, oh0 flags) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f10641a = rootTraceCreator;
        this.f10642b = clock;
        int j03 = flags.j0();
        this.f10643c = flags.k0();
        this.f10644d = mo2.d.a();
        ArrayList arrayList = new ArrayList();
        this.f10645e = arrayList;
        this.f10646f = new yb0(j03, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r12, dj.e r13, aj.r r14, bl2.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.nh2
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.nh2 r0 = (ads_mobile_sdk.nh2) r0
            int r1 = r0.f8814h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8814h = r1
            goto L18
        L13:
            ads_mobile_sdk.nh2 r0 = new ads_mobile_sdk.nh2
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f8812f
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8814h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            mo2.a r12 = r0.f8811e
            aj.r r14 = r0.f8810d
            dj.e r13 = r0.f8809c
            java.lang.String r1 = r0.f8808b
            ads_mobile_sdk.rh2 r0 = r0.f8807a
            ue.c.H(r15)
            r15 = r12
            r9 = r13
            r10 = r14
            r12 = r1
            goto L5b
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3e:
            ue.c.H(r15)
            mo2.a r15 = r11.f10644d
            r0.f8807a = r11
            r0.f8808b = r12
            r0.f8809c = r13
            r0.f8810d = r14
            r0.f8811e = r15
            r0.f8814h = r3
            mo2.c r15 = (mo2.c) r15
            java.lang.Object r0 = r15.f(r4, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r11
            r9 = r13
            r10 = r14
        L5b:
            ads_mobile_sdk.yb0 r13 = r0.f10646f     // Catch: java.lang.Throwable -> L86
            ads_mobile_sdk.mh2 r14 = new ads_mobile_sdk.mh2     // Catch: java.lang.Throwable -> L86
            zn2.a r1 = zn2.b.f142311b     // Catch: java.lang.Throwable -> L86
            a.zb r1 = r0.f10642b     // Catch: java.lang.Throwable -> L86
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            zn2.d r3 = zn2.d.MILLISECONDS     // Catch: java.lang.Throwable -> L86
            long r6 = dl2.b.Q2(r1, r3)     // Catch: java.lang.Throwable -> L86
            r5 = r14
            r8 = r12
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L86
            r13.put(r12, r14)     // Catch: java.lang.Throwable -> L86
            r0.a()     // Catch: java.lang.Throwable -> L86
            r0.b()     // Catch: java.lang.Throwable -> L86
            kotlin.Unit r12 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L86
            mo2.c r15 = (mo2.c) r15
            r15.i(r4)
            return r12
        L86:
            r12 = move-exception
            mo2.c r15 = (mo2.c) r15
            r15.i(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rh2.a(java.lang.String, dj.e, aj.r, bl2.c):java.lang.Object");
    }

    public final void b() {
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        if (this.f10645e.isEmpty()) {
            return;
        }
        a.v8 builder = od2.r();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator it = this.f10645e.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ld2 value = (ld2) pair.f80346a;
            mh2 mh2Var = (mh2) pair.f80347b;
            h4Var = ((od2) builder.f10110b).evictions_;
            List unmodifiableList = Collections.unmodifiableList(h4Var);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getEvictionsList(...)");
            ba0 ba0Var = new ba0(unmodifiableList);
            a.y6 builder2 = md2.r();
            Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder2, "builder");
            Intrinsics.checkNotNullParameter(value, "value");
            builder2.b();
            md2 md2Var = (md2) builder2.f10110b;
            md2Var.getClass();
            md2Var.evictionReason_ = value.a();
            String value2 = mh2Var.f8230c.requestId;
            if (value2 == null) {
                value2 = "";
            }
            Intrinsics.checkNotNullParameter(value2, "value");
            builder2.b();
            md2 md2Var2 = (md2) builder2.f10110b;
            md2Var2.getClass();
            md2Var2.requestId_ = value2;
            String str = mh2Var.f8230c.requestAgent;
            String value3 = str != null ? str : "";
            Intrinsics.checkNotNullParameter(value3, "value");
            builder2.b();
            md2 md2Var3 = (md2) builder2.f10110b;
            md2Var3.getClass();
            md2Var3.requestAgent_ = value3;
            nl0 value4 = mh2Var.f8229b.f55121l;
            Intrinsics.checkNotNullParameter(value4, "value");
            builder2.b();
            md2 md2Var4 = (md2) builder2.f10110b;
            md2Var4.getClass();
            md2Var4.scarRequestType_ = value4.a();
            sj0 a13 = builder2.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            md2 value5 = (md2) a13;
            Intrinsics.checkNotNullParameter(ba0Var, "<this>");
            Intrinsics.checkNotNullParameter(value5, "value");
            builder.b();
            od2 od2Var = (od2) builder.f10110b;
            od2Var.getClass();
            h4Var2 = od2Var.evictions_;
            if (!((j) h4Var2).f6594a) {
                od2Var.evictions_ = e0.t.a(h4Var2);
            }
            h4Var3 = od2Var.evictions_;
            h4Var3.add(value5);
        }
        sj0 a14 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        od2 od2Var2 = (od2) a14;
        sb2 sb2Var = this.f10641a;
        il0 il0Var = il0.CUI_NAME_SCAR_CACHE_EVICTION;
        ss2 ss2Var = new ss2(new o52(), new v01(), new k72(), new g5());
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a15 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                qs2.a().f().f6996r = od2Var2;
                Object obj = Unit.f80348a;
                if (obj instanceof jk0) {
                    ft2.a((jk0) obj);
                }
                dl2.b.J(a15, null);
            } catch (Throwable th3) {
                try {
                    a15.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a15.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (!(th3 instanceof uk0)) {
                        throw new dk0(th3);
                    }
                    throw th3;
                } finally {
                }
            }
        } else {
            cs2 a16 = qs2.a(il0Var, q0Var, true);
            try {
                qs2.a().f().f6996r = od2Var2;
                Object obj2 = Unit.f80348a;
                if (obj2 instanceof jk0) {
                    ft2.a((jk0) obj2);
                }
                dl2.b.J(a16, null);
            } catch (Throwable th4) {
                try {
                    a16.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a16.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (!(th4 instanceof uk0)) {
                        throw new dk0(th4);
                    }
                    throw th4;
                } finally {
                }
            }
        }
        this.f10645e.clear();
    }

    public final void a() {
        zn2.a aVar = zn2.b.f142311b;
        this.f10642b.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        Iterator it = this.f10646f.entrySet().iterator();
        while (it.hasNext()) {
            mh2 mh2Var = (mh2) ((Map.Entry) it.next()).getValue();
            if (zn2.b.c(Q2, zn2.b.k(mh2Var.f8228a, this.f10643c)) <= 0) {
                return;
            }
            it.remove();
            this.f10645e.add(new Pair(ld2.EVICTION_REASON_EXPIRED, mh2Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.oh2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.oh2 r0 = (ads_mobile_sdk.oh2) r0
            int r1 = r0.f9312f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9312f = r1
            goto L18
        L13:
            ads_mobile_sdk.oh2 r0 = new ads_mobile_sdk.oh2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f9310d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9312f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            mo2.a r6 = r0.f9309c
            java.lang.String r1 = r0.f9308b
            ads_mobile_sdk.rh2 r0 = r0.f9307a
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
            mo2.a r7 = r5.f10644d
            r0.f9307a = r5
            r0.f9308b = r6
            r0.f9309c = r7
            r0.f9312f = r3
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            ads_mobile_sdk.yb0 r0 = r0.f10646f     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L5d
            ads_mobile_sdk.mh2 r6 = (ads_mobile_sdk.mh2) r6     // Catch: java.lang.Throwable -> L5d
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            return r6
        L5d:
            r6 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rh2.a(java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:12:0x0055, B:16:0x005d, B:18:0x0067, B:20:0x006b, B:21:0x0073), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x0070, TRY_ENTER, TryCatch #0 {all -> 0x0070, blocks: (B:12:0x0055, B:16:0x005d, B:18:0x0067, B:20:0x006b, B:21:0x0073), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v12, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ph2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ph2 r0 = (ads_mobile_sdk.ph2) r0
            int r1 = r0.f9687g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9687g = r1
            goto L18
        L13:
            ads_mobile_sdk.ph2 r0 = new ads_mobile_sdk.ph2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f9685e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9687g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r6 = r0.f9684d
            java.lang.String r7 = r0.f9683c
            java.lang.String r1 = r0.f9682b
            ads_mobile_sdk.rh2 r0 = r0.f9681a
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
            mo2.a r8 = r5.f10644d
            r0.f9681a = r5
            r0.f9682b = r6
            r0.f9683c = r7
            r0.f9684d = r8
            r0.f9687g = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            if (r7 != 0) goto L5d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L70
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            return r6
        L5d:
            ads_mobile_sdk.yb0 r0 = r0.f10646f     // Catch: java.lang.Throwable -> L70
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.mh2 r6 = (ads_mobile_sdk.mh2) r6     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L72
            java.util.LinkedHashSet r6 = r6.f8231d     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L72
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r6 = move-exception
            goto L7d
        L72:
            r6 = 0
        L73:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L70
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            return r6
        L7d:
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rh2.a(java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x005d, B:16:0x006c, B:18:0x0079, B:19:0x007e), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #0 {all -> 0x006a, blocks: (B:12:0x005d, B:16:0x006c, B:18:0x0079, B:19:0x007e), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, ads_mobile_sdk.mh2 r8, int r9, bl2.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.qh2
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qh2 r0 = (ads_mobile_sdk.qh2) r0
            int r1 = r0.f10099i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10099i = r1
            goto L18
        L13:
            ads_mobile_sdk.qh2 r0 = new ads_mobile_sdk.qh2
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f10097g
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10099i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.f10096f
            mo2.a r6 = r0.f10095e
            ads_mobile_sdk.mh2 r8 = r0.f10094d
            java.lang.String r7 = r0.f10093c
            java.lang.String r1 = r0.f10092b
            ads_mobile_sdk.rh2 r0 = r0.f10091a
            ue.c.H(r10)
            r10 = r6
            r6 = r1
            goto L5b
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            ue.c.H(r10)
            mo2.a r10 = r5.f10644d
            r0.f10091a = r5
            r0.f10092b = r6
            r0.f10093c = r7
            r0.f10094d = r8
            r0.f10095e = r10
            r0.f10096f = r9
            r0.f10099i = r3
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r0 = r10.f(r4, r0)
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r5
        L5b:
            if (r7 != 0) goto L6c
            ads_mobile_sdk.yb0 r7 = r0.f10646f     // Catch: java.lang.Throwable -> L6a
            r7.remove(r6)     // Catch: java.lang.Throwable -> L6a
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6a
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            return r6
        L6a:
            r6 = move-exception
            goto L86
        L6c:
            java.util.LinkedHashSet r1 = r8.f8231d     // Catch: java.lang.Throwable -> L6a
            r1.add(r7)     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedHashSet r7 = r8.f8231d     // Catch: java.lang.Throwable -> L6a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L6a
            if (r7 < r9) goto L7e
            ads_mobile_sdk.yb0 r7 = r0.f10646f     // Catch: java.lang.Throwable -> L6a
            r7.remove(r6)     // Catch: java.lang.Throwable -> L6a
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6a
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            return r6
        L86:
            mo2.c r10 = (mo2.c) r10
            r10.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rh2.a(java.lang.String, java.lang.String, ads_mobile_sdk.mh2, int, bl2.c):java.lang.Object");
    }
}

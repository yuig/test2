package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p12 extends cs2 {

    /* renamed from: g, reason: collision with root package name */
    public final o12 f9522g;

    /* renamed from: h, reason: collision with root package name */
    public final zb f9523h;

    /* renamed from: i, reason: collision with root package name */
    public final a.j3 f9524i;

    /* renamed from: j, reason: collision with root package name */
    public p12 f9525j;

    /* renamed from: k, reason: collision with root package name */
    public final jw1 f9526k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p12(il0 il0Var, List list, UUID uuid, ss2 ss2Var, o12 o12Var, zb zbVar, a.j3 j3Var, int i13, cs2 cs2Var, int i14, Boolean bool, boolean z13) {
        super(il0Var, ss2Var, cs2Var, dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), z13, 0);
        zn2.a aVar = zn2.b.f142311b;
        zbVar.getClass();
        this.f9522g = o12Var;
        this.f9523h = zbVar;
        this.f9524i = j3Var;
        this.f9526k = new jw1(i14, ss2Var, il0Var, list, uuid, cs2Var != null ? cs2Var.d() : -1, i13, zn2.b.e(b()), bool, 201326336);
    }

    public final void a(int i13, p12 nextTrace) {
        Intrinsics.checkNotNullParameter(nextTrace, "nextTrace");
        if (!c().get()) {
            this.f9526k.f6979a = i13;
            this.f9525j = nextTrace;
            return;
        }
        ds2.a("This trace " + this.f9526k.f6981c.name() + " has already finished");
    }

    @Override // ads_mobile_sdk.cs2
    public final jw1 f() {
        return this.f9526k;
    }

    @Override // ads_mobile_sdk.cs2
    public final void h() {
        jw1 jw1Var = this.f9526k;
        zn2.a aVar = zn2.b.f142311b;
        this.f9523h.getClass();
        jw1Var.f6991m = zn2.b.j(dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), this.f4020c);
    }

    @Override // ads_mobile_sdk.cs2
    public final cs2 a(il0 cuiName, List tags, boolean z13) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        jw1 jw1Var = this.f9526k;
        p12 trace = new p12(cuiName, tags, jw1Var.f6983e, this.f4018a, this.f9522g, this.f9523h, this.f9524i, jw1Var.f6985g + 1, this, z13, 1536);
        trace.f9526k.f6999u = this.f9526k.f6999u;
        o12 o12Var = this.f9522g;
        o12Var.getClass();
        Intrinsics.checkNotNullParameter(trace, "trace");
        while (true) {
            Object obj = o12Var.f9105a.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            p12 p12Var = (p12) obj;
            trace.a(p12Var.f9526k.f6979a + 1, p12Var);
            AtomicReference atomicReference = o12Var.f9105a;
            while (!atomicReference.compareAndSet(p12Var, trace)) {
                if (atomicReference.get() != p12Var) {
                    break;
                }
            }
            return trace;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ p12(ads_mobile_sdk.il0 r17, java.util.List r18, java.util.UUID r19, ads_mobile_sdk.ss2 r20, ads_mobile_sdk.o12 r21, a.zb r22, a.j3 r23, int r24, ads_mobile_sdk.cs2 r25, boolean r26, int r27) {
        /*
            r16 = this;
            r0 = r27
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L9
            r12 = r2
            goto Lb
        L9:
            r12 = r25
        Lb:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L12
            r0 = -1
        L10:
            r13 = r0
            goto L14
        L12:
            r0 = 0
            goto L10
        L14:
            a.c5 r0 = ads_mobile_sdk.go1.a()
            if (r0 == 0) goto L24
            ads_mobile_sdk.un1 r0 = (ads_mobile_sdk.un1) r0
            boolean r0 = r0.a()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L24:
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r15 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p12.<init>(ads_mobile_sdk.il0, java.util.List, java.util.UUID, ads_mobile_sdk.ss2, ads_mobile_sdk.o12, a.zb, a.j3, int, ads_mobile_sdk.cs2, boolean, int):void");
    }

    @Override // ads_mobile_sdk.cs2
    public final void a() {
        jw1[] jw1VarArr;
        super.a();
        jw1 jw1Var = this.f9526k;
        if (jw1Var.f6979a == 0) {
            a.j3 j3Var = this.f9524i;
            UUID uuid = jw1Var.f6983e;
            p12 p12Var = (p12) this.f9522g.f9105a.get();
            if (p12Var == null) {
                jw1VarArr = new jw1[0];
            } else {
                jw1[] jw1VarArr2 = new jw1[p12Var.f9526k.f6979a + 1];
                while (p12Var != null) {
                    jw1 jw1Var2 = p12Var.f9526k;
                    jw1VarArr2[jw1Var2.f6979a] = jw1Var2;
                    p12Var = p12Var.f9525j;
                }
                jw1VarArr = (jw1[]) kotlin.collections.c0.A(jw1VarArr2).toArray(new jw1[0]);
            }
            ws2 traceSnapshot = new ws2(uuid, jw1VarArr);
            ks2 ks2Var = (ks2) j3Var;
            ks2Var.getClass();
            Intrinsics.checkNotNullParameter(traceSnapshot, "traceSnapshot");
            if (ks2Var.f7485i) {
                ks2Var.f7480d.a(traceSnapshot);
                if (ks2Var.f7488l) {
                    for (jw1 jw1Var3 : jw1VarArr) {
                        Throwable th3 = jw1Var3.f6990l;
                        if (th3 == null) {
                            th3 = jw1Var3.f6989k;
                        }
                        Throwable th4 = th3;
                        if (th4 != null) {
                            ks2Var.f7481e.a(new ec0(th4, jw1Var3.f6981c.name(), jw1Var3.f6980b, true, jw1Var3.f6986h));
                        }
                    }
                }
            }
        }
    }
}

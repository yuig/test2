package ads_mobile_sdk;

import ao2.j0;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rw1 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f10826d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f10827e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10828f;

    /* renamed from: g, reason: collision with root package name */
    public final mo2.a f10829g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f10830h;

    /* renamed from: i, reason: collision with root package name */
    public final ReferenceQueue f10831i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(j0 backgroundScope, oh0 flags) {
        super((il0) null, false, 7);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f10826d = backgroundScope;
        this.f10827e = flags;
        this.f10829g = mo2.d.a();
        this.f10830h = new LinkedHashMap();
        this.f10831i = new ReferenceQueue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r9.f(null, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        if (lb.l0.T(r6, r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v7, types: [mo2.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:20:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ca -> B:27:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:21:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.rw1 r8, bl2.c r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof ads_mobile_sdk.nw1
            if (r0 == 0) goto L16
            r0 = r9
            ads_mobile_sdk.nw1 r0 = (ads_mobile_sdk.nw1) r0
            int r1 = r0.f9021f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f9021f = r1
            goto L1b
        L16:
            ads_mobile_sdk.nw1 r0 = new ads_mobile_sdk.nw1
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f9019d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9021f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            ads_mobile_sdk.rw1 r8 = r0.f9016a
        L2c:
            ue.c.H(r9)
            goto L44
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            mo2.a r8 = r0.f9018c
            ads_mobile_sdk.hk0 r2 = r0.f9017b
            ads_mobile_sdk.rw1 r6 = r0.f9016a
            ue.c.H(r9)
            r9 = r8
            r8 = r6
            goto L68
        L44:
            java.lang.ref.ReferenceQueue r9 = r8.f10831i
            java.lang.ref.Reference r9 = r9.poll()
            boolean r2 = r9 instanceof ads_mobile_sdk.hk0
            if (r2 == 0) goto L51
            ads_mobile_sdk.hk0 r9 = (ads_mobile_sdk.hk0) r9
            goto L52
        L51:
            r9 = r3
        L52:
            r2 = r9
        L53:
            if (r2 == 0) goto Lab
            mo2.a r9 = r8.f10829g
            r0.f9016a = r8
            r0.f9017b = r2
            r0.f9018c = r9
            r0.f9021f = r5
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r6 = r9.f(r3, r0)
            if (r6 != r1) goto L68
            goto Lcc
        L68:
            java.util.LinkedHashMap r6 = r8.f10830h     // Catch: java.lang.Throwable -> La4
            java.lang.Object r6 = r6.remove(r2)     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> La4
            mo2.c r9 = (mo2.c) r9
            r9.i(r3)
            ao2.j0 r9 = r8.f10826d
            ads_mobile_sdk.ow1 r6 = new ads_mobile_sdk.ow1
            r6.<init>(r2, r3)
            kotlin.coroutines.j r2 = kotlin.coroutines.j.f80412a
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r7)
            java.lang.String r7 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            ads_mobile_sdk.et2 r7 = new ads_mobile_sdk.et2
            r7.<init>(r6, r3)
            kotlin.jvm.internal.j.z(r9, r2, r3, r7, r4)
            java.lang.ref.ReferenceQueue r9 = r8.f10831i
            java.lang.ref.Reference r9 = r9.poll()
            boolean r2 = r9 instanceof ads_mobile_sdk.hk0
            if (r2 == 0) goto La2
            ads_mobile_sdk.hk0 r9 = (ads_mobile_sdk.hk0) r9
            goto L52
        La2:
            r2 = r3
            goto L53
        La4:
            r8 = move-exception
            mo2.c r9 = (mo2.c) r9
            r9.i(r3)
            throw r8
        Lab:
            ads_mobile_sdk.oh0 r9 = r8.f10827e
            r9.getClass()
            zn2.a r2 = zn2.b.f142311b
            zn2.d r2 = zn2.d.MINUTES
            long r6 = dl2.b.P2(r4, r2)
            java.lang.String r2 = "gads:phantom_reference_interval:seconds"
            long r6 = r9.b(r6, r2)
            r0.f9016a = r8
            r0.f9017b = r3
            r0.f9018c = r3
            r0.f9021f = r4
            java.lang.Object r9 = lb.l0.T(r6, r0)
            if (r9 != r1) goto L44
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rw1.a(ads_mobile_sdk.rw1, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        oh0 oh0Var = this.f10827e;
        oh0Var.getClass();
        zn2.a aVar = zn2.b.f142311b;
        long b13 = oh0Var.b(dl2.b.P2(2, zn2.d.MINUTES), "gads:phantom_reference_interval:seconds");
        aVar.getClass();
        boolean z13 = zn2.b.c(b13, 0L) > 0;
        this.f10828f = z13;
        if (z13) {
            j0 j0Var = this.f10826d;
            qw1 block = new qw1(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
        return new pk0(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.k8] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.lw0 r6, ads_mobile_sdk.ed2 r7, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.pw1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.pw1 r0 = (ads_mobile_sdk.pw1) r0
            int r1 = r0.f9840g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9840g = r1
            goto L18
        L13:
            ads_mobile_sdk.pw1 r0 = new ads_mobile_sdk.pw1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f9838e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9840g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            mo2.a r6 = r0.f9837d
            a.k8 r7 = r0.f9836c
            java.lang.Object r1 = r0.f9835b
            ads_mobile_sdk.rw1 r0 = r0.f9834a
            ue.c.H(r8)
            r8 = r6
            r6 = r1
            goto L5a
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r8)
            boolean r8 = r5.f10828f
            if (r8 != 0) goto L44
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        L44:
            mo2.a r8 = r5.f10829g
            r0.f9834a = r5
            r0.f9835b = r6
            r0.f9836c = r7
            r0.f9837d = r8
            r0.f9840g = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r0 = r5
        L5a:
            java.util.LinkedHashMap r1 = r0.f10830h     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.hk0 r2 = new ads_mobile_sdk.hk0     // Catch: java.lang.Throwable -> L70
            java.lang.ref.ReferenceQueue r0 = r0.f10831i     // Catch: java.lang.Throwable -> L70
            r2.<init>(r7, r6, r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L70
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r6 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L70
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            return r6
        L70:
            r6 = move-exception
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rw1.a(ads_mobile_sdk.lw0, ads_mobile_sdk.ed2, bl2.c):java.lang.Object");
    }
}

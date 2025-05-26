package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class vp extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ao2.o1 f12594a;

    /* renamed from: b, reason: collision with root package name */
    public int f12595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp f12596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(wp wpVar, bl2.c cVar) {
        super(2, cVar);
        this.f12596c = wpVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new vp(this.f12596c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vp(this.f12596c, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f12595b
            r2 = 0
            r3 = 2
            r4 = 4
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L26
            if (r1 == r3) goto L21
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            goto L21
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            ue.c.H(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            goto Lae
        L21:
            ue.c.H(r10)
            goto Lc0
        L26:
            ao2.o1 r1 = r9.f12594a
            ue.c.H(r10)
            goto L64
        L2c:
            ue.c.H(r10)
            ads_mobile_sdk.wp r10 = r9.f12596c
            ao2.j0 r1 = r10.f13138e
            ads_mobile_sdk.up r7 = new ads_mobile_sdk.up
            r7.<init>(r10, r2)
            kotlin.coroutines.j r10 = kotlin.coroutines.j.f80412a
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r8)
            java.lang.String r8 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            ads_mobile_sdk.et2 r8 = new ads_mobile_sdk.et2
            r8.<init>(r7, r2)
            ao2.k2 r1 = kotlin.jvm.internal.j.z(r1, r10, r2, r8, r3)
            ads_mobile_sdk.wp r10 = r9.f12596c
            ads_mobile_sdk.eg r10 = r10.f13143j
            r9.f12594a = r1
            r9.f12595b = r6
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.eg.a(r10, r9)
            if (r10 != r0) goto L64
            return r0
        L64:
            ads_mobile_sdk.gf r10 = (ads_mobile_sdk.gf) r10
            java.lang.String r10 = r10.x()
            java.lang.String r6 = "getAppSettingsJson(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)
            int r10 = r10.length()
            if (r10 <= 0) goto L87
            ads_mobile_sdk.wp r10 = r9.f12596c
            ads_mobile_sdk.z6 r10 = r10.f13144k
            r9.f12594a = r2
            r9.f12595b = r3
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.z6.a(r10, r9)
            if (r10 != r0) goto Lc0
            return r0
        L87:
            ads_mobile_sdk.wp r10 = r9.f12596c     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            ads_mobile_sdk.oh0 r10 = r10.f13147n     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            r10.getClass()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            java.lang.String r3 = "gads:adapter_initialization:cld_timeout"
            zn2.a r6 = zn2.b.f142311b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            zn2.d r6 = zn2.d.SECONDS     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            r7 = 10
            long r6 = dl2.b.P2(r7, r6)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            long r6 = r10.b(r6, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            ads_mobile_sdk.tp r10 = new ads_mobile_sdk.tp     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            r10.<init>(r1, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            r9.f12594a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            r9.f12595b = r5     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            java.lang.Object r10 = bs1.c.x2(r6, r10, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> Lae
            if (r10 != r0) goto Lae
            return r0
        Lae:
            ads_mobile_sdk.wp r10 = r9.f12596c
            ads_mobile_sdk.z6 r10 = r10.f13144k
            r9.f12594a = r2
            r9.f12595b = r4
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.z6.a(r10, r9)
            if (r10 != r0) goto Lc0
            return r0
        Lc0:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r21 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public lg0 f10418a;

    /* renamed from: b, reason: collision with root package name */
    public sy0 f10419b;

    /* renamed from: c, reason: collision with root package name */
    public int f10420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f10421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sy0 f10422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(g31 g31Var, sy0 sy0Var, bl2.c cVar) {
        super(2, cVar);
        this.f10421d = g31Var;
        this.f10422e = sy0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r21(this.f10421d, this.f10422e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r21(this.f10421d, this.f10422e, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f10420c
            java.lang.String r2 = "consentStringsProvider"
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            ue.c.H(r11)
            goto L95
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            ads_mobile_sdk.sy0 r1 = r10.f10419b
            ads_mobile_sdk.lg0 r2 = r10.f10418a
            ue.c.H(r11)
            goto L83
        L2a:
            ue.c.H(r11)
            goto L68
        L2e:
            ue.c.H(r11)
            goto L55
        L32:
            ue.c.H(r11)
            ads_mobile_sdk.g31 r11 = r10.f10421d
            ads_mobile_sdk.oh0 r11 = r11.f5371e
            r11.getClass()
            zn2.a r1 = zn2.b.f142311b
            zn2.d r1 = zn2.d.SECONDS
            r8 = 60
            long r8 = dl2.b.P2(r8, r1)
            java.lang.String r1 = "gads:flag_update_delay_sec"
            long r8 = r11.b(r8, r1)
            r10.f10420c = r6
            java.lang.Object r11 = lb.l0.T(r8, r10)
            if (r11 != r0) goto L55
            return r0
        L55:
            ads_mobile_sdk.g31 r11 = r10.f10421d
            a.f4 r11 = r11.f5380n
            if (r11 == 0) goto L9c
            ads_mobile_sdk.zr r11 = (ads_mobile_sdk.zr) r11
            ao2.x r11 = r11.C
            r10.f10420c = r5
            java.lang.Object r11 = r11.join(r10)
            if (r11 != r0) goto L68
            return r0
        L68:
            ads_mobile_sdk.g31 r11 = r10.f10421d
            ads_mobile_sdk.lg0 r1 = r11.f5374h
            ads_mobile_sdk.sy0 r5 = r10.f10422e
            a.f4 r11 = r11.f5380n
            if (r11 == 0) goto L98
            r10.f10418a = r1
            r10.f10419b = r5
            r10.f10420c = r4
            ads_mobile_sdk.zr r11 = (ads_mobile_sdk.zr) r11
            java.lang.Object r11 = ads_mobile_sdk.zr.d(r11, r10)
            if (r11 != r0) goto L81
            return r0
        L81:
            r2 = r1
            r1 = r5
        L83:
            nm.u r11 = (nm.u) r11
            r10.f10418a = r7
            r10.f10419b = r7
            r10.f10420c = r3
            r2.getClass()
            java.lang.Object r11 = ads_mobile_sdk.lg0.a(r2, r1, r11, r10)
            if (r11 != r0) goto L95
            return r0
        L95:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        L98:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r7
        L9c:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.r21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

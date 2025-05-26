package cu;

import ao2.j0;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f53245r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BaseAdsScrollingModule f53246s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BaseAdsScrollingModule baseAdsScrollingModule, bl2.c cVar) {
        super(2, cVar);
        this.f53246s = baseAdsScrollingModule;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f53246s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f53245r
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule r6 = r9.f53246s
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            ue.c.H(r10)
            goto L67
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            ue.c.H(r10)
            goto L4d
        L22:
            ue.c.H(r10)
            goto L34
        L26:
            ue.c.H(r10)
            r9.f53245r = r5
            r7 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r10 = lb.l0.S(r7, r9)
            if (r10 != r0) goto L34
            return r0
        L34:
            boolean r10 = r6.f35329p0
            if (r10 == 0) goto L3b
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L3b:
            int r10 = r6.T0()
            r6.r0(r2, r10, r2)
            r9.f53245r = r4
            r4 = 750(0x2ee, double:3.705E-321)
            java.lang.Object r10 = lb.l0.S(r4, r9)
            if (r10 != r0) goto L4d
            return r0
        L4d:
            boolean r10 = r6.f35329p0
            if (r10 == 0) goto L54
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L54:
            int r10 = r6.T0()
            int r10 = -r10
            r6.r0(r2, r10, r2)
            r9.f53245r = r3
            r3 = 375(0x177, double:1.853E-321)
            java.lang.Object r10 = lb.l0.S(r3, r9)
            if (r10 != r0) goto L67
            return r0
        L67:
            boolean r10 = r6.f35329p0
            if (r10 == 0) goto L6e
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        L6e:
            int r10 = r6.getScrollY()
            if (r10 == 0) goto L77
            r6.t0(r2)
        L77:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

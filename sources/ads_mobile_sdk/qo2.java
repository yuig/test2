package ads_mobile_sdk;

import a.w0;
import ao2.j0;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qo2 extends v0 {

    /* renamed from: j, reason: collision with root package name */
    public final a.w6 f10203j;

    /* renamed from: k, reason: collision with root package name */
    public final a.w6 f10204k;

    /* renamed from: l, reason: collision with root package name */
    public final Optional f10205l;

    /* renamed from: m, reason: collision with root package name */
    public final a.fe f10206m;

    /* renamed from: n, reason: collision with root package name */
    public final h80 f10207n;

    /* renamed from: o, reason: collision with root package name */
    public final j0 f10208o;

    /* renamed from: p, reason: collision with root package name */
    public String f10209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo2(a.w6 adapterWrapper, a.w6 rtbAdapterWrapper, Optional oldAdapterWrapper, a.fe mediationAdapterProxyFactory, h80 delegatingThirdPartyEventEmitter, j0 uiScope, ss2 traceMetaSet, wi.k baseRequest, h92 requestType, long j13, int i13, r0 adConfiguration, vo commonConfiguration, cf2 serverTransaction, String renderId) {
        super(traceMetaSet, baseRequest, requestType, j13, i13, adConfiguration, commonConfiguration, serverTransaction, renderId);
        Intrinsics.checkNotNullParameter(adapterWrapper, "adapterWrapper");
        Intrinsics.checkNotNullParameter(rtbAdapterWrapper, "rtbAdapterWrapper");
        Intrinsics.checkNotNullParameter(oldAdapterWrapper, "oldAdapterWrapper");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        this.f10203j = adapterWrapper;
        this.f10204k = rtbAdapterWrapper;
        this.f10205l = oldAdapterWrapper;
        this.f10206m = mediationAdapterProxyFactory;
        this.f10207n = delegatingThirdPartyEventEmitter;
        this.f10208o = uiScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.w0 r8, bl2.c r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qo2.a(a.w0, bl2.c):java.lang.Object");
    }

    @Override // a.kb
    public final boolean b() {
        return !this.f12268f.f10357b.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ads_mobile_sdk.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r11, bl2.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.po2
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.po2 r0 = (ads_mobile_sdk.po2) r0
            int r1 = r0.f9762c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9762c = r1
            goto L18
        L13:
            ads_mobile_sdk.po2 r0 = new ads_mobile_sdk.po2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f9760a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9762c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r12)
            goto L92
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            ue.c.H(r12)
            ads_mobile_sdk.r0 r12 = r10.c()
            java.util.List r12 = r12.f10357b
            java.util.Iterator r12 = r12.iterator()
        L3c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r12.next()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r10.f10209p = r5
            a.fe r4 = r10.f10206m
            ads_mobile_sdk.h92 r8 = r10.f12265c
            r9 = 4
            r7 = 0
            r6 = r11
            a.w0 r2 = a.fe.a(r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L3c
            goto L5a
        L59:
            r2 = 0
        L5a:
            if (r2 != 0) goto L89
            ads_mobile_sdk.mk0 r11 = new ads_mobile_sdk.mk0
            wi.s r12 = new wi.s
            wi.q r0 = wi.q.NOT_FOUND
            int r0 = r0.getValue()
            ads_mobile_sdk.r0 r1 = r10.c()
            java.util.List r1 = r1.f10357b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to instantiate any mediation adapter class: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "undefined"
            r12.<init>(r0, r1, r2)
            r11.<init>(r12)
            return r11
        L89:
            r0.f9762c = r3
            java.lang.Object r12 = r10.a(r2, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            a.ad r12 = (a.ad) r12
            boolean r11 = r12 instanceof ads_mobile_sdk.jk0
            if (r11 == 0) goto L99
            goto La7
        L99:
            boolean r11 = r12 instanceof ads_mobile_sdk.pk0
            if (r11 == 0) goto La8
            ads_mobile_sdk.pk0 r11 = new ads_mobile_sdk.pk0
            do2.l r12 = lb.l0.i0(r12)
            r11.<init>(r12)
            r12 = r11
        La7:
            return r12
        La8:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qo2.a(boolean, bl2.c):java.lang.Object");
    }

    public final a.ad a(w0 w0Var) {
        if (w0Var instanceof u91) {
            return new pk0(this.f10203j.a(d(), c(), w0Var));
        }
        if (w0Var instanceof ic2) {
            return new pk0(this.f10204k.a(d(), c(), w0Var));
        }
        if (w0Var instanceof gq1) {
            if (this.f10205l.isPresent()) {
                return new pk0(((a.w6) this.f10205l.get()).a(d(), c(), w0Var));
            }
            return new nk0("OldAdapterWrapper is empty, unable to wrap " + w0Var + ".");
        }
        throw new NoWhenBranchMatchedException();
    }
}

package h22;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66572i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f66573j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f66572i = i13;
        this.f66573j = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f66572i
            java.lang.String r1 = "getUid(...)"
            h22.c r2 = r4.f66573j
            switch(r0) {
                case 0: goto L60;
                case 1: goto L21;
                default: goto L9;
            }
        L9:
            h22.d r5 = (h22.d) r5
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r2.getClass()
            com.pinterest.api.model.f30 r0 = r5.f66581a
            h22.d r1 = new h22.d
            java.util.List r5 = r5.f66582b
            java.util.ArrayList r5 = kh2.u2.e1(r0, r5)
            r1.<init>(r0, r5)
            return r1
        L21:
            com.pinterest.api.model.f30 r5 = (com.pinterest.api.model.f30) r5
            java.lang.String r0 = "updatedPin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r2.getClass()
            com.pinterest.api.model.dl0 r0 = r5.v6()
            if (r0 == 0) goto L3f
            java.lang.String r2 = r5.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r3 = 0
            java.util.List r0 = kh2.u2.U(r0, r3, r2)
            if (r0 != 0) goto L41
        L3f:
            kotlin.collections.q0 r0 = kotlin.collections.q0.f80391a
        L41:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L4a
            jk2.h0 r5 = jk2.h0.f76488a
            goto L5f
        L4a:
            ey.v0 r2 = new ey.v0
            java.lang.String r3 = r5.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            ey.s4 r1 = ey.s4.PAGES_FROM_PIN_API_FETCH
            r2.<init>(r3, r1)
            r2.i()
            jk2.i1 r5 = h22.c.a(r5, r0)
        L5f:
            return r5
        L60:
            com.pinterest.api.model.f30 r5 = (com.pinterest.api.model.f30) r5
            x02.i2 r0 = r2.f66575a
            kotlin.jvm.internal.Intrinsics.f(r5)
            r0.Z(r5)
            uk2.f r0 = r2.f66579e
            r0.c(r5)
            java.lang.String r5 = r5.getUid()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            h22.e r0 = r2.f66577c
            r0.getClass()
            java.lang.String r1 = "pinId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.util.LinkedHashSet r0 = r0.f66583a
            r0.add(r5)
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h22.a.invoke(java.lang.Object):java.lang.Object");
    }
}

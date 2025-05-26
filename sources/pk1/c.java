package pk1;

import bi1.a0;
import ck2.i;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.framework.multisection.datasource.pagedlist.j0;
import dl1.s;
import ey.l0;
import kotlin.jvm.internal.Intrinsics;
import rh1.q1;
import x02.x2;

/* loaded from: classes5.dex */
public final class c extends h0 {
    public final a E;
    public final boolean F;
    public final x2 G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r18, m60.g0 r19, pk1.a r20, boolean r21, java.util.Map r22, pk1.f r23) {
        /*
            r17 = this;
            r12 = r17
            r13 = r19
            r14 = r20
            r15 = r22
            xk2.v r0 = pk1.h.f100545a
            java.lang.Object r1 = r0.getValue()
            pk1.d r1 = (pk1.d) r1
            so.oa r1 = (so.oa) r1
            bf2.d r1 = r1.f113927t7
            java.lang.Object r1 = r1.get()
            r7 = r1
            x12.a r7 = (x12.a) r7
            java.lang.Object r0 = r0.getValue()
            pk1.d r0 = (pk1.d) r0
            so.oa r0 = (so.oa) r0
            x02.x2 r11 = r0.G2()
            java.lang.String r0 = "remoteUrl"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "pageSizeProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "userViewConfiguration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "extraRequestParams"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "pagedListService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "userRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            rr0.b r4 = new rr0.b
            r4.<init>(r13)
            j10.k r0 = com.pinterest.api.model.deserializer.UserDeserializer.f36811e
            r0.getClass()
            com.pinterest.api.model.deserializer.UserDeserializer r0 = com.pinterest.api.model.deserializer.UserDeserializer.f36812f
            if (r0 == 0) goto L9c
            r2 = 1
            ke0.a[] r2 = new ke0.a[r2]
            r3 = 0
            r2[r3] = r0
            r6 = 0
            r16 = 1260(0x4ec, float:1.766E-42)
            r3 = 0
            r5 = 0
            r9 = 0
            r0 = r17
            r1 = r18
            r8 = r23
            r13 = r11
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r12.E = r14
            r0 = r21
            r12.F = r0
            r12.G = r13
            qz.f0 r0 = new qz.f0
            r0.<init>()
            n00.c r1 = n00.c.LIBRARY_USER_FEED
            java.lang.String r1 = n00.b.a(r1)
            java.lang.String r2 = "fields"
            r0.e(r2, r1)
            java.lang.String r1 = "page_size"
            java.lang.String r2 = r19.d()
            r0.e(r1, r2)
            r0.f(r15)
            r12.f49121k = r0
            vq0.h r0 = r14.f100537b
            int r1 = r14.f100536a
            r12.o(r1, r0)
            return
        L9c:
            java.lang.String r0 = "INSTANCE"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pk1.c.<init>(java.lang.String, m60.g0, pk1.a, boolean, java.util.Map, pk1.f):void");
    }

    @Override // wk1.e
    public final void E2() {
        u(this.G.B().H(tk2.e.f118017c).A(wj2.c.a()).F(new q1(18, new a0(this, 16)), new q1(19, b.f100538j), i.f27923c, i.f27924d));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void R(boolean z13) {
        if (this.F && (this.f49128r instanceof j0)) {
            new l0(0, 0).i();
        }
        super.R(z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void T(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return this.E.f100536a;
    }
}

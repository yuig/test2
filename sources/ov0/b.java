package ov0;

import com.pinterest.api.model.vh;
import com.pinterest.api.model.zq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import z32.m0;

/* loaded from: classes5.dex */
public final class b extends h0 {
    public final /* synthetic */ int E = 2;
    public boolean F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.lang.String r17, m60.g0 r18, yk1.a r19, b60.b r20) {
        /*
            r16 = this;
            r12 = r16
            r0 = r17
            r13 = r19
            r14 = r20
            r1 = 2
            r12.E = r1
            java.lang.String r1 = "pinId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pageSizeProvider"
            r15 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "viewResources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "activeUserManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pins/"
            r1.<init>(r2)
            java.lang.String r2 = "/reactions/"
            java.lang.String r1 = a.a.p(r1, r0, r2)
            android.content.Context r0 = kb0.a.f79058b
            java.lang.Class<so1.b> r0 = so1.b.class
            java.lang.Object r0 = ep.b.g(r0)
            so1.b r0 = (so1.b) r0
            so.oa r0 = (so.oa) r0
            bf2.d r0 = r0.Ic
            java.lang.Object r0 = r0.get()
            ke0.a r0 = (ke0.a) r0
            ke0.a[] r2 = new ke0.a[]{r0}
            r7 = 0
            r11 = 2044(0x7fc, float:2.864E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            qz.f0 r0 = new qz.f0
            r0.<init>()
            n00.c r1 = n00.c.USER_REACTION
            java.lang.String r1 = n00.b.a(r1)
            java.lang.String r2 = "fields"
            r0.e(r2, r1)
            java.lang.String r1 = "page_size"
            java.lang.String r2 = r18.d()
            r0.e(r1, r2)
            r12.f49121k = r0
            yi0.a r0 = new yi0.a
            r0.<init>(r13, r14)
            r1 = 168(0xa8, float:2.35E-43)
            r12.o(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov0.b.<init>(java.lang.String, m60.g0, yk1.a, b60.b):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final boolean K() {
        switch (this.E) {
            case 2:
                return this.F;
            default:
                return this.f49136z;
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.E) {
            case 0:
                return 7;
            case 1:
                s item = getItem(i13);
                if (!(item instanceof vh)) {
                    return item instanceof zq ? 4 : -2;
                }
                m0 m0Var = ((vh) item).f42868z;
                int i14 = m0Var == null ? -1 : c.f97724a[m0Var.ordinal()];
                int i15 = 1;
                if (i14 == 1) {
                    return 0;
                }
                if (i14 != 2) {
                    i15 = 3;
                    if (i14 == 3) {
                        return 2;
                    }
                    if (i14 != 4) {
                        i15 = 5;
                        if (i14 != 5) {
                            return -2;
                        }
                    }
                }
                return i15;
            default:
                return RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION;
        }
    }

    @Override // wt1.b
    public final boolean i() {
        switch (this.E) {
            case 0:
                return this.F;
            case 1:
                return this.F;
            default:
                return !(this instanceof d51.s);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(nv0.b r15) {
        /*
            r14 = this;
            r0 = 0
            r14.E = r0
            java.lang.String r1 = "actionListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            b20.c r1 = new b20.c
            r2 = 2
            r1.<init>(r2)
            ke0.a[] r2 = g4.u.b0()
            r1.c(r2)
            ke0.a r2 = gh0.b.U()
            r1.b(r2)
            int r2 = r1.C()
            ke0.a[] r2 = new ke0.a[r2]
            java.lang.Object[] r1 = r1.D(r2)
            r4 = r1
            ke0.a[] r4 = (ke0.a[]) r4
            r9 = 0
            r13 = 2044(0x7fc, float:2.864E-42)
            java.lang.String r3 = "storypins/stickers/search/stories"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            r1 = 1
            r14.F = r1
            qz.f0 r1 = new qz.f0
            r1.<init>()
            java.lang.String r2 = "recently_used_sticker_ids"
            java.lang.String r3 = ""
            r1.e(r2, r3)
            r14.f49121k = r1
            nv0.a r1 = new nv0.a
            r1.<init>(r15, r0)
            r15 = 7
            r14.o(r15, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov0.b.<init>(nv0.b):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(nv0.b r20, pv0.d r21, nv0.l r22) {
        /*
            r19 = this;
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            r11 = 1
            r12.E = r11
            java.lang.String r0 = "actionListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "boardStickerListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "imageStickerListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            b20.c r0 = new b20.c
            r9 = 2
            r0.<init>(r9)
            ke0.a[] r1 = g4.u.b0()
            r0.c(r1)
            ke0.a r1 = gh0.b.U()
            r0.b(r1)
            int r1 = r0.C()
            ke0.a[] r1 = new ke0.a[r1]
            java.lang.Object[] r0 = r0.D(r1)
            r2 = r0
            ke0.a[] r2 = (ke0.a[]) r2
            r7 = 0
            r16 = 2044(0x7fc, float:2.864E-42)
            java.lang.String r1 = "storypins/stickers/feed/"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r17 = 0
            r0 = r19
            r9 = r17
            r14 = r11
            r11 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r12.F = r14
            pk0.b r0 = new pk0.b
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            r12.o(r1, r0)
            nv0.a r0 = new nv0.a
            r1 = 3
            r0.<init>(r13, r1)
            r12.o(r14, r0)
            ni0.f r0 = new ni0.f
            r2 = r21
            r3 = r14
            r0.<init>(r13, r2, r15)
            r2 = 2
            r12.o(r2, r0)
            nv0.a r0 = new nv0.a
            r0.<init>(r13, r3)
            r12.o(r1, r0)
            nv0.a r0 = new nv0.a
            r0.<init>(r13, r2)
            r1 = 4
            r12.o(r1, r0)
            pk0.b r0 = new pk0.b
            r1 = 22
            r0.<init>(r1)
            r1 = 5
            r12.o(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov0.b.<init>(nv0.b, pv0.d, nv0.l):void");
    }
}

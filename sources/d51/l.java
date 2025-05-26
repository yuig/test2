package d51;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.profile.savedtab.remoterequest.ProfileSavedTabBoardsRetrofitPagedRemoteRequest;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.u2;

/* loaded from: classes5.dex */
public class l extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final String L;
    public final c51.e M;
    public final g51.f N;
    public final boolean O;
    public final boolean P;
    public final u2 Q;
    public final boolean R;
    public final boolean S;
    public List T;
    public final String U;
    public final boolean V;
    public final boolean W;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(java.lang.String r87, c51.e r88, g51.f r89, nr0.k r90, boolean r91, boolean r92, java.lang.String r93, lh0.u2 r94, java.lang.String r95, boolean r96, boolean r97, java.lang.Integer r98, boolean r99, int r100) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d51.l.<init>(java.lang.String, c51.e, g51.f, nr0.k, boolean, boolean, java.lang.String, lh0.u2, java.lang.String, boolean, boolean, java.lang.Integer, boolean, int):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public boolean C() {
        return this.V;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public boolean D() {
        return this.W;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public String F() {
        return this.U;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(kotlin.jvm.internal.r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        LinkedHashMap registeredDeserializers = this.f49132v;
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        ow modelStorage = this.f49116f;
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        x12.a pagedListService = this.f49117g;
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        return new ProfileSavedTabBoardsRetrofitPagedRemoteRequest(registeredDeserializers, modelStorage, null, null, pagedListService, null, null, null, null, 460, null);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (!this.P) {
            List<dl1.s> list = itemsToSet;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (dl1.s sVar : list) {
                    vh vhVar = sVar instanceof vh ? (vh) sVar : null;
                    if (!Intrinsics.d(vhVar != null ? vhVar.q() : null, "all_pins")) {
                        break;
                    }
                }
            }
            itemsToSet = q0.f80391a;
        }
        super.b0(itemsToSet, z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        if (i13 == 48) {
            return false;
        }
        if (i13 != 53) {
            return this.E.f(i13);
        }
        return true;
    }

    public final boolean f0() {
        return this.N.f63603c.b(this.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0() {
        /*
            r10 = this;
            qz.f0 r0 = new qz.f0
            r0.<init>()
            g51.f r1 = r10.N
            c51.e r2 = r10.M
            java.lang.String r3 = "getMyBoardSortOption(...)"
            if (r2 == 0) goto L29
            r4 = r2
            g51.n r4 = (g51.n) r4
            boolean r5 = r4.G3()
            if (r5 == 0) goto L20
            bq.c r4 = r4.f63640t
            bq.b r4 = r4.b()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            goto L27
        L20:
            bq.b r4 = bq.c.f23676d
            java.lang.String r5 = "DEFAULT_OPTION"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
        L27:
            if (r4 != 0) goto L32
        L29:
            bq.c r4 = r1.f63601a
            bq.b r4 = r4.b()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
        L32:
            java.lang.String r3 = r4.getApiKey()
            java.lang.String r4 = "getApiKey(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r4 = "sort"
            r0.e(r4, r3)
            boolean r3 = r10.R
            if (r3 == 0) goto L4b
            x02.x r2 = x02.x.PROTECTED_BOARDS_FILTER
            java.lang.String r2 = r2.getValue()
            goto L69
        L4b:
            if (r2 == 0) goto L63
            g51.n r2 = (g51.n) r2
            boolean r3 = r2.G3()
            if (r3 == 0) goto L5c
            boolean r2 = r2.f63626f
            if (r2 != 0) goto L5c
            x02.x r2 = x02.x.ALL_BOARDS_FILTER
            goto L5e
        L5c:
            x02.x r2 = x02.x.PUBLIC_BOARDS_FILTER
        L5e:
            java.lang.String r2 = r2.getValue()
            goto L69
        L63:
            x02.x r2 = x02.x.ALL_BOARDS_FILTER
            java.lang.String r2 = r2.getValue()
        L69:
            kotlin.jvm.internal.Intrinsics.f(r2)
            java.lang.String r3 = "privacy_filter"
            r0.e(r3, r2)
            java.lang.String r2 = "filter_stories"
            java.lang.String r3 = "false"
            r0.e(r2, r3)
            boolean r2 = r10.O
            r2 = r2 ^ 1
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "filter_all_pins"
            r0.e(r3, r2)
            boolean r2 = r10.S
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "filter_collage"
            r0.e(r3, r2)
            m60.g0 r1 = r1.f63606f
            java.lang.String r1 = r1.d()
            java.lang.String r2 = "page_size"
            r0.e(r2, r1)
            boolean r1 = r10.f0()
            if (r1 != 0) goto Lac
            lh0.u2 r1 = r10.Q
            boolean r1 = r1.c()
            if (r1 == 0) goto Lac
            n00.c r1 = n00.c.LIBRARY_BOARD_FEED_WITH_CREATOR_ATTRIBUTION_AND_BOARD_PIN_COUNT
            goto Lae
        Lac:
            n00.c r1 = n00.c.LIBRARY_BOARD_FEED
        Lae:
            java.lang.String r2 = "fields"
            java.lang.String r1 = n00.b.a(r1)
            r0.e(r2, r1)
            java.util.List r1 = r10.T
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto Ldb
            java.util.List r1 = r10.T
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            d51.c r8 = d51.c.f53689l
            r6 = 0
            r7 = 0
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            r9 = 30
            java.lang.String r1 = kotlin.collections.CollectionsKt.Z(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "filter_types"
            r0.e(r2, r1)
        Ldb:
            r10.f49121k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d51.l.g0():void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s item = getItem(i13);
        if (item instanceof v7) {
            return 16925;
        }
        boolean z13 = item instanceof vh;
        nr0.k kVar = this.E;
        if (!z13) {
            return kVar.getItemViewType(i13);
        }
        String q13 = ((vh) item).q();
        if (Intrinsics.d(q13, "all_pins")) {
            return 48;
        }
        if (Intrinsics.d(q13, "your_collages")) {
            return 49;
        }
        return kVar.getItemViewType(i13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, wt1.b
    public final void n() {
        g0();
        super.n();
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean q(int i13) {
        if (i13 == 48) {
            return false;
        }
        if (i13 != 53) {
            return this.E.q(i13);
        }
        return true;
    }
}

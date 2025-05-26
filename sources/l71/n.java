package l71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import m60.w;
import uj2.b0;

/* loaded from: classes5.dex */
public final class n extends s {
    public final j22.b A;
    public final boolean B;
    public final boolean C;
    public final no0.a D;

    public /* synthetic */ n(w wVar, o71.w wVar2, ip1.b bVar, uk1.d dVar, uj2.q qVar, vy.m mVar, z61.b bVar2, j22.b bVar3, boolean z13) {
        this(wVar, wVar2, bVar, dVar, qVar, mVar, bVar2, bVar3, z13, null, null);
    }

    @Override // l71.f
    public final boolean B() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055 A[RETURN, SYNTHETIC] */
    @Override // sq0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getItemViewType(int r2) {
        /*
            r1 = this;
            java.lang.Object r2 = r1.getItem(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.pinterest.activity.search.model.SearchTypeaheadItem"
            kotlin.jvm.internal.Intrinsics.g(r2, r0)
            br.d r2 = (br.d) r2
            java.lang.String r2 = r2.f23727y
            if (r2 == 0) goto L58
            int r0 = r2.hashCode()
            switch(r0) {
                case -51815703: goto L4c;
                case 654206954: goto L43;
                case 1469416705: goto L37;
                case 2035935090: goto L2c;
                case 2085703211: goto L23;
                case 2120832896: goto L17;
                default: goto L16;
            }
        L16:
            goto L58
        L17:
            java.lang.String r0 = "autocomplete_trending_articles"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L58
        L20:
            r2 = 115(0x73, float:1.61E-43)
            goto L59
        L23:
            java.lang.String r0 = "autocomplete_profiles_header"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L55
            goto L58
        L2c:
            java.lang.String r0 = "autocomplete_nux_topic_articles"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L58
            r2 = 113(0x71, float:1.58E-43)
            goto L59
        L37:
            java.lang.String r0 = "autocomplete_curated_articles"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L40
            goto L58
        L40:
            r2 = 114(0x72, float:1.6E-43)
            goto L59
        L43:
            java.lang.String r0 = "autocomplete_popular_header"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L55
            goto L58
        L4c:
            java.lang.String r0 = "autocomplete_recent_searches_header"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L55
            goto L58
        L55:
            r2 = 112(0x70, float:1.57E-43)
            goto L59
        L58:
            r2 = 1
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l71.n.getItemViewType(int):int");
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) this.D.b(new p71.f(this.B, this.C)).buildRequest();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, z61.b searchPWTManager, j22.b searchService, boolean z13, j3 j3Var, nu1.a aVar) {
        super(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        this.A = searchService;
        this.B = false;
        this.C = z13;
        this.D = new no0.a(searchService, j3Var);
        if (aVar != null) {
            o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, new ni0.f(presenterPinalytics, networkStateStream, aVar));
            o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, new xv.g(presenterPinalytics, networkStateStream, aVar, eventManager));
            o(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, new yi0.a(presenterPinalytics, aVar));
        }
        o(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, new cg0.c(4, presenterPinalytics, networkStateStream));
    }
}

package l71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import lh0.f3;
import lh0.g1;
import lh0.j3;
import lh0.z3;
import m60.w;
import o71.l0;
import uj2.b0;

/* loaded from: classes5.dex */
public final class k extends s {
    public final boolean A;
    public final m71.a B;
    public final j3 C;
    public final p71.c D;
    public final r71.a E;
    public String F;
    public final int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w eventManager, o71.w screenNavigatorManager, ip1.b prefetchManager, uk1.d presenterPinalytics, uj2.q networkStateStream, vy.m analyticsApi, z61.b searchPWTManager, j22.b searchService, boolean z13, m71.a cacheInteractor, lh0.o baseExperimentsHelper, j3 typeaheadExperiments, f3 libraryExperiments, hl1.a viewActivity, boolean z14, yk1.v viewResources, nu1.a aVar, g70.h boardNavigator) {
        super(eventManager, screenNavigatorManager, prefetchManager, presenterPinalytics, networkStateStream, analyticsApi, searchPWTManager, baseExperimentsHelper, libraryExperiments);
        uj2.q qVar;
        j3 j3Var;
        r41.k profileNavigator = r41.k.f106176a;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(searchService, "searchService");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(cacheInteractor, "cacheInteractor");
        Intrinsics.checkNotNullParameter(baseExperimentsHelper, "baseExperimentsHelper");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        Intrinsics.checkNotNullParameter(libraryExperiments, "libraryExperiments");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.A = z13;
        this.B = cacheInteractor;
        this.C = typeaheadExperiments;
        this.D = new p71.c(searchService, 1);
        r71.a aVar2 = new r71.a(presenterPinalytics, networkStateStream, new l0(presenterPinalytics, analyticsApi), eventManager, 1);
        this.E = aVar2;
        this.F = this.f81938m;
        i iVar = new i(this, 0);
        if (!Intrinsics.d(this.f81965v, iVar)) {
            this.f81965v = iVar;
            this.f81962s.f106419m = iVar;
            this.f81963t.f139602i = iVar;
        }
        o(3, aVar2);
        o(2, new aj0.d(viewResources, presenterPinalytics, networkStateStream, new l0(presenterPinalytics, analyticsApi), boardNavigator));
        if (aVar != null) {
            qVar = networkStateStream;
            j3Var = typeaheadExperiments;
            o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, new ni0.f(presenterPinalytics, qVar, aVar));
            o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, new xv.g(presenterPinalytics, qVar, aVar, eventManager));
            o(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, new yi0.a(presenterPinalytics, aVar));
        } else {
            qVar = networkStateStream;
            j3Var = typeaheadExperiments;
        }
        o(RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, new cg0.c(4, presenterPinalytics, qVar));
        this.G = z14 ? 15 : 12;
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        typeaheadExperiments.getClass();
        Intrinsics.checkNotNullParameter("enabled_icon_ranking_headers_user", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        ((g1) j3Var.f83398a).k("android_search_autocomplete_header_icon_exp", "enabled_icon_ranking_headers_user", activate);
    }

    @Override // l71.f
    public final boolean B() {
        return false;
    }

    @Override // l71.f
    public final boolean H(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return false;
    }

    @Override // l71.f
    public final void I(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.F = value;
        r71.b bVar = this.f81962s;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        bVar.f106414h = value;
        yo0.a aVar = this.f81963t;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        aVar.f139600g = value;
        r71.a aVar2 = this.E;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        aVar2.f106405g = value;
    }

    @Override // l71.f
    public final boolean K() {
        ((g1) this.C.f83398a).c("android_search_client_cache_delay");
        return this.A;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.equals("autocomplete_profiles_header") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r0.equals("autocomplete_popular_header") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r0.equals("autocomplete_recent_searches_header") == false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // sq0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.getItem(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.pinterest.activity.search.model.SearchTypeaheadItem"
            kotlin.jvm.internal.Intrinsics.g(r4, r0)
            br.d r4 = (br.d) r4
            java.lang.String r0 = r4.f23727y
            if (r0 == 0) goto L59
            int r1 = r0.hashCode()
            switch(r1) {
                case -51815703: goto L4d;
                case 654206954: goto L44;
                case 1469416705: goto L38;
                case 2035935090: goto L2d;
                case 2085703211: goto L24;
                case 2120832896: goto L17;
                default: goto L16;
            }
        L16:
            goto L59
        L17:
            java.lang.String r1 = "autocomplete_trending_articles"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L59
        L20:
            r4 = 115(0x73, float:1.61E-43)
            goto L7e
        L24:
            java.lang.String r1 = "autocomplete_profiles_header"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L59
        L2d:
            java.lang.String r1 = "autocomplete_nux_topic_articles"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            r4 = 113(0x71, float:1.58E-43)
            goto L7e
        L38:
            java.lang.String r1 = "autocomplete_curated_articles"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L59
        L41:
            r4 = 114(0x72, float:1.6E-43)
            goto L7e
        L44:
            java.lang.String r1 = "autocomplete_popular_header"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L59
        L4d:
            java.lang.String r1 = "autocomplete_recent_searches_header"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L59
        L56:
            r4 = 112(0x70, float:1.57E-43)
            goto L7e
        L59:
            br.c r4 = r4.f23707e
            if (r4 != 0) goto L5f
            r4 = -1
            goto L67
        L5f:
            int[] r0 = l71.j.f81953a
            int r4 = r4.ordinal()
            r4 = r0[r4]
        L67:
            r0 = 1
            if (r4 == r0) goto L7c
            r1 = 2
            if (r4 == r1) goto L79
            r2 = 3
            if (r4 == r2) goto L77
            r2 = 4
            if (r4 == r2) goto L75
            r4 = r0
            goto L7e
        L75:
            r4 = r1
            goto L7e
        L77:
            r4 = r2
            goto L7e
        L79:
            r4 = 108(0x6c, float:1.51E-43)
            goto L7e
        L7c:
            r4 = 10
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l71.k.getItemViewType(int):int");
    }

    @Override // l71.f
    public final b0 v(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.B.a(query, this.A, j22.a.TYPEAHEAD);
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (b0) this.D.b(new p71.d(query, this.G)).buildRequest();
    }

    @Override // l71.f
    public final String z() {
        return this.F;
    }
}

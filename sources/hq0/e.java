package hq0;

import c71.b0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import eq0.n;
import ey.a0;
import ey.g1;
import ey.q1;
import h32.f1;
import h32.g0;
import h32.u0;
import h61.h;
import java.util.HashMap;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import m60.w;
import nx.d0;
import q71.d1;

/* loaded from: classes5.dex */
public final class e extends yk1.b implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f69915a;

    /* renamed from: b, reason: collision with root package name */
    public final ip1.b f69916b;

    /* renamed from: c, reason: collision with root package name */
    public final z61.b f69917c;

    /* renamed from: d, reason: collision with root package name */
    public final String f69918d;

    /* renamed from: e, reason: collision with root package name */
    public final n f69919e;

    /* renamed from: f, reason: collision with root package name */
    public final w f69920f;

    /* renamed from: g, reason: collision with root package name */
    public int f69921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69922h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69923i;

    /* renamed from: j, reason: collision with root package name */
    public final uk2.d f69924j;

    /* renamed from: k, reason: collision with root package name */
    public final d f69925k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d presenterPinalytics, ip1.b prefetchManager, z61.b searchPWTManager, String convoId, n nVar, w eventManager) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f69915a = presenterPinalytics;
        this.f69916b = prefetchManager;
        this.f69917c = searchPWTManager;
        this.f69918d = convoId;
        this.f69919e = nVar;
        this.f69920f = eventManager;
        uk2.d dVar = new uk2.d();
        dVar.c("");
        Intrinsics.checkNotNullExpressionValue(dVar, "apply(...)");
        this.f69924j = dVar;
        this.f69925k = new d(this);
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (!isBound() || z.j(query)) {
            return;
        }
        q3(query);
    }

    @Override // q71.d1
    public final void H1() {
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = ((iq0.e) ((eq0.f) getView())).f73396s0;
        if (typeaheadSearchBarContainer != null) {
            typeaheadSearchBarContainer.j("");
        } else {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void P0() {
        d0 d0Var = this.f69915a.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.START_TYPING, (r18 & 2) != 0 ? null : u0.CONVERSATION_SEND_A_PIN_BACK_BUTTON, (r18 & 4) != 0 ? null : g0.SEARCH_BOX, (r18 & 8) != 0 ? null : "", (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void Y(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f69924j.c(query);
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void l() {
    }

    @Override // yk1.b
    public final void onActivate() {
        if (((iq0.e) ((eq0.f) getView())).b8().j() != this.f69921g) {
            this.f69923i = true;
            ((iq0.e) ((eq0.f) getView())).j8(this.f69921g);
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        eq0.f view = (eq0.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f69920f.h(this.f69925k);
        iq0.e eVar = (iq0.e) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.f73399v0 = this;
        Intrinsics.checkNotNullParameter(this, "searchBarListener");
        TypeaheadSearchBarContainer typeaheadSearchBarContainer = eVar.f73396s0;
        if (typeaheadSearchBarContainer != null) {
            typeaheadSearchBarContainer.i(this);
        } else {
            Intrinsics.r("searchBarContainer");
            throw null;
        }
    }

    @Override // yk1.b
    public final void onCreate() {
        this.f69923i = true;
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f69920f.j(this.f69925k);
        super.onUnbind();
    }

    public final void p3(int i13) {
        if (this.f69922h && !this.f69923i) {
            this.f69922h = false;
            return;
        }
        this.f69921g = i13;
        if (isBound()) {
            TypeaheadSearchBarContainer typeaheadSearchBarContainer = ((iq0.e) ((eq0.f) getView())).f73396s0;
            if (typeaheadSearchBarContainer == null) {
                Intrinsics.r("searchBarContainer");
                throw null;
            }
            String f13 = typeaheadSearchBarContainer.f();
            if (!(!z.j(f13)) || this.f69923i) {
                this.f69922h = !this.f69923i;
                this.f69923i = false;
                ((iq0.e) ((eq0.f) getView())).j8(i13);
            } else {
                yk1.n view = getView();
                Intrinsics.g(view, "null cannot be cast to non-null type com.pinterest.feature.conversation.sendapin.view.ConversationSendAPinTabHostFragment");
                if (((iq0.e) view).f91282J) {
                    q3(f13);
                }
            }
        }
    }

    public final void q3(String str) {
        h searchType;
        HashMap o13 = ep.b.o("entered_query", str);
        d0 d0Var = this.f69915a.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_TEXT_INPUT, (r18 & 4) != 0 ? null : g0.MODAL_CONVERSATION_DISCOVERY, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        String obj = StringsKt.i0(str).toString();
        if (this.f69921g == 0) {
            this.f69916b.a();
            searchType = h.PINS;
            this.f69917c.getClass();
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            br.a aVar = br.a.TYPED;
            q1 pwtSearchType = searchType.toPWTSearchType();
            new a0(pwtSearchType, aVar, -1).i();
            Intrinsics.checkNotNullParameter(pwtSearchType, "pwtSearchType");
            new g1(pwtSearchType).i();
        } else {
            searchType = h.MY_PINS;
        }
        h hVar = searchType;
        String[] values = {obj, "typed"};
        Intrinsics.checkNotNullParameter(values, "values");
        NavigationImpl c13 = b0.c(new b0(hVar, obj, null, null, null, null, null, null, null, "typed", null, null, e0.b(c0.M(values, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -66564, 2097151), false, 3);
        c13.Y1("com.pinterest.EXTRA_CONVERSATION_SEND_A_PIN_SEARCH", true);
        c13.y0(this.f69918d, "com.pinterest.EXTRA_CONVO_ID");
        n nVar = this.f69919e;
        if (nVar != null) {
            String str2 = nVar.f59920a;
            if (j1.U0(str2)) {
                c13.y0(str2, "com.pinterest.EXTRA_CONVO_THREAD_ID");
            }
            c13.y0(nVar.f59921b, "com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID");
        }
        ((nl1.d) ((eq0.f) getView())).M1(c13);
    }
}

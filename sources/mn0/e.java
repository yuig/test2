package mn0;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.j;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y;
import df.j1;
import h32.f1;
import h32.v0;
import i92.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.w;
import nx.b0;
import nx.d1;
import uj2.q;
import x02.e0;
import x02.i2;
import x02.x0;
import x02.y0;
import x02.z0;
import yk1.i;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class e extends t implements ln0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.boardsection.a f87762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87763b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87764c;

    /* renamed from: d, reason: collision with root package name */
    public final String f87765d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87766e;

    /* renamed from: f, reason: collision with root package name */
    public final List f87767f;

    /* renamed from: g, reason: collision with root package name */
    public final List f87768g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87769h;

    /* renamed from: i, reason: collision with root package name */
    public final j f87770i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f87771j;

    /* renamed from: k, reason: collision with root package name */
    public final x0 f87772k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f87773l;

    /* renamed from: m, reason: collision with root package name */
    public final w f87774m;

    /* renamed from: n, reason: collision with root package name */
    public final k f87775n;

    /* renamed from: o, reason: collision with root package name */
    public final v f87776o;

    /* renamed from: p, reason: collision with root package name */
    public final j12.b f87777p;

    /* renamed from: q, reason: collision with root package name */
    public final tb0.h f87778q;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f87779r;

    /* renamed from: s, reason: collision with root package name */
    public final d1 f87780s;

    /* renamed from: t, reason: collision with root package name */
    public final kn0.b f87781t;

    /* renamed from: u, reason: collision with root package name */
    public final b0 f87782u;

    /* renamed from: v, reason: collision with root package name */
    public v7 f87783v;

    /* renamed from: w, reason: collision with root package name */
    public final rr.c f87784w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.pinterest.feature.boardsection.a boardSectionActionMode, String boardId, boolean z13, String bulkMoveOriginBoardId, String str, List list, ArrayList arrayList, String str2, j pinAction, z0 boardSectionRepository, x0 boardRepository, i2 pinRepository, w eventManager, k toastUtils, v viewResources, uk1.d presenterPinalytics, q networkStateStream, j12.b boardSectionEventHandler, tb0.h crashReporting, f0 devUtils, d1 trackingParamAttacher, kn0.b bulkActionStatusLongPollingManager, b0 pinAuxHelper) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardSectionActionMode, "boardSectionActionMode");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(bulkMoveOriginBoardId, "bulkMoveOriginBoardId");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(boardSectionEventHandler, "boardSectionEventHandler");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(bulkActionStatusLongPollingManager, "bulkActionStatusLongPollingManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f87762a = boardSectionActionMode;
        this.f87763b = boardId;
        this.f87764c = z13;
        this.f87765d = bulkMoveOriginBoardId;
        this.f87766e = str;
        this.f87767f = list;
        this.f87768g = arrayList;
        this.f87769h = str2;
        this.f87770i = pinAction;
        this.f87771j = boardSectionRepository;
        this.f87772k = boardRepository;
        this.f87773l = pinRepository;
        this.f87774m = eventManager;
        this.f87775n = toastUtils;
        this.f87776o = viewResources;
        this.f87777p = boardSectionEventHandler;
        this.f87778q = crashReporting;
        this.f87779r = devUtils;
        this.f87780s = trackingParamAttacher;
        this.f87781t = bulkActionStatusLongPollingManager;
        this.f87782u = pinAuxHelper;
        this.f87784w = new rr.c(this);
    }

    public static final void p3(e eVar, f30 f30Var, String str) {
        v0 v0Var;
        HashMap o13 = eVar.f87782u.o(f30Var, str);
        if (o13 == null) {
            o13 = new HashMap();
        }
        HashMap hashMap = o13;
        if (b40.X0(f30Var)) {
            hashMap.put(SbaPinRep.AUX_DATA_VIDEO_ID, String.valueOf(b40.i0(f30Var)));
        }
        String b13 = eVar.f87780s.b(f30Var);
        if (b13 == null || b13.length() == 0) {
            v0Var = null;
        } else {
            v0 v0Var2 = new v0();
            v0Var2.G = b13;
            v0Var = v0Var2;
        }
        eVar.getPinalytics().H(f1.PIN_REPIN, f30Var.getUid(), null, hashMap, v0Var, false);
    }

    public final void q3(String boardSectionTitle) {
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        if (isBound()) {
            ((rn0.e) ((ln0.b) getView())).setLoadState(i.LOADING);
        }
        int i13 = a.f87753a[this.f87762a.ordinal()];
        String boardId = this.f87763b;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        z0 z0Var = this.f87771j;
        int i14 = 2;
        if (i13 == 1) {
            if (isBound()) {
                rn0.e eVar = (rn0.e) ((ln0.b) getView());
                ig1.b.O0(eVar.f108839m0, eVar.getView(), eVar.getContext());
            }
            z0Var.getClass();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
            q k13 = z0Var.k(new j12.c(boardId, boardSectionTitle));
            e0 e0Var = new e0(9, new y0(z0Var, z15 ? 1 : 0));
            ck2.c cVar = ck2.i.f27923c;
            jk2.v vVar = new jk2.v(k13, e0Var, cVar, z14 ? 1 : 0);
            Intrinsics.checkNotNullExpressionValue(vVar, "doOnSubscribe(...)");
            vVar.F(new xl0.a(10, new b(this, z13 ? 1 : 0)), new xl0.a(11, new b(this, i14)), cVar, ck2.i.f27924d);
            return;
        }
        int i15 = 0;
        if (i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                List list = this.f87767f;
                if (list == null) {
                    list = q0.f80391a;
                }
                z0Var.a0(boardId, boardSectionTitle, list).E(this.f87784w, new xl0.a(12, new b(this, i15)));
                return;
            }
            return;
        }
        v7 v7Var = (v7) this.f87772k.O(boardId);
        boolean z16 = v7Var != null && v7Var.s1().intValue() == 0;
        rn0.e eVar2 = (rn0.e) ((ln0.b) getView());
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        eVar2.setLoadState(i.LOADED);
        NavigationImpl w13 = Navigation.w1(y.e());
        w13.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
        w13.m0("com.pinterest.EXTRA_BOARD_SECTION_TITLE", boardSectionTitle);
        w13.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION.getValue());
        w13.Y1("com.pinterest.EXTRA_BOARD_SECTION_EMPTY_BOARD", z16);
        eVar2.f7().d(w13);
    }

    @Override // yk1.p
    /* renamed from: r3, reason: merged with bridge method [inline-methods] */
    public final void r3(ln0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((rn0.e) view).f108840n0 = this;
        if (this.f87764c) {
            f0 f0Var = this.f87779r;
            String str = this.f87765d;
            f0Var.N(str, "_bulkMoveOriginBoardId is null", new Object[0]);
            ((rn0.e) ((ln0.b) getView())).setLoadState(i.LOADING);
            if (str != null) {
                xj2.c F = this.f87772k.S(str).F(new xl0.a(13, new b(this, 3)), new xl0.a(14, new b(this, 4)), ck2.i.f27923c, ck2.i.f27924d);
                Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
                addDisposable(F);
            }
        }
    }

    public final void s3(String boardSectionTitle) {
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        int i13 = 0;
        boolean z13 = j1.d1(boardSectionTitle) && com.pinterest.feature.board.create.b.a(boardSectionTitle, 50);
        GestaltButton.SmallPrimaryButton smallPrimaryButton = ((rn0.e) ((ln0.b) getView())).f108833g0;
        if (smallPrimaryButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        smallPrimaryButton.d(new rn0.d(z13, i13));
        if (z13) {
            GestaltTextField gestaltTextField = ((rn0.e) ((ln0.b) getView())).f108832f0;
            if (gestaltTextField != null) {
                gestaltTextField.X(rn0.c.f108825k);
                return;
            } else {
                Intrinsics.r("boardSectionTitleEditText");
                throw null;
            }
        }
        rn0.e eVar = (rn0.e) ((ln0.b) getView());
        String string = eVar.getString(k70.e.invalid_section_name_letter_number_special_char);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltTextField gestaltTextField2 = eVar.f108832f0;
        if (gestaltTextField2 != null) {
            gestaltTextField2.X(new kl0.c(string, 7));
        } else {
            Intrinsics.r("boardSectionTitleEditText");
            throw null;
        }
    }
}

package i11;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c2;
import androidx.fragment.app.w0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.iw;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.feature.pin.create.view.CreateBoardCell;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import com.pinterest.ui.grid.PinterestRecyclerView;
import df.j1;
import h32.d4;
import h32.f1;
import h32.u0;
import i32.y0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import jk2.g0;
import jk2.h0;
import kh2.m2;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.a4;
import lh0.g1;
import lh0.z2;
import lh0.z3;
import m60.f0;
import m60.w;
import nx.d0;
import pk.a0;
import sq0.b0;
import x02.i2;
import x02.x;
import x02.x0;
import x02.y;
import yk1.v;

/* loaded from: classes5.dex */
public abstract class m extends vq0.d implements f11.c, eb2.f, com.pinterest.feature.search.results.view.j, f11.b {
    public final RepinAnimationData A;
    public final boolean B;
    public final String C;
    public final String D;
    public final Boolean E;
    public final boolean F;
    public final gp1.k G;
    public final int H;
    public final v7 I;

    /* renamed from: J, reason: collision with root package name */
    public final v7 f70990J;
    public f30 K;
    public String L;
    public String M;
    public final g11.a N;
    public boolean O;
    public int P;
    public int Q;
    public BoardFeed R;
    public ArrayList S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final HashSet X;
    public boolean Y;
    public kk2.l Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f70991a0;

    /* renamed from: b0, reason: collision with root package name */
    public final HashMap f70992b0;

    /* renamed from: c, reason: collision with root package name */
    public final y f70993c;

    /* renamed from: c0, reason: collision with root package name */
    public BoardFeed f70994c0;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f70995d;

    /* renamed from: d0, reason: collision with root package name */
    public f11.d f70996d0;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f70997e;

    /* renamed from: e0, reason: collision with root package name */
    public final uk2.f f70998e0;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f70999f;

    /* renamed from: f0, reason: collision with root package name */
    public my1.a f71000f0;

    /* renamed from: g, reason: collision with root package name */
    public final w f71001g;

    /* renamed from: g0, reason: collision with root package name */
    public k11.p f71002g0;

    /* renamed from: h, reason: collision with root package name */
    public final v f71003h;

    /* renamed from: h0, reason: collision with root package name */
    public c2 f71004h0;

    /* renamed from: i, reason: collision with root package name */
    public final z2 f71005i;

    /* renamed from: i0, reason: collision with root package name */
    public final i f71006i0;

    /* renamed from: j, reason: collision with root package name */
    public final i92.k f71007j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f71008j0;

    /* renamed from: k, reason: collision with root package name */
    public final rg0.s f71009k;

    /* renamed from: k0, reason: collision with root package name */
    public final h f71010k0;

    /* renamed from: l, reason: collision with root package name */
    public final zf0.f f71011l;

    /* renamed from: m, reason: collision with root package name */
    public final com.pinterest.feature.pin.r f71012m;

    /* renamed from: n, reason: collision with root package name */
    public final String f71013n;

    /* renamed from: o, reason: collision with root package name */
    public final String f71014o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f71015p;

    /* renamed from: q, reason: collision with root package name */
    public final d4 f71016q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f71017r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f71018s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f71019t;

    /* renamed from: u, reason: collision with root package name */
    public final String f71020u;

    /* renamed from: v, reason: collision with root package name */
    public final String f71021v;

    /* renamed from: w, reason: collision with root package name */
    public final String f71022w;

    /* renamed from: x, reason: collision with root package name */
    public final String f71023x;

    /* renamed from: y, reason: collision with root package name */
    public final String f71024y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f71025z;

    public /* synthetic */ m(y yVar, i2 i2Var, x0 x0Var, b60.b bVar, uk1.d dVar, uj2.q qVar, w wVar, v vVar, z2 z2Var, i92.k kVar, rg0.s sVar, zf0.f fVar, f21.e eVar, com.pinterest.feature.pin.r rVar, String str, d4 d4Var, Boolean bool, String str2, boolean z13, String str3, boolean z14, boolean z15, int i13) {
        this(yVar, i2Var, x0Var, bVar, dVar, qVar, wVar, vVar, z2Var, kVar, sVar, fVar, eVar, rVar, str, null, false, false, d4Var, bool, str2, z13, false, false, null, null, null, str3, null, false, null, null, z14, null, null, null, (i13 & 32) != 0 ? true : z15, gp1.k.UNKNOWN);
    }

    public static final void D3(m mVar) {
        wy0 f13;
        boolean Z3 = mVar.Z3();
        HashSet hashSet = mVar.X;
        if (Z3) {
            hashSet.add(mVar.I);
        }
        if (!mVar.B || (f13 = ((b60.d) mVar.f70999f).f()) == null) {
            return;
        }
        Integer x23 = f13.x2();
        Intrinsics.checkNotNullExpressionValue(x23, "getCollageDraftCount(...)");
        if (x23.intValue() > 0) {
            z2 z2Var = mVar.f71005i;
            z2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) z2Var.f83520a;
            if (g1Var.o("android_curation_snc_bp_remove_collage_entrypoint", "enabled", z3Var) || g1Var.l("android_curation_snc_bp_remove_collage_entrypoint")) {
                return;
            }
            hashSet.add(mVar.f70990J);
        }
    }

    public static ArrayList F3(BoardFeed boardFeed) {
        List<v7> q13 = boardFeed.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
        ArrayList arrayList = new ArrayList();
        for (v7 v7Var : q13) {
            Intrinsics.f(v7Var);
            if (!kh2.d.A0(v7Var) && !v7Var.f1().booleanValue()) {
                arrayList.add(v7Var);
            }
        }
        return arrayList;
    }

    public static void J3(ArrayList arrayList, v7 v7Var, String other) {
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            String j13 = ((v7) it.next()).j1();
            Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
            Intrinsics.checkNotNullParameter(j13, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            if (j13.compareToIgnoreCase(other) > 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            arrayList.add(i13, v7Var);
        } else {
            arrayList.add(v7Var);
        }
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void E0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
    }

    public final v7 G3(String str) {
        for (dl1.s sVar : d()) {
            if (sVar.getUid() != null && str != null && Intrinsics.d(str, sVar.getUid())) {
                return (v7) sVar;
            }
        }
        return null;
    }

    public String H3(int i13) {
        boolean z13 = this.f70991a0 && this.f71017r;
        ArrayList suggestedBoards = this.S;
        HashSet customSaveBoards = this.X;
        HashMap headersMap = this.f70992b0;
        Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
        Intrinsics.checkNotNullParameter(customSaveBoards, "customSaveBoards");
        Intrinsics.checkNotNullParameter(headersMap, "headersMap");
        v viewResources = this.f71003h;
        Intrinsics.checkNotNullParameter(viewResources, "resources");
        if (z13) {
            if (i13 == 0) {
                headersMap.put(Integer.valueOf(i13), ((yk1.a) viewResources).f139224a.getString(e02.e.pinned_no_translate));
            } else if (i13 == 1) {
                headersMap.put(Integer.valueOf(i13), ((yk1.a) viewResources).f139224a.getString(e02.e.choose_different_board_no_translate));
            }
            Intrinsics.checkNotNullParameter(viewResources, "viewResources");
            if (i13 == 0) {
                return ((yk1.a) viewResources).f139224a.getString(m60.x0.pinned);
            }
            if (i13 != 1) {
                return null;
            }
            return ((yk1.a) viewResources).f139224a.getString(m60.x0.choose_different_board);
        }
        if (!(!suggestedBoards.isEmpty())) {
            if (!(!customSaveBoards.isEmpty()) || i13 != customSaveBoards.size()) {
                return null;
            }
            yk1.a aVar = (yk1.a) viewResources;
            headersMap.put(Integer.valueOf(i13), aVar.f139224a.getString(e02.e.save_to_board_no_translate));
            return aVar.f139224a.getString(f02.g.save_to_board);
        }
        if (i13 == customSaveBoards.size() && i13 < suggestedBoards.size()) {
            yk1.a aVar2 = (yk1.a) viewResources;
            headersMap.put(Integer.valueOf(i13), aVar2.f139224a.getString(e02.e.create_board_top_choices_no_translate));
            return aVar2.f139224a.getString(m60.x0.create_board_top_choices);
        }
        if (i13 != suggestedBoards.size()) {
            return null;
        }
        yk1.a aVar3 = (yk1.a) viewResources;
        headersMap.put(Integer.valueOf(i13), aVar3.f139224a.getString(e02.e.create_board_all_no_translate));
        return aVar3.f139224a.getString(m60.x0.create_board_all);
    }

    public final String I3() {
        List list;
        f30 f30Var = this.K;
        if (f30Var == null) {
            return null;
        }
        cc J3 = f30Var.J3();
        if (J3 != null) {
            cc J32 = f30Var.J3();
            List d2 = J32 != null ? J32.d() : null;
            Integer e13 = J3.e();
            Intrinsics.checkNotNullExpressionValue(e13, "getIndex(...)");
            int intValue = e13.intValue();
            if (d2 != null && (!d2.isEmpty()) && (list = d2) != null && intValue >= 0 && intValue < list.size()) {
                Object obj = d2.get(intValue);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                sr e14 = dl2.b.e1((l30) obj);
                if (e14 != null) {
                    return e14.j();
                }
            }
        }
        return ve.h.r(f30Var);
    }

    public final void K3() {
        String str;
        if (!this.T || (this instanceof r)) {
            wy0 f13 = ((b60.d) this.f70999f).f();
            if (f13 == null || (str = f13.getUid()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                ((l11.j) ((f11.d) getView())).g0(m60.x0.generic_error);
                f11.d dVar = (f11.d) getView();
                ((yk1.a) this.f71003h).f139224a.getString(m60.x0.generic_error);
                ((l11.j) dVar).X8();
                return;
            }
            uj2.q d2 = m22.a.d(this.f70993c, str, this.V);
            g gVar = new g(this, 1);
            d2.d(gVar);
            Intrinsics.checkNotNullExpressionValue(gVar, "subscribeWith(...)");
            addDisposable(gVar);
        }
    }

    public final void L3() {
        int i13;
        String str;
        f11.d dVar;
        String str2;
        if (!this.U || (this instanceof r) || (dVar = this.f70996d0) == null || (str2 = ((l11.j) dVar).H1) == null || str2.length() != 0) {
            boolean X3 = X3();
            uj2.q qVar = h0.f76488a;
            int i14 = 3;
            y yVar = this.f70993c;
            if (!X3) {
                String str3 = this.M;
                if (str3 == null || str3.length() <= 0) {
                    this.U = true;
                    if (this.T) {
                        ((l11.j) ((f11.d) getView())).W8();
                        return;
                    }
                    return;
                }
                ((l11.j) ((f11.d) getView())).getClass();
                new gy.g(3).i();
                String pinId = this.M;
                if (pinId != null) {
                    uk2.f fVar = m22.a.f85712a;
                    Intrinsics.checkNotNullParameter(yVar, "<this>");
                    Intrinsics.checkNotNullParameter(pinId, "pinId");
                    if (pinId.length() != 0) {
                        x02.w wVar = new x02.w(3, pinId);
                        wVar.f55252b = 100000L;
                        qVar = yVar.e(wVar);
                    }
                    ek0.c cVar = new ek0.c(2, this, pinId);
                    qVar.d(cVar);
                    Intrinsics.checkNotNullExpressionValue(cVar, "subscribeWith(...)");
                    addDisposable(cVar);
                    return;
                }
                return;
            }
            BoardFeed boardFeed = new BoardFeed();
            int i15 = 0;
            int i16 = 0;
            while (true) {
                i13 = 4;
                if (i16 >= 4) {
                    break;
                }
                u7 x03 = v7.x0();
                Intrinsics.checkNotNullExpressionValue(x03, "builder(...)");
                x03.P("SuggestedBoardPlaceholder" + i16);
                v7 a13 = x03.a();
                List list = boardFeed.f35557i;
                if (!boardFeed.v()) {
                    boardFeed.B();
                }
                list.add(a13);
                boardFeed.H(list);
                i16++;
            }
            ArrayList F3 = F3(boardFeed);
            this.S = F3;
            w3(F3);
            if (isBound()) {
                ((l11.j) ((f11.d) getView())).E8(0, false);
            }
            ((l11.j) ((f11.d) getView())).getClass();
            new gy.g(3).i();
            String str4 = this.M;
            if (str4 != null && str4.length() > 0) {
                String pinId2 = this.M;
                if (pinId2 != null) {
                    uk2.f fVar2 = m22.a.f85712a;
                    Intrinsics.checkNotNullParameter(yVar, "<this>");
                    Intrinsics.checkNotNullParameter(pinId2, "pinId");
                    if (pinId2.length() == 0) {
                        Intrinsics.checkNotNullExpressionValue(qVar, "empty(...)");
                    } else {
                        x02.w wVar2 = new x02.w(pinId2);
                        wVar2.f55252b = 100000L;
                        wVar2.f131514k = false;
                        qVar = yVar.e(wVar2);
                    }
                    uj2.q t13 = qVar.t(new wv0.a(22, new d(this, i14)));
                    g gVar = new g(this, i15);
                    t13.d(gVar);
                    Intrinsics.checkNotNullExpressionValue(gVar, "subscribeWith(...)");
                    addDisposable(gVar);
                    return;
                }
                return;
            }
            if (this.f71022w != null) {
                uk2.f fVar3 = m22.a.f85712a;
                Intrinsics.checkNotNullParameter(yVar, "<this>");
                x02.w wVar3 = new x02.w(4, "", null, x.ALL_BOARDS_FILTER, false, this.f71022w, false);
                wVar3.f55252b = 100000L;
                uj2.q t14 = yVar.e(wVar3).t(new wv0.a(21, new d(this, i13)));
                g gVar2 = new g(this, i15);
                t14.d(gVar2);
                Intrinsics.checkNotNullExpressionValue(gVar2, "subscribeWith(...)");
                addDisposable(gVar2);
                return;
            }
            wy0 f13 = ((b60.d) this.f70999f).f();
            if (f13 == null || (str = f13.getUid()) == null) {
                str = "";
            }
            uj2.q e13 = m22.a.e(yVar, str, this.W);
            g gVar3 = new g(this, i15);
            e13.d(gVar3);
            Intrinsics.checkNotNullExpressionValue(gVar3, "subscribeWith(...)");
            addDisposable(gVar3);
        }
    }

    public void M3(String str, String boardName, String str2) {
        ba j63;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        f30 f30Var = this.K;
        String uid = (f30Var == null || (j63 = f30Var.j6()) == null) ? null : j63.getUid();
        String str3 = this.f71013n;
        if (str3 == null) {
            return;
        }
        List b13 = e0.b(str3);
        c0.d.n(this.f70995d, b13, this.f71020u, str, null, this.f71018s).j(new j(this, uid, str, boardName, str2, b13));
    }

    public final void N3() {
        kk2.l lVar = this.Z;
        if (lVar != null) {
            lVar.dispose();
        }
        this.Z = null;
        g0 s13 = this.f70997e.y().s();
        Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
        xj2.c o13 = s13.o(new a11.f(29, new d(this, 5)), new c(0, new d(this, 6)));
        addDisposable(o13);
        this.Z = (kk2.l) o13;
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void P0() {
    }

    @Override // vq0.g
    /* renamed from: Q3, reason: merged with bridge method [inline-methods] */
    public void r3(f11.d view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        String str2 = this.f71013n;
        int i13 = 1;
        if ((str2 == null || z.j(str2)) && (str = this.L) != null && str.length() > 0) {
            this.M = this.L;
            this.W = true;
            this.V = true;
        }
        if (!this.V && !this.W) {
            this.f70993c.a();
        }
        this.f70996d0 = view;
        l11.j listener = (l11.j) view;
        listener.setLoadState(yk1.i.LOADING);
        K3();
        L3();
        HeaderCell headerCell = listener.A1;
        if (headerCell == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        headerCell.f47076d = listener;
        List list = listener.f81423b1;
        if (list != null && ((list.size() > 1 || listener.E1 != null) && !listener.f81444w1)) {
            listener.c8(new kx0.b(listener, list, i13));
            listener.f81444w1 = true;
        }
        Resources resources = listener.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int dimensionPixelSize = resources.getDimensionPixelSize(f02.a.board_picker_padding);
        listener.a8(new com.pinterest.feature.home.view.f(dimensionPixelSize, dimensionPixelSize, 0, 3));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, listener.f81422a1);
        layoutParams.gravity = 81;
        Context requireContext = listener.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        CreateBoardCell createBoardCell = new CreateBoardCell(requireContext);
        createBoardCell.setId(f02.c.create_board_cell_id);
        createBoardCell.setLayoutParams(layoutParams);
        createBoardCell.a().i(l11.d.f81400l);
        listener.X0 = createBoardCell;
        FrameLayout frameLayout = listener.R0;
        if (frameLayout != null) {
            frameLayout.addView(createBoardCell);
        } else {
            FrameLayout frameLayout2 = listener.U0;
            if (frameLayout2 == null) {
                Intrinsics.r("rootContainer");
                throw null;
            }
            frameLayout2.addView(createBoardCell);
        }
        int i14 = 2;
        kx0.b creator = new kx0.b(listener, layoutParams, i14);
        Intrinsics.checkNotNullParameter(creator, "creator");
        PinterestRecyclerView pinterestRecyclerView = listener.f139736j0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.c(creator);
        }
        Context requireContext2 = listener.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        if (!a0.q0(requireContext2)) {
            View view2 = new View(listener.requireContext());
            listener.f81448z1 = view2;
            Resources resources2 = listener.getResources();
            int i15 = f02.b.board_picker_bottom_drop_shadow;
            ThreadLocal threadLocal = e5.n.f57243a;
            view2.setBackground(resources2.getDrawable(i15, null));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, listener.f81447z0, listener.getResources().getDisplayMetrics()));
            layoutParams2.gravity = 80;
            layoutParams2.bottomMargin = listener.f81422a1;
            View view3 = listener.f81448z1;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams2);
            }
            FrameLayout frameLayout3 = listener.R0;
            if (frameLayout3 != null) {
                frameLayout3.addView(listener.f81448z1);
            } else {
                FrameLayout frameLayout4 = listener.U0;
                if (frameLayout4 == null) {
                    Intrinsics.r("rootContainer");
                    throw null;
                }
                frameLayout4.addView(listener.f81448z1);
            }
        }
        f1 eventType = f1.VIEW;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Navigation navigation = listener.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        String str3 = v03;
        HashMap hashMap = new HashMap();
        String str4 = listener.T0;
        if (str4 != null) {
            hashMap.put("save_session_id", str4);
        }
        String str5 = listener.O1;
        if (str5 != null) {
            hashMap.put("board_picker_surface_origin", str5);
        }
        String str6 = listener.P1;
        if (str6 != null) {
            hashMap.put("user_action", str6);
        }
        listener.s7().h0(eventType, u0.BOARD_ACTION_CREATE_BUTTON, h32.g0.MODAL_ADD_PIN, str3, hashMap, null, null, false);
        if (listener.N0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        xk2.v vVar = zf0.f.f141903e;
        y0 y0Var = y0.ANDROID_REPIN_DIALOG_TAKEOVER;
        if (j1.D0(y0Var, i32.l.ANDROID_QUICKSAVE_BOARD_CREATE_EDU)) {
            Context requireContext3 = listener.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            mf.i iVar = new mf.i(requireContext3);
            listener.Y0 = iVar;
            FrameLayout frameLayout5 = listener.U0;
            if (frameLayout5 == null) {
                Intrinsics.r("rootContainer");
                throw null;
            }
            frameLayout5.addView(iVar);
            rg0.s sVar = listener.O0;
            if (sVar == null) {
                Intrinsics.r("experiences");
                throw null;
            }
            rg0.n b13 = ((dh0.d) sVar).b(y0Var);
            if (b13 != null) {
                b13.g();
            }
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        f0 f0Var = listener.B0;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.M(listener.X0, "CreateBoardCell must be initialized before setListener is called", tb0.p.REPIN, new Object[0]);
        CreateBoardCell createBoardCell2 = listener.X0;
        if (createBoardCell2 != null) {
            createBoardCell2.f47070b = this;
        }
        listener.f81442u1 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        listener.Z0 = this;
        if (str2 != null && !z.j(str2)) {
            i2 i2Var = this.f70995d;
            xj2.c F = new jk2.i2(new jk2.x(i2Var.M(str2).j(), new d51.a(4, a.f70956k), i14), i2Var.R(str2), 0).F(new a11.f(23, new d(this, i13)), new a11.f(24, new d(this, i14)), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
        listener.f81443v1 = this;
        w wVar = this.f71001g;
        wVar.h(this.f71006i0);
        h32.g0 f123811z0 = listener.getF123811z0();
        g11.a aVar = this.N;
        aVar.f63367k = f123811z0;
        if (str2 != null) {
            aVar.f122380b = str2;
        }
        String str7 = this.f71014o;
        if (str7 != null) {
            aVar.f122383e = str7;
        }
        if (this.Y) {
            N3();
        }
        this.f71008j0 = false;
        if (isBound()) {
            yk1.n view4 = getView();
            b0 b0Var = view4 instanceof b0 ? (b0) view4 : null;
            if (b0Var != null) {
                b0Var.addItemVisibilityChangeListener(new w01.s(this, i14));
            }
        }
        wVar.h(this.f71010k0);
        z2 z2Var = this.f71005i;
        z2Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) z2Var.f83520a;
        if (g1Var.o("android_curation_brv_reorder_profile_cell_in_board_picker", "enabled", z3Var)) {
            return;
        }
        g1Var.l("android_curation_brv_reorder_profile_cell_in_board_picker");
    }

    public final void R3(String boardUid, String boardName) {
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        S3(boardUid, boardName, false, 0, null, null);
    }

    public final void S3(String boardUid, String boardName, boolean z13, int i13, String str, Integer num) {
        String str2;
        m mVar;
        v7 G5;
        NavigationImpl L;
        String z43;
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        HashMap f63135d0 = this.N.getF63135d0();
        String str3 = this.f71023x;
        if (str3 == null) {
            str3 = "";
        }
        f63135d0.put("save_session_id", str3);
        BoardFeed boardFeed = this.R;
        if (boardFeed != null) {
            f63135d0.put("board_title_suggestions", g11.a.l(boardFeed));
        }
        bp1.h.w(f63135d0, this.S);
        String str4 = this.f71013n;
        if (str4 != null) {
            f63135d0.put("pin_id", str4);
        }
        if (boardUid != null) {
            f63135d0.put("board_id", boardUid);
        }
        if (num != null) {
            f63135d0.put("board_index", num.toString());
        }
        if (num == null) {
            str2 = "BOARD_PICKER_PROFILE_BOARD";
        } else {
            HashMap hashMap = this.f70992b0;
            Iterator it = hashMap.keySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue > i14 && intValue <= num.intValue()) {
                    i14 = intValue;
                }
            }
            if (i14 != 0) {
                String str5 = (String) hashMap.get(Integer.valueOf(i14));
                int i15 = e02.e.create_board_top_choices_no_translate;
                yk1.a aVar = (yk1.a) this.f71003h;
                if (Intrinsics.d(str5, aVar.f139224a.getString(i15))) {
                    str2 = "BOARD_PICKER_TOP_CHOICES";
                } else {
                    int i16 = e02.e.create_board_all_no_translate;
                    Resources resources = aVar.f139224a;
                    if (Intrinsics.d(str5, resources.getString(i16))) {
                        str2 = "BOARD_PICKER_ALL_BOARDS";
                    } else if (Intrinsics.d(str5, resources.getString(e02.e.tap_to_create_a_new_board_top_header))) {
                        str2 = "BOARD_PICKER_BOARD_TITLE_SUGGESTION";
                    }
                }
            }
            str2 = null;
        }
        if (str2 != null) {
            f63135d0.put("board_component", str2);
        }
        f30 f30Var = this.K;
        if (f30Var != null && (z43 = f30Var.z4()) != null) {
            f63135d0.put("image_signature", z43);
        }
        getPinalytics().f0(u0.BOARD_NAME, null, boardUid, f63135d0, false);
        boolean z14 = this.f71015p;
        boolean z15 = this.f71017r;
        if (!z13) {
            if (z15) {
                mVar = this;
                f30 f30Var2 = mVar.K;
                if (Intrinsics.d(boardUid, (f30Var2 == null || (G5 = f30Var2.G5()) == null) ? null : G5.getUid())) {
                    ((l11.j) ((f11.d) getView())).dismiss();
                    mVar.a4(boardUid, boardName, str);
                } else {
                    mVar.M3(boardUid, boardName, str);
                }
            } else {
                mVar = this;
                String repinPreviewImageUrl = getRepinPreviewImageUrl() != null ? getRepinPreviewImageUrl() : str;
                if (!z14) {
                    Intrinsics.checkNotNullParameter(boardName, "boardName");
                    String q13 = b40.q(mVar.K);
                    ArrayList suggestedBoards = mVar.S;
                    Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
                    if (boardName != null) {
                        mVar.U3(new h11.d(boardUid, boardName, repinPreviewImageUrl, q13, false, false, i13, null, suggestedBoards));
                        return;
                    } else {
                        Intrinsics.r("boardName");
                        throw null;
                    }
                }
                if (isBound()) {
                    l11.j jVar = (l11.j) ((f11.d) getView());
                    ig1.b.O0(jVar.J1, jVar.getView(), jVar.requireContext());
                }
                uj2.q.M(800L, TimeUnit.MILLISECONDS, tk2.e.f118016b).H(tk2.e.f118017c).A(wj2.c.a()).F(new a11.f(27, new ja.a(this, boardUid, boardName, repinPreviewImageUrl, i13)), new a11.f(28, a.f70957l), ck2.i.f27923c, ck2.i.f27924d);
            }
            return;
        }
        if (isBound()) {
            if (!z15 || this.f71020u == null) {
                l11.j jVar2 = (l11.j) ((f11.d) getView());
                ig1.b.K0(jVar2.J1, jVar2.getView(), true, jVar2.requireContext());
            }
            if (this.O) {
                this.f71001g.d(new m92.b());
            }
            l11.j jVar3 = (l11.j) ((f11.d) getView());
            jVar3.getClass();
            Intrinsics.checkNotNullParameter(boardUid, "boardUid");
            String str6 = jVar3.T0;
            boolean z16 = jVar3.f81439r1;
            boolean z17 = jVar3.f81430i1;
            boolean z18 = jVar3.M1;
            RepinAnimationData repinAnimationData = jVar3.N1;
            String str7 = jVar3.f81433l1;
            String str8 = jVar3.f81434m1;
            Intrinsics.checkNotNullParameter(boardUid, "boardUid");
            if (z16) {
                L = Navigation.L(m3.f(), boardUid, ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue());
                L.m0("com.pinterest.EXTRA_SOURCE", hk0.m.PROFILE.toString());
            } else {
                L = Navigation.L(m3.h(), boardUid, ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue());
            }
            L.m0("com.pinterest.EXTRA_BOARD_ID", boardUid);
            com.pinterest.feature.boardsection.a aVar2 = com.pinterest.feature.boardsection.a.REPIN;
            L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", aVar2.getValue());
            L.Y1("com.pinterest.EXTRA_LOAD_ALL_BOARDS", false);
            L.Y1("com.pinterest.EXTRA_SHOW_PARENT_BOARD", true);
            L.z(i13, "com.pinterest.EXTRA_BOARD_LIST_POSITION");
            L.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", z14);
            L.Y1("com.pinterest.EXTRA_IS_STORY_PIN", z17);
            L.m0("com.pinterest.EXTRA_PIN_ID", str4);
            L.m0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID", str7);
            L.m0("com.pinterest.EXTRA_SHUFFLE_ID", str8);
            L.Y1("com.pinterest.EXTRA_IS_ELIGIBLE_FOR_REPIN_ANIMATION", z18);
            L.w0(repinAnimationData, "com.pinterest.EXTRA_REPIN_ANIMATION_DATA");
            if (str6 != null) {
                L.m0("com.pinterest.EXTRA_SESSION_ID", str6);
            }
            Intrinsics.checkNotNullExpressionValue(L, "apply(...)");
            if (jVar3.f81439r1 && jVar3.S0) {
                L.m0("com.pinterest.EXTRA_SOURCE", hk0.m.STRUCTURED_FEED.toString());
            }
            L.m0("com.pinterest.EXTRA_BOARD_ID", boardUid);
            L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", aVar2.getValue());
            L.Y1("com.pinterest.EXTRA_IS_STORY_PIN", jVar3.f81430i1);
            L.Y1("com.pinterest.EXTRA_PIN_FROM_SCHEDULED_PINS_PAGE", jVar3.f81425d1);
            String str9 = jVar3.L1;
            if (str9 != null) {
                L.m0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE", str9);
            }
            if (jVar3.f81439r1) {
                L.Y1("com.pinterest.EXTRA_FROM_AUTO_SAVE", true);
                L.m0("com.pinterest.EXTRA_AUTO_SAVE_ORIGIN_PIN_ID", jVar3.f81438q1);
                L.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", new ArrayList(kotlin.collections.g1.b(str4)));
            }
            BottomSheetBehavior bottomSheetBehavior = jVar3.f81445x1;
            if (bottomSheetBehavior == null) {
                Intrinsics.r("bottomSheetBehavior");
                throw null;
            }
            L.z(bottomSheetBehavior.L, "com.pinterest.EXTRA_SECTION_PICKER_BOTTOM_SHEET_STATE");
            BottomSheetBehavior bottomSheetBehavior2 = jVar3.f81445x1;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.r("bottomSheetBehavior");
                throw null;
            }
            L.z(bottomSheetBehavior2.f32301f ? -1 : bottomSheetBehavior2.f32299e, "com.pinterest.EXTRA_SECTION_PICKER_BOTTOM_SHEET_PEEK_HEIGHT");
            boolean z19 = str4 != null && str4.length() > 0;
            List list = jVar3.f81423b1;
            boolean z23 = list != null && list.size() > 1;
            if (z19 && z23) {
                L.m0("com.pinterest.EXTRA_PIN_ID", str4);
                L.m0("com.pinterest.EXTRA_META", jVar3.f81429h1);
                List list2 = jVar3.f81423b1;
                if (list2 != null) {
                    L.a(new ArrayList(list2));
                }
            } else if (z19) {
                L.m0("com.pinterest.EXTRA_PIN_ID", str4);
            } else {
                L.m0("com.pinterest.EXTRA_META", jVar3.f81429h1);
                List list3 = jVar3.f81423b1;
                if (list3 != null) {
                    L.a(new ArrayList(list3));
                }
            }
            String str10 = jVar3.f81426e1;
            if (str10 != null) {
                L.m0("com.pinterest.EXTRA_PIN_INTEREST_TAGS", str10);
            }
            String str11 = jVar3.f81427f1;
            if (str11 != null) {
                L.m0("com.pinterest.EXTRA_USER_MENTION_TAGS", str11);
            }
            Date date = jVar3.f81424c1;
            if (date != null) {
                L.y0(date, "com.pinterest.EXTRA_PIN_SELECTED_DATE_TIME");
            }
            String str12 = jVar3.T0;
            if (str12 != null) {
                L.m0("com.pinterest.EXTRA_SESSION_ID", str12);
            }
            if (jVar3.V8()) {
                L.m0("com.pinterest.EXTRA_BOARD_PICKER_TYPE", "com.pinterest.EXTRA_BOARD_PICKER_TYPE_SIMPLE");
            }
            if (jVar3.U6()) {
                jVar3.M1(L);
            } else {
                wk2.a aVar3 = jVar3.M0;
                if (aVar3 == null) {
                    Intrinsics.r("repinBoardSectionPickerFragmentProvider");
                    throw null;
                }
                ho0.m mVar2 = (ho0.m) aVar3.get();
                mVar2.R7(L);
                ViewParent parent = jVar3.requireView().getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                int id3 = ((ViewGroup) parent).getId();
                w0 supportFragmentManager = jVar3.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                mo1.c.b(supportFragmentManager, id3, mVar2, true, mo1.a.MODAL, "");
            }
        }
    }

    public void T3() {
        f30 f30Var = this.K;
        if (f30Var == null) {
            return;
        }
        if (isBound()) {
            l11.j jVar = (l11.j) ((f11.d) getView());
            ig1.b.O0(jVar.J1, jVar.getView(), jVar.requireContext());
        }
        this.N.o(f1.TAP, this.f71013n, this.S, this.R, this.f71023x, f30Var.z4());
        k11.p pVar = this.f71002g0;
        if (pVar == null) {
            Intrinsics.r("repinUtils");
            throw null;
        }
        k11.p.b(pVar, f30Var, this.f71015p, this.f71024y, this.f71025z, null, this.C, this.G, 16);
        int i13 = 22;
        uj2.q.M(800L, TimeUnit.MILLISECONDS, tk2.e.f118016b).H(tk2.e.f118017c).A(wj2.c.a()).F(new a11.f(21, new ky0.b(i13, this, f30Var)), new a11.f(i13, a.f70958m), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // f11.c
    public void U0() {
        f11.d dVar = (f11.d) getViewIfBound();
        if (dVar != null) {
            ArrayList arrayList = this.S;
            BoardFeed boardFeed = this.R;
            f30 f30Var = this.K;
            String z43 = f30Var != null ? f30Var.z4() : null;
            g11.a aVar = this.N;
            String str = this.f71013n;
            aVar.m(str, arrayList, boardFeed, z43);
            l11.j jVar = (l11.j) dVar;
            ig1.b.K0(jVar.J1, jVar.getView(), false, jVar.requireContext());
            this.Y = true;
            N3();
            NavigationImpl j03 = m2.j0(str, jVar.T0, ou1.b.BOARD_PICKER.getValue(), this.f71015p, jVar.V8());
            if (jVar.U6()) {
                jVar.M1(j03);
                return;
            }
            il1.a aVar2 = jVar.L0;
            if (aVar2 == null) {
                Intrinsics.r("fragmentFactory");
                throw null;
            }
            nl1.d dVar2 = (nl1.d) aVar2.e(m3.a());
            dVar2.R7(j03);
            Bundle arguments = jVar.getArguments();
            if (arguments != null) {
                dVar2.setArguments(arguments);
            }
            ViewParent parent = jVar.requireView().getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int id3 = ((ViewGroup) parent).getId();
            w0 parentFragmentManager = jVar.getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(parentFragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar3, "beginTransaction(...)");
            mo1.c.a(aVar3, mo1.a.MODAL);
            aVar3.g(id3, dVar2, null, 1);
            aVar3.c(null);
            aVar3.e(false);
            dVar2.Q7(true);
        }
    }

    public abstract void U3(h11.d dVar);

    public final void V3(String str) {
        this.L = str;
    }

    public final void W3(boolean z13) {
        this.f70991a0 = z13;
    }

    public boolean X3() {
        wy0 f13 = ((b60.d) this.f70999f).f();
        if (f13 != null) {
            int intValue = f13.t2().intValue();
            Integer p43 = f13.p4();
            Intrinsics.checkNotNullExpressionValue(p43, "getSecretBoardCount(...)");
            int intValue2 = p43.intValue() + intValue;
            z3 z3Var = z3.ACTIVATE_EXPERIMENT;
            z2 z2Var = this.f71005i;
            if (intValue2 > (z2Var.b("enabled_5_boards", z3Var) ? 5 : z2Var.b("enabled_7_boards", z3Var) ? 7 : z2Var.b("enabled_10_boards", z3Var) ? 10 : z2Var.b("enabled_12_boards", z3Var) ? 12 : this.H)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void Y(String query) {
        f11.d dVar;
        Intrinsics.checkNotNullParameter(query, "query");
        if ((this instanceof r) && (dVar = this.f70996d0) != null) {
            l11.j jVar = (l11.j) dVar;
            if (query == null || query.length() <= 0) {
                String string = jVar.getResources().getString(e02.e.board_create_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                CreateBoardCell createBoardCell = jVar.X0;
                if (createBoardCell != null) {
                    createBoardCell.a().i(new zu0.c(string, 19));
                }
            } else {
                String string2 = jVar.getResources().getString(e02.e.board_create_search_title);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String Y = j1.Y(string2, new Object[]{query}, null, 6);
                CreateBoardCell createBoardCell2 = jVar.X0;
                if (createBoardCell2 != null) {
                    createBoardCell2.a().i(new zu0.c(Y, 18));
                }
            }
            if (query != null) {
                Intrinsics.checkNotNullParameter(query, "<set-?>");
                jVar.H1 = query;
            }
            if (jVar.H1.length() == 0) {
                v3();
                K3();
                L3();
                f11.d dVar2 = this.f70996d0;
                if (dVar2 != null) {
                    l11.j jVar2 = (l11.j) dVar2;
                    PinterestRecyclerView pinterestRecyclerView = jVar2.B1;
                    if (pinterestRecyclerView == null) {
                        Intrinsics.r("recylerView");
                        throw null;
                    }
                    FrameLayout frameLayout = jVar2.D1;
                    if (frameLayout == null) {
                        Intrinsics.r("emptyStateTextViewBackground");
                        throw null;
                    }
                    frameLayout.setVisibility(0);
                    pinterestRecyclerView.setVisibility(0);
                }
                f11.d dVar3 = this.f70996d0;
                if (dVar3 != null) {
                    GestaltSearchField gestaltSearchField = ((l11.j) dVar3).F1;
                    if (gestaltSearchField != null) {
                        c0.d.j(gestaltSearchField, l11.d.f81402n);
                        return;
                    } else {
                        Intrinsics.r("searchBarView");
                        throw null;
                    }
                }
                return;
            }
            v3();
            BoardFeed boardFeed = this.f70994c0;
            String str = ((l11.j) ((f11.d) getView())).H1;
            List<v7> q13 = boardFeed.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
            ArrayList arrayList = new ArrayList();
            for (v7 v7Var : q13) {
                Intrinsics.f(v7Var);
                if (!kh2.d.A0(v7Var) && !v7Var.f1().booleanValue()) {
                    arrayList.add(v7Var);
                }
            }
            Object collect = arrayList.stream().filter(new iw(5, new zu0.c(str, 17))).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(collect, "collect(...)");
            List list = (List) collect;
            if (!list.isEmpty()) {
                PinterestRecyclerView pinterestRecyclerView2 = jVar.B1;
                if (pinterestRecyclerView2 == null) {
                    Intrinsics.r("recylerView");
                    throw null;
                }
                FrameLayout frameLayout2 = jVar.D1;
                if (frameLayout2 == null) {
                    Intrinsics.r("emptyStateTextViewBackground");
                    throw null;
                }
                frameLayout2.setVisibility(0);
                pinterestRecyclerView2.setVisibility(0);
                u3(list);
                return;
            }
            PinterestRecyclerView pinterestRecyclerView3 = jVar.B1;
            if (pinterestRecyclerView3 == null) {
                Intrinsics.r("recylerView");
                throw null;
            }
            FrameLayout frameLayout3 = jVar.D1;
            if (frameLayout3 == null) {
                Intrinsics.r("emptyStateTextViewBackground");
                throw null;
            }
            String string3 = jVar.getResources().getString(e02.e.empty_state_board_picker_search_message);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            Object[] objArr = new Object[1];
            GestaltSearchField gestaltSearchField2 = jVar.F1;
            if (gestaltSearchField2 == null) {
                Intrinsics.r("searchBarView");
                throw null;
            }
            objArr[0] = gestaltSearchField2.I0();
            String Y2 = j1.Y(string3, objArr, null, 6);
            GestaltText gestaltText = jVar.C1;
            if (gestaltText == null) {
                Intrinsics.r("emptyStateTextView");
                throw null;
            }
            gestaltText.i(new zu0.c(Y2, 20));
            frameLayout3.setVisibility(0);
            pinterestRecyclerView3.setVisibility(8);
        }
    }

    public boolean Y3() {
        return this.f71016q != d4.PIN_EDIT;
    }

    public boolean Z3() {
        if (this.F && !this.f71019t && !this.f71017r) {
            z2 z2Var = this.f71005i;
            z2Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) z2Var.f83520a;
            return (g1Var.o("android_curation_brv_reorder_profile_cell_in_board_picker", "enabled", z3Var) || g1Var.l("android_curation_brv_reorder_profile_cell_in_board_picker") || ((b60.d) this.f70999f).f() == null) ? false : true;
        }
        return false;
    }

    public final void a4(String str, String boardName, String str2) {
        f30 pin = this.K;
        if (pin != null) {
            c2 c2Var = this.f71004h0;
            if (c2Var == null) {
                Intrinsics.r("repinToastHelper");
                throw null;
            }
            d0 pinalytics = getPinalytics();
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(boardName, "boardName");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            i92.k kVar = (i92.k) c2Var.f16532c;
            String uid = pin.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            w wVar = (w) c2Var.f16531b;
            j11.d dVar = new j11.d(c2Var.g(pinalytics, false, j11.a.REPIN), wVar, (g70.h) c2Var.f16536g, uid, str, boardName, str2, ((b60.d) ((b60.b) c2Var.f16534e)).g(), false, false);
            dVar.d(f1.RENDER, this.f71023x);
            kVar.c(dVar);
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        dl1.s sVar = (dl1.s) getItem(i13);
        boolean z13 = sVar instanceof v7;
        return (z13 && Intrinsics.d(((v7) sVar).getUid(), "PROFILE_PINS")) ? f11.g.TYPE_BOARDLESS_SAVE.getValue() : (z13 && Intrinsics.d(((v7) sVar).getUid(), "COLLAGE_DRAFTS")) ? f11.g.ADD_TO_COLLAGE.getValue() : (this.Q <= 0 || i13 < this.P) ? f11.g.TYPE_BOARD.getValue() : f11.g.TYPE_SUGGESTED_BOARD_NAME.getValue();
    }

    public final String getRepinPreviewImageUrl() {
        f30 f30Var = this.K;
        if (f30Var == null) {
            return null;
        }
        return f30Var.J3() != null ? I3() : kg.o.m(f30Var);
    }

    @Override // com.pinterest.feature.search.results.view.j
    public final void l() {
    }

    @Override // vq0.g
    public final void o(int i13, vq0.h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f126436a.j(i13, viewBinderInstance);
    }

    @Override // vq0.g, yk1.b
    public final void onActivate() {
        q3();
        this.Y = false;
    }

    @Override // yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        this.Y = bundle != null ? bundle.getBoolean("SAVED_STATE_HAS_LAUNCHED_BOARD_CREATE") : false;
    }

    @Override // yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("SAVED_STATE_HAS_LAUNCHED_BOARD_CREATE", this.Y);
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    public void onUnbind() {
        w wVar = this.f71001g;
        wVar.j(this.f71006i0);
        wVar.j(this.f71010k0);
        super.onUnbind();
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y boardFeedRepository, i2 pinRepository, x0 boardRepository, b60.b activeUserManager, uk1.d presenterPinalytics, uj2.q networkStateStream, w eventManager, v viewResources, z2 experiments, i92.k toastUtils, rg0.s experiences, zf0.f educationHelper, f21.e repinToProfileHelper, com.pinterest.feature.pin.r repinAnimationUtil, String str, String str2, boolean z13, boolean z14, d4 viewType, Boolean bool, String str3, boolean z15, boolean z16, boolean z17, String str4, String str5, String str6, String str7, String str8, boolean z18, RepinAnimationData repinAnimationData, k11.k kVar, boolean z19, String str9, String str10, Boolean bool2, boolean z23, gp1.k repinSource) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(repinSource, "repinSource");
        this.f70993c = boardFeedRepository;
        this.f70995d = pinRepository;
        this.f70997e = boardRepository;
        this.f70999f = activeUserManager;
        this.f71001g = eventManager;
        this.f71003h = viewResources;
        this.f71005i = experiments;
        this.f71007j = toastUtils;
        this.f71009k = experiences;
        this.f71011l = educationHelper;
        this.f71012m = repinAnimationUtil;
        this.f71013n = str;
        this.f71014o = str2;
        this.f71015p = z14;
        this.f71016q = viewType;
        this.f71017r = z15;
        this.f71018s = z16;
        this.f71019t = z17;
        this.f71020u = str4;
        this.f71021v = str5;
        this.f71022w = str6;
        this.f71023x = str7;
        this.f71024y = str8;
        this.f71025z = z18;
        this.A = repinAnimationData;
        this.B = z19;
        this.C = str9;
        this.D = str10;
        this.E = bool2;
        this.F = z23;
        this.G = repinSource;
        u7 x03 = v7.x0();
        x03.P("PROFILE_PINS");
        x03.C("");
        x03.G("{\"reason\": 3, \"score\": -1}");
        v7 a13 = x03.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        this.I = a13;
        u7 x04 = v7.x0();
        x04.P("COLLAGE_DRAFTS");
        v7 a14 = x04.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        this.f70990J = a14;
        this.S = new ArrayList();
        this.X = new HashSet();
        this.f70992b0 = new HashMap();
        this.f70994c0 = new BoardFeed();
        uk2.f fVar = new uk2.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f70998e0 = fVar;
        this.f71006i0 = new i(this);
        this.f71008j0 = true;
        this.f71010k0 = new h(this);
        this.M = str;
        this.V = z13;
        this.W = z13;
        this.H = ((yk1.a) viewResources).f139224a.getInteger(m60.u0.board_picker_page_count);
        g11.a aVar = (g11.a) presenterPinalytics;
        this.N = aVar;
        aVar.f63365i = bool;
        aVar.f63366j = str3;
        aVar.f63368l = str7;
        if (kVar != null) {
            k11.j jVar = kVar.f78148a;
            aVar.f63369m = jVar.f78146b;
            aVar.f63370n = jVar.f78147c;
        }
        int value = f11.g.TYPE_BOARD.getValue();
        zm0.a viewBinderInstance = new zm0.a(Y3(), this, this, new d(this, 0));
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        this.f126436a.j(value, viewBinderInstance);
        int value2 = f11.g.ADD_TO_COLLAGE.getValue();
        f viewBinderInstance2 = new f(this, 0);
        Intrinsics.checkNotNullParameter(viewBinderInstance2, "viewBinderInstance");
        this.f126436a.j(value2, viewBinderInstance2);
        int value3 = f11.g.TYPE_BOARDLESS_SAVE.getValue();
        f viewBinderInstance3 = new f(this, 1);
        Intrinsics.checkNotNullParameter(viewBinderInstance3, "viewBinderInstance");
        this.f126436a.j(value3, viewBinderInstance3);
        int value4 = f11.g.TYPE_SUGGESTED_BOARD_NAME.getValue();
        f viewBinderInstance4 = new f(this, 2);
        Intrinsics.checkNotNullParameter(viewBinderInstance4, "viewBinderInstance");
        this.f126436a.j(value4, viewBinderInstance4);
    }
}

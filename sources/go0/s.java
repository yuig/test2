package go0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.feature.pin.create.view.CreateBoardSectionCell;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.m3;
import dl1.t;
import h32.u0;
import j1.p0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jk2.a1;
import jk2.e0;
import kb.w0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nx.b0;
import nx.d1;
import pk.a0;
import x02.i2;
import yk1.v;

/* loaded from: classes5.dex */
public final class s extends a {
    public final v A;
    public final b0 B;
    public final String C;
    public final String D;
    public final String E;
    public final Boolean F;
    public final int G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final String f65903J;
    public final String K;
    public final boolean L;
    public final k11.f M;
    public f30 N;
    public k11.d O;
    public qp.g P;

    /* renamed from: i, reason: collision with root package name */
    public final String f65904i;

    /* renamed from: j, reason: collision with root package name */
    public final w0 f65905j;

    /* renamed from: k, reason: collision with root package name */
    public final Date f65906k;

    /* renamed from: l, reason: collision with root package name */
    public final String f65907l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f65908m;

    /* renamed from: n, reason: collision with root package name */
    public final RepinAnimationData f65909n;

    /* renamed from: o, reason: collision with root package name */
    public final b60.d f65910o;

    /* renamed from: p, reason: collision with root package name */
    public final i2 f65911p;

    /* renamed from: q, reason: collision with root package name */
    public final t f65912q;

    /* renamed from: r, reason: collision with root package name */
    public final ag1.b f65913r;

    /* renamed from: s, reason: collision with root package name */
    public final tb0.h f65914s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f65915t;

    /* renamed from: u, reason: collision with root package name */
    public final k11.h f65916u;

    /* renamed from: v, reason: collision with root package name */
    public final com.pinterest.feature.pin.j f65917v;

    /* renamed from: w, reason: collision with root package name */
    public final g11.a f65918w;

    /* renamed from: x, reason: collision with root package name */
    public final w f65919x;

    /* renamed from: y, reason: collision with root package name */
    public final j12.b f65920y;

    /* renamed from: z, reason: collision with root package name */
    public final i92.k f65921z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r21, wk1.c r22, go0.f r23, kb.w0 r24, boolean r25, java.util.Date r26, java.lang.String r27, boolean r28, com.pinterest.feature.pin.RepinAnimationData r29, b60.b r30, x12.a r31, m60.g0 r32, x02.x0 r33, nr0.m r34, x02.i2 r35, dl1.t r36, ag1.b r37, tb0.h r38, nx.d1 r39, k11.h r40, com.pinterest.feature.pin.j r41, g11.a r42, m60.w r43, j12.b r44, i92.k r45, yk1.v r46, x02.y r47, lh0.z2 r48, nx.b0 r49, es.a r50) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.s.<init>(java.lang.String, wk1.c, go0.f, kb.w0, boolean, java.util.Date, java.lang.String, boolean, com.pinterest.feature.pin.RepinAnimationData, b60.b, x12.a, m60.g0, x02.x0, nr0.m, x02.i2, dl1.t, ag1.b, tb0.h, nx.d1, k11.h, com.pinterest.feature.pin.j, g11.a, m60.w, j12.b, i92.k, yk1.v, x02.y, lh0.z2, nx.b0, es.a):void");
    }

    @Override // fo0.a
    public final void V0(ba boardSection) {
        int i13 = 0;
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        ho0.d dVar = (ho0.d) ((fo0.c) getView());
        ig1.b.O0(this.H, dVar.getView(), dVar.getContext());
        fo0.c cVar = (fo0.c) getView();
        String sectionId = boardSection.getUid();
        Intrinsics.checkNotNullExpressionValue(sectionId, "getUid(...)");
        String sectionName = boardSection.A();
        if (sectionName == null) {
            sectionName = "";
        }
        ho0.m mVar = (ho0.m) cVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        mVar.f69729m1 = sectionId;
        mVar.f69730n1 = sectionName;
        HashMap hashMap = new HashMap();
        String str = this.f65907l;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        getPinalytics().Z(u0.BOARD_SECTION_DONE_BUTTON, hashMap);
        xj2.c F = uj2.q.M(800L, TimeUnit.MILLISECONDS, tk2.e.f118016b).A(wj2.c.a()).F(new j(5, new q(this, boardSection, i13)), new j(6, g.f65859m), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        v7 u13 = boardSection.u();
        String message = a.a.D(u13 != null ? u13.j1() : null, ", ", boardSection.A());
        if (message.length() > 0) {
            ho0.m mVar2 = (ho0.m) ((fo0.c) getView());
            mVar2.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            View view = mVar2.getView();
            if (view != null) {
                bs1.c.s2(view, message);
            }
        }
    }

    @Override // fo0.a
    public final void W0(String boardUid, String boardName, String str) {
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        HashMap hashMap = new HashMap();
        String str2 = this.f65907l;
        if (str2 != null) {
            hashMap.put("save_session_id", str2);
        }
        getPinalytics().f0(u0.BOARD_NAME, null, boardUid, hashMap, false);
        ho0.d dVar = (ho0.d) ((fo0.c) getView());
        ig1.b.O0(this.H, dVar.getView(), dVar.getContext());
        uj2.q.M(800L, TimeUnit.MILLISECONDS, tk2.e.f118016b).A(wj2.c.a()).F(new j(3, new p0(this, boardName, boardUid, str, 18)), new j(4, g.f65860n), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        qp.g gVar = this.P;
        if (gVar != null) {
            gVar.dispose();
        }
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        String str = this.C;
        return str == null || z.j(str);
    }

    public final void v3(String str, String str2) {
        if (this.I) {
            e0 M = ((dl1.l) this.f65912q).M(this.f65913r.d());
            hk2.b bVar = new hk2.b(new j(7, new p(this, str, 1)), new j(8, new o(this, 3)), ck2.i.f27923c);
            M.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
            ho0.m mVar = (ho0.m) ((fo0.c) getView());
            hf0.b.k(mVar.requireActivity().getCurrentFocus());
            if (mVar.U6() && mVar.f69734r1) {
                mVar.Y6(ho0.b.f69685m);
                return;
            } else {
                mVar.P7();
                return;
            }
        }
        String str3 = this.f65904i;
        String str4 = this.K;
        if (str4 != null && str4.length() != 0) {
            this.f65919x.f(new kp1.a(str3, str));
            ho0.m mVar2 = (ho0.m) ((fo0.c) getView());
            if (mVar2.U6()) {
                mVar2.z(ho0.b.f69684l);
                return;
            }
            return;
        }
        if (this.O == null) {
            this.O = new k11.d(this.f65911p, (k11.e) getView(), this.f65905j, getPinalytics(), this.f65907l);
        }
        ba u33 = u3(str);
        if (u33 != null) {
            fo0.c cVar = (fo0.c) getView();
            String A = u33.A();
            Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
            ((ho0.m) cVar).n9(str, str3, A);
        }
        k11.d dVar = this.O;
        if (dVar != null) {
            dVar.c(((ho0.m) ((fo0.c) getView())).f69736t1, this.f65904i, str2, b40.q(this.N), str, this.f65903J, this.E, this.F);
        }
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] */
    public final void r3(fo0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        Object value = this.f65920y.f74410a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        uk2.p pVar = (uk2.p) value;
        pVar.getClass();
        a1 a1Var = new a1(pVar);
        Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
        qp.g gVar = new qp.g(this, 4);
        a1Var.d(gVar);
        this.P = gVar;
        ho0.m mVar = (ho0.m) view;
        Context requireContext = mVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        View createBoardSectionCell = new CreateBoardSectionCell(requireContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, createBoardSectionCell.getResources().getDimensionPixelOffset(f02.a.lego_create_board_cell_height));
        layoutParams.gravity = 81;
        createBoardSectionCell.setLayoutParams(layoutParams);
        createBoardSectionCell.setOnClickListener(new lj0.a(mVar, 11));
        FrameLayout frameLayout = mVar.V0;
        if (frameLayout == null && (frameLayout = mVar.X0) == null) {
            Intrinsics.r("rootContainer");
            throw null;
        }
        frameLayout.addView(createBoardSectionCell);
        Context requireContext2 = mVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        if (!a0.q0(requireContext2)) {
            mVar.g9();
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        mVar.f69723g1 = this;
        int i13 = 2;
        String str = this.C;
        if (str == null || z.j(str)) {
            this.f65914s.h("Null pinId");
        } else {
            if (isBound()) {
                ((ho0.d) ((fo0.c) getView())).setLoadState(yk1.i.LOADING);
            }
            xj2.c o13 = this.f65911p.Q(str).s().o(new j(1, new o(this, 1)), new j(2, new p(this, str, 0)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
        i iVar = this.f65823g;
        if (iVar != null) {
            xj2.c F = iVar.f49129s.H(tk2.e.f118017c).A(wj2.c.a()).F(new j(13, new o(this, i13)), new j(14, g.f65858l), ck2.i.f27923c, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
    }

    public final void x3() {
        String v03;
        if (isBound()) {
            ho0.d dVar = (ho0.d) ((fo0.c) getView());
            ig1.b.L0(dVar.getContext(), dVar.getView(), this.H, true);
            ho0.m mVar = (ho0.m) ((fo0.c) getView());
            mVar.getClass();
            String boardId = this.f65904i;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            NavigationImpl L = Navigation.L(m3.d(), "", ml1.b.MODAL_TRANSITION.getValue());
            L.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
            String str = mVar.f69725i1;
            L.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", (str == null || str.length() == 0) ? new ArrayList() : f0.d(str));
            L.m0("com.pinterest.EXTRA_SHUFFLE_ASSET_ID", mVar.f69741y1);
            L.m0("com.pinterest.EXTRA_SHUFFLE_ID", mVar.f69742z1);
            L.Y1("com.pinterest.EXTRA_IS_SHUFFLE_REMIXABLE", com.bumptech.glide.d.o0(mVar.A1));
            L.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", com.pinterest.feature.boardsection.a.REPIN.getValue());
            boolean z13 = mVar.f69731o1;
            if (z13) {
                L.Y1("com.pinterest.EXTRA_CLOSEUP_TOPLEVEL_SOURCE", z13);
            }
            Navigation navigation = mVar.I;
            if (navigation != null && (v03 = navigation.v0("com.pinterest.EXTRA_SESSION_ID")) != null) {
                L.m0("com.pinterest.EXTRA_SESSION_ID", v03);
            }
            if (mVar.U6()) {
                mVar.M1(L);
                return;
            }
            il1.a aVar = mVar.H1;
            if (aVar == null) {
                Intrinsics.r("fragmentFractory");
                throw null;
            }
            com.pinterest.framework.screens.m e13 = aVar.e(m3.d());
            nl1.d dVar2 = e13 instanceof nl1.d ? (nl1.d) e13 : null;
            if (dVar2 != null) {
                dVar2.R7(L);
            }
            View view = mVar.getView();
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            Integer valueOf = viewGroup != null ? Integer.valueOf(viewGroup.getId()) : null;
            if (valueOf != null) {
                androidx.fragment.app.w0 supportFragmentManager = mVar.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                int intValue = valueOf.intValue();
                Intrinsics.f(dVar2);
                mo1.c.c(supportFragmentManager, intValue, dVar2, true, mo1.a.MODAL, 32);
            }
        }
    }
}

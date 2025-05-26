package yn0;

import a.cb;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import ck2.i;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y;
import com.pinterest.ui.components.modals.BoardSectionEditOption;
import f0.h;
import hk2.u;
import i92.k;
import kh2.k3;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import uj2.l;
import uj2.q;
import uk1.e;
import x02.x0;
import x02.z0;
import xa0.m;
import yb0.n;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f139522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139523b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f139524c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f139525d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f139526e;

    /* renamed from: f, reason: collision with root package name */
    public final v f139527f;

    /* renamed from: g, reason: collision with root package name */
    public final k f139528g;

    /* renamed from: h, reason: collision with root package name */
    public v7 f139529h;

    /* renamed from: i, reason: collision with root package name */
    public ba f139530i;

    /* renamed from: j, reason: collision with root package name */
    public String f139531j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String boardSectionId, String boardId, z0 boardSectionRepository, x0 boardRepository, b60.b activeUserManager, e presenterPinalyticsFactory, q networkStateStream, v viewResources, k toastUtils) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f139522a = boardSectionId;
        this.f139523b = boardId;
        this.f139524c = boardSectionRepository;
        this.f139525d = boardRepository;
        this.f139526e = activeUserManager;
        this.f139527f = viewResources;
        this.f139528g = toastUtils;
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(xn0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        final zn0.d dVar = (zn0.d) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.f142277p0 = this;
        BoardSectionEditOption boardSectionEditOption = dVar.f142274m0;
        if (boardSectionEditOption == null) {
            Intrinsics.r("mergeSectionOption");
            throw null;
        }
        final int i13 = 0;
        boardSectionEditOption.setOnClickListener(new View.OnClickListener() { // from class: zn0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i14 = i13;
                d this$0 = dVar;
                switch (i14) {
                    case 0:
                        int i15 = d.f142270u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        yn0.d dVar2 = this$0.f142277p0;
                        if (dVar2 != null) {
                            dVar2.u3();
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f142270u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        yn0.d dVar3 = this$0.f142277p0;
                        if (dVar3 != null) {
                            dVar3.t3();
                            break;
                        }
                        break;
                }
            }
        });
        BoardSectionEditOption boardSectionEditOption2 = dVar.f142275n0;
        if (boardSectionEditOption2 == null) {
            Intrinsics.r("deleteSectionOption");
            throw null;
        }
        final int i14 = 1;
        boardSectionEditOption2.setOnClickListener(new View.OnClickListener() { // from class: zn0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i142 = i14;
                d this$0 = dVar;
                switch (i142) {
                    case 0:
                        int i15 = d.f142270u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        yn0.d dVar2 = this$0.f142277p0;
                        if (dVar2 != null) {
                            dVar2.u3();
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f142270u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        yn0.d dVar3 = this$0.f142277p0;
                        if (dVar3 != null) {
                            dVar3.t3();
                            break;
                        }
                        break;
                }
            }
        });
        clearDisposables();
        xj2.c o13 = this.f139524c.Q(this.f139522a).s().o(new tn0.a(17, new b(this, i14)), new tn0.a(18, c.f139520k));
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        addDisposable(o13);
        xj2.c F = this.f139525d.S(this.f139523b).F(new tn0.a(19, new b(this, i13)), new tn0.a(20, c.f139519j), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void q3(String boardSectionName) {
        Intrinsics.checkNotNullParameter(boardSectionName, "boardSectionName");
        boolean a13 = com.pinterest.feature.board.create.b.a(boardSectionName, null);
        ((zn0.d) ((xn0.a) getView())).c8((!Intrinsics.d(boardSectionName, this.f139531j)) && a13);
        if (a13) {
            GestaltTextField gestaltTextField = ((zn0.d) ((xn0.a) getView())).f142272k0;
            if (gestaltTextField != null) {
                gestaltTextField.X(zn0.c.f142265j);
                return;
            } else {
                Intrinsics.r("boardSectionNameEditField");
                throw null;
            }
        }
        GestaltTextField gestaltTextField2 = ((zn0.d) ((xn0.a) getView())).f142272k0;
        if (gestaltTextField2 != null) {
            gestaltTextField2.X(zn0.c.f142267l);
        } else {
            Intrinsics.r("boardSectionNameEditField");
            throw null;
        }
    }

    public final void r3(String boardSectionTitle) {
        Intrinsics.checkNotNullParameter(boardSectionTitle, "newBoardSectionName");
        ba boardSection = this.f139530i;
        if (boardSection == null) {
            return;
        }
        ((zn0.d) ((xn0.a) getView())).setLoadState(yk1.i.LOADING);
        z0 z0Var = this.f139524c;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        Intrinsics.checkNotNullParameter(boardSectionTitle, "boardSectionTitle");
        String uid = boardSection.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        j12.e eVar = new j12.e(uid, boardSectionTitle);
        aa aaVar = new aa(boardSection, 0);
        aaVar.d(boardSectionTitle);
        ba a13 = aaVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        l G = z0Var.G(eVar, a13);
        G.getClass();
        u uVar = new u(G);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        uVar.i(new a(this, 1), new tn0.a(21, new b(this, 2)));
    }

    public final void s3() {
        ba baVar = this.f139530i;
        if (baVar == null) {
            return;
        }
        ((zn0.d) ((xn0.a) getView())).setLoadState(yk1.i.LOADING);
        this.f139524c.d(baVar).i(new a(this, 0), new tn0.a(16, new b(this, 3)));
    }

    public final void t3() {
        SpannableStringBuilder C;
        ba baVar = this.f139530i;
        if (baVar == null) {
            return;
        }
        xn0.a aVar = (xn0.a) getView();
        String boardSectionName = baVar.A();
        Intrinsics.checkNotNullExpressionValue(boardSectionName, "getTitle(...)");
        Integer x13 = baVar.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getPinCount(...)");
        int intValue = x13.intValue();
        zn0.d dVar = (zn0.d) aVar;
        dVar.getClass();
        String boardSectionId = this.f139522a;
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        Intrinsics.checkNotNullParameter(boardSectionName, "boardSectionName");
        if (intValue == 0) {
            Context requireContext = dVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            String string = dVar.getString(k70.e.delete_empty_board_section);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C = h.C(requireContext, string, new String[]{"%1$s"}, new String[]{boardSectionName}, null, eo1.b.color_themed_text_default);
        } else {
            String quantityString = dVar.getResources().getQuantityString(k70.d.plural_delete_board_section_confirmation_subtitle, intValue, "%1$s", Integer.valueOf(intValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            Context requireContext2 = dVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            C = h.C(requireContext2, quantityString, new String[]{"%1$s"}, new String[]{boardSectionName}, null, eo1.b.color_themed_text_default);
        }
        String string2 = dVar.getString(k70.e.delete_board_section_confirmation_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = dVar.getString(k70.e.delete_board_section);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        Context requireContext3 = dVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        n nVar = new n(requireContext3);
        nVar.w(string2);
        nVar.u(C);
        nVar.q(string3);
        String string4 = dVar.getString(m60.x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        nVar.m(string4);
        nVar.setFocusable(true);
        nVar.setFocusableInTouchMode(true);
        nVar.requestFocus();
        nVar.f138513j = new m(12, dVar, boardSectionId);
        cb.x(nVar, dVar.f7());
    }

    public final void u3() {
        if (isBound()) {
            zn0.d dVar = (zn0.d) ((xn0.a) getView());
            dVar.getClass();
            String boardId = this.f139523b;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            String boardSectionId = this.f139522a;
            Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
            NavigationImpl z03 = Navigation.z0(y.d(), boardId);
            z03.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", boardSectionId);
            dVar.M1(z03);
        }
    }

    public final void v3() {
        Boolean bool;
        Boolean bool2;
        boolean z13;
        xn0.a aVar = (xn0.a) getView();
        v7 v7Var = this.f139529h;
        ba baVar = this.f139530i;
        b60.b bVar = this.f139526e;
        boolean z14 = true;
        if (v7Var == null || baVar == null) {
            bool = null;
        } else {
            Integer q13 = v7Var.q1();
            Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
            if (q13.intValue() > 1) {
                boolean[] zArr = baVar.f36034k;
                if ((zArr.length > 9 && zArr[9] && dl2.b.S1(com.bumptech.glide.d.Q(bVar), dl2.b.g1(baVar.B()))) || w.h0(v7Var) || kh2.d.C0(v7Var, y22.c.MERGE_SECTIONS)) {
                    z13 = true;
                    bool = Boolean.valueOf(z13);
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        zn0.d dVar = (zn0.d) aVar;
        BoardSectionEditOption boardSectionEditOption = dVar.f142274m0;
        if (boardSectionEditOption == null) {
            Intrinsics.r("mergeSectionOption");
            throw null;
        }
        k3.R1(boardSectionEditOption, booleanValue);
        dVar.d8();
        xn0.a aVar2 = (xn0.a) getView();
        v7 v7Var2 = this.f139529h;
        ba baVar2 = this.f139530i;
        if (v7Var2 == null || baVar2 == null) {
            bool2 = null;
        } else {
            boolean[] zArr2 = baVar2.f36034k;
            if ((zArr2.length <= 9 || !zArr2[9] || !dl2.b.S1(com.bumptech.glide.d.Q(bVar), dl2.b.g1(baVar2.B()))) && !w.h0(v7Var2) && !kh2.d.C0(v7Var2, y22.c.DELETE_SECTIONS)) {
                z14 = false;
            }
            bool2 = Boolean.valueOf(z14);
        }
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        zn0.d dVar2 = (zn0.d) aVar2;
        BoardSectionEditOption boardSectionEditOption2 = dVar2.f142275n0;
        if (boardSectionEditOption2 == null) {
            Intrinsics.r("deleteSectionOption");
            throw null;
        }
        k3.R1(boardSectionEditOption2, booleanValue2);
        dVar2.d8();
    }
}

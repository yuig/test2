package ll0;

import a.cb;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.widget.ConstraintLayout;
import ap.o;
import b10.z;
import bi1.a0;
import ck2.i;
import com.pinterest.api.model.e8;
import com.pinterest.api.model.hb;
import com.pinterest.api.model.lb;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.multisection.datasource.pagedlist.h;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.text.DescriptionEditView;
import dl1.u;
import gi.m;
import i92.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk2.j1;
import kh2.k3;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import m60.w;
import nx.f0;
import ol0.s;
import pq2.d1;
import q5.v0;
import u50.k0;
import uj2.b0;
import uj2.q;
import wk1.l;
import x02.a2;
import x02.x0;
import xk2.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class f extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83802a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f83803b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f83804c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f83805d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f83806e;

    /* renamed from: f, reason: collision with root package name */
    public final v f83807f;

    /* renamed from: g, reason: collision with root package name */
    public final w f83808g;

    /* renamed from: h, reason: collision with root package name */
    public final k f83809h;

    /* renamed from: i, reason: collision with root package name */
    public final e12.d f83810i;

    /* renamed from: j, reason: collision with root package name */
    public final jl0.b f83811j;

    /* renamed from: k, reason: collision with root package name */
    public final x92.b f83812k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f83813l;

    /* renamed from: m, reason: collision with root package name */
    public v7 f83814m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83815n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f83816o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83817p;

    /* renamed from: q, reason: collision with root package name */
    public final b f83818q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.k f83819r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String boardId, uk1.d presenterPinalytics, x0 boardRepository, d1 boardRetrofit, b60.b activeUserManager, m boardInviteUtils, v viewResources, w eventManager, o uploadContactsUtil, k toastUtils, e12.d boardService, f0 pinalyticsFactory, x92.b graphQLBoardCollaboratorRemoteDataSource, c2 sharesheetUtils) {
        super(0);
        jl0.b boardUtils = jl0.a.f76935a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardRetrofit, "boardRetrofit");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(boardInviteUtils, "boardInviteUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(boardUtils, "boardUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(graphQLBoardCollaboratorRemoteDataSource, "graphQLBoardCollaboratorRemoteDataSource");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f83802a = boardId;
        this.f83803b = presenterPinalytics;
        this.f83804c = boardRepository;
        this.f83805d = boardRetrofit;
        this.f83806e = activeUserManager;
        this.f83807f = viewResources;
        this.f83808g = eventManager;
        this.f83809h = toastUtils;
        this.f83810i = boardService;
        this.f83811j = boardUtils;
        this.f83812k = graphQLBoardCollaboratorRemoteDataSource;
        this.f83813l = sharesheetUtils;
        this.f83818q = new b(this);
        this.f83819r = xk2.m.a(n.NONE, new a(this, 0));
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        com.pinterest.feature.board.edit.a boardEditView = (com.pinterest.feature.board.edit.a) nVar;
        Intrinsics.checkNotNullParameter(boardEditView, "boardEditView");
        super.r3(boardEditView);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ol0.f) boardEditView).Q0 = this;
        q B = this.f83804c.B();
        xo.a aVar = new xo.a(this, 9);
        a2 a2Var = i.f27924d;
        xj2.c F = B.F(aVar, a2Var, i.f27923c, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        q3();
        this.f83808g.h(this.f83818q);
    }

    public final void p3() {
        com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) getViewIfBound();
        if (aVar != null) {
            ol0.m mVar = ol0.m.f96402f;
            ((ol0.f) aVar).b8(ol0.m.f96403g);
        }
    }

    public final void q3() {
        int i13 = 1;
        a remoteFetch = new a(this, i13);
        x0 x0Var = this.f83804c;
        x0Var.getClass();
        String modelId = this.f83802a;
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(remoteFetch, "remoteFetch");
        u uVar = new u(modelId);
        b0 b0Var = (b0) remoteFetch.invoke();
        l lVar = new l(29, new a0(x0Var, 23));
        b0Var.getClass();
        jk2.m j13 = q.j(new j1(new kk2.g(b0Var, lVar, 3).u(), new h(5, new dl1.f(x0Var, uVar, i13)), i13), x0Var.x(uVar));
        gl1.d dVar = x0Var.f55246s;
        q i14 = j13.i(new b22.f(2, new dl1.g(dVar, 1))).i(new b22.f(3, new dl1.g(dVar, 2)));
        Intrinsics.checkNotNullExpressionValue(i14, "compose(...)");
        xj2.c F = i14.F(new zk0.b(21, new c(this, 0)), new zk0.b(22, new c(this, i13)), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void r3() {
        v7 v7Var = this.f83814m;
        if (v7Var != null) {
            this.f83813l.n(v7Var, -1, this.f83808g, false, 1);
        }
    }

    public final void s3(CharSequence boardName) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f83815n = true;
        if (isBound()) {
            boolean a13 = com.pinterest.feature.board.create.b.a(boardName, 50);
            GestaltButton gestaltButton = ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).f96384x0;
            if (gestaltButton == null) {
                Intrinsics.r("doneButton");
                throw null;
            }
            gestaltButton.d(new jc0.m(a13, 22));
            v7 v7Var = this.f83814m;
            if (v7Var != null && Intrinsics.d(v7Var.f1(), Boolean.TRUE)) {
                this.f83815n = false;
                GestaltTextField gestaltTextField = ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).f96386z0;
                if (gestaltTextField != null) {
                    gestaltTextField.X(ol0.e.f96357j);
                    return;
                } else {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
            }
            if (a13) {
                GestaltTextField gestaltTextField2 = ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).f96386z0;
                if (gestaltTextField2 != null) {
                    gestaltTextField2.X(ol0.e.f96358k);
                    return;
                } else {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
            }
            int i13 = 3;
            if (boardName.length() > 50) {
                com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) getView();
                k0 error = bs1.c.j2(new String[0], a70.c.invalid_board_name_length);
                ol0.f fVar = (ol0.f) aVar;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                GestaltTextField gestaltTextField3 = fVar.f96386z0;
                if (gestaltTextField3 != null) {
                    gestaltTextField3.X(new fx.e(i13, error));
                    return;
                } else {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
            }
            com.pinterest.feature.board.edit.a aVar2 = (com.pinterest.feature.board.edit.a) getView();
            k0 error2 = bs1.c.j2(new String[0], a70.c.invalid_board_name_letter_number_special_char);
            ol0.f fVar2 = (ol0.f) aVar2;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter(error2, "error");
            GestaltTextField gestaltTextField4 = fVar2.f96386z0;
            if (gestaltTextField4 != null) {
                gestaltTextField4.X(new fx.e(i13, error2));
            } else {
                Intrinsics.r("boardNameEditText");
                throw null;
            }
        }
    }

    public final void t3() {
        if (this.f83817p) {
            ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).c8("com.pinterest.EXTRA_BOARD_HEADER_IMAGE_RESULT_IMAGE_MODIFIED");
        } else {
            ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).D5();
        }
    }

    public final void u3() {
        v7 v7Var = this.f83814m;
        if (v7Var != null) {
            this.f83812k.K(v7Var).j(new d(this, 0));
        }
    }

    public final void v3() {
        com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) getView();
        v7 v7Var = this.f83814m;
        if (v7Var != null) {
            kh2.d.L0(v7Var);
        }
        ol0.f fVar = (ol0.f) aVar;
        fVar.getClass();
        String boardId = this.f83802a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        b60.b activeUserManager = fVar.getActiveUserManager();
        x0 x0Var = fVar.f96375o0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        pb0.d dVar = fVar.f96377q0;
        if (dVar == null) {
            Intrinsics.r("fuzzyDateFormatter");
            throw null;
        }
        s sVar = new s(boardId, activeUserManager, x0Var, dVar);
        z zVar = new z(28, fVar, boardId);
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        sVar.f96428f = zVar;
        fVar.f7().d(new jc0.v(sVar, false, 0L, 30));
    }

    public final void w3() {
        if (isBound()) {
            ol0.f fVar = (ol0.f) ((com.pinterest.feature.board.edit.a) getView());
            fVar.getClass();
            String boardId = this.f83802a;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            String string = fVar.getString(d70.g.leave_board__title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = fVar.getString(d70.g.leave_board_check);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = fVar.getString(d70.g.leave_board);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            yb0.n h83 = fVar.h8(string, string2, string3);
            h83.f138513j = new xa0.m(7, fVar, boardId);
            cb.x(h83, fVar.f7());
        }
    }

    public final void x3(v7 v7Var, a aVar, Function1 function1) {
        this.f83804c.n0(v7Var).j(new k0.a(aVar, this, function1, 0));
    }

    public final void z3(v7 v7Var) {
        Boolean bool;
        if (isBound()) {
            v7 v7Var2 = this.f83814m;
            boolean z13 = false;
            byte b13 = 0;
            if (v7Var2 != null && Intrinsics.d(v7Var2.f1(), Boolean.TRUE)) {
                this.f83815n = false;
                GestaltTextField gestaltTextField = ((ol0.f) ((com.pinterest.feature.board.edit.a) getView())).f96386z0;
                if (gestaltTextField == null) {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
                gestaltTextField.X(ol0.e.f96357j);
                ol0.f fVar = (ol0.f) ((com.pinterest.feature.board.edit.a) getView());
                LinearLayout linearLayout = fVar.E0;
                if (linearLayout == null) {
                    Intrinsics.r("boardSecretView");
                    throw null;
                }
                bs1.c.X0(linearLayout);
                View view = fVar.J0;
                if (view == null) {
                    Intrinsics.r("leaveContainer");
                    throw null;
                }
                bs1.c.X0(view);
                GestaltText gestaltText = fVar.K0;
                if (gestaltText == null) {
                    Intrinsics.r("leaveDetails");
                    throw null;
                }
                bs1.c.X0(gestaltText);
                View view2 = fVar.I0;
                if (view2 == null) {
                    Intrinsics.r("deleteContainer");
                    throw null;
                }
                bs1.c.X0(view2);
                GestaltText gestaltText2 = fVar.N0;
                if (gestaltText2 == null) {
                    Intrinsics.r("actionsText");
                    throw null;
                }
                bs1.c.X0(gestaltText2);
            }
            b60.d dVar = (b60.d) this.f83806e;
            wy0 f13 = dVar.f();
            if (f13 != null) {
                wy0 k13 = v7Var.k1();
                String uid = k13 != null ? k13.getUid() : null;
                if (uid == null) {
                    uid = "";
                }
                bool = Boolean.valueOf(dl2.b.S1(f13, uid));
            } else {
                bool = null;
            }
            boolean o03 = com.bumptech.glide.d.o0(bool);
            Boolean E0 = v7Var.E0();
            Intrinsics.checkNotNullExpressionValue(E0, "getBoardOwnerHasActiveAds(...)");
            boolean booleanValue = E0.booleanValue();
            com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) getView();
            if (!o03) {
                wy0 activeUser = dVar.f();
                if (activeUser != null) {
                    Intrinsics.checkNotNullParameter(v7Var, "<this>");
                    Intrinsics.checkNotNullParameter(activeUser, "activeUser");
                    z13 = kh2.d.D0(activeUser.getUid(), v7Var);
                }
                ol0.f fVar2 = (ol0.f) aVar;
                LinearLayout linearLayout2 = fVar2.f96385y0;
                if (linearLayout2 == null) {
                    Intrinsics.r("boardNameViewWrapper");
                    throw null;
                }
                bs1.c.X0(linearLayout2);
                LinearLayout linearLayout3 = fVar2.C0;
                if (linearLayout3 == null) {
                    Intrinsics.r("boardDescriptionView");
                    throw null;
                }
                bs1.c.X0(linearLayout3);
                LinearLayout linearLayout4 = fVar2.E0;
                if (linearLayout4 == null) {
                    Intrinsics.r("boardSecretView");
                    throw null;
                }
                bs1.c.X0(linearLayout4);
                View view3 = fVar2.I0;
                if (view3 == null) {
                    Intrinsics.r("deleteContainer");
                    throw null;
                }
                bs1.c.X0(view3);
                View view4 = fVar2.J0;
                if (view4 == null) {
                    Intrinsics.r("leaveContainer");
                    throw null;
                }
                bs1.c.U1(view4);
                GestaltText gestaltText3 = fVar2.K0;
                if (gestaltText3 == null) {
                    Intrinsics.r("leaveDetails");
                    throw null;
                }
                bs1.c.U1(gestaltText3);
                GestaltIconButton gestaltIconButton = fVar2.B0;
                if (gestaltIconButton != null) {
                    gestaltIconButton.t(new jc0.m(z13, 21));
                    return;
                } else {
                    Intrinsics.r("addCollaboratorButton");
                    throw null;
                }
            }
            ol0.f fVar3 = (ol0.f) aVar;
            GestaltTextField gestaltTextField2 = fVar3.f96386z0;
            if (gestaltTextField2 == null) {
                Intrinsics.r("boardNameEditText");
                throw null;
            }
            gestaltTextField2.clearFocus();
            DescriptionEditView descriptionEditView = fVar3.D0;
            if (descriptionEditView == null) {
                Intrinsics.r("descriptionEt");
                throw null;
            }
            descriptionEditView.clearFocus();
            GestaltButton gestaltButton = fVar3.f96384x0;
            if (gestaltButton == null) {
                Intrinsics.r("doneButton");
                throw null;
            }
            pk.a0.v1(gestaltButton);
            GestaltIconButton gestaltIconButton2 = fVar3.B0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("addCollaboratorButton");
                throw null;
            }
            gestaltIconButton2.t(ol0.e.f96363p);
            int i13 = 1;
            if (!this.f83815n) {
                String name = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Intrinsics.checkNotNullParameter(name, "name");
                GestaltTextField gestaltTextField3 = fVar3.f96386z0;
                if (gestaltTextField3 == null) {
                    Intrinsics.r("boardNameEditText");
                    throw null;
                }
                gestaltTextField3.X(new kl0.c(name, i13));
            }
            if (!this.f83816o) {
                String R0 = v7Var.R0();
                String description = R0 != null ? R0 : "";
                Intrinsics.checkNotNullParameter(description, "description");
                DescriptionEditView descriptionEditView2 = fVar3.D0;
                if (descriptionEditView2 == null) {
                    Intrinsics.r("descriptionEt");
                    throw null;
                }
                descriptionEditView2.j(description);
                f fVar4 = fVar3.Q0;
                if (fVar4 != null) {
                    fVar4.f83816o = true;
                }
            }
            boolean M0 = kh2.d.M0(v7Var);
            if (!fVar3.R0) {
                GestaltSwitch gestaltSwitch = fVar3.F0;
                if (gestaltSwitch == null) {
                    Intrinsics.r("secretToggleSwitch");
                    throw null;
                }
                gestaltSwitch.i(new jc0.m(M0, 20));
                fVar3.g8();
                fVar3.f8();
            }
            Boolean z03 = v7Var.z0();
            Intrinsics.checkNotNullExpressionValue(z03, "getAllowHomefeedRecommendations(...)");
            boolean booleanValue2 = z03.booleanValue();
            if (!fVar3.R0) {
                GestaltSwitch gestaltSwitch2 = fVar3.H0;
                if (gestaltSwitch2 == null) {
                    Intrinsics.r("allowHomefeedRecommendationsSwitch");
                    throw null;
                }
                gestaltSwitch2.i(new jc0.m(booleanValue2, 19));
                ol0.d dVar2 = new ol0.d(fVar3, 3);
                GestaltSwitch gestaltSwitch3 = fVar3.H0;
                if (gestaltSwitch3 == null) {
                    Intrinsics.r("allowHomefeedRecommendationsSwitch");
                    throw null;
                }
                pe.i.i(gestaltSwitch3, new e0(22, dVar2));
                ConstraintLayout constraintLayout = fVar3.G0;
                if (constraintLayout == null) {
                    Intrinsics.r("homefeedRecommendationsContainer");
                    throw null;
                }
                v0.m(constraintLayout, r5.d.f106213g, fVar3.getString(d70.g.board_edit_switch_accessibility_action), new ol0.c(fVar3, dVar2, b13 == true ? 1 : 0));
                fVar3.e8();
            }
            GestaltText gestaltText4 = fVar3.L0;
            if (gestaltText4 == null) {
                Intrinsics.r("secretBoardEducationView");
                throw null;
            }
            k3.R1(gestaltText4, booleanValue);
            List C0 = v7Var.C0();
            if (C0 != null) {
                List list = C0;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((lb) it.next()).g());
                }
                if (arrayList.contains(Integer.valueOf(hb.BOARD_HEADER_IMAGE_CREATE.getEventType().getValue()))) {
                    fVar3.b8(ol0.m.f96403g);
                    return;
                }
            }
            ol0.m mVar = ol0.m.f96402f;
            e8 Z0 = v7Var.Z0();
            fVar3.b8(Z0 != null ? new ol0.m(kh2.n.u(Z0), null, null, 30) : ol0.m.f96402f);
        }
    }
}

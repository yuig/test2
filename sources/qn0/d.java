package qn0;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.v0;
import ar0.v;
import com.pinterest.feature.boardsection.create.selectpins.view.CreateBoardSectionSelectPinsGridCell;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import i92.k;
import kotlin.jvm.functions.Function0;
import lp.l;
import m60.f0;
import m60.g0;
import m60.u0;
import m60.w;
import nr0.m;
import nx.d1;
import rm1.q;
import x02.i2;
import x02.x0;
import x02.z0;
import yk1.j;
import yq0.z;

/* loaded from: classes.dex */
public class d extends g implements nn0.c, v {

    /* renamed from: m1, reason: collision with root package name */
    public static final /* synthetic */ int f104450m1 = 0;
    public GestaltButton O0;
    public nn0.a P0;
    public final ar0.c Q0 = new ar0.c();
    public com.pinterest.feature.boardsection.a R0;
    public boolean S0;
    public String T0;
    public String U0;
    public String V0;
    public z0 W0;
    public f0 X0;
    public j Y0;
    public g0 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public k f104451a1;

    /* renamed from: b1, reason: collision with root package name */
    public w f104452b1;

    /* renamed from: c1, reason: collision with root package name */
    public rr0.a f104453c1;

    /* renamed from: d1, reason: collision with root package name */
    public m f104454d1;

    /* renamed from: e1, reason: collision with root package name */
    public uk1.e f104455e1;

    /* renamed from: f1, reason: collision with root package name */
    public x0 f104456f1;

    /* renamed from: g1, reason: collision with root package name */
    public i2 f104457g1;

    /* renamed from: h1, reason: collision with root package name */
    public e12.d f104458h1;

    /* renamed from: i1, reason: collision with root package name */
    public j12.k f104459i1;

    /* renamed from: j1, reason: collision with root package name */
    public d1 f104460j1;

    /* renamed from: k1, reason: collision with root package name */
    public ac2.m f104461k1;

    /* renamed from: l1, reason: collision with root package name */
    public final uk2.f f104462l1;

    public d() {
        this.Y = true;
        this.f104462l1 = new uk2.f();
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return this.f104461k1;
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z zVar) {
        super.Q8(zVar);
        final int i13 = 0;
        zVar.G(66, new Function0(this) { // from class: qn0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f104448b;

            {
                this.f104448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i14 = i13;
                d dVar = this.f104448b;
                switch (i14) {
                    case 0:
                        int i15 = d.f104450m1;
                        dVar.getClass();
                        CreateBoardSectionSelectPinsGridCell createBoardSectionSelectPinsGridCell = new CreateBoardSectionSelectPinsGridCell((ye2.m) dVar.getContext());
                        createBoardSectionSelectPinsGridCell.f45364d = dVar.P0;
                        dVar.s7();
                        return createBoardSectionSelectPinsGridCell;
                    default:
                        int i16 = d.f104450m1;
                        dVar.getClass();
                        return new h((ye2.m) dVar.getContext());
                }
            }
        });
        final int i14 = 1;
        zVar.G(76, new Function0(this) { // from class: qn0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f104448b;

            {
                this.f104448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i142 = i14;
                d dVar = this.f104448b;
                switch (i142) {
                    case 0:
                        int i15 = d.f104450m1;
                        dVar.getClass();
                        CreateBoardSectionSelectPinsGridCell createBoardSectionSelectPinsGridCell = new CreateBoardSectionSelectPinsGridCell((ye2.m) dVar.getContext());
                        createBoardSectionSelectPinsGridCell.f45364d = dVar.P0;
                        dVar.s7();
                        return createBoardSectionSelectPinsGridCell;
                    default:
                        int i16 = d.f104450m1;
                        dVar.getClass();
                        return new h((ye2.m) dVar.getContext());
                }
            }
        });
        zVar.A(true);
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Navigation navigation2 = this.I;
        this.R0 = com.pinterest.feature.boardsection.a.getEnumFromValue(navigation2.v0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE"));
        this.S0 = navigation2.S("com.pinterest.EXTRA_BOARD_SECTION_EMPTY_BOARD", false);
        int i13 = c.f104449a[this.R0.ordinal()];
        if (i13 == 1) {
            this.V0 = navigation2.v0("com.pinterest.EXTRA_BOARD_SECTION_TITLE");
            String v03 = navigation2.v0("com.pinterest.EXTRA_BOARD_ID");
            this.T0 = v03;
            this.X0.S(j1.d1(v03) && j1.d1(this.V0), "Invalid board id or invalid board section title were passed as navigation params. Please provide a non-empty board section title and board id", new Object[0]);
            return;
        }
        if (i13 == 2) {
            String v04 = navigation2.v0("com.pinterest.EXTRA_BOARD_ID");
            this.T0 = v04;
            this.X0.S(j1.d1(v04), "Invalid board id was passed as navigation param to organize board pins. Please provide a non-empty board id", new Object[0]);
            return;
        }
        if (i13 == 3) {
            this.T0 = navigation2.v0("com.pinterest.EXTRA_BOARD_ID");
            this.U0 = navigation2.v0("com.pinterest.EXTRA_BOARD_SECTION_ID");
            this.X0.S(j1.d1(this.T0) && j1.d1(this.U0), "Invalid board id or invalid board section id were passed as navigation params to organize board section pins. Please provide a non-empty board id", new Object[0]);
        } else if (i13 == 4) {
            String v05 = navigation2.v0("com.pinterest.EXTRA_BOARD_ID");
            this.T0 = v05;
            this.X0.S(j1.d1(v05), "Invalid board id was passed as a navigation params to re-order board pins. Please provide a non-empty board id", new Object[0]);
        } else {
            if (i13 != 5) {
                return;
            }
            this.T0 = navigation2.v0("com.pinterest.EXTRA_BOARD_ID");
            this.U0 = navigation2.v0("com.pinterest.EXTRA_BOARD_SECTION_ID");
            this.X0.S(j1.d1(this.T0) && j1.d1(this.U0), "Invalid board id or section id was passed as a navigation params to re-order board pins. Please provide a non-empty board id and non-empty board section id", new Object[0]);
        }
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a aVar) {
        super.S7(aVar);
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) aVar;
        gestaltToolbarImpl.I();
        com.pinterest.feature.boardsection.a aVar2 = this.R0;
        if (aVar2 == com.pinterest.feature.boardsection.a.REORDER_BOARD_PINS || aVar2 == com.pinterest.feature.boardsection.a.REORDER_BOARD_SECTION_PINS) {
            gestaltToolbarImpl.b0(getString(k70.e.press_and_hold_pins_to_reorder));
        } else {
            gestaltToolbarImpl.b0(getString(s42.j.select_pins));
        }
        if (this.R0 != com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION) {
            gestaltToolbarImpl.R(q.CANCEL.drawableRes(requireContext(), dl2.b.f1(requireContext())), getString(m60.x0.cancel));
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        on0.b bVar = new on0.b(this.f104453c1, this.f104458h1, this.f104459i1, this.Z0);
        rr0.h hVar = new rr0.h(E4(), this.f104454d1);
        hVar.f109912a = ((uk1.a) this.f104455e1).g();
        hVar.f109913b = bVar;
        hVar.f109914c = W8();
        hVar.f109925n = this.f104456f1;
        hVar.f109926o = this.Y0;
        hVar.f109927p = this.f104457g1;
        hVar.f109916e = this.f104460j1;
        rr0.h a13 = hVar.a();
        return new pn0.b(this.R0, this.T0, this.U0, this.V0, this.f104462l1, this.W0, this.f104456f1, a13, this.f104451a1, this.f104452b1, this);
    }

    public final void g9(int i13) {
        GestaltButton smallPrimaryButton;
        String string;
        fo1.a i73 = i7();
        if (i73 == null) {
            return;
        }
        GestaltButton gestaltButton = this.O0;
        if (gestaltButton != null) {
            i73.removeView(gestaltButton);
        }
        if (c.f104449a[this.R0.ordinal()] == 1) {
            if (i13 != 0 || this.S0) {
                smallPrimaryButton = new GestaltButton.SmallPrimaryButton(requireContext());
                string = getResources().getString(m60.x0.done);
            } else {
                smallPrimaryButton = new GestaltButton.SmallSecondaryButton(requireContext());
                string = getResources().getString(m60.x0.skip);
            }
            smallPrimaryButton.d(new l(string, 3)).e(new bp.j(24, this, smallPrimaryButton));
            this.O0 = smallPrimaryButton;
        }
        GestaltButton gestaltButton2 = this.O0;
        if (gestaltButton2 != null) {
            ((GestaltToolbarImpl) i73).c(gestaltButton2);
        }
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return getResources().getInteger(u0.board_section_select_pins_grid_cols);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getD0() {
        return a4.BOARD_SECTION_SELECT_PINS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF111517j0() {
        return d4.BOARD_SECTION;
    }

    @Override // yq0.t
    public final mj.m k8() {
        return new mj.m(5);
    }

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        return new s();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(k70.c.board_section_select_pins_fragment, k70.b.p_recycler_view);
        eVar.f979c = k70.b.empty_state_container;
        eVar.b(k70.b.loading_layout);
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        ((PinterestStaggeredGridLayoutManager) n83.f19650a).f1(2);
        return n83;
    }

    @Override // yq0.t
    public final ar0.f o8() {
        return new kl0.m(this, 1);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        g9(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.toolbar_height);
        int i13 = k70.e.empty_board_section_message;
        com.pinterest.feature.boardsection.a aVar = this.R0;
        if (aVar == com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION || aVar == com.pinterest.feature.boardsection.a.BOARD_ORGANIZE_PINS) {
            i13 = l70.d.empty_board_message_select_pins;
        }
        F8(getResources().getString(i13));
        G8(dimensionPixelSize);
        ((pn0.b) this.P0).X3(this.f104462l1);
    }
}

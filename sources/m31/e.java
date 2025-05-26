package m31;

import a.cb;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.pin.r;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import g70.h;
import h32.a4;
import h32.d4;
import h32.g0;
import i92.k;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jk2.a1;
import kh2.s0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lq0.o;
import m60.w;
import nx.b0;
import uj2.q;
import x02.i2;
import x02.x0;
import xn1.i;
import xn1.j;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lm31/e;", "Lyk1/k;", "Lj31/b;", "<init>", "()V", "bp1/h", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a implements j31.b {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f85767x0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f85768j0;

    /* renamed from: k0, reason: collision with root package name */
    public i2 f85769k0;

    /* renamed from: l0, reason: collision with root package name */
    public k f85770l0;

    /* renamed from: m0, reason: collision with root package name */
    public x0 f85771m0;

    /* renamed from: n0, reason: collision with root package name */
    public r f85772n0;

    /* renamed from: o0, reason: collision with root package name */
    public b0 f85773o0;

    /* renamed from: p0, reason: collision with root package name */
    public h f85774p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltButton f85775q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltTextField f85776r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltSpinner f85777s0;

    /* renamed from: t0, reason: collision with root package name */
    public j31.a f85778t0;

    /* renamed from: u0, reason: collision with root package name */
    public final uk2.f f85779u0 = cb.r("create(...)");

    /* renamed from: v0, reason: collision with root package name */
    public a4 f85780v0 = a4.BOARD_NAME_INPUT;

    /* renamed from: w0, reason: collision with root package name */
    public final g0 f85781w0 = g0.PIN_CREATE_BOARD_PICKER;

    @Override // yk1.k
    public final m V7() {
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_BOARD_NAME", "");
        String Z2 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CLUSTER_ID", "");
        boolean G = com.bumptech.glide.d.G(this, "is_from_auto_organize", false);
        String R0 = dl2.b.R0(com.bumptech.glide.d.Z(this, "EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", ""));
        if (com.bumptech.glide.d.Z(this, "repin_id", "").length() > 0) {
            a4 a4Var = a4.NRT_AUTO_ORGANIZE_REFINE_BOARD;
            Intrinsics.checkNotNullParameter(a4Var, "<set-?>");
            this.f85780v0 = a4Var;
        }
        boolean G2 = com.bumptech.glide.d.G(this, "all_cluster_pins_deselected", false);
        String Z3 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_DESELECTED_PIN_IDS_LIST", "");
        List Y = com.bumptech.glide.d.Y(this, "com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", q0.f80391a);
        q p73 = p7();
        uk1.e eVar = this.f85768j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        i2 i2Var = this.f85769k0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        k kVar = this.f85770l0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        w f73 = f7();
        x0 x0Var = this.f85771m0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        r rVar = this.f85772n0;
        if (rVar == null) {
            Intrinsics.r("repinAnimationUtil");
            throw null;
        }
        b0 b0Var = this.f85773o0;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        String Z4 = com.bumptech.glide.d.Z(this, "repin_id", "");
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOURCE") : null;
        h hVar = this.f85774p0;
        if (hVar != null) {
            return new l31.d(Z3, Y, p73, g13, i2Var, kVar, f73, x0Var, rVar, b0Var, Z, Z2, G, R0, Z4, v03, G2, hVar);
        }
        Intrinsics.r("boardNavigator");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getV0() {
        return this.f85781w0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getQ0() {
        return this.f85780v0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getH0() {
        return d4.valueOf(com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", "FEED"));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = nz1.d.fragment_boardless_pins_create_board;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean a13;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ((GestaltIconButton) onCreateView.findViewById(nz1.c.back_button)).u(new o(20, onCreateView, this));
        final int i13 = 0;
        this.f85775q0 = ((GestaltButton) onCreateView.findViewById(nz1.c.done_button)).e(new gm1.a(this) { // from class: m31.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f85763b;

            {
                this.f85763b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                boolean a14;
                int i14 = i13;
                e this$0 = this.f85763b;
                switch (i14) {
                    case 0:
                        int i15 = e.f85767x0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f85779u0.c(Unit.f80348a);
                        GestaltTextField gestaltTextField = this$0.f85776r0;
                        if (gestaltTextField == null) {
                            Intrinsics.r("editText");
                            throw null;
                        }
                        hf0.b.k(gestaltTextField.o0());
                        GestaltTextField gestaltTextField2 = this$0.f85776r0;
                        if (gestaltTextField2 != null) {
                            gestaltTextField2.clearFocus();
                            return;
                        } else {
                            Intrinsics.r("editText");
                            throw null;
                        }
                    default:
                        int i16 = e.f85767x0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof j) {
                            j jVar = (j) it;
                            this$0.getClass();
                            if (jVar instanceof xn1.a) {
                                j31.a aVar = this$0.f85778t0;
                                if (aVar != null) {
                                    j31.a.t2(aVar);
                                    return;
                                }
                                return;
                            }
                            if (jVar instanceof i) {
                                a14 = com.pinterest.feature.board.create.b.a(((i) jVar).f135454c, null);
                                GestaltButton gestaltButton = this$0.f85775q0;
                                if (gestaltButton != null) {
                                    gestaltButton.d(new i31.a(a14, 2));
                                    return;
                                } else {
                                    Intrinsics.r("createButton");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        uk2.f fVar = this.f85779u0;
        fVar.getClass();
        new a1(fVar).K(500L, TimeUnit.MILLISECONDS).H(tk2.e.f118017c).A(wj2.c.a()).F(new a21.a(25, new c(this, i13)), new a21.a(26, d.f85766i), ck2.i.f27923c, ck2.i.f27924d);
        View findViewById = onCreateView.findViewById(nz1.c.board_name_edit_text);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        Intrinsics.f(gestaltTextField);
        int i14 = 2;
        gestaltTextField.X(new c(this, i14));
        final int i15 = 1;
        gestaltTextField.Z(new gm1.a(this) { // from class: m31.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f85763b;

            {
                this.f85763b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                boolean a14;
                int i142 = i15;
                e this$0 = this.f85763b;
                switch (i142) {
                    case 0:
                        int i152 = e.f85767x0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f85779u0.c(Unit.f80348a);
                        GestaltTextField gestaltTextField2 = this$0.f85776r0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("editText");
                            throw null;
                        }
                        hf0.b.k(gestaltTextField2.o0());
                        GestaltTextField gestaltTextField22 = this$0.f85776r0;
                        if (gestaltTextField22 != null) {
                            gestaltTextField22.clearFocus();
                            return;
                        } else {
                            Intrinsics.r("editText");
                            throw null;
                        }
                    default:
                        int i16 = e.f85767x0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof j) {
                            j jVar = (j) it;
                            this$0.getClass();
                            if (jVar instanceof xn1.a) {
                                j31.a aVar = this$0.f85778t0;
                                if (aVar != null) {
                                    j31.a.t2(aVar);
                                    return;
                                }
                                return;
                            }
                            if (jVar instanceof i) {
                                a14 = com.pinterest.feature.board.create.b.a(((i) jVar).f135454c, null);
                                GestaltButton gestaltButton = this$0.f85775q0;
                                if (gestaltButton != null) {
                                    gestaltButton.d(new i31.a(a14, 2));
                                    return;
                                } else {
                                    Intrinsics.r("createButton");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f85776r0 = gestaltTextField;
        ((GestaltText) onCreateView.findViewById(nz1.c.board_create_info)).i(new c(this, i15));
        View findViewById2 = onCreateView.findViewById(nz1.c.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f85777s0 = (GestaltSpinner) findViewById2;
        GestaltTextField gestaltTextField2 = this.f85776r0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("editText");
            throw null;
        }
        Editable z03 = gestaltTextField2.z0();
        String obj = z03 != null ? z03.toString() : null;
        if (obj == null) {
            obj = "";
        }
        a13 = com.pinterest.feature.board.create.b.a(obj, null);
        GestaltButton gestaltButton = this.f85775q0;
        if (gestaltButton != null) {
            gestaltButton.d(new i31.a(a13, i14));
            return onCreateView;
        }
        Intrinsics.r("createButton");
        throw null;
    }

    @Override // yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GestaltSpinner gestaltSpinner = this.f85777s0;
        if (gestaltSpinner != null) {
            s0.w(gestaltSpinner, new qv0.f(state, 2));
        } else {
            Intrinsics.r("loadingView");
            throw null;
        }
    }
}

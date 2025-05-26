package u11;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kg0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import dv0.n;
import h32.d4;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import om1.l;
import q11.d;
import qv0.d0;
import so.s1;
import sw0.q0;
import t11.f;
import uk1.e;
import yk1.m;
import yq0.b0;
import yq0.z;
import zp.y0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu11/c;", "Lyq0/b0;", "", "Lq11/d;", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends b0<Object> implements d {
    public static final /* synthetic */ int D0 = 0;
    public GestaltButton A0;
    public GestaltText B0;
    public final d4 C0 = d4.PIN_EDIT;

    /* renamed from: u0, reason: collision with root package name */
    public s1 f119997u0;

    /* renamed from: v0, reason: collision with root package name */
    public e f119998v0;

    /* renamed from: w0, reason: collision with root package name */
    public bh.b f119999w0;

    /* renamed from: x0, reason: collision with root package name */
    public k f120000x0;

    /* renamed from: y0, reason: collision with root package name */
    public q11.c f120001y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltButton f120002z0;

    public c() {
        this.E = ry1.d.pin_edit_generic_fragment;
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        hf0.b.k(getView());
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(q11.b.VIEW_TYPE_TEXT_IMAGE_COMPOUND.getViewType(), new q0(requireContext, 15));
        adapter.G(q11.b.VIEW_TYPE_TEXT_INPUT.getViewType(), new q0(requireContext, 16));
        adapter.G(q11.b.VIEW_TYPE_ACTIONABLE_FIELD.getViewType(), new q0(requireContext, 17));
        adapter.G(q11.b.VIEW_TYPE_DIVIDER.getViewType(), new q0(requireContext, 18));
        adapter.G(q11.b.VIEW_TYPE_DESC_DETAIL_WIDGET.getViewType(), new q0(requireContext, 19));
    }

    public final void R8(boolean z13) {
        if (z13) {
            GestaltButton gestaltButton = this.A0;
            if (gestaltButton == null) {
                Intrinsics.r("publishButton");
                throw null;
            }
            gestaltButton.d(b.f119994k);
        } else {
            GestaltButton gestaltButton2 = this.A0;
            if (gestaltButton2 == null) {
                Intrinsics.r("publishButton");
                throw null;
            }
            gestaltButton2.d(b.f119993j);
        }
        GestaltButton gestaltButton3 = this.f120002z0;
        if (gestaltButton3 != null) {
            gestaltButton3.d(new n(z13, 17));
        } else {
            Intrinsics.r("saveButton");
            throw null;
        }
    }

    public final void S8(String title, String subTitle, String confirmText, String cancelText, q11.e confirmEvent, q11.e cancelEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(confirmText, "confirmText");
        Intrinsics.checkNotNullParameter(cancelText, "cancelText");
        Intrinsics.checkNotNullParameter(confirmEvent, "confirmEvent");
        Intrinsics.checkNotNullParameter(cancelEvent, "cancelEvent");
        w f73 = f7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        yb0.n nVar = new yb0.n(requireContext);
        nVar.w(title);
        nVar.u(subTitle);
        nVar.q(confirmText);
        nVar.m(cancelText);
        nVar.p(new y0(nVar, this, confirmEvent, 20));
        nVar.l(new d0(12, this, cancelEvent));
        f73.d(new yb0.e(nVar));
    }

    public final void T8(int i13) {
        k kVar = this.f120000x0;
        if (kVar != null) {
            kVar.k(i13);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // yk1.k
    public final m V7() {
        String v03;
        String v04;
        Navigation navigation = this.I;
        if (navigation != null && (v04 = navigation.v0("com.pinterest.EXTRA_SCHEDULED_PIN_ID")) != null) {
            this.Y = true;
            kg0 d2 = ew.d(v04);
            s1 s1Var = this.f119997u0;
            if (s1Var == null) {
                Intrinsics.r("pinEditBottomSheetPresenterFactory");
                throw null;
            }
            e eVar = this.f119998v0;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
            bh.b bVar = this.f119999w0;
            if (bVar != null) {
                Intrinsics.f(d2);
                return s1Var.a(f13, bVar.h(d2));
            }
            Intrinsics.r("editablePinWrapperProvider");
            throw null;
        }
        Navigation navigation2 = this.I;
        if (navigation2 == null || (v03 = navigation2.v0("com.pinterest.EXTRA_PIN_ID")) == null) {
            throw new IllegalStateException();
        }
        f30 c13 = ew.c(v03);
        s1 s1Var2 = this.f119997u0;
        if (s1Var2 == null) {
            Intrinsics.r("pinEditBottomSheetPresenterFactory");
            throw null;
        }
        e eVar2 = this.f119998v0;
        if (eVar2 == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f14 = ((uk1.a) eVar2).f(s7(), "");
        bh.b bVar2 = this.f119999w0;
        if (bVar2 != null) {
            Intrinsics.f(c13);
            return s1Var2.a(f14, bVar2.g(c13, z7()));
        }
        Intrinsics.r("editablePinWrapperProvider");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF50136o() {
        return this.C0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, ry1.c.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ry1.c.delete_button);
        final int i13 = 0;
        ((GestaltIconButton) findViewById).u(new gm1.a(this) { // from class: u11.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f119992b;

            {
                this.f119992b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                q11.c cVar;
                int i14 = i13;
                c this$0 = this.f119992b;
                switch (i14) {
                    case 0:
                        int i15 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar = this$0.f120001y0) != null) {
                            ((f) cVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar2 = this$0.f120001y0;
                        if (cVar2 != null) {
                            ((f) cVar2).G3();
                            break;
                        }
                        break;
                    case 2:
                        int i17 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar3 = this$0.f120001y0;
                        if (cVar3 != null) {
                            ((f) cVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i18 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "also(...)");
        final int i14 = 1;
        this.f120002z0 = ((GestaltButton) onCreateView.findViewById(ry1.c.save_button)).e(new gm1.a(this) { // from class: u11.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f119992b;

            {
                this.f119992b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                q11.c cVar;
                int i142 = i14;
                c this$0 = this.f119992b;
                switch (i142) {
                    case 0:
                        int i15 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar = this$0.f120001y0) != null) {
                            ((f) cVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar2 = this$0.f120001y0;
                        if (cVar2 != null) {
                            ((f) cVar2).G3();
                            break;
                        }
                        break;
                    case 2:
                        int i17 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar3 = this$0.f120001y0;
                        if (cVar3 != null) {
                            ((f) cVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i18 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        this.A0 = ((GestaltButton) onCreateView.findViewById(ry1.c.publish_button)).e(new gm1.a(this) { // from class: u11.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f119992b;

            {
                this.f119992b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                q11.c cVar;
                int i142 = i15;
                c this$0 = this.f119992b;
                switch (i142) {
                    case 0:
                        int i152 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar = this$0.f120001y0) != null) {
                            ((f) cVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i16 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar2 = this$0.f120001y0;
                        if (cVar2 != null) {
                            ((f) cVar2).G3();
                            break;
                        }
                        break;
                    case 2:
                        int i17 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar3 = this$0.f120001y0;
                        if (cVar3 != null) {
                            ((f) cVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i18 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = onCreateView.findViewById(ry1.c.pin_edit_page_header);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.B0 = (GestaltText) findViewById2;
        final int i16 = 3;
        ((GestaltIconButton) onCreateView.findViewById(ry1.c.pin_edit_back_btn)).u(new gm1.a(this) { // from class: u11.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f119992b;

            {
                this.f119992b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                q11.c cVar;
                int i142 = i16;
                c this$0 = this.f119992b;
                switch (i142) {
                    case 0:
                        int i152 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof l) && (cVar = this$0.f120001y0) != null) {
                            ((f) cVar).z3();
                            break;
                        }
                        break;
                    case 1:
                        int i162 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar2 = this$0.f120001y0;
                        if (cVar2 != null) {
                            ((f) cVar2).G3();
                            break;
                        }
                        break;
                    case 2:
                        int i17 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q11.c cVar3 = this$0.f120001y0;
                        if (cVar3 != null) {
                            ((f) cVar3).F3();
                            break;
                        }
                        break;
                    default:
                        int i18 = c.D0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                }
            }
        });
        return onCreateView;
    }
}

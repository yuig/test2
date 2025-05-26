package nq1;

import a.z0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import dl1.s;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import pk.a0;
import so.r;
import we1.a2;
import xk2.k;
import xk2.m;
import xk2.n;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnq1/e;", "Lyk1/k;", "Llq1/b;", "<init>", "()V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a implements lq1.b {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f91820u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public r f91821j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f91822k0;

    /* renamed from: l0, reason: collision with root package name */
    public hf0.c f91823l0;

    /* renamed from: m0, reason: collision with root package name */
    public View f91824m0;

    /* renamed from: n0, reason: collision with root package name */
    public ViewGroup f91825n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f91826o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f91827p0;

    /* renamed from: q0, reason: collision with root package name */
    public TableLayout f91828q0;

    /* renamed from: r0, reason: collision with root package name */
    public final k f91829r0 = m.a(n.NONE, new c(this, 2));

    /* renamed from: s0, reason: collision with root package name */
    public final v f91830s0 = m.b(new c(this, 1));

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f91831t0;

    public e() {
        this.E = fq1.c.idea_pin_ingredient_or_supply_bottom_sheet_fragment;
        this.f91831t0 = d4.PIN;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Object X0 = navigation != null ? navigation.X0() : null;
        s sVar = X0 instanceof s ? (s) X0 : null;
        uk1.e eVar = this.f91822k0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(this.f91831t0, null, null, g0.PIN_STORY_PIN_PAGE, null);
        r rVar = this.f91821j0;
        if (rVar != null) {
            return rVar.a(sVar, g13);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    public final ca2.e b8() {
        return (ca2.e) this.f91830s0.getValue();
    }

    public final void c8() {
        if (this.f91823l0 == null) {
            Intrinsics.r("deviceInfoProvider");
            throw null;
        }
        ca2.e.i(b8(), "navigation", hf0.b.f69003c - b8().g(), null, 4);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF91831t0() {
        return this.f91831t0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.L = false;
        this.M = false;
        super.onCreate(bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        GestaltIconButton gestaltIconButton;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(fq1.b.idea_pin_ingredient_or_supply_bottom_sheet_background);
        findViewById.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f91824m0 = findViewById;
        View findViewById2 = onCreateView.findViewById(fq1.b.header_placeholder_view);
        ViewGroup viewGroup2 = (ViewGroup) findViewById2;
        Context context = getContext();
        if (context != null) {
            gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
            gestaltIconButton.t(d.f91816j);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int W = bs1.c.W(gestaltIconButton, eo1.c.space_200);
            layoutParams.setMarginStart(W);
            layoutParams.topMargin = W;
            layoutParams.gravity = 8388627;
            gestaltIconButton.setLayoutParams(layoutParams);
            final int i13 = 1;
            gestaltIconButton.u(new gm1.a(this) { // from class: nq1.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f91813b;

                {
                    this.f91813b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i14 = i13;
                    e this$0 = this.f91813b;
                    switch (i14) {
                        case 0:
                            int i15 = e.f91820u0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.c8();
                            break;
                        default:
                            int i16 = e.f91820u0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof l) {
                                this$0.c8();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            gestaltIconButton = null;
        }
        viewGroup2.addView(gestaltIconButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f91825n0 = viewGroup2;
        View findViewById3 = onCreateView.findViewById(fq1.b.bottom_sheet_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f91826o0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(fq1.b.metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f91827p0 = (GestaltText) findViewById4;
        View findViewById5 = onCreateView.findViewById(fq1.b.ingredients_or_supplies_table);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f91828q0 = (TableLayout) findViewById5;
        View findViewById6 = onCreateView.findViewById(fq1.b.close_bottom_sheet_button);
        final int i14 = 0;
        ((GestaltButton) findViewById6).e(new gm1.a(this) { // from class: nq1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f91813b;

            {
                this.f91813b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                e this$0 = this.f91813b;
                switch (i142) {
                    case 0:
                        int i15 = e.f91820u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.c8();
                        break;
                    default:
                        int i16 = e.f91820u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.c8();
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        ca2.e b83 = b8();
        b83.m(onCreateView.findViewById(fq1.b.idea_pin_ingredient_or_supply_bottom_sheet));
        int W2 = bs1.c.W(onCreateView, fq1.a.idea_pin_list_bottom_sheet_minimum_height);
        hf0.c cVar = this.f91823l0;
        if (cVar == null) {
            Intrinsics.r("deviceInfoProvider");
            throw null;
        }
        int i15 = hf0.b.f69003c;
        if (cVar == null) {
            Intrinsics.r("deviceInfoProvider");
            throw null;
        }
        b83.n(Math.max(W2, i15 - ((hf0.b.f69002b * 16) / 9)));
        b83.o(0);
        NestedScrollView nestedScrollView = (NestedScrollView) onCreateView.findViewById(fq1.b.idea_pin_list_bottom_sheet_scroll_view);
        Intrinsics.f(nestedScrollView);
        nestedScrollView.A = new z0(this, 27);
        onCreateView.setOnClickListener(new a2(this, 28));
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b8().l();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
    }
}

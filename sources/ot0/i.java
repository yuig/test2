package ot0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.brio.widget.progress.LoadingView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import dl1.t;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import om0.m1;
import om1.l;
import so.x7;
import tj0.s;
import x02.x0;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lot0/i;", "Lyq0/b0;", "", "Lot0/d;", "Lot0/c;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends a<Object> implements d, c {
    public static final /* synthetic */ int I0 = 0;
    public ag1.b A0;
    public x7 B0;
    public i92.k C0;
    public x0 D0;
    public LoadingView E0;
    public GestaltTextField F0;
    public k G0;
    public k H0;

    /* renamed from: z0, reason: collision with root package name */
    public t f97527z0;

    public i() {
        this.E = aq1.f.layout_idea_pin_creation_board_sticker_picker;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(0, new m1(9, requireContext, this));
    }

    @Override // yk1.k
    public final m V7() {
        x7 x7Var = this.B0;
        if (x7Var == null) {
            Intrinsics.r("ideaPinBoardStickerPickerFactory");
            throw null;
        }
        k a13 = x7Var.a(new s(b7(), 1), this);
        this.H0 = a13;
        return a13;
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void deactivate() {
        GestaltTextField gestaltTextField = this.F0;
        if (gestaltTextField == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        hf0.b.k(gestaltTextField);
        super.deactivate();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF53238r0() {
        Navigation navigation = this.I;
        d4 f49944f = navigation != null ? navigation.getF49944f() : null;
        return f49944f == null ? d4.UNKNOWN_VIEW : f49944f;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.back_button);
        final int i13 = 0;
        ((GestaltIconButton) findViewById).u(new gm1.a(this) { // from class: ot0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f97520b;

            {
                this.f97520b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                k kVar;
                int i14 = i13;
                i this$0 = this.f97520b;
                switch (i14) {
                    case 0:
                        int i15 = i.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i16 = i.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.i) && (kVar = this$0.G0) != null) {
                            kVar.u3(((xn1.i) it).f135454c);
                            break;
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(aq1.d.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.E0 = (LoadingView) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.board_sticker_picker_search_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById3;
        this.F0 = gestaltTextField;
        if (gestaltTextField == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        final int i14 = 1;
        gestaltTextField.Z(new gm1.a(this) { // from class: ot0.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f97520b;

            {
                this.f97520b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                k kVar;
                int i142 = i14;
                i this$0 = this.f97520b;
                switch (i142) {
                    case 0:
                        int i15 = i.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            break;
                        }
                        break;
                    default:
                        int i16 = i.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof xn1.i) && (kVar = this$0.G0) != null) {
                            kVar.u3(((xn1.i) it).f135454c);
                            break;
                        }
                        break;
                }
            }
        });
        return onCreateView;
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LoadingView loadingView = this.E0;
        if (loadingView == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        se0.f.Companion.getClass();
        loadingView.g2(se0.e.a(state));
    }
}

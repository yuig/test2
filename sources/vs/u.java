package vs;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.grid.PinterestRecyclerView;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvs/u;", "Lnl1/d;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class u extends i0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f126516h0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public i92.k f126517c0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f126518d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltSpinner f126519e0;

    /* renamed from: f0, reason: collision with root package name */
    public PinterestRecyclerView f126520f0;

    /* renamed from: g0, reason: collision with root package name */
    public b f126521g0;

    public u() {
        int i13 = 2;
        xk2.k q13 = jq.b.q(2, new q1(this, 3), xk2.n.NONE);
        this.f126518d0 = a1.s(this, k0.f80436a.b(h0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
    }

    public final h0 Y7() {
        return (h0) this.f126518d0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF99380v0() {
        return d4.ABOUT_ADS;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = ps.q.ads_debugger_fragment;
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        Y7().h(f49940b);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(ps.p.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f126519e0 = (GestaltSpinner) findViewById;
        View findViewById2 = v13.findViewById(ps.p.ad_debug_info);
        PinterestRecyclerView pinterestRecyclerView = (PinterestRecyclerView) findViewById2;
        final int i13 = 1;
        androidx.recyclerview.widget.b0 b0Var = new androidx.recyclerview.widget.b0(pinterestRecyclerView.getContext(), 1);
        b0Var.i(bs1.c.f0(pinterestRecyclerView, eo1.d.brio_divider_super_light_gray, null, null, 6));
        pinterestRecyclerView.a(b0Var);
        pinterestRecyclerView.a(new eb2.k(bs1.c.W(pinterestRecyclerView, eo1.c.space_200), bs1.c.W(pinterestRecyclerView, eo1.c.space_100), bs1.c.W(pinterestRecyclerView, eo1.c.space_200), bs1.c.W(pinterestRecyclerView, eo1.c.space_100)));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f126520f0 = pinterestRecyclerView;
        final int i14 = 0;
        ((GestaltIconButton) v13.findViewById(ps.p.ad_debug_cancel)).u(new gm1.a(this) { // from class: vs.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f126502b;

            {
                this.f126502b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i14;
                u this$0 = this.f126502b;
                switch (i15) {
                    case 0:
                        int i16 = u.f126516h0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.Y7().f126487d.e().a(i.f126488a);
                            break;
                        }
                        break;
                    default:
                        int i17 = u.f126516h0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof cn1.q) {
                            l82.c e13 = this$0.Y7().f126487d.e();
                            String str = ((cn1.q) it).f28232c;
                            if (str == null) {
                                str = "";
                            }
                            e13.a(new l(str));
                            break;
                        }
                        break;
                }
            }
        });
        ((GestaltSearchField) v13.findViewById(ps.p.ad_debug_search)).a0(q.f126503j).g0(new gm1.a(this) { // from class: vs.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f126502b;

            {
                this.f126502b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i15 = i13;
                u this$0 = this.f126502b;
                switch (i15) {
                    case 0:
                        int i16 = u.f126516h0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof om1.l) {
                            this$0.Y7().f126487d.e().a(i.f126488a);
                            break;
                        }
                        break;
                    default:
                        int i17 = u.f126516h0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof cn1.q) {
                            l82.c e13 = this$0.Y7().f126487d.e();
                            String str = ((cn1.q) it).f28232c;
                            if (str == null) {
                                str = "";
                            }
                            e13.a(new l(str));
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) v13.findViewById(ps.p.bottom_buttons);
        gestaltButtonGroup.b(new bp.j(6, gestaltButtonGroup, this));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new t(this, null), 3);
    }
}

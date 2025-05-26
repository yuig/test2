package q01;

import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RowsWithVariableColumnsLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.xc0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq01/p;", "Lyq0/b0;", "", "Lm01/b;", "<init>", "()V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p extends a<Object> implements m01.b {
    public static final /* synthetic */ int E0 = 0;
    public View B0;
    public p01.i C0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f101829z0;
    public final xk2.v A0 = xk2.m.b(new n(this, 1));
    public final xk2.v D0 = xk2.m.b(new n(this, 2));

    public p() {
        this.Y = true;
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(18992131, new n(this, 3));
    }

    public final void U8(String str) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        View view = this.B0;
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null) {
            alpha.start();
        }
        ca2.e.i(V8(), str, 0.0f, null, 6);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f101829z0;
        if (eVar != null) {
            return new p01.i(((uk1.a) eVar).g(), p7(), (m01.a) this.D0.getValue());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final ca2.e V8() {
        return (ca2.e) this.A0.getValue();
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        U8("navigation");
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getE0() {
        return d4.RELATED_PINS_FILTER_OPTIONS_DRAWER;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(n80.d.fragment_related_pins_filter_options_sheet, n80.c.bottom_sheet_recycler_view);
    }

    @Override // yq0.t
    public final v0 n8() {
        return new v0(new RowsWithVariableColumnsLayoutManager(new cp.b(this, 28)));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Navigation navigation = this.I;
        if ((navigation != null ? navigation.X0() : null) == null) {
            D5();
        } else {
            this.L = false;
            super.onCreate(bundle);
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        V8().l();
        super.onDestroyView();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        v13.setOnClickListener(new com.pinterest.feature.home.view.c(this, 14));
        V8().m(v13.findViewById(n80.c.bottom_sheet_with_grid));
        this.B0 = v13.findViewById(n80.c.scrim_view);
        ((GestaltIconButton) v13.findViewById(n80.c.bottom_sheet_close_button)).u(new np0.h(this, 27));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.space_100);
        a8(new eb2.k(0, 0, dimensionPixelOffset, dimensionPixelOffset));
    }

    @Override // yq0.t, yk1.n
    public final void setLoadState(yk1.i state) {
        View view;
        Intrinsics.checkNotNullParameter(state, "state");
        super.setLoadState(state);
        if (state != yk1.i.LOADED || (view = getView()) == null) {
            return;
        }
        view.post(new m(this, 0));
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        xc0 a13 = ((m01.a) this.D0.getValue()).a();
        String j13 = a13 != null ? a13.j() : null;
        if (j13 != null) {
            return z0.f(new Pair("selected_filter_option_name", j13));
        }
        return null;
    }
}

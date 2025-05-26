package q71;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.navigation.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.m3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq71/d;", "Lq71/x;", "<init>", "()V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends h {
    public uk1.e S0;
    public m3 T0;
    public final xk2.v U0 = xk2.m.b(new c(this, 0));

    @Override // nl1.d, ku1.k
    public final void F6(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        xk2.v vVar = this.U0;
        if (((nl1.d) vVar.getValue()) instanceof d) {
            super.F6(navigation);
            return;
        }
        nl1.d dVar = (nl1.d) vVar.getValue();
        if (dVar != null) {
            dVar.F6(navigation);
        }
    }

    @Override // q71.x, k71.o
    public final void P2(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        xk2.v vVar = this.U0;
        if (((nl1.d) vVar.getValue()) instanceof d) {
            D5();
            return;
        }
        nl1.d dVar = (nl1.d) vVar.getValue();
        if (dVar != null) {
            dVar.D5();
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new c(this, 1));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        m3 m3Var = this.T0;
        if (m3Var == null) {
            Intrinsics.r("environmentFactory");
            throw null;
        }
        String str = this.E0;
        uk1.e eVar = this.S0;
        if (eVar != null) {
            return new o71.i(m3Var.a(str, ((uk1.a) eVar).f(s7(), ""), new org.chromium.net.y(), new z61.b()));
        }
        Intrinsics.r("pinalyticsFactory");
        throw null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H0 = Integer.valueOf(m60.x0.search);
        Z8(false);
    }

    @Override // q71.x, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }

    @Override // q71.x, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        view.setPaddingRelative(view.getPaddingStart(), getResources().getDimensionPixelSize(n42.a.search_typeahead_collage_top_margin), view.getPaddingEnd(), view.getPaddingBottom());
    }
}

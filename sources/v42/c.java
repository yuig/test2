package v42;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.u0;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv42/c;", "Lwk1/k;", "Ldl1/s;", "Ls42/a;", "Lnr0/j;", "<init>", "()V", "selectPinsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class c extends e<s> implements s42.a {
    public boolean T0;
    public final boolean R0 = true;
    public int S0 = Integer.MAX_VALUE;
    public final v U0 = xk2.m.b(new b(this, 0));

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(66, dl2.b.m2(s7(), W8(), new b(this, 1)));
        adapter.G(67, new b(this, 2));
        if (this.R0) {
            adapter.G(68, new b(this, 3));
        }
        adapter.A(true);
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return getResources().getInteger(u0.board_section_select_pins_grid_cols);
    }

    /* renamed from: j9 */
    public abstract GestaltText getF57496j1();

    /* renamed from: k9 */
    public abstract FrameLayout getF57497k1();

    @Override // sq0.e, yq0.t
    public final g2 l8() {
        return new androidx.recyclerview.widget.s();
    }

    public final boolean l9() {
        FrameLayout f57497k1 = getF57497k1();
        return f57497k1 != null && f57497k1.getVisibility() == 0;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        v0 n83 = super.n8();
        l2 l2Var = n83.f19650a;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager != null) {
            pinterestStaggeredGridLayoutManager.g1();
        }
        return n83;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.R0) {
            A8((a) this.U0.getValue());
        }
        super.onDestroyView();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.R0) {
            b8((a) this.U0.getValue());
        }
        v8();
    }
}

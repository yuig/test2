package p82;

import a7.e;
import android.os.Bundle;
import android.view.View;
import com.pinterest.ui.grid.PinterestRecyclerView;
import hn1.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mm1.d;
import mm1.k;
import o82.v2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp82/a;", "Lo82/v2;", "<init>", "()V", "stateBasedRecyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class a extends v2 {
    public final int G0 = tk1.b.gestalt_sheet_multisection_content;
    public final boolean H0 = true;
    public final boolean I0 = true;
    public final o J0 = o.DEFAULT;
    public k K0;

    public abstract Function0 h9();

    /* renamed from: i9 */
    public int getF111192c1() {
        return 0;
    }

    /* renamed from: j9, reason: from getter */
    public int getG0() {
        return this.G0;
    }

    @Override // yq0.t
    public final e m8() {
        e eVar = new e(tk1.b.gestalt_sheet_fragment, tk1.a.p_recycler_view);
        eVar.f979c = tk1.a.empty_state_container;
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int g03 = getG0();
        int f111192c1 = getF111192c1();
        Function0 h93 = h9();
        k kVar = new k(this, new d(g03, false, 0, f111192c1, false, false, this.H0, this.I0, h93, this.J0));
        kVar.l();
        this.K0 = kVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        k kVar = this.K0;
        if (kVar == null) {
            Intrinsics.r("delegate");
            throw null;
        }
        kVar.f().d();
        super.onDestroyView();
    }

    @Override // yq0.t
    public final PinterestRecyclerView t8(View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        k kVar = this.K0;
        if (kVar != null) {
            kVar.k(parentView);
            return super.t8(parentView);
        }
        Intrinsics.r("delegate");
        throw null;
    }
}

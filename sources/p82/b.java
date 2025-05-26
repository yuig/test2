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
import o82.i3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp82/b;", "Lo82/i3;", "<init>", "()V", "stateBasedRecyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b extends i3 {
    public final int A0 = tk1.b.gestalt_sheet_multisection_content;
    public final boolean B0 = true;
    public final boolean C0 = true;
    public final o D0 = o.DEFAULT;
    public k E0;

    public abstract Function0 Y8();

    /* renamed from: Z8 */
    public int getU0() {
        return 0;
    }

    /* renamed from: a9, reason: from getter */
    public int getA0() {
        return this.A0;
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
        int a03 = getA0();
        int u03 = getU0();
        Function0 Y8 = Y8();
        k kVar = new k(this, new d(a03, false, 0, u03, false, false, this.B0, this.C0, Y8, this.D0));
        kVar.l();
        this.E0 = kVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        k kVar = this.E0;
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
        k kVar = this.E0;
        if (kVar != null) {
            kVar.k(parentView);
            return super.t8(parentView);
        }
        Intrinsics.r("delegate");
        throw null;
    }
}

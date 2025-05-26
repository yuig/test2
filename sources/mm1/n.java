package mm1;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmm1/n;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwk1/k;", "<init>", "()V", "fragmentLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class n<T> extends wk1.k<T> {
    public final int M0 = tk1.b.gestalt_sheet_multisection_content;
    public final boolean N0 = true;
    public final boolean O0 = true;
    public final hn1.o P0 = hn1.o.DEFAULT;
    public k Q0;

    public final void g9(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        k kVar = this.Q0;
        if (kVar != null) {
            kVar.i().T(nextState);
        } else {
            Intrinsics.r("delegate");
            throw null;
        }
    }

    public abstract Function0 h9();

    /* renamed from: i9 */
    public int getF108113b1() {
        return 0;
    }

    /* renamed from: j9 */
    public int getF108114c1() {
        return 0;
    }

    /* renamed from: k9, reason: from getter */
    public int getW0() {
        return this.M0;
    }

    public boolean l9() {
        return this instanceof tj0.h;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(tk1.b.gestalt_sheet_fragment, tk1.a.p_recycler_view);
        eVar.f979c = tk1.a.empty_state_container;
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int w03 = getW0();
        boolean l93 = l9();
        int f108114c1 = getF108114c1();
        int f108113b1 = getF108113b1();
        Function0 h93 = h9();
        k kVar = new k(this, new d(w03, l93, f108114c1, f108113b1, false, false, this.N0, this.O0, h93, this.P0));
        kVar.l();
        this.Q0 = kVar;
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        k kVar = this.Q0;
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
        k kVar = this.Q0;
        if (kVar != null) {
            kVar.k(parentView);
            return super.t8(parentView);
        }
        Intrinsics.r("delegate");
        throw null;
    }
}

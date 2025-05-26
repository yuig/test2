package l11;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.feature.pin.create.view.HeaderCell;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f81421b;

    public i(j jVar, int i13) {
        this.f81420a = i13;
        this.f81421b = jVar;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        int i15 = this.f81420a;
        j jVar = this.f81421b;
        switch (i15) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i14 > 0) {
                    jVar.s7().N(f1.SCROLL, u0.BOARD_PICKER, g0.MODAL_ADD_PIN, null, false);
                    jVar.A8(this);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                float dimension = jVar.getResources().getDimension(d70.b.lego_board_action_toolbar_elevation);
                if (recyclerView.canScrollVertically(-1)) {
                    HeaderCell headerCell = jVar.A1;
                    if (headerCell == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    headerCell.setElevation(dimension);
                } else {
                    HeaderCell headerCell2 = jVar.A1;
                    if (headerCell2 == null) {
                        Intrinsics.r("headerView");
                        throw null;
                    }
                    headerCell2.setElevation(0.0f);
                }
                if (jVar.f81448z1 != null) {
                    if (recyclerView.canScrollVertically(1)) {
                        View view = jVar.f81448z1;
                        if (view == null) {
                            return;
                        }
                        view.setVisibility(0);
                        return;
                    }
                    View view2 = jVar.f81448z1;
                    if (view2 == null) {
                        return;
                    }
                    view2.setVisibility(8);
                    return;
                }
                return;
        }
    }
}

package d61;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ar0.s;
import kotlin.jvm.internal.Intrinsics;
import wg1.j;
import wg1.p;

/* loaded from: classes5.dex */
public final class i extends s {
    @Override // ar0.s
    public final void l(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof j) {
            ((j) view).l6(0L, false);
        }
    }

    @Override // ar0.s
    public final void m(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof j) {
            j jVar = (j) view;
            jVar.l6(4000L, true);
            ViewPager viewPager = jVar.f129795q;
            xa.a aVar = viewPager.f19892e;
            p pVar = aVar instanceof p ? (p) aVar : null;
            if (pVar != null) {
                int i13 = viewPager.f19893f;
                int b13 = pVar.b();
                for (int i14 = 0; i14 < b13; i14++) {
                    if (i14 <= i13 && i14 >= i13) {
                        pVar.o(i14);
                    }
                }
            }
        }
    }
}

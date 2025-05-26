package zy;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface m {
    default void a(RecyclerView recyclerView, boolean z13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    default void b(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Iterator it = impressions.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
    }

    void c(Object obj);

    default void d() {
    }

    default void e(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
    }

    default void f(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    default void g(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Iterator it = impressions.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    default void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}

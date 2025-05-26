package yq0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface u {
    default void E(d0 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    void F(d0 d0Var, RecyclerView recyclerView, int i13);

    default void K(d0 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    default void o(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }
}

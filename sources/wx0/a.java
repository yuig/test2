package wx0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sx0.b;

/* loaded from: classes5.dex */
public final class a extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f131197a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f131198b;

    public a(int i13, b shouldSubtractSpaceFromFirstItem) {
        Intrinsics.checkNotNullParameter(shouldSubtractSpaceFromFirstItem, "shouldSubtractSpaceFromFirstItem");
        this.f131197a = i13;
        this.f131198b = shouldSubtractSpaceFromFirstItem;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int i13;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(outRect, view, parent, state);
        parent.getClass();
        int r13 = RecyclerView.r1(view);
        if (r13 == 0) {
            if (((Boolean) this.f131198b.invoke(Integer.valueOf(r13))).booleanValue()) {
                i13 = -this.f131197a;
                outRect.top = i13;
            }
        }
        i13 = 0;
        outRect.top = i13;
    }
}

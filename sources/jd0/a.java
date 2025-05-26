package jd0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.w2;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinEmptyStateView;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinRow;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75481c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75483e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        this(0, 0, 0, i13, 0);
        this.f75479a = 0;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int i13 = this.f75479a;
        int i14 = this.f75483e;
        int i15 = this.f75481c;
        int i16 = this.f75482d;
        int i17 = this.f75480b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                int b13 = state.b();
                if (b13 > 0) {
                    parent.getClass();
                    if (RecyclerView.r1(view) == b13 - 1) {
                    }
                }
                if (!(view instanceof CreatorHubRecentPinRow) && !(view instanceof j) && !(view instanceof CreatorHubRecentPinEmptyStateView)) {
                    super.f(outRect, view, parent, state);
                    outRect.set(i17, i15, i16, i14);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.f(outRect, view, parent, state);
                parent.getClass();
                int r13 = RecyclerView.r1(view);
                l2 l2Var = parent.f19242n;
                Intrinsics.f(l2Var);
                int P = l2Var.P();
                if (r13 > 0) {
                    outRect.left = i17;
                } else {
                    outRect.left = i16;
                }
                if (r13 >= P - 1) {
                    outRect.right = i14;
                    break;
                } else {
                    outRect.right = i15;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i13, int i14) {
        this(0, i13, 0, 0, 1);
        this.f75479a = 1;
    }

    public a(int i13, int i14, int i15, int i16, int i17) {
        this.f75479a = i17;
        this.f75480b = i13;
        this.f75481c = i14;
        this.f75482d = i15;
        this.f75483e = i16;
    }
}

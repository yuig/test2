package ar0;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.n0;
import androidx.recyclerview.widget.y2;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;
import q5.m0;
import q5.v0;

/* loaded from: classes5.dex */
public final class c extends n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Set f20369d = h1.f(77, 78, 79, 80);

    /* renamed from: b, reason: collision with root package name */
    public y92.e f20370b;

    /* renamed from: c, reason: collision with root package name */
    public int f20371c = -1;

    public static int g(y2 y2Var) {
        int k13 = y2Var.k();
        return k13 != -1 ? k13 : y2Var.j();
    }

    @Override // androidx.recyclerview.widget.n0
    public final void a(RecyclerView recyclerView, y2 viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.f19717a;
        Object tag = view.getTag(ia.c.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = v0.f102521a;
            m0.l(view, floatValue);
        }
        view.setTag(ia.c.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        KeyEvent.Callback callback = viewHolder.f19717a;
        if (callback instanceof d) {
            Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.core.view.recycler.DragAndDropItemView");
            ((d) callback).onItemDragEnd(g(viewHolder));
            y92.e eVar = this.f20370b;
            if (eVar != null) {
                eVar.o3(this.f20371c, g(viewHolder));
            }
            this.f20371c = -1;
        }
    }

    @Override // androidx.recyclerview.widget.n0
    public final int d(RecyclerView recyclerView, y2 viewHolder) {
        int i13;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        KeyEvent.Callback callback = viewHolder.f19717a;
        if (callback instanceof d) {
            Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.feature.core.view.recycler.DragAndDropItemView");
            if (((d) callback).getF45303h()) {
                l2 l2Var = recyclerView.f19242n;
                if ((l2Var instanceof GridLayoutManager) || (l2Var != null && ((l2Var instanceof PinterestStaggeredGridLayoutManager) || (l2Var instanceof StaggeredGridLayoutManager) || (l2Var instanceof GridLayoutManager)))) {
                    i13 = 15;
                } else {
                    i13 = 3;
                    if ((l2Var instanceof LinearLayoutManager) && ((LinearLayoutManager) l2Var).f19157p == 0) {
                        i13 = 12;
                    }
                }
                return (i13 << 16) | i13;
            }
        }
        i13 = 0;
        return (i13 << 16) | i13;
    }

    @Override // androidx.recyclerview.widget.n0
    public final int e(RecyclerView recyclerView, int i13, int i14, long j13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i15 = i14 * 5;
        long j14 = 5 * j13;
        if (this.f19523a == -1) {
            this.f19523a = recyclerView.getResources().getDimensionPixelSize(ia.b.item_touch_helper_max_drag_scroll_per_frame);
        }
        int i16 = this.f19523a;
        int abs = Math.abs(i15);
        int signum = (int) Math.signum(i15);
        float min = Math.min(1.0f, (abs * 1.0f) / i13) - 1.0f;
        int i17 = (int) (((min * min * min * min * min) + 1.0f) * signum * i16);
        float f13 = j14 <= CameraPreview.AUTOFOCUS_INTERVAL_MILLIS ? j14 / 2000.0f : 1.0f;
        int i18 = (int) (f13 * f13 * f13 * f13 * f13 * i17);
        if (i18 == 0) {
            return i15 > 0 ? 1 : -1;
        }
        return i18;
    }

    public final void h(y92.e eVar) {
        this.f20370b = eVar;
    }
}

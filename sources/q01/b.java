package q01;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import oi.o6;
import oi.p6;
import rq.x2;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i01.t f101773a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f101774b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f101775c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f101778f;

    public b(i01.t pinCloseupView, RecyclerView closeupRecyclerView, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(pinCloseupView, "pinCloseupView");
        Intrinsics.checkNotNullParameter(closeupRecyclerView, "closeupRecyclerView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101773a = pinCloseupView;
        this.f101774b = closeupRecyclerView;
        this.f101775c = activity;
        int d2 = hf0.b.d(activity) / 10;
        this.f101776d = d2;
        this.f101777e = d2 * 9;
        this.f101778f = 3;
    }

    public final void a() {
        ((PinCloseupFragment) this.f101773a).G9();
        RecyclerView recyclerView = this.f101774b;
        l2 l2Var = recyclerView.f19242n;
        Object obj = null;
        PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
        if (pinterestStaggeredGridLayoutManager == null) {
            return;
        }
        Iterator it = d7.b.O(recyclerView).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((View) next) instanceof x2) {
                obj = next;
                break;
            }
        }
        View view = (View) obj;
        if (view == null) {
            return;
        }
        x2 x2Var = (x2) view;
        FrameLayout frameLayout = x2Var.f109653i;
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f101777e));
        }
        FrameLayout frameLayout2 = x2Var.f109653i;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int Z = l2.Z(view) - 1;
        RecyclerView recyclerView2 = this.f101774b;
        q5.x.a(recyclerView2, new p6(recyclerView2, pinterestStaggeredGridLayoutManager, this, Z, 1));
    }

    public final void b() {
        RecyclerView recyclerView = this.f101774b;
        q5.x.a(recyclerView, new o6(recyclerView, this, 12));
    }
}

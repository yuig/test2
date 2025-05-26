package hp0;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n2;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final y92.c f69842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jp0.b f69843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f69844c;

    public j(jp0.b bVar, t tVar) {
        this.f69843b = bVar;
        this.f69844c = tVar;
        Context context = bVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f69842a = new y92.c(context, new qi0.b(tVar, 1));
    }

    @Override // androidx.recyclerview.widget.n2
    public final void a(RecyclerView rv2, MotionEvent e13) {
        Intrinsics.checkNotNullParameter(rv2, "rv");
        Intrinsics.checkNotNullParameter(e13, "e");
        ViewPager2 viewPager2 = this.f69844c.f69872n0;
        if (viewPager2 != null) {
            viewPager2.dispatchTouchEvent(e13);
        } else {
            Intrinsics.r("viewPager");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public final boolean b(RecyclerView rv2, MotionEvent e13) {
        Intrinsics.checkNotNullParameter(rv2, "rv");
        Intrinsics.checkNotNullParameter(e13, "e");
        int i13 = -bs1.c.b0(this.f69843b, ps.n.ads_qcm_drawer_top_margin_collapsed_mode);
        MotionEvent obtain = MotionEvent.obtain(e13);
        obtain.offsetLocation(0.0f, i13);
        ViewPager2 viewPager2 = this.f69844c.f69872n0;
        if (viewPager2 != null) {
            viewPager2.dispatchTouchEvent(obtain);
            return this.f69842a.c(e13);
        }
        Intrinsics.r("viewPager");
        throw null;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void e(boolean z13) {
    }
}

package d91;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class n extends m implements rj0.c {

    /* renamed from: l, reason: collision with root package name */
    public final d0 f54106l;

    /* renamed from: m, reason: collision with root package name */
    public float f54107m;

    /* renamed from: n, reason: collision with root package name */
    public final float f54108n;

    /* renamed from: o, reason: collision with root package name */
    public final PinterestVideoView f54109o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, d0 pinalytics) {
        super(context, pinalytics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f54106l = pinalytics;
        this.f54107m = 1.0f;
        this.f54108n = hf0.b.f69002b;
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalytics, sc2.d.video_view_simple, 8);
        z13.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        z13.e0(bc2.m.GRID);
        z13.g0(nc2.j.AUTOPLAY_ALWAYS);
        z13.z(4);
        z13.O(true);
        this.f54101g.addView(z13);
        this.f54109o = z13;
    }

    @Override // d91.m
    public final int i(int i13) {
        float f13 = this.f54107m;
        return f13 == 0.0f ? super.i(i13) : (int) (i13 / f13);
    }

    @Override // d91.m, ky.h
    public final ky.g z() {
        return ky.g.ITEM_GRID;
    }
}

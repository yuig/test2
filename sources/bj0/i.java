package bj0;

import android.content.Context;
import android.widget.FrameLayout;
import bc2.k;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nc2.j;
import nx.d0;

/* loaded from: classes5.dex */
public final class i extends g {

    /* renamed from: f, reason: collision with root package name */
    public final PinterestVideoView f22958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, d0 pinalytics) {
        super(context, pinalytics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalytics, sc2.d.video_view_simple, 8);
        z13.z(4);
        z13.g0(j.AUTOPLAY_ALWAYS_WITH_NETWORK);
        z13.O(true);
        z13.P(true);
        z13.D0 = g0.FLOWED_PIN;
        int dimensionPixelSize = z13.getResources().getDimensionPixelSize(r0.bubble_large_size);
        z13.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.f22958f = z13;
        this.f22955b = b();
        this.f22956c = e();
        this.f22957d = a();
        addView(this.f22955b);
        addView(this.f22956c);
        addView(this.f22957d);
        addView(z13);
    }

    @Override // bj0.g, zi0.a
    public final void k1(k metadata, HashMap auxData) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        PinterestVideoView pinterestVideoView = this.f22958f;
        pinterestVideoView.C0.putAll(auxData);
        oc2.i.g(pinterestVideoView, metadata, null, 6);
    }
}

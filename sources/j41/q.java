package j41;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.video.core.view.PinterestVideoView;
import java.io.File;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public PinterestVideoView f74670a;

    @Override // j41.b
    public final void a(c92.n content, a dimensions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        if (content instanceof h41.d) {
            PinterestVideoView pinterestVideoView = this.f74670a;
            if (pinterestVideoView == null) {
                Intrinsics.r("video");
                throw null;
            }
            int measuredWidth = pinterestVideoView.getMeasuredWidth();
            int i13 = dimensions.f74639a;
            int i14 = dimensions.f74640b;
            if (measuredWidth != i13) {
                PinterestVideoView pinterestVideoView2 = this.f74670a;
                if (pinterestVideoView2 == null) {
                    Intrinsics.r("video");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = pinterestVideoView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i13;
                layoutParams.height = i14;
                pinterestVideoView2.setLayoutParams(layoutParams);
            }
            PinterestVideoView pinterestVideoView3 = this.f74670a;
            if (pinterestVideoView3 == null) {
                Intrinsics.r("video");
                throw null;
            }
            pinterestVideoView3.K0.V1("", (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
            PinterestVideoView pinterestVideoView4 = this.f74670a;
            if (pinterestVideoView4 == null) {
                Intrinsics.r("video");
                throw null;
            }
            h41.d dVar = (h41.d) content;
            String uid = dVar.f67631b.getName();
            Intrinsics.checkNotNullExpressionValue(uid, "getName(...)");
            bc2.c dimensions2 = new bc2.c(i13, i14);
            File videoFile = dVar.f67631b;
            Intrinsics.checkNotNullParameter(videoFile, "videoFile");
            Intrinsics.checkNotNullParameter(dimensions2, "dimensions");
            String absolutePath = videoFile.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            bc2.o oVar = new bc2.o("local_video", absolutePath, null, null, null);
            bc2.q videoTracks = new bc2.q(y0.b(new Pair("local_video", oVar)), oVar, 0L, null, null, dimensions2, null, bc2.l.ORGANIC, 344);
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            oc2.i.g(pinterestVideoView4, new bc2.k(uid, videoTracks.a(), null, null, videoTracks, null), null, 6);
        }
    }

    @Override // j41.b
    public final View b(a dimensions, Context context, d0 pinalyics) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyics, "pinalyics");
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalyics, 0, 12);
        z13.setLayoutParams(new FrameLayout.LayoutParams(dimensions.f74639a, dimensions.f74640b));
        z13.g0(nc2.j.AUTOPLAY_ALWAYS);
        z13.O(true);
        z13.P(true);
        z13.A(false);
        z13.z(0);
        this.f74670a = z13;
        return kg.p.g(z13);
    }
}

package ab2;

import androidx.media3.ui.AspectRatioFrameLayout;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final PinterestVideoView f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1760c;

    /* renamed from: d, reason: collision with root package name */
    public final nc2.j f1761d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1762e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1763f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1764g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1765h;

    /* renamed from: i, reason: collision with root package name */
    public final ic2.d f1766i;

    public m(PinterestVideoView videoView) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f1758a = videoView;
        this.f1759b = videoView.F0;
        AspectRatioFrameLayout aspectRatioFrameLayout = videoView.f18937b;
        bf.b.w(aspectRatioFrameLayout);
        this.f1760c = aspectRatioFrameLayout.f18872c;
        this.f1761d = videoView.K;
        this.f1762e = videoView.A;
        this.f1763f = videoView.getB();
        this.f1764g = videoView.f52795w;
        this.f1765h = videoView.G0;
        this.f1766i = videoView.I0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f1758a, ((m) obj).f1758a);
    }

    public final int hashCode() {
        return this.f1758a.hashCode();
    }

    public final String toString() {
        return "VideoViewProperties(videoView=" + this.f1758a + ")";
    }
}

package lo;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.media3.ui.z;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f84162a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f84163b;

    public i(WebViewYouTubePlayer youTubePlayerOwner) {
        Intrinsics.checkNotNullParameter(youTubePlayerOwner, "youTubePlayerOwner");
        this.f84162a = youTubePlayerOwner;
        this.f84163b = new Handler(Looper.getMainLooper());
    }

    @JavascriptInterface
    public final void sendApiChange() {
        this.f84163b.post(new g(this, 0));
    }

    @JavascriptInterface
    public final void sendError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f84163b.post(new z(28, this, kotlin.text.z.i(error, "2", true) ? c.INVALID_PARAMETER_IN_REQUEST : kotlin.text.z.i(error, "5", true) ? c.HTML_5_PLAYER : kotlin.text.z.i(error, "100", true) ? c.VIDEO_NOT_FOUND : kotlin.text.z.i(error, "101", true) ? c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : kotlin.text.z.i(error, "150", true) ? c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : c.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@NotNull String quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        this.f84163b.post(new z(25, this, kotlin.text.z.i(quality, "small", true) ? a.SMALL : kotlin.text.z.i(quality, "medium", true) ? a.MEDIUM : kotlin.text.z.i(quality, "large", true) ? a.LARGE : kotlin.text.z.i(quality, "hd720", true) ? a.HD720 : kotlin.text.z.i(quality, "hd1080", true) ? a.HD1080 : kotlin.text.z.i(quality, "highres", true) ? a.HIGH_RES : kotlin.text.z.i(quality, "default", true) ? a.DEFAULT : a.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@NotNull String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f84163b.post(new z(26, this, kotlin.text.z.i(rate, "0.25", true) ? b.RATE_0_25 : kotlin.text.z.i(rate, "0.5", true) ? b.RATE_0_5 : kotlin.text.z.i(rate, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, true) ? b.RATE_1 : kotlin.text.z.i(rate, "1.5", true) ? b.RATE_1_5 : kotlin.text.z.i(rate, "2", true) ? b.RATE_2 : b.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendReady() {
        this.f84163b.post(new g(this, 1));
    }

    @JavascriptInterface
    public final void sendStateChange(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f84163b.post(new z(29, this, kotlin.text.z.i(state, "UNSTARTED", true) ? d.UNSTARTED : kotlin.text.z.i(state, "ENDED", true) ? d.ENDED : kotlin.text.z.i(state, "PLAYING", true) ? d.PLAYING : kotlin.text.z.i(state, "PAUSED", true) ? d.PAUSED : kotlin.text.z.i(state, "BUFFERING", true) ? d.BUFFERING : kotlin.text.z.i(state, "CUED", true) ? d.VIDEO_CUED : d.UNKNOWN));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            this.f84163b.post(new f(this, Float.parseFloat(seconds), 0));
        } catch (NumberFormatException e13) {
            e13.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = "0";
            }
            this.f84163b.post(new f(this, Float.parseFloat(seconds), 1));
        } catch (NumberFormatException e13) {
            e13.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoId(@NotNull String videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        this.f84163b.post(new z(27, this, videoId));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@NotNull String fraction) {
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        try {
            this.f84163b.post(new f(this, Float.parseFloat(fraction), 2));
        } catch (NumberFormatException e13) {
            e13.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f84163b.post(new g(this, 2));
    }
}

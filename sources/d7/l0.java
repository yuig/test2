package d7;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.view.ViewGroup;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l0 {
    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder c() {
        return new PlaybackMetrics.Builder();
    }

    public static /* bridge */ /* synthetic */ SplashScreenView h(ViewGroup viewGroup) {
        return (SplashScreenView) viewGroup;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView i(Object obj) {
        return (SplashScreenView) obj;
    }

    public static /* bridge */ /* synthetic */ boolean r(ViewGroup viewGroup) {
        return viewGroup instanceof SplashScreenView;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof SplashScreenView;
    }
}

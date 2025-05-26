package n5;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: c, reason: collision with root package name */
    public SplashScreenView f89243c;

    @Override // n5.q
    public final void a() {
    }

    @Override // n5.q
    public final View b() {
        View iconView;
        SplashScreenView splashScreenView = this.f89243c;
        if (splashScreenView == null) {
            Intrinsics.r("platformView");
            throw null;
        }
        iconView = splashScreenView.getIconView();
        Intrinsics.f(iconView);
        return iconView;
    }

    @Override // n5.q
    public final ViewGroup c() {
        SplashScreenView splashScreenView = this.f89243c;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        Intrinsics.r("platformView");
        throw null;
    }

    @Override // n5.q
    public final void d() {
        SplashScreenView splashScreenView = this.f89243c;
        if (splashScreenView == null) {
            Intrinsics.r("platformView");
            throw null;
        }
        splashScreenView.remove();
        Activity activity = this.f89244a;
        Resources.Theme theme = activity.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        r.b(theme, decorView, new TypedValue());
    }
}

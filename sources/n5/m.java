package n5;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.google.firebase.messaging.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: i, reason: collision with root package name */
    public l f89232i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f89233j;

    /* renamed from: k, reason: collision with root package name */
    public final k f89234k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f89233j = true;
        this.f89234k = new k(this, activity);
    }

    @Override // n5.n
    public final void a() {
        Activity activity = this.f89235a;
        Resources.Theme theme = activity.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "activity.theme");
        d(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f89234k);
    }

    @Override // n5.n
    public final void b(fl.q keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
        this.f89240f = keepOnScreenCondition;
        View findViewById = this.f89235a.findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f89232i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f89232i);
        }
        l lVar = new l(this, findViewById);
        this.f89232i = lVar;
        viewTreeObserver.addOnPreDrawListener(lVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n5.j] */
    @Override // n5.n
    public final void c(final a0 exitAnimationListener) {
        SplashScreen splashScreen;
        Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
        splashScreen = this.f89235a.getSplashScreen();
        splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: n5.j
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                m this$0 = m.this;
                a0 exitAnimationListener2 = exitAnimationListener;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(exitAnimationListener2, "$exitAnimationListener");
                Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
                this$0.getClass();
                TypedValue typedValue = new TypedValue();
                Activity activity = this$0.f89235a;
                Resources.Theme theme = activity.getTheme();
                Window window = activity.getWindow();
                if (theme.resolveAttribute(R.attr.statusBarColor, typedValue, true)) {
                    window.setStatusBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(R.attr.navigationBarColor, typedValue, true)) {
                    window.setNavigationBarColor(typedValue.data);
                }
                if (theme.resolveAttribute(R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                    if (typedValue.data != 0) {
                        window.addFlags(Integer.MIN_VALUE);
                    } else {
                        window.clearFlags(Integer.MIN_VALUE);
                    }
                }
                if (theme.resolveAttribute(R.attr.enforceNavigationBarContrast, typedValue, true)) {
                    window.setNavigationBarContrastEnforced(typedValue.data != 0);
                }
                if (theme.resolveAttribute(R.attr.enforceStatusBarContrast, typedValue, true)) {
                    window.setStatusBarContrastEnforced(typedValue.data != 0);
                }
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(theme, "theme");
                r.b(theme, viewGroup, typedValue);
                viewGroup.setOnHierarchyChangeListener(null);
                window.setDecorFitsSystemWindows(this$0.f89233j);
                exitAnimationListener2.k(new h1.b(splashScreenView, activity));
            }
        });
    }
}

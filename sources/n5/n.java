package n5;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.messaging.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f89235a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f89236b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f89237c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f89238d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89239e;

    /* renamed from: f, reason: collision with root package name */
    public o f89240f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f89241g;

    /* renamed from: h, reason: collision with root package name */
    public h1.b f89242h;

    public n(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f89235a = activity;
        this.f89240f = new c3.e(3);
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme currentTheme = this.f89235a.getTheme();
        if (currentTheme.resolveAttribute(b.windowSplashScreenBackground, typedValue, true)) {
            this.f89236b = Integer.valueOf(typedValue.resourceId);
            this.f89237c = Integer.valueOf(typedValue.data);
        }
        if (currentTheme.resolveAttribute(b.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.f89238d = currentTheme.getDrawable(typedValue.resourceId);
        }
        if (currentTheme.resolveAttribute(b.splashScreenIconSize, typedValue, true)) {
            this.f89239e = typedValue.resourceId == c.splashscreen_icon_size_with_background;
        }
        Intrinsics.checkNotNullExpressionValue(currentTheme, "currentTheme");
        d(currentTheme, typedValue);
    }

    public void b(fl.q keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        this.f89240f = keepOnScreenCondition;
        View findViewById = this.f89235a.findViewById(R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new g(this, findViewById));
    }

    public void c(a0 exitAnimationListener) {
        float dimension;
        Intrinsics.checkNotNullParameter(exitAnimationListener, "exitAnimationListener");
        this.f89241g = exitAnimationListener;
        Activity activity = this.f89235a;
        h1.b bVar = new h1.b(activity);
        Integer num = this.f89236b;
        Integer num2 = this.f89237c;
        ViewGroup c13 = ((q) bVar.f66449b).c();
        if (num != null && num.intValue() != 0) {
            c13.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            c13.setBackgroundColor(num2.intValue());
        } else {
            c13.setBackground(activity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = this.f89238d;
        if (drawable != null) {
            ImageView imageView = (ImageView) c13.findViewById(e.splashscreen_icon_view);
            if (this.f89239e) {
                Drawable drawable2 = imageView.getContext().getDrawable(d.icon_background);
                dimension = imageView.getResources().getDimension(c.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new a(drawable2, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(c.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new a(drawable, dimension));
        }
        c13.addOnLayoutChangeListener(new h(0, this, bVar));
    }

    public final void d(Resources.Theme currentTheme, TypedValue typedValue) {
        int i13;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (!currentTheme.resolveAttribute(b.postSplashScreenTheme, typedValue, true) || (i13 = typedValue.resourceId) == 0) {
            return;
        }
        this.f89235a.setTheme(i13);
    }
}

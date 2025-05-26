package n5;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.a0;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f89244a;

    /* renamed from: b, reason: collision with root package name */
    public final v f89245b;

    public q(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f89244a = activity;
        this.f89245b = xk2.m.b(new a0(this, 20));
    }

    public void a() {
        View rootView = ((ViewGroup) this.f89244a.findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) this.f89245b.getValue());
        }
    }

    public View b() {
        View findViewById = c().findViewById(e.splashscreen_icon_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "splashScreenView.findVie…d.splashscreen_icon_view)");
        return findViewById;
    }

    public ViewGroup c() {
        return (ViewGroup) this.f89245b.getValue();
    }

    public void d() {
        ViewParent parent = c().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c());
        }
    }
}

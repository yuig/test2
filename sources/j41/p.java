package j41;

import android.view.View;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class p extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f74668a;

    /* renamed from: b, reason: collision with root package name */
    public final Navigation f74669b;

    public p(w eventManager, NavigationImpl navigation) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f74668a = eventManager;
        this.f74669b = navigation;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        kg.n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f74668a.d(this.f74669b);
    }
}

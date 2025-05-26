package ls0;

import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.y1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes5.dex */
public final class b extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f84618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f84619c;

    public b(d dVar, String str, int i13) {
        this.f84617a = i13;
        this.f84618b = dVar;
        this.f84619c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f84617a;
        String str = this.f84619c;
        d dVar = this.f84618b;
        switch (i13) {
            case 0:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                dVar.f84623a.d(Navigation.z0((ScreenLocation) y1.f51583d.getValue(), str));
                break;
            case 1:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                w wVar = dVar.f84623a;
                NavigationImpl z03 = Navigation.z0((ScreenLocation) y1.f51583d.getValue(), str);
                z03.z(r41.b.GridActionUtils.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
                wVar.d(z03);
                break;
            case 2:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                g70.h.g(dVar.f84625c, str, null, null, 6);
                break;
            default:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                dVar.f84623a.d(Navigation.z0((ScreenLocation) y1.f51583d.getValue(), str));
                break;
        }
    }
}

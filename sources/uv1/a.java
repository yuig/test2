package uv1;

import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.oneBarLibrary.modals.views.BodyTypeFilterEducationView;
import com.pinterest.screens.t2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes4.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BodyTypeFilterEducationView f123184b;

    public /* synthetic */ a(BodyTypeFilterEducationView bodyTypeFilterEducationView, int i13) {
        this.f123183a = i13;
        this.f123184b = bodyTypeFilterEducationView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f123183a;
        BodyTypeFilterEducationView bodyTypeFilterEducationView = this.f123184b;
        switch (i13) {
            case 0:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                w wVar = bodyTypeFilterEducationView.f49999f;
                if (wVar == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                NavigationImpl z03 = Navigation.z0((ScreenLocation) t2.f51392a.getValue(), "https://help.pinterest.com/contact?current_page=overview&features_settings=search");
                z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
                wVar.d(z03);
                return;
            default:
                kg.n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                w wVar2 = bodyTypeFilterEducationView.f49999f;
                if (wVar2 == null) {
                    Intrinsics.r("eventManager");
                    throw null;
                }
                NavigationImpl z04 = Navigation.z0((ScreenLocation) t2.f51392a.getValue(), "https://help.pinterest.com/article/search-by-body-type-ranges");
                z04.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
                wVar2.d(z04);
                return;
        }
    }
}

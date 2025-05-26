package q11;

import android.os.Bundle;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.c3;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import m60.w;
import zp.e0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w f102041a;

    /* renamed from: b, reason: collision with root package name */
    public final j f102042b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f102043c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f102044d;

    public a(w eventManager, j navigationManager, b60.b activeUserManager, es.a adFormats) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f102041a = eventManager;
        this.f102042b = navigationManager;
        this.f102043c = activeUserManager;
        this.f102044d = adFormats;
    }

    public final void a(f30 f30Var, boolean z13) {
        String str;
        if (f30Var != null && b40.Q0(f30Var) && !((es.c) this.f102044d).M(f30Var)) {
            wy0 Q = com.bumptech.glide.d.Q(this.f102043c);
            wy0 n13 = b40.n(f30Var);
            if (n13 == null || (str = n13.getUid()) == null) {
                str = "";
            }
            if (dl2.b.S1(Q, str)) {
                ew.l(f30Var);
                ScreenLocation screenLocation = (ScreenLocation) c3.f50629a.getValue();
                Bundle bundle = new Bundle();
                bundle.putString("com.pinterest.EXTRA_PIN_ID", f30Var.getUid());
                Unit unit = Unit.f80348a;
                NavigationImpl navigation = Navigation.v1(screenLocation, bundle);
                Intrinsics.checkNotNullExpressionValue(navigation, "create(...)");
                j jVar = this.f102042b;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                jVar.m(navigation);
                return;
            }
        }
        this.f102041a.d(new v(new e0(f30Var), z13, 0L, 28));
    }
}

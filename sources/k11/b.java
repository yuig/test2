package k11;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.k3;
import i32.y0;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import rg0.s;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f78112a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f78113b;

    /* renamed from: c, reason: collision with root package name */
    public final w f78114c;

    /* renamed from: d, reason: collision with root package name */
    public final s f78115d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f78116e;

    /* renamed from: f, reason: collision with root package name */
    public f30 f78117f;

    /* renamed from: g, reason: collision with root package name */
    public f30 f78118g;

    /* renamed from: h, reason: collision with root package name */
    public final a f78119h;

    public b(Context applicationContext, d0 pinalytics, w eventManager, s experiences, c2 repinToastHelper) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        this.f78112a = applicationContext;
        this.f78113b = pinalytics;
        this.f78114c = eventManager;
        this.f78115d = experiences;
        this.f78116e = repinToastHelper;
        this.f78119h = new a(this);
    }

    public final void a() {
        this.f78114c.h(this.f78119h);
    }

    public final void b(f30 pin, f30 newPin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        this.f78117f = pin;
        this.f78118g = newPin;
        y0 y0Var = y0.ANDROID_POST_GIFT_GUIDE_REPIN_TAKEOVER;
        rg0.n b13 = ((dh0.d) this.f78115d).b(y0Var);
        if (b13 != null) {
            if (b13.f108060b == i32.l.ANDROID_EASY_GIFT_GUIDE_SAVING_UPSELL.value()) {
                ag2.e eVar = b13.f108068j;
                Intrinsics.g(eVar, "null cannot be cast to non-null type com.pinterest.experience.DisplayData");
                rg0.g gVar = (rg0.g) eVar;
                ArrayList arrayList = gVar.f108021q;
                if (arrayList != null) {
                    NavigationImpl L = Navigation.L((ScreenLocation) k3.f51028c.getValue(), "", ml1.b.NO_TRANSITION.getValue());
                    L.y0(Boolean.valueOf(gVar.f108020p), "com.pinterest.EXTRA_ANNOUNCEMENT_MODAL_SHOW_CLOSE");
                    L.y0(arrayList, "com.pinterest.EXTRA_ANNOUNCEMENT_MODAL_OBJECTS");
                    L.y0(y0Var, "com.pinterest.EXTRA_PLACEMENT_ID");
                    new Handler(Looper.getMainLooper()).post(new a11.p(2, this, L));
                    return;
                }
                return;
            }
        }
        if (b13 != null) {
            if (b13.f108060b == i32.l.EASY_GIFT_GUIDE_SAVING_MEDIA_MODAL.value()) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                Intrinsics.checkNotNullExpressionValue(hVar, "getInstance(...)");
                eh0.o.a(this.f78112a, b13, this.f78114c, hVar, null);
                return;
            }
        }
        c2.j(this.f78116e, pin, newPin, this.f78113b);
    }

    public final void c() {
        this.f78114c.j(this.f78119h);
    }
}

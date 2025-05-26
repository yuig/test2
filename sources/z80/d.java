package z80;

import android.content.Context;
import ao2.j0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import lr.z;
import s80.e5;
import s80.f5;
import s80.g5;
import s80.h5;
import s80.l7;
import u50.k0;

/* loaded from: classes5.dex */
public final class d implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final b20.c f141047a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f141048b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f141049c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f141050d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f141051e;

    public d(b20.c toastForSEP, ll.j navigator, b60.b activeUserManager, Context context, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f141047a = toastForSEP;
        this.f141048b = navigator;
        this.f141049c = activeUserManager;
        this.f141050d = context;
        this.f141051e = eventManager;
    }

    public static final void j(d dVar) {
        wy0 f13 = ((b60.d) dVar.f141049c).f();
        String uid = f13 != null ? f13.getUid() : null;
        vb0.j.f125466a.M(uid, "User id is null after saving collage draft", tb0.p.COLLAGES, new Object[0]);
        if (uid == null) {
            return;
        }
        NavigationImpl navigation = r41.k.c(r41.k.f106176a, uid, null, null, null, 30);
        navigation.m0("com.pinterest.EXTRA_PROFILE_TAB", "collages");
        u70.a bottomNavTabType = u70.a.PROFILE;
        ll.j jVar = dVar.f141048b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        jVar.g(new oh1.u(26, navigation, bottomNavTabType));
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        h5 request = (h5) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean d2 = Intrinsics.d(request, e5.f111520a);
        b20.c cVar = this.f141047a;
        if (d2) {
            b20.c.B(cVar, new k92.b(new k92.c(new k0(l7.save_draft_success_toast_with_tab), new k0(l7.save_draft_success_toast_button), null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN)), new c(this, 0), new c(this, 1), 24);
            return;
        }
        if (request instanceof f5) {
            this.f141051e.d(new i92.i(new z(this, 2)));
        } else if (request instanceof g5) {
            b20.c.B(cVar, new k92.b(new k92.c(new k0(((g5) request).f111560a), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL)), null, null, 30);
        }
    }
}

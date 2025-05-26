package rr;

import android.net.Uri;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e2 extends d0 {

    /* renamed from: i, reason: collision with root package name */
    public static final List f109738i = kotlin.collections.f0.j("setting", "settings");

    /* renamed from: j, reason: collision with root package name */
    public static final List f109739j = kotlin.collections.f0.j("profile_visibility", "profile-visibility");

    /* renamed from: g, reason: collision with root package name */
    public String f109740g;

    /* renamed from: h, reason: collision with root package name */
    public final List f109741h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(qr.h webhookDeeplinkUtil) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        this.f109741h = kotlin.collections.f0.j(y1.f109872c, w1.f109867c, s1.f109852c, x1.f109870c, z1.f109876c, a2.f109704c, u1.f109862c, t1.f109861c, c2.f109721c, r1.f109846c);
    }

    public static final void g(e2 e2Var, String str, ScreenLocation screenLocation) {
        e2Var.f109740g = str;
        NavigationImpl w13 = Navigation.w1(screenLocation);
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        e2Var.f109723a.m(w13);
    }

    public static final void h(e2 e2Var, boolean z13) {
        e2Var.f109740g = "claim_account";
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.D());
        w13.m0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE", e82.w.INSTAGRAM.getApiParam());
        w13.Y1("com.pinterest.EXTRA_IS_RECONNECT_FLOW", z13);
        e2Var.f109723a.m(w13);
    }

    @Override // rr.d0
    public final String a() {
        return this.f109740g;
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null) {
            Object obj = null;
            if (pathSegments.isEmpty()) {
                pathSegments = null;
            }
            if (pathSegments != null) {
                String str = pathSegments.get(0);
                if (!f109738i.contains(str)) {
                    if (Intrinsics.d(str, "push_settings")) {
                        b2 b2Var = b2.f109711c;
                        k.f109765u.invoke(this);
                        return;
                    } else {
                        if (Intrinsics.d(str, "connect")) {
                            v1 v1Var = v1.f109866c;
                            k.f109763s.invoke(this);
                            return;
                        }
                        return;
                    }
                }
                Iterator it = this.f109741h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Boolean) ((d2) next).f109732a.invoke(pathSegments)).booleanValue()) {
                        obj = next;
                        break;
                    }
                }
                d2 d2Var = (d2) obj;
                if (d2Var == null || (function1 = d2Var.f109733b) == null) {
                    return;
                }
                function1.invoke(this);
            }
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        List<String> pathSegments;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!this.f109723a.f104943d.e() || (pathSegments = uri.getPathSegments()) == null) {
            return false;
        }
        if (pathSegments.isEmpty()) {
            pathSegments = null;
        }
        if (pathSegments == null) {
            return false;
        }
        String str = pathSegments.get(0);
        if (!f109738i.contains(str)) {
            if (Intrinsics.d(str, "push_settings")) {
                return ((Boolean) b2.f109711c.a().invoke(pathSegments)).booleanValue();
            }
            if (Intrinsics.d(str, "connect")) {
                return ((Boolean) v1.f109866c.a().invoke(pathSegments)).booleanValue();
            }
            return false;
        }
        List list = this.f109741h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((d2) it.next()).a().invoke(pathSegments)).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}

package rr;

import android.net.Uri;
import android.os.Bundle;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n2 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f109789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(qr.h webhookDeeplinkUtil, boolean z13) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        this.f109789g = z13;
    }

    @Override // rr.d0
    public final String a() {
        return "today";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("full_screen", false);
        String queryParameter = uri.getQueryParameter("referrer");
        Integer valueOf = queryParameter != null ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.H());
        w13.z(valueOf != null ? valueOf.intValue() : c42.i.LINK.getValue(), "com.pinterest.EXTRA_TODAY_TAB_REFERRER");
        w13.Y1("com.pinterest.EXTRA_TODAY_TAB_FULL_SCREEN", true);
        qr.h hVar = this.f109723a;
        if (booleanQueryParameter) {
            hVar.r(w13);
        } else if (this.f109789g) {
            u70.a aVar = u70.a.HOME;
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRAS_KEY_INITIAL_SELECTED_TAB_LOCATION", com.pinterest.screens.g1.H());
            bundle.putInt("com.pinterest.EXTRA_TODAY_TAB_REFERRER", valueOf != null ? valueOf.intValue() : c42.i.LINK.getValue());
            Unit unit = Unit.f80348a;
            hVar.p(aVar, bundle);
        } else {
            u70.a bottomNavTabType = u70.a.SEARCH;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
            sr.f fVar = hVar.f104947h;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
            fVar.a(bottomNavTabType, null);
            hVar.r(w13);
        }
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.d(uri.getHost(), "today") && uri.getPathSegments().size() == 0) {
            return true;
        }
        return uri.getPathSegments().size() == 1 && n60.o.x(uri, 0, "today");
    }
}

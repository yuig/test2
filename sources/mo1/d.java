package mo1;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.pinterest.navigation.NavigationImpl;
import ey.d0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.e0;
import nx.o0;
import tb0.h;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final h f87806a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f87807b;

    public d(h crashReporting, e0 pinalyticsEventManager) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(pinalyticsEventManager, "pinalyticsEventManager");
        this.f87806a = crashReporting;
        this.f87807b = pinalyticsEventManager;
    }

    public static void a(d dVar, boolean z13, Intent intent, NavigationImpl navigationImpl, Bundle bundle, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            intent = null;
        }
        if ((i13 & 4) != 0) {
            navigationImpl = null;
        }
        if ((i13 & 8) != 0) {
            bundle = null;
        }
        ((o0) dVar.f87807b).c();
        d0.f60468a.clear();
        if (intent == null) {
            Context context = kb0.a.f79058b;
            Application W = f0.W();
            intent = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
            if (intent == null) {
                throw new Exception("No intent found for package name");
            }
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            intent.addFlags(32768);
            Intrinsics.checkNotNullExpressionValue(intent, "with(...)");
        }
        r70.b k03 = r70.b.f106349i.k0();
        k03.f106352b = true;
        ck2.a aVar = k03.f106355e;
        aVar.f27913a = 0;
        aVar.f27914b = "";
        intent.putExtra("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", z13);
        if (navigationImpl != null) {
            intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigationImpl);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Context context2 = kb0.a.f79058b;
        f0.W().startActivity(intent);
    }

    public final void b(Context context, String data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Uri data2 = Uri.parse(data);
        Intrinsics.checkNotNullExpressionValue(data2, "parse(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data2, "data");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(data2);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e13) {
            this.f87806a.p(e13);
        }
    }
}

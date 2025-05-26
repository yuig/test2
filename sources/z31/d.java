package z31;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i3;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import tb0.h;
import u50.r;
import y31.g0;

/* loaded from: classes5.dex */
public final class d implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f140798a;

    /* renamed from: b, reason: collision with root package name */
    public final w f140799b;

    /* renamed from: c, reason: collision with root package name */
    public final k f140800c;

    public d(Context context, w eventManager, h crashReporting, k toastUtils) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f140798a = context;
        this.f140799b = eventManager;
        this.f140800c = toastUtils;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        g0 request = (g0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        int i13 = c.f140797a[request.f136796a.f136777a.ordinal()];
        y31.c cVar = request.f136796a;
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                this.f140799b.d(Navigation.z0((ScreenLocation) i3.f50972f.getValue(), cVar.f136779c));
                return;
            }
            return;
        }
        Uri parse = Uri.parse(cVar.f136779c);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(intent.getFlags() + 268435456);
        Context context = this.f140798a;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            this.f140800c.i(context.getString(x0.generic_error));
        }
    }
}

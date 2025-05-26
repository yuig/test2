package is1;

import android.app.Activity;
import h32.f1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements c5.a {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f73637a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f73638b;

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f73639c;

    /* renamed from: d, reason: collision with root package name */
    public final l f73640d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f73641e;

    public q(Activity activity, nx.d0 pinalytics, k22.m userService, l locationUtils, Function0 onPermissionResultCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(locationUtils, "locationUtils");
        Intrinsics.checkNotNullParameter(onPermissionResultCallback, "onPermissionResultCallback");
        this.f73637a = activity;
        this.f73638b = pinalytics;
        this.f73639c = userService;
        this.f73640d = locationUtils;
        this.f73641e = onPermissionResultCallback;
    }

    @Override // c5.a
    public final void onRequestPermissionsResult(int i13, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        l lVar = this.f73640d;
        Activity activity = this.f73637a;
        nx.d0 d0Var = this.f73638b;
        lVar.a(activity, d0Var);
        nx.d0.v(d0Var, f1.LOCATION_PERMISSIONS_PROMPT, null, false, 12);
        if (!(grantResults.length == 0)) {
            if (grantResults[0] == 0) {
                nx.d0.v(d0Var, f1.LOCATION_PERMISSIONS_ACCEPT_WHILE_IN_USE, null, false, 12);
                lVar.b(activity, this.f73639c);
            } else {
                nx.d0.v(d0Var, f1.LOCATION_PERMISSIONS_DENY, null, false, 12);
            }
        }
        this.f73641e.invoke();
    }
}

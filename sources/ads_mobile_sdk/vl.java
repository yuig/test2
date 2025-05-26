package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vl implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12556a;

    public vl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12556a = context;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            Intrinsics.checkNotNullParameter("CanOpenAppGmsgHandler not enabled on R+ devices.", "message");
            ft2.a(true, "CanOpenAppGmsgHandler not enabled on R+ devices.", null);
            return Unit.f80348a;
        }
        String str = (String) map.get("package_name");
        if (str == null || str.length() == 0) {
            Intrinsics.checkNotNullParameter("Package name missing in canOpenApp GMSG.", "message");
            ft2.a(true, "Package name missing in canOpenApp GMSG.", null);
            return Unit.f80348a;
        }
        PackageManager packageManager = this.f12556a.getPackageManager();
        boolean z13 = (packageManager != null ? packageManager.getLaunchIntentForPackage(str) : null) != null;
        nm.u uVar = new nm.u();
        uVar.t(str, Boolean.valueOf(z13));
        Object a13 = ym0Var.a(uVar, "openableApp", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CAN_OPEN_APP;
    }
}

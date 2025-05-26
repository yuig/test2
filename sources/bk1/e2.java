package bk1;

import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.CookieManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f2 f23216j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(f2 f2Var, int i13) {
        super(0);
        this.f23215i = i13;
        this.f23216j = f2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f23215i;
        f2 f2Var = this.f23216j;
        switch (i13) {
            case 0:
                PackageManager packageManager = f2Var.f23223c.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
                Intrinsics.checkNotNullParameter(packageManager, "packageManager");
                Intrinsics.checkNotNullParameter(packageManager, "packageManager");
                Intrinsics.checkNotNullParameter("com.android.vending", "packageName");
                boolean z13 = true;
                try {
                    packageManager.getPackageInfo("com.android.vending", 1);
                } catch (PackageManager.NameNotFoundException unused) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                zr.b bVar = ((bs.b) f2Var.f23222b).f23840a;
                bVar.getClass();
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        try {
                            CookieManager.getInstance();
                            return !dl2.b.z1(bVar.f142746a, "com.android.chrome") ? new bs.d(bs.c.CHROME_DISABLED) : bs.e.f23844a;
                        } catch (Exception unused2) {
                            return new bs.d(bs.c.WEBVIEW_DISABLED);
                        }
                    }
                } catch (Exception unused3) {
                }
                return new bs.d(bs.c.API_LEVEL);
        }
    }
}

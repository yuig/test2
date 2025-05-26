package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class w80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f12895a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(y80 y80Var) {
        super(0);
        this.f12895a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        Context context;
        Context context2;
        ActivityInfo activityInfo;
        context = this.f12895a.f14134d;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = this.f12895a.f14134d;
        }
        y80 y80Var = this.f12895a;
        context2 = y80Var.f14134d;
        PackageManager packageManager = context2.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        ResolveInfo a13 = y80.a(y80Var, packageManager);
        if (a13 == null || (activityInfo = a13.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionCode + "." + activityInfo.packageName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}

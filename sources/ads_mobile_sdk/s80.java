package ads_mobile_sdk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class s80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f11000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(y80 y80Var) {
        super(0);
        this.f11000a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f11000a.f14134d.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        if (resolveActivity != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (resolveActivity.activityInfo.name.equals(it.next().activityInfo.name)) {
                    return Boolean.valueOf(resolveActivity.activityInfo.packageName.equals(s.k.c(this.f11000a.f14134d)));
                }
            }
        }
        return Boolean.FALSE;
    }
}

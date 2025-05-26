package zs;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.measurement.q4;
import eo1.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import l82.c;
import s.o;
import ws.h;
import xs.u;
import xs.v;

/* loaded from: classes3.dex */
public final class a {
    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = queryIntentActivities;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        Set J0 = CollectionsKt.J0(arrayList);
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities2, "queryIntentActivities(...)");
        List<ResolveInfo> list2 = queryIntentActivities2;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (!J0.contains(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, Context context, c cartingEventIntake) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cartingEventIntake, "cartingEventIntake");
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(268469248);
            intent.addCategory("android.intent.category.BROWSABLE");
            if (Build.VERSION.SDK_INT >= 30 || a(context, intent)) {
                context.startActivity(intent);
                try {
                    cartingEventIntake.a(new h(v.f135761a));
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            }
        } catch (ActivityNotFoundException unused2) {
        }
        Activity k03 = bs1.c.k0(context);
        int i13 = b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        int color = k03.getColor(i13);
        o oVar = new o();
        int i14 = color | (-16777216);
        Integer valueOf = Integer.valueOf(i14);
        s.a aVar = oVar.f110280b;
        aVar.f110242a = valueOf;
        aVar.f110244c = Integer.valueOf(i14);
        Intent intent2 = oVar.f110279a;
        intent2.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        intent2.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", 0);
        Intrinsics.checkNotNullExpressionValue(oVar, "setColorScheme(...)");
        if (k03 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) k03;
            int height = fragmentActivity.getWindow().getDecorView().getHeight();
            Rect rect = new Rect();
            fragmentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int dimensionPixelSize = (height - rect.top) - fragmentActivity.getResources().getDimensionPixelSize(eo1.c.space_200);
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = hf0.b.d(k03) + (hf0.b.f69007g / 2);
            }
            if (dimensionPixelSize <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent2.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", dimensionPixelSize);
            intent2.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 2);
        }
        q4 a13 = oVar.a();
        ((Intent) a13.f31594b).setData(Uri.parse(str));
        Intrinsics.checkNotNullExpressionValue(a13, "apply(...)");
        cartingEventIntake.a(new h(u.f135760a));
        k03.startActivityForResult((Intent) a13.f31594b, AdSize.MEDIUM_RECTANGLE_WIDTH, null);
    }
}

package com.pinterest.feature.pear.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c0.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e82.c0;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ly1.a;
import nx.d0;
import sh.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/pear/util/ApplicationSelectionReceiver;", "Lly1/a;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ApplicationSelectionReceiver extends a {
    @Override // ly1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (extras = intent.getExtras()) == null) {
            return;
        }
        Iterator<String> it = extras.keySet().iterator();
        while (it.hasNext()) {
            Object obj = extras.get(it.next());
            ComponentName componentName = obj instanceof ComponentName ? (ComponentName) obj : null;
            if (componentName != null) {
                String packageName = componentName.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                d0 a13 = f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                g0 g0Var = g0.SHEET;
                u0 u0Var = (u0) c0.f57822a.get(packageName);
                if (u0Var == null) {
                    u0Var = u0.PIN_SAVE_BUTTON;
                }
                HashMap hashMap = new HashMap();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
                hashMap.put("name", packageManager.getApplicationLabel(applicationInfo).toString());
                Unit unit = Unit.f80348a;
                d.u2(a13, null, g0Var, u0Var, hashMap, 1);
            }
        }
    }
}

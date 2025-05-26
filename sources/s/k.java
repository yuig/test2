package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final b.e f110277a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f110278b;

    public k(b.e eVar, ComponentName componentName) {
        this.f110277a = eVar;
        this.f110278b = componentName;
    }

    public static boolean a(Context context, String str, q qVar) {
        qVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, qVar, 33);
    }

    public static void b(Context context, String str) {
        if (str == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            a(applicationContext, str, new c(applicationContext));
        } catch (SecurityException unused) {
        }
    }

    public static String c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        return null;
    }

    public final r d(b bVar) {
        j jVar = new j(bVar);
        b.e eVar = this.f110277a;
        try {
            if (((b.c) eVar).B(jVar)) {
                return new r(eVar, jVar, this.f110278b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void e() {
        try {
            ((b.c) this.f110277a).F();
        } catch (RemoteException unused) {
        }
    }
}

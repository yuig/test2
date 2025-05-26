package df;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f54788a;

    static {
        String name = k1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "Validate::class.java.name");
        f54788a = name;
    }

    public static final boolean a(Context context, String redirectURI) {
        List<ResolveInfo> list;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        Iterator<ResolveInfo> it = list.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.d(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.d(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z13 = true;
        }
        return z13;
    }

    public static final void b(String arg, String name) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(name, "name");
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(a.a.k("Argument '", name, "' cannot be empty").toString());
        }
    }

    public static final void c(Collection container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        Iterator it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter("requests", "name");
        if (!(!container.isEmpty())) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void d(Object obj, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj == null) {
            throw new NullPointerException(a.a.k("Argument '", name, "' cannot be null"));
        }
    }

    public static final void e(String str, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException(a.a.k("Argument '", name, "' cannot be null or empty").toString());
        }
    }

    public static final void f() {
        if (!le.v.f83119p.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}

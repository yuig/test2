package lu1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.n;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import tb0.h;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84971a;

    /* renamed from: b, reason: collision with root package name */
    public final d f84972b;

    /* renamed from: c, reason: collision with root package name */
    public final dy.a f84973c;

    /* renamed from: d, reason: collision with root package name */
    public final h f84974d;

    public c(Context applicationContext, d activityIntentFactory, dy.a appsFlyerManager, h crashReporting) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(appsFlyerManager, "appsFlyerManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f84971a = applicationContext;
        this.f84972b = activityIntentFactory;
        this.f84973c = appsFlyerManager;
        this.f84974d = crashReporting;
    }

    public final Intent c(Context context, Uri uri, String str) {
        Intent b13 = this.f84972b.b(context, a.WEB_VIEW_ACTIVITY);
        b13.setData(uri);
        b13.putExtra("com.pinterest.EXTRA_HAS_URL", true);
        b13.putExtra("com.pinterest.EXTRA_ALLOW_REDIRECT_BACK", true);
        if (str != null && str.length() > 0) {
            b13.putExtra("com.pinterest.EXTRA_WEB_TITLE_STRING", str);
        }
        return b13;
    }

    public final Intent d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = this.f84972b.b(context, a.EXPERIMENTS_RELOADER_ACTIVITY);
        b13.setFlags(603979776);
        return b13;
    }

    public final Intent e(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = this.f84972b.b(context, a.MAIN_ACTIVITY);
        b13.setFlags(603979776);
        b13.setFlags(b13.getFlags() + 268435456);
        if (z13) {
            b13.setFlags(b13.getFlags() + 32768);
        }
        return b13;
    }

    public final Intent f() {
        Intent b13 = this.f84972b.b(this.f84971a, a.PINTEREST_ACTIVITY);
        b13.setFlags(603979776);
        return b13;
    }

    public final Intent g(Context context, u70.a bottomNavTabType, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        Intent e13 = e(context, false);
        e13.putExtra("com.pinterest.EXTRA_PENDING_TAB", bottomNavTabType.name());
        if (bundle != null) {
            e13.putExtra("com.pinterest.EXTRA_PENDING_TAB_EXTRAS", bundle);
            e13.putExtra("com.pinterest.EXTRA_IS_DEEPLINK", bundle.getBoolean("com.pinterest.EXTRA_IS_DEEPLINK", false));
        }
        return e13;
    }

    public final Intent h(Context context, Navigation navigation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intent e13 = e(context, false);
        e13.putExtra("com.pinterest.EXTRA_PENDING_TASK", navigation);
        return e13;
    }

    public final Intent i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f84972b.b(context, a.AUTHENTICATION_ACTIVITY);
    }

    public final Intent j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = this.f84972b.b(context, a.WEB_HOOK_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_SOURCE", "SOURCE_APP_NAVIGATION");
        b13.setFlags(603979776);
        return b13;
    }

    public final void k(Activity activity, boolean z13) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent e13 = c60.d.b() ? e(activity, z13) : f();
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            e13.putExtras(extras);
        }
        activity.startActivity(e13);
    }

    public final void l(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                context.startActivity(intent);
            } catch (Exception e13) {
                this.f84974d.o("Error creating Intent & starting activity from the URI " + uri, e13);
                Unit unit = Unit.f80348a;
            }
        }
    }

    public final void m(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || z.j(str)) {
            return;
        }
        l(context, Uri.parse(str));
    }

    public final void n(n context, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent b13 = this.f84972b.b(context, a.NUX_ACTIVITY);
        if (str != null && str.length() != 0) {
            b13.putExtra("com.pinterest.EXTRA_PLACEMENT_ID", str);
        }
        if (bundle != null) {
            b13.putExtras(bundle);
        }
        b13.setFlags(603979776);
        context.startActivity(b13);
    }

    public final void o(Activity activity, Bundle bundle, boolean z13) {
        if (!z13 && activity != null) {
            activity.getIntent().putExtra("com.pinterest.EXTRA_REQUEST_LOCATION_PERMISSION", true);
        }
        if (activity != null) {
            if (bundle != null) {
                activity.getIntent().putExtras(bundle);
            }
            activity.getIntent().putExtra("com.pinterest.EXTRA_POST_SIGNED_UP", z13);
            p(activity);
            activity.finish();
        }
    }

    public final void p(Context context) {
        wy0 f13;
        Intrinsics.checkNotNullParameter(context, "context");
        dy.a aVar = this.f84973c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (!aVar.b()) {
            if (aVar.f56519l != null && ((f13 = ((b60.d) aVar.f56515h).f()) == null || !dl2.b.O1(f13, false))) {
                Intent b13 = aVar.f56510c.b(context, a.WEB_HOOK_ACTIVITY);
                String str = aVar.f56519l;
                b13.setData(str != null ? Uri.parse(str) : null);
                b13.putExtra("com.pinterest.EXTRA_SOURCE", "SOURCE_APP_NAVIGATION");
                if (b13.getData() != null) {
                    context.startActivity(b13);
                    aVar.f56519l = null;
                    return;
                }
            }
            aVar.f56519l = null;
        }
        Intent intent = bs1.c.k0(context).getIntent();
        if (intent != null) {
            if (intent.getStringExtra("com.pinterest.EXTRA_SDK_MODE") == null) {
                context.startActivity(f().putExtras(intent));
                return;
            }
            Intent b14 = this.f84972b.b(this.f84971a, a.PINTEREST_OAUTH_ACTIVITY);
            b14.addFlags(131072);
            context.startActivity(b14.putExtras(intent));
        }
    }

    public final void q(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intent b13 = this.f84972b.b(applicationContext, a.AUTHENTICATION_ACTIVITY);
        b13.putExtras(activity.getIntent());
        if (bundle != null) {
            b13.putExtras(bundle);
        }
        b13.setFlags(603979776);
        activity.startActivity(b13);
    }

    public final void r(Context context, Navigation navigation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        context.startActivity(h(context, navigation));
    }

    public final void s(Context context, Uri uri, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        context.startActivity(c(context, uri, str).putExtra("com.pinterest.EXTRA_CATCH_BY_WEBHOOK", true));
    }

    public final void t(Activity activity, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ScreenLocation a13 = com.pinterest.screens.d.a();
        Intrinsics.f(str);
        NavigationImpl z03 = Navigation.z0(a13, str);
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", z13);
        z03.Y1("com.pinterest.EXTRA_WEBPAGE_PINNABLE", z14);
        Intent e13 = e(activity, false);
        e13.putExtra("com.pinterest.EXTRA_PENDING_TASK", z03);
        activity.startActivity(e13);
        activity.finish();
    }

    public final boolean u(String url, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(url, "url");
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(data, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(queryIntentActivities);
        if (resolveInfo == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(resolveInfo.activityInfo.packageName);
        intent.setData(Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}

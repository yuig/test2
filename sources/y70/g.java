package y70;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.pinterest.api.model.iw;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.s0;
import lh0.z3;
import m60.f0;
import s.k;
import s.q;
import s.r;
import t3.s1;
import tb0.p;

/* loaded from: classes.dex */
public final class g extends q implements i {

    /* renamed from: g, reason: collision with root package name */
    public final Application f137996g;

    /* renamed from: h, reason: collision with root package name */
    public final z70.f f137997h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f137998i;

    /* renamed from: j, reason: collision with root package name */
    public final e f137999j;

    /* renamed from: k, reason: collision with root package name */
    public final tb0.h f138000k;

    /* renamed from: l, reason: collision with root package name */
    public final s0 f138001l;

    /* renamed from: m, reason: collision with root package name */
    public final uk2.d f138002m;

    /* renamed from: n, reason: collision with root package name */
    public final h f138003n;

    /* renamed from: o, reason: collision with root package name */
    public String f138004o;

    /* renamed from: p, reason: collision with root package name */
    public c f138005p;

    /* renamed from: q, reason: collision with root package name */
    public r f138006q;

    /* renamed from: r, reason: collision with root package name */
    public final f f138007r;

    public g(Application context, z70.f chromeSettings, f0 devUtils, e customTabEventLogger, tb0.h crashReporting, s0 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chromeSettings, "chromeSettings");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(customTabEventLogger, "customTabEventLogger");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f137996g = context;
        this.f137997h = chromeSettings;
        this.f137998i = devUtils;
        this.f137999j = customTabEventLogger;
        this.f138000k = crashReporting;
        this.f138001l = experiments;
        this.f138002m = s1.h("create(...)");
        this.f138003n = new h(this);
        this.f138007r = new f(this);
    }

    public final String b(Intent intent, ArrayList arrayList) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        if (arrayList.isEmpty()) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = this.f137996g.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.U(0, queryIntentActivities);
        String str = (resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName;
        if (str == null) {
            str = "";
        }
        ArrayList H0 = CollectionsKt.H0(CollectionsKt.x0(arrayList, al2.a.a(new a(str, 1), new a(this, 2), b.f137969l)));
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        s0 s0Var = this.f138001l;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter("enabled_no_firefox", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((g1) s0Var.f83472a).k("android_non_chrome_cct", "enabled_no_firefox", activate)) {
            H0.removeIf(new iw(1, b.f137968k));
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) CollectionsKt.firstOrNull(H0);
        if (resolveInfo2 == null || (activityInfo = resolveInfo2.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public final boolean c(ResolveInfo resolveInfo) {
        PackageInfo packageInfo;
        if (Intrinsics.d(resolveInfo.activityInfo.packageName, "com.android.chrome")) {
            try {
                packageInfo = this.f137996g.getPackageManager().getPackageInfo("com.android.chrome", 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if ((packageInfo != null ? Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode : 0L) > 428014100) {
                return true;
            }
        }
        return false;
    }

    @Override // s.q
    public final void onCustomTabsServiceConnected(ComponentName name, k client) {
        z70.f fVar = this.f137997h;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        try {
            r d2 = client.d(this.f138007r);
            this.f138006q = d2;
            fVar.f140993b = d2;
            client.e();
        } catch (SecurityException e13) {
            this.f138006q = null;
            fVar.f140993b = null;
            String message = e13.getMessage();
            if (message == null) {
                message = "Got SecurityException when trying to establish a new chrome session.";
            }
            this.f138000k.q(e13, message, p.CHROME_TAB);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f138006q = null;
        this.f137997h.f140993b = null;
    }
}

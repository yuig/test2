package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y80 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f14134d;

    /* renamed from: e, reason: collision with root package name */
    public final a.j3 f14135e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageManager f14136f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.k f14137g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.k f14138h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.k f14139i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f14140j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f14141k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.k f14142l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.k f14143m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f14144n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(Context context, a.j3 traceLogger) {
        super(il0.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK, false, 6);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f14134d = context;
        this.f14135e = traceLogger;
        this.f14136f = context.getPackageManager();
        this.f14137g = xk2.m.b(new r80(this));
        this.f14138h = xk2.m.b(new v80(this));
        this.f14139i = xk2.m.b(t80.f11450a);
        this.f14140j = xk2.m.b(new x80(this));
        this.f14141k = xk2.m.b(new w80(this));
        this.f14142l = xk2.m.b(new s80(this));
        this.f14143m = xk2.m.b(new q80(this));
        this.f14144n = xk2.m.b(new u80(this));
    }

    public final boolean c() {
        return ((Boolean) this.f14137g.getValue()).booleanValue();
    }

    public final boolean d() {
        return Intrinsics.d(Environment.getExternalStorageState(), "mounted") && (Build.VERSION.SDK_INT >= 30 || this.f14134d.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        this.f14137g.getValue();
        this.f14139i.getValue();
        this.f14138h.getValue();
        this.f14140j.getValue();
        this.f14141k.getValue();
        this.f14142l.getValue();
        this.f14143m.getValue();
        this.f14144n.getValue();
        return new pk0(Unit.f80348a);
    }

    public static final ResolveInfo a(y80 y80Var, PackageManager packageManager) {
        y80Var.getClass();
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
    }

    public final boolean a(Intent intent) {
        PackageManager.ResolveInfoFlags of;
        List queryIntentActivities;
        PackageManager packageManager = this.f14134d.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            if (queryIntentActivities.isEmpty()) {
                return false;
            }
        } else {
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities2, "queryIntentActivities(...)");
            if (queryIntentActivities2.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

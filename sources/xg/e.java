package xg;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.engage.service.AppEngageException;
import com.google.android.engage.service.ClusterList;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.r;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final fi.b f134910e = new fi.b("AppEngageService", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Intent f134911f = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.android.vending");

    /* renamed from: g, reason: collision with root package name */
    public static final Intent f134912g = new Intent("com.google.android.engage.BIND_APP_ENGAGE_SERVICE").setPackage("com.google.android.engage.verifyapp");

    /* renamed from: h, reason: collision with root package name */
    public static e f134913h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f134914a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134915b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134916c;

    /* renamed from: d, reason: collision with root package name */
    public final fi.i f134917d;

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|(10:5|6|(1:8)|9|10|11|12|(2:14|(1:16)(2:17|18))|21|(7:23|24|25|26|(1:28)|29|30)(2:34|(9:36|(1:38)|39|40|41|42|(1:44)|45|46)(2:49|50)))|54|6|(0)|9|10|11|12|(0)|21|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005b, code lost:
    
        r0.a(a.a.k("Env [", r1, "] is not supported. Supported values: 'debug' and 'production'."), r4, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = r10.getPackageName()
            r9.f134915b = r0
            fi.b r0 = xg.g.f134919a
            java.lang.String r1 = "com.google.android.engage.service.ENV"
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r5 = r10.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r4 == 0) goto L28
            java.lang.String r1 = r4.getString(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            goto L32
        L26:
            r1 = move-exception
            goto L2a
        L28:
            r1 = r2
            goto L32
        L2a:
            java.lang.String r4 = "Package name not found."
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r0.a(r4, r1, r5)
            goto L28
        L32:
            java.lang.String r4 = "DEBUG"
            if (r1 != 0) goto L37
            r1 = r4
        L37:
            r5 = 1
            r6 = 2
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.String r7 = r1.toUpperCase(r7)     // Catch: java.lang.IllegalArgumentException -> L5a
            r7.getClass()     // Catch: java.lang.IllegalArgumentException -> L5a
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L68
            java.lang.String r4 = "PRODUCTION"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L54
            r6 = r5
            goto L68
        L54:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L5a
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> L5a
            throw r4     // Catch: java.lang.IllegalArgumentException -> L5a
        L5a:
            r4 = move-exception
            java.lang.String r7 = "Env ["
            java.lang.String r8 = "] is not supported. Supported values: 'debug' and 'production'."
            java.lang.String r1 = a.a.k(r7, r1, r8)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r0.a(r1, r4, r7)
        L68:
            int r6 = r6 + (-1)
            fi.b r0 = xg.e.f134910e
            if (r6 == 0) goto L91
            java.lang.String r1 = "1.2.0-debug"
            r9.f134916c = r1
            r9.f134914a = r5
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            java.lang.String r4 = "com.google.android.engage.verifyapp"
            r1.getPackageInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8e
            fi.i r1 = new fi.i
            android.content.Context r2 = r10.getApplicationContext()
            if (r2 == 0) goto L86
            r10 = r2
        L86:
            android.content.Intent r2 = xg.e.f134912g
            r1.<init>(r10, r0, r2)
            r9.f134917d = r1
            return
        L8e:
            r9.f134917d = r2
            return
        L91:
            java.lang.String r1 = "1.2.0"
            r9.f134916c = r1
            boolean r1 = fi.j.a(r10)
            if (r1 == 0) goto Lc1
            fi.i r1 = new fi.i
            android.content.Context r2 = r10.getApplicationContext()
            if (r2 == 0) goto La4
            goto La5
        La4:
            r2 = r10
        La5:
            android.content.Intent r4 = xg.e.f134911f
            r1.<init>(r2, r0, r4)
            r9.f134917d = r1
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            java.lang.String r0 = "com.android.vending"
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            int r10 = r10.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            r0 = 83441400(0x4f936f8, float:5.85901E-36)
            if (r10 < r0) goto Lbe
            r3 = r5
        Lbe:
            r9.f134914a = r3
            return
        Lc1:
            r9.f134917d = r2
            r9.f134914a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.e.<init>(android.content.Context):void");
    }

    public final Task a(ClusterList clusterList) {
        Bundle bundle = new Bundle();
        bundle.putString("engage_sdk_version", this.f134916c);
        bundle.putString("calling_package_name", this.f134915b);
        bundle.putParcelable("clusters", clusterList);
        return b(new j(this, bundle, 1));
    }

    public final Task b(d dVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        fi.i iVar = this.f134917d;
        if (iVar == null) {
            return Tasks.forException(new AppEngageException(1));
        }
        iVar.a().post(new k(iVar, taskCompletionSource, taskCompletionSource, new k(this, taskCompletionSource, dVar, taskCompletionSource)));
        return taskCompletionSource.getTask().continueWithTask(r.INSTANCE, h.f134920a);
    }
}

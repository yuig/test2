package jk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final fi.b f76355c = new fi.b("SplitInstallInfoProvider", 1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f76356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f76357b;

    public u(Context context) {
        this.f76356a = context;
        this.f76357b = context.getPackageName();
    }

    public static String b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean d(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet e(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = g(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!d(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet g(PackageInfo packageInfo) {
        HashSet hashSet;
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet2 = new HashSet();
        fi.b bVar = f76355c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                bVar.b("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            bVar.b("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet2, strArr);
        } else {
            bVar.b("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        ik.h hVar = (ik.h) t.f76354a.get();
        if (hVar != null) {
            ik.a aVar = hVar.f72397a;
            synchronized (aVar.f72386c) {
                hashSet = new HashSet(aVar.f72386c);
            }
            hashSet2.addAll(hashSet);
        }
        return hashSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.k0 a(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            fi.b r2 = jk.u.f76355c
            if (r10 != 0) goto Le
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in Context."
            r2.h(r1, r10)
            return r0
        Le:
            java.lang.String r3 = "com.android.vending.splits"
            int r10 = r10.getInt(r3)
            if (r10 != 0) goto L1e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in AndroidManifest."
            r2.h(r1, r10)
            return r0
        L1e:
            android.content.Context r3 = r9.f76356a     // Catch: android.content.res.Resources.NotFoundException -> Ldf
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Ldf
            android.content.res.XmlResourceParser r10 = r3.getXml(r10)     // Catch: android.content.res.Resources.NotFoundException -> Ldf
            androidx.lifecycle.k0 r3 = new androidx.lifecycle.k0
            r4 = 3
            r3.<init>(r4)
        L2e:
            int r5 = r10.next()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            r6 = 1
            if (r5 == r6) goto Lc9
            int r5 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            r6 = 2
            if (r5 != r6) goto L2e
            java.lang.String r5 = r10.getName()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            java.lang.String r7 = "splits"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r5 != 0) goto L4c
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L2e
        L4c:
            int r5 = r10.next()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r5 == r4) goto L2e
            int r5 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r5 != r6) goto L4c
            java.lang.String r5 = r10.getName()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            java.lang.String r7 = "module"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r5 == 0) goto Lc5
            java.lang.String r5 = "name"
            java.lang.String r5 = bp1.h.L(r5, r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r5 == 0) goto Lc1
        L6c:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 == r4) goto L4c
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 != r6) goto L6c
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            java.lang.String r8 = "language"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 != 0) goto L88
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L6c
        L88:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 == r4) goto L6c
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 != r6) goto L88
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            java.lang.String r8 = "entry"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 == 0) goto Lbd
            java.lang.String r7 = "key"
            java.lang.String r7 = bp1.h.L(r7, r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            java.lang.String r8 = "split"
            java.lang.String r8 = bp1.h.L(r8, r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            if (r7 == 0) goto L88
            if (r8 == 0) goto L88
            r3.b(r5, r7, r8)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L88
        Lb7:
            r10 = move-exception
            goto Lce
        Lb9:
            r10 = move-exception
            goto Lce
        Lbb:
            r10 = move-exception
            goto Lce
        Lbd:
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L88
        Lc1:
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L4c
        Lc5:
            bp1.h.M(r10)     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto L4c
        Lc9:
            androidx.lifecycle.k0 r0 = r3.c()     // Catch: java.lang.IllegalStateException -> Lb7 java.io.IOException -> Lb9 org.xmlpull.v1.XmlPullParserException -> Lbb
            goto Ld5
        Lce:
            java.lang.String r3 = "SplitInstall"
            java.lang.String r4 = "Error while parsing splits.xml"
            android.util.Log.e(r3, r4, r10)
        Ld5:
            if (r0 != 0) goto Lde
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Can't parse languages metadata."
            r2.h(r1, r10)
        Lde:
            return r0
        Ldf:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Resource with languages metadata doesn't exist."
            r2.h(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.u.a(android.os.Bundle):androidx.lifecycle.k0");
    }

    public final HashSet c() {
        PackageInfo f13 = f();
        return (f13 == null || f13.applicationInfo == null) ? new HashSet() : e(f13);
    }

    public final PackageInfo f() {
        try {
            return this.f76356a.getPackageManager().getPackageInfo(this.f76357b, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        } catch (PackageManager.NameNotFoundException unused) {
            f76355c.c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}

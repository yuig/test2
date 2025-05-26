package androidx.camera.core.impl;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class c2 implements q.a {
    public static y1 a(Context context, Bundle bundle) {
        boolean z13 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] b13 = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] b14 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        kh2.m0.p("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        kh2.m0.p("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z13);
        kh2.m0.p("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(b13));
        kh2.m0.p("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(b14));
        return new y1(z13, new HashSet(c(b13)), new HashSet(c(b14)));
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i13 = bundle.getInt(str, -1);
        if (i13 == -1) {
            kh2.m0.X0("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i13);
        } catch (Resources.NotFoundException e13) {
            kh2.m0.Y0("QuirkSettingsLoader", "Quirk class names resource not found: " + i13, e13);
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashSet c(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<androidx.camera.core.impl.x1> r6 = androidx.camera.core.impl.x1.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            kh2.m0.X0(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            kh2.m0.Y0(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.c2.c(java.lang.String[]):java.util.HashSet");
    }

    @Override // q.a
    public final Object apply(Object obj) {
        return obj;
    }
}

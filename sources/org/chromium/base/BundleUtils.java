package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import dp2.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public class BundleUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97298a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayMap f97299b = new ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f97300c = Collections.synchronizedMap(new ArrayMap());

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000d, code lost:
    
        r6 = r6.createContextForSplit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0011, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r6.getClassLoader().getParent();
        r0 = org.chromium.base.BundleUtils.f97299b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r1 = (java.lang.ClassLoader) r0.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.equals(r6.getClassLoader()) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if ((r3 instanceof android.content.ContextWrapper) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        r3 = ((android.content.ContextWrapper) r3).getBaseContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        r4 = r3.getClass().getDeclaredField("mClassLoader");
        r4.setAccessible(true);
        r4.set(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        fp2.c.f62789a.a("Android.IsolatedSplits.ClassLoaderReplaced." + r7, 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        throw new java.lang.RuntimeException("Error setting ClassLoader.", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r0.put(r7, r6.getClassLoader());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0015, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x001e, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0026, code lost:
    
        r0 = org.chromium.base.BundleUtils.f97298a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0028, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0029, code lost:
    
        r1 = dp2.j.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002d, code lost:
    
        r6 = r6.createContextForSplit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0009, code lost:
    
        r0 = dp2.j.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context a(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = r6
        L1:
            boolean r1 = r0 instanceof android.content.ContextWrapper     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r1 == 0) goto L26
            boolean r1 = r0 instanceof android.app.Application     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            if (r1 == 0) goto L1f
            dp2.j r0 = dp2.j.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.Context r6 = r6.createContextForSplit(r7)     // Catch: java.lang.Throwable -> L15
            r0.close()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            goto L35
        L15:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
        L1e:
            throw r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
        L1f:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.content.Context r0 = r0.getBaseContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            goto L1
        L26:
            java.lang.Object r0 = org.chromium.base.BundleUtils.f97298a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            monitor-enter(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            dp2.j r1 = dp2.j.c()     // Catch: java.lang.Throwable -> L9f
            android.content.Context r6 = r6.createContextForSplit(r7)     // Catch: java.lang.Throwable -> La1
            r1.close()     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
        L35:
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r0.getParent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            android.util.ArrayMap r0 = org.chromium.base.BundleUtils.f97299b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            monitor-enter(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L79
            r2 = 1
            if (r1 == 0) goto L7b
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L79
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L82
            r3 = r6
        L53:
            boolean r4 = r3 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L5e
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r3.getBaseContext()     // Catch: java.lang.Throwable -> L79
            goto L53
        L5e:
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.ReflectiveOperationException -> L70 java.lang.Throwable -> L79
            java.lang.String r5 = "mClassLoader"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.ReflectiveOperationException -> L70 java.lang.Throwable -> L79
            r4.setAccessible(r2)     // Catch: java.lang.ReflectiveOperationException -> L70 java.lang.Throwable -> L79
            r4.set(r3, r1)     // Catch: java.lang.ReflectiveOperationException -> L70 java.lang.Throwable -> L79
            r1 = r2
            goto L83
        L70:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "Error setting ClassLoader."
            r7.<init>(r1, r6)     // Catch: java.lang.Throwable -> L79
            throw r7     // Catch: java.lang.Throwable -> L79
        L79:
            r6 = move-exception
            goto L9d
        L7b:
            java.lang.ClassLoader r1 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L79
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L79
        L82:
            r1 = 0
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.lang.String r3 = "Android.IsolatedSplits.ClassLoaderReplaced."
            r0.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r0.append(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            java.lang.String r7 = r0.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            fp2.b r0 = fp2.c.f62789a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            r0.a(r7, r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
            return r6
        L9b:
            r6 = move-exception
            goto Lad
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
        L9f:
            r6 = move-exception
            goto Lab
        La1:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> La6
            goto Laa
        La6:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> L9f
        Laa:
            throw r6     // Catch: java.lang.Throwable -> L9f
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            throw r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9b
        Lad:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.a(android.content.Context, java.lang.String):android.content.Context");
    }

    public static ClassLoader b(String str) {
        ClassLoader classLoader;
        ArrayMap arrayMap = f97299b;
        synchronized (arrayMap) {
            classLoader = (ClassLoader) arrayMap.get(str);
        }
        if (classLoader == null) {
            a(a.f113317a, str);
            synchronized (arrayMap) {
                classLoader = (ClassLoader) arrayMap.get(str);
            }
        }
        return classLoader;
    }

    public static String c(String str, String str2) {
        int binarySearch;
        ApplicationInfo applicationInfo = a.f113317a.getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        String str3 = (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str2)) >= 0) ? applicationInfo.splitSourceDirs[binarySearch] : null;
        if (str3 == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo2 = a.f113317a.getApplicationInfo();
            return str3 + "!/lib/" + ((String) applicationInfo2.getClass().getField("primaryCpuAbi").get(applicationInfo2)) + "/" + System.mapLibraryName(str);
        } catch (ReflectiveOperationException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static boolean d(String str) {
        int binarySearch;
        ApplicationInfo applicationInfo = a.f113317a.getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        String str2 = null;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            str2 = applicationInfo.splitSourceDirs[binarySearch];
        }
        return str2 != null;
    }

    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        j c13 = j.c();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                c13.close();
                return findLibrary;
            }
            ClassLoader classLoader = a.f113317a.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary != null) {
                c13.close();
                return findLibrary;
            }
            String c14 = c(str, str2);
            c13.close();
            return c14;
        } catch (Throwable th3) {
            try {
                c13.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @CalledByNative
    public static boolean isBundleForNative() {
        return false;
    }
}

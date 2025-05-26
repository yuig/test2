package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class id2 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f6347a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6348b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f6349c;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        strArr[1] = (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : "";
        f6348b = strArr;
        f6349c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static void a(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(lstat.st_mode)) {
                    throw new FileNotFoundException(a.a.j("Can't open file: ", str));
                }
                if (fstat.st_dev != lstat.st_dev || fstat.st_ino != lstat.st_ino) {
                    throw new FileNotFoundException(a.a.j("Can't open file: ", str));
                }
            } catch (ErrnoException e13) {
                throw new IOException(e13);
            }
        } catch (ErrnoException e14) {
            throw new IOException(e14);
        }
    }

    public static File[] b(Context context) {
        Object obj = d5.a.f53679a;
        return context.getExternalCacheDirs();
    }

    public static boolean a(Context context, String str) {
        try {
            for (File file : (File[]) new a.r5(context, 0).call()) {
                if (file != null) {
                    String canonicalPath = file.getCanonicalPath();
                    if (!canonicalPath.endsWith("/")) {
                        canonicalPath = canonicalPath.concat("/");
                    }
                    if (str.startsWith(canonicalPath)) {
                        return true;
                    }
                }
            }
            try {
                for (File file2 : (File[]) new a.r5(context, 1).call()) {
                    if (file2 != null) {
                        String canonicalPath2 = file2.getCanonicalPath();
                        if (!canonicalPath2.endsWith("/")) {
                            canonicalPath2 = canonicalPath2.concat("/");
                        }
                        if (str.startsWith(canonicalPath2)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (NullPointerException e13) {
                throw e13;
            } catch (Exception e14) {
                throw new RuntimeException(e14);
            }
        } catch (NullPointerException e15) {
            throw e15;
        } catch (Exception e16) {
            throw new RuntimeException(e16);
        }
    }

    public static File[] a(Context context) {
        Object obj = d5.a.f53679a;
        return context.getExternalFilesDirs(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r13 == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.FileOutputStream a(android.content.Context r13, android.net.Uri r14, ads_mobile_sdk.hd2 r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.id2.a(android.content.Context, android.net.Uri, ads_mobile_sdk.hd2):java.io.FileOutputStream");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r4.startsWith(r3) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        r3 = r2.createDeviceProtectedStorageContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r3 = r3.getDataDir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r3 = r3.getCanonicalPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r3.endsWith("/") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r3 = r3.concat("/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r4.startsWith(r3) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r2 = a(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r4.startsWith(r3) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r2, android.os.ParcelFileDescriptor r3, android.net.Uri r4, ads_mobile_sdk.hd2 r5) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r4.getPath()
            r0.<init>(r4)
            java.lang.String r4 = r0.getCanonicalPath()
            a(r3, r4)
            java.lang.String r3 = "/proc/"
            boolean r3 = r4.startsWith(r3)
            if (r3 != 0) goto La0
            java.lang.String r3 = "/data/misc/"
            boolean r3 = r4.startsWith(r3)
            if (r3 != 0) goto La0
            r5.getClass()
            pk.c1 r3 = r5.f5931c
            r0 = 0
            pk.y0 r3 = r3.listIterator(r0)
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L93
            java.lang.Object r3 = d5.a.f53679a
            java.io.File r3 = r2.getDataDir()
            java.lang.String r0 = "/"
            if (r3 == 0) goto L4f
            java.lang.String r3 = r3.getCanonicalPath()
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L48
            java.lang.String r3 = r3.concat(r0)
        L48:
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L68
            goto L88
        L4f:
            java.io.File r3 = android.os.Environment.getDataDirectory()
            java.lang.String r3 = r3.getCanonicalPath()
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L61
            java.lang.String r3 = r3.concat(r0)
        L61:
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L68
            goto L88
        L68:
            android.content.Context r3 = r2.createDeviceProtectedStorageContext()
            if (r3 == 0) goto L8a
            java.io.File r3 = r3.getDataDir()
            if (r3 == 0) goto L8a
            java.lang.String r3 = r3.getCanonicalPath()
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L82
            java.lang.String r3 = r3.concat(r0)
        L82:
            boolean r3 = r4.startsWith(r3)
            if (r3 == 0) goto L8a
        L88:
            r2 = 1
            goto L8e
        L8a:
            boolean r2 = a(r2, r4)
        L8e:
            boolean r3 = r5.f5929a
            if (r2 != r3) goto La0
            return
        L93:
            java.lang.Object r2 = r3.next()
            r2.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
        La0:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "Can't open file: "
            java.lang.String r3 = r3.concat(r4)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.id2.a(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, ads_mobile_sdk.hd2):void");
    }
}

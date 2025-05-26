package ik;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f72390a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f72391b;

    /* renamed from: c, reason: collision with root package name */
    public File f72392c;

    public c(Context context) {
        this.f72391b = context;
        this.f72390a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void e(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(a.a.k("Failed to delete '", file.getAbsolutePath(), "'"));
        }
    }

    public static File f(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void g(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    public final File a(String str) {
        File file = new File(i(), "dex");
        g(file);
        File f13 = f(file, str);
        g(f13);
        return f13;
    }

    public final File b(String str) {
        File file = new File(i(), "verified-splits");
        g(file);
        return f(file, String.valueOf(str).concat(".apk"));
    }

    public final HashSet c() {
        File file = new File(i(), "verified-splits");
        g(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && (!file2.canWrite())) {
                    hashSet.add(new b(file2, file2.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void d() {
        File h10 = h();
        String[] list = h10.list();
        if (list != null) {
            for (String str : list) {
                long j13 = this.f72390a;
                if (!str.equals(Long.toString(j13))) {
                    File file = new File(h10, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + j13 + ")");
                    e(file);
                }
            }
        }
    }

    public final File h() {
        if (this.f72392c == null) {
            Context context = this.f72391b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f72392c = context.getFilesDir();
        }
        File file = new File(this.f72392c, "splitcompat");
        g(file);
        return file;
    }

    public final File i() {
        File file = new File(h(), Long.toString(this.f72390a));
        g(file);
        return file;
    }
}

package lb0;

import android.content.Context;
import df.j1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import m60.a0;
import m60.f0;

/* loaded from: classes.dex */
public final class g {
    public static void a(String str) {
        File file = new File(c(str, true));
        if (file.exists()) {
            if (file.isDirectory()) {
                b(file);
            } else {
                file.delete();
            }
        }
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            boolean z13 = true;
            for (String str : file.list()) {
                z13 &= b(new File(file, str));
            }
            if (!z13) {
                return false;
            }
        }
        return file.delete();
    }

    public static String c(String str, boolean z13) {
        String V = j1.V("%s/%s", d(e.CACHE_FOLDER_JSON), str);
        File file = new File(V);
        if (z13 && !file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        return V;
    }

    public static String d(e eVar) {
        Context context = kb0.a.f79058b;
        File file = new File(f0.X().getCacheDir(), eVar.getValue());
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getPath();
    }

    public static vd0.c e(String str) {
        try {
            File file = new File(c(str, false));
            if (!file.exists()) {
                return new vd0.c();
            }
            ByteArrayOutputStream g03 = com.bumptech.glide.d.g0(file);
            return new vd0.c(g03 == null ? "" : g03.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static Object f(String str) {
        FileInputStream fileInputStream;
        ?? r23;
        BufferedInputStream bufferedInputStream;
        Throwable th3;
        Closeable closeable;
        Object obj = null;
        try {
            fileInputStream = new FileInputStream(c(str, true));
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                try {
                    r23 = new ObjectInputStream(bufferedInputStream);
                } catch (Exception unused) {
                    r23 = 0;
                } catch (Throwable th4) {
                    r23 = 0;
                    th3 = th4;
                }
            } catch (Exception unused2) {
                bufferedInputStream = null;
                r23 = 0;
            } catch (Throwable th5) {
                th = th5;
                r23 = 0;
                th3 = th;
                bufferedInputStream = r23;
                ap2.e.a(fileInputStream);
                ap2.e.a(bufferedInputStream);
                ap2.e.a(r23);
                throw th3;
            }
        } catch (Exception unused3) {
            bufferedInputStream = null;
            fileInputStream = null;
            r23 = 0;
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = null;
            r23 = 0;
        }
        try {
            obj = r23.readObject();
            ap2.e.a(fileInputStream);
            closeable = r23;
        } catch (Exception unused4) {
            ap2.e.a(fileInputStream);
            closeable = r23;
            ap2.e.a(bufferedInputStream);
            ap2.e.a(closeable);
            return obj;
        } catch (Throwable th7) {
            th3 = th7;
            ap2.e.a(fileInputStream);
            ap2.e.a(bufferedInputStream);
            ap2.e.a(r23);
            throw th3;
        }
        ap2.e.a(bufferedInputStream);
        ap2.e.a(closeable);
        return obj;
    }

    public static String g(String str) {
        try {
            ByteArrayOutputStream g03 = com.bumptech.glide.d.g0(new File(c(str, true)));
            return g03 == null ? "" : g03.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void h(String str, a0 a0Var) {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(c(str, true));
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(bufferedOutputStream);
                    try {
                        objectOutputStream2.writeObject(a0Var);
                        ap2.e.a(objectOutputStream2);
                    } catch (Exception unused) {
                        objectOutputStream = objectOutputStream2;
                        ap2.e.a(objectOutputStream);
                        ap2.e.a(bufferedOutputStream);
                        ap2.e.a(fileOutputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                        ap2.e.a(objectOutputStream);
                        ap2.e.a(bufferedOutputStream);
                        ap2.e.a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception unused3) {
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
            }
        } catch (Exception unused4) {
            bufferedOutputStream = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
            fileOutputStream = null;
        }
        ap2.e.a(bufferedOutputStream);
        ap2.e.a(fileOutputStream);
    }
}

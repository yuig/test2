package mc;

import a.cb;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n60.o;
import x02.x1;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public final x1 f86898c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f86896a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public long f86897b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f86899d = 2097152;

    public g(x1 x1Var) {
        this.f86898c = x1Var;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder i13 = o.i(String.valueOf(str.substring(0, length).hashCode()));
        i13.append(String.valueOf(str.substring(length).hashCode()));
        return i13.toString();
    }

    public static int g(FilterInputStream filterInputStream) {
        int read = filterInputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static int h(FilterInputStream filterInputStream) {
        return (g(filterInputStream) << 24) | g(filterInputStream) | (g(filterInputStream) << 8) | (g(filterInputStream) << 16);
    }

    public static long i(FilterInputStream filterInputStream) {
        return (g(filterInputStream) & 255) | ((g(filterInputStream) & 255) << 8) | ((g(filterInputStream) & 255) << 16) | ((g(filterInputStream) & 255) << 24) | ((g(filterInputStream) & 255) << 32) | ((g(filterInputStream) & 255) << 40) | ((g(filterInputStream) & 255) << 48) | ((255 & g(filterInputStream)) << 56);
    }

    public static String j(FilterInputStream filterInputStream) {
        return new String(l((int) i(filterInputStream), filterInputStream), StandardCharsets.UTF_8);
    }

    public static byte[] l(int i13, FilterInputStream filterInputStream) {
        byte[] bArr = new byte[i13];
        int i14 = 0;
        while (i14 < i13) {
            int read = filterInputStream.read(bArr, i14, i13 - i14);
            if (read == -1) {
                break;
            }
            i14 += read;
        }
        if (i14 == i13) {
            return bArr;
        }
        throw new IOException(cb.j("Expected ", i13, " bytes, read ", i14, " bytes"));
    }

    public static void m(FileOutputStream fileOutputStream, int i13) {
        fileOutputStream.write(i13 & 255);
        fileOutputStream.write((i13 >> 8) & 255);
        fileOutputStream.write((i13 >> 16) & 255);
        fileOutputStream.write((i13 >> 24) & 255);
    }

    public static void n(FileOutputStream fileOutputStream, long j13) {
        fileOutputStream.write((byte) j13);
        fileOutputStream.write((byte) (j13 >>> 8));
        fileOutputStream.write((byte) (j13 >>> 16));
        fileOutputStream.write((byte) (j13 >>> 24));
        fileOutputStream.write((byte) (j13 >>> 32));
        fileOutputStream.write((byte) (j13 >>> 40));
        fileOutputStream.write((byte) (j13 >>> 48));
        fileOutputStream.write((byte) (j13 >>> 56));
    }

    public static void o(FileOutputStream fileOutputStream, String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        n(fileOutputStream, bytes.length);
        fileOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized a a(String str) {
        f fVar;
        e eVar = (e) this.f86896a.get(str);
        InputStream inputStream = null;
        if (eVar == null) {
            return null;
        }
        try {
            File b13 = b(str);
            try {
                fVar = new f(new FileInputStream(b13));
            } catch (IOException e13) {
                e = e13;
                fVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return null;
                    }
                }
                throw th;
            }
            try {
                e.a(fVar);
                a b14 = eVar.b(l((int) (b13.length() - fVar.f86895b), fVar));
                try {
                    fVar.close();
                    return b14;
                } catch (IOException unused2) {
                    return null;
                }
            } catch (IOException e14) {
                e = e14;
                b13.getAbsolutePath();
                e.toString();
                k(str);
                if (fVar != null) {
                    try {
                        fVar.close();
                    } catch (IOException unused3) {
                        return null;
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final File b(String str) {
        return new File(this.f86898c.a(), c(str));
    }

    public final void d(int i13) {
        long j13 = this.f86897b + i13;
        int i14 = this.f86899d;
        if (j13 < i14) {
            return;
        }
        SystemClock.elapsedRealtime();
        Iterator it = this.f86896a.entrySet().iterator();
        while (it.hasNext()) {
            e eVar = (e) ((Map.Entry) it.next()).getValue();
            if (b(eVar.f86888b).delete()) {
                this.f86897b -= eVar.f86887a;
            } else {
                c(eVar.f86888b);
            }
            it.remove();
            if (this.f86897b + r2 < i14 * 0.9f) {
                break;
            }
        }
        SystemClock.elapsedRealtime();
    }

    public final synchronized void e(String str, a aVar) {
        d(aVar.f86879a.length);
        File b13 = b(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b13);
            e eVar = new e(str, aVar);
            if (!eVar.c(fileOutputStream)) {
                fileOutputStream.close();
                b13.getAbsolutePath();
                throw new IOException();
            }
            fileOutputStream.write(aVar.f86879a);
            fileOutputStream.close();
            f(str, eVar);
        } catch (IOException unused) {
            if (b13.delete()) {
                return;
            }
            b13.getAbsolutePath();
        }
    }

    public final void f(String str, e eVar) {
        LinkedHashMap linkedHashMap = this.f86896a;
        if (linkedHashMap.containsKey(str)) {
            this.f86897b = (eVar.f86887a - ((e) linkedHashMap.get(str)).f86887a) + this.f86897b;
        } else {
            this.f86897b += eVar.f86887a;
        }
        linkedHashMap.put(str, eVar);
    }

    public final synchronized void k(String str) {
        boolean delete = b(str).delete();
        LinkedHashMap linkedHashMap = this.f86896a;
        e eVar = (e) linkedHashMap.get(str);
        if (eVar != null) {
            this.f86897b -= eVar.f86887a;
            linkedHashMap.remove(str);
        }
        if (!delete) {
            c(str);
        }
    }
}

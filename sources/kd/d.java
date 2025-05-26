package kd;

import android.os.StrictMode;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f79200a;

    /* renamed from: b, reason: collision with root package name */
    public final File f79201b;

    /* renamed from: c, reason: collision with root package name */
    public final File f79202c;

    /* renamed from: d, reason: collision with root package name */
    public final File f79203d;

    /* renamed from: f, reason: collision with root package name */
    public final long f79205f;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f79208i;

    /* renamed from: k, reason: collision with root package name */
    public int f79210k;

    /* renamed from: h, reason: collision with root package name */
    public long f79207h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f79209j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f79211l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f79212m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: n, reason: collision with root package name */
    public final a f79213n = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f79204e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f79206g = 1;

    public d(File file, long j13) {
        this.f79200a = file;
        this.f79201b = new File(file, "journal");
        this.f79202c = new File(file, "journal.tmp");
        this.f79203d = new File(file, "journal.bkp");
        this.f79205f = j13;
    }

    public static void A(File file, File file2, boolean z13) {
        if (z13) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(d dVar, m7.c cVar, boolean z13) {
        synchronized (dVar) {
            c cVar2 = (c) cVar.f86116c;
            if (cVar2.f79197f != cVar) {
                throw new IllegalStateException();
            }
            if (z13 && !cVar2.f79196e) {
                for (int i13 = 0; i13 < dVar.f79206g; i13++) {
                    if (!((boolean[]) cVar.f86117d)[i13]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i13);
                    }
                    if (!cVar2.f79195d[i13].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i14 = 0; i14 < dVar.f79206g; i14++) {
                File file = cVar2.f79195d[i14];
                if (!z13) {
                    e(file);
                } else if (file.exists()) {
                    File file2 = cVar2.f79194c[i14];
                    file.renameTo(file2);
                    long j13 = cVar2.f79193b[i14];
                    long length = file2.length();
                    cVar2.f79193b[i14] = length;
                    dVar.f79207h = (dVar.f79207h - j13) + length;
                }
            }
            dVar.f79210k++;
            cVar2.f79197f = null;
            if (cVar2.f79196e || z13) {
                cVar2.f79196e = true;
                dVar.f79208i.append((CharSequence) "CLEAN");
                dVar.f79208i.append(' ');
                dVar.f79208i.append((CharSequence) cVar2.f79192a);
                dVar.f79208i.append((CharSequence) cVar2.a());
                dVar.f79208i.append('\n');
                if (z13) {
                    long j14 = dVar.f79211l;
                    dVar.f79211l = 1 + j14;
                    cVar2.f79198g = j14;
                }
            } else {
                dVar.f79209j.remove(cVar2.f79192a);
                dVar.f79208i.append((CharSequence) "REMOVE");
                dVar.f79208i.append(' ');
                dVar.f79208i.append((CharSequence) cVar2.f79192a);
                dVar.f79208i.append('\n');
            }
            g(dVar.f79208i);
            if (dVar.f79207h > dVar.f79205f || dVar.k()) {
                dVar.f79212m.submit(dVar.f79213n);
            }
        }
    }

    public static void c(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void g(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static d m(File file, long j13) {
        if (j13 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                A(file2, file3, false);
            }
        }
        d dVar = new d(file, j13);
        if (dVar.f79201b.exists()) {
            try {
                dVar.q();
                dVar.o();
                return dVar;
            } catch (IOException e13) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e13.getMessage() + ", removing");
                dVar.d();
            }
        }
        file.mkdirs();
        d dVar2 = new d(file, j13);
        dVar2.z();
        return dVar2;
    }

    public final void J() {
        while (this.f79207h > this.f79205f) {
            String str = (String) ((Map.Entry) this.f79209j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f79208i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    c cVar = (c) this.f79209j.get(str);
                    if (cVar != null && cVar.f79197f == null) {
                        for (int i13 = 0; i13 < this.f79206g; i13++) {
                            File file = cVar.f79194c[i13];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j13 = this.f79207h;
                            long[] jArr = cVar.f79193b;
                            this.f79207h = j13 - jArr[i13];
                            jArr[i13] = 0;
                        }
                        this.f79210k++;
                        this.f79208i.append((CharSequence) "REMOVE");
                        this.f79208i.append(' ');
                        this.f79208i.append((CharSequence) str);
                        this.f79208i.append('\n');
                        this.f79209j.remove(str);
                        if (k()) {
                            this.f79212m.submit(this.f79213n);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f79208i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f79209j.values()).iterator();
            while (it.hasNext()) {
                m7.c cVar = ((c) it.next()).f79197f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            J();
            c(this.f79208i);
            this.f79208i = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void d() {
        close();
        g.a(this.f79200a);
    }

    public final m7.c f(String str) {
        synchronized (this) {
            try {
                if (this.f79208i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                c cVar = (c) this.f79209j.get(str);
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.f79209j.put(str, cVar);
                } else if (cVar.f79197f != null) {
                    return null;
                }
                m7.c cVar2 = new m7.c(this, cVar, 0);
                cVar.f79197f = cVar2;
                this.f79208i.append((CharSequence) "DIRTY");
                this.f79208i.append(' ');
                this.f79208i.append((CharSequence) str);
                this.f79208i.append('\n');
                g(this.f79208i);
                return cVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized mb.d h(String str) {
        if (this.f79208i == null) {
            throw new IllegalStateException("cache is closed");
        }
        c cVar = (c) this.f79209j.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f79196e) {
            return null;
        }
        for (File file : cVar.f79194c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f79210k++;
        this.f79208i.append((CharSequence) "READ");
        this.f79208i.append(' ');
        this.f79208i.append((CharSequence) str);
        this.f79208i.append('\n');
        if (k()) {
            this.f79212m.submit(this.f79213n);
        }
        return new mb.d(this, str, cVar.f79198g, cVar.f79194c, cVar.f79193b);
    }

    public final boolean k() {
        int i13 = this.f79210k;
        return i13 >= 2000 && i13 >= this.f79209j.size();
    }

    public final void o() {
        e(this.f79202c);
        Iterator it = this.f79209j.values().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            m7.c cVar2 = cVar.f79197f;
            int i13 = this.f79206g;
            int i14 = 0;
            if (cVar2 == null) {
                while (i14 < i13) {
                    this.f79207h += cVar.f79193b[i14];
                    i14++;
                }
            } else {
                cVar.f79197f = null;
                while (i14 < i13) {
                    e(cVar.f79194c[i14]);
                    e(cVar.f79195d[i14]);
                    i14++;
                }
                it.remove();
            }
        }
    }

    public final void q() {
        File file = this.f79201b;
        f fVar = new f(new FileInputStream(file), g.f79220a);
        try {
            String a13 = fVar.a();
            String a14 = fVar.a();
            String a15 = fVar.a();
            String a16 = fVar.a();
            String a17 = fVar.a();
            if (!"libcore.io.DiskLruCache".equals(a13) || !SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(a14) || !Integer.toString(this.f79204e).equals(a15) || !Integer.toString(this.f79206g).equals(a16) || !"".equals(a17)) {
                throw new IOException("unexpected journal header: [" + a13 + ", " + a14 + ", " + a16 + ", " + a17 + "]");
            }
            int i13 = 0;
            while (true) {
                try {
                    w(fVar.a());
                    i13++;
                } catch (EOFException unused) {
                    this.f79210k = i13 - this.f79209j.size();
                    if (fVar.f79219e == -1) {
                        z();
                    } else {
                        this.f79208i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), g.f79220a));
                    }
                    try {
                        fVar.close();
                        return;
                    } catch (RuntimeException e13) {
                        throw e13;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                fVar.close();
            } catch (RuntimeException e14) {
                throw e14;
            } catch (Exception unused3) {
            }
            throw th3;
        }
    }

    public final void w(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i13);
        LinkedHashMap linkedHashMap = this.f79209j;
        if (indexOf2 == -1) {
            substring = str.substring(i13);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i13, indexOf2);
        }
        c cVar = (c) linkedHashMap.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            linkedHashMap.put(substring, cVar);
        }
        int i14 = 0;
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f79197f = new m7.c(this, cVar, i14);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        cVar.f79196e = true;
        cVar.f79197f = null;
        if (split.length != cVar.f79199h.f79206g) {
            c.b(split);
            throw null;
        }
        while (i14 < split.length) {
            try {
                cVar.f79193b[i14] = Long.parseLong(split[i14]);
                i14++;
            } catch (NumberFormatException unused) {
                c.b(split);
                throw null;
            }
        }
    }

    public final synchronized void z() {
        try {
            BufferedWriter bufferedWriter = this.f79208i;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f79202c), g.f79220a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f79204e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f79206g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (c cVar : this.f79209j.values()) {
                    if (cVar.f79197f != null) {
                        bufferedWriter2.write("DIRTY " + cVar.f79192a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + cVar.f79192a + cVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f79201b.exists()) {
                    A(this.f79201b, this.f79203d, true);
                }
                A(this.f79202c, this.f79201b, false);
                this.f79203d.delete();
                this.f79208i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f79201b, true), g.f79220a));
            } catch (Throwable th3) {
                c(bufferedWriter2);
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}

package com.bugsnag.android;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29325b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f29326c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f29327d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f29328e = new ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f29329f = new ConcurrentSkipListSet();

    public l1(File file, int i13, u1 u1Var, m1 m1Var) {
        this.f29324a = file;
        this.f29325b = i13;
        this.f29326c = u1Var;
        this.f29327d = m1Var;
    }

    public final void a(Collection collection) {
        ReentrantLock reentrantLock = this.f29328e;
        reentrantLock.lock();
        if (collection != null) {
            try {
                this.f29329f.removeAll(collection);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void b(Collection collection) {
        ReentrantLock reentrantLock = this.f29328e;
        reentrantLock.lock();
        if (collection != null) {
            try {
                this.f29329f.removeAll(collection);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void c() {
        File[] listFiles;
        File file = this.f29324a;
        if (!g(file) || (listFiles = file.listFiles()) == null) {
            return;
        }
        int length = listFiles.length;
        int i13 = this.f29325b;
        if (length < i13) {
            return;
        }
        List<File> T = kotlin.collections.c0.T(new b4.f(1), listFiles);
        int length2 = (listFiles.length - i13) + 1;
        int i14 = 0;
        for (File file2 : T) {
            if (i14 == length2) {
                return;
            }
            if (!this.f29329f.contains(file2)) {
                f().f("Discarding oldest error as stored error limit reached: '" + ((Object) file2.getPath()) + '\'');
                b(kotlin.collections.g1.b(file2));
                i14++;
            }
        }
    }

    public final ArrayList d() {
        File[] listFiles;
        File file = this.f29324a;
        ReentrantLock reentrantLock = this.f29328e;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            boolean g13 = g(file);
            ConcurrentSkipListSet concurrentSkipListSet = this.f29329f;
            if (g13 && (listFiles = file.listFiles()) != null) {
                int length = listFiles.length;
                int i13 = 0;
                while (i13 < length) {
                    File file2 = listFiles[i13];
                    i13++;
                    if (file2.length() == 0) {
                        if (!file2.delete()) {
                            file2.deleteOnExit();
                        }
                    } else if (file2.isFile() && !concurrentSkipListSet.contains(file2)) {
                        arrayList.add(file2);
                    }
                }
            }
            concurrentSkipListSet.addAll(arrayList);
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public abstract String e(Object obj);

    public u1 f() {
        return this.f29326c;
    }

    public final boolean g(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e13) {
            f().b("Could not prepare file storage directory", e13);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.bugsnag.android.o1, java.io.Closeable] */
    public final String h(n1 n1Var) {
        Closeable closeable;
        File file = this.f29324a;
        Closeable closeable2 = null;
        if (!g(file) || this.f29325b == 0) {
            return null;
        }
        c();
        ?? e13 = e(n1Var);
        String absolutePath = new File(file, (String) e13).getAbsolutePath();
        ReentrantLock reentrantLock = this.f29328e;
        reentrantLock.lock();
        try {
            try {
                e13 = new o1(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
            } catch (FileNotFoundException e14) {
                e = e14;
                e13 = 0;
            } catch (Exception e15) {
                e = e15;
                e13 = 0;
            } catch (Throwable th3) {
                th = th3;
                kh2.m2.q0(closeable2);
                reentrantLock.unlock();
                throw th;
            }
            try {
                e13.M(n1Var);
                f().c("Saved unsent payload to disk: '" + ((Object) absolutePath) + '\'');
                kh2.m2.q0(e13);
                reentrantLock.unlock();
                return absolutePath;
            } catch (FileNotFoundException e16) {
                e = e16;
                f().a("Ignoring FileNotFoundException - unable to create file", e);
                closeable = e13;
                kh2.m2.q0(closeable);
                reentrantLock.unlock();
                return null;
            } catch (Exception e17) {
                e = e17;
                File file2 = new File(absolutePath);
                m1 m1Var = this.f29327d;
                if (m1Var != null) {
                    m1Var.a(e, file2, "Crash report serialization");
                }
                u1 f13 = f();
                try {
                    closeable = e13;
                    if (!file2.delete()) {
                        file2.deleteOnExit();
                        closeable = e13;
                    }
                } catch (Exception e18) {
                    f13.a("Failed to delete file", e18);
                    closeable = e13;
                }
                kh2.m2.q0(closeable);
                reentrantLock.unlock();
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable2 = e13;
            kh2.m2.q0(closeable2);
            reentrantLock.unlock();
            throw th;
        }
    }
}

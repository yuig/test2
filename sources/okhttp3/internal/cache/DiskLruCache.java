package okhttp3.internal.cache;

import a.a;
import ao2.m0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import dl2.b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import t3.s1;
import wo2.c;
import wo2.c0;
import wo2.d;
import wo2.e0;
import wo2.f;
import wo2.k;
import wo2.p;
import wo2.x;
import wo2.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public static final long A;
    public static final Regex B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;

    /* renamed from: v, reason: collision with root package name */
    public static final String f95786v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f95787w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f95788x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f95789y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f95790z;

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f95791a;

    /* renamed from: b, reason: collision with root package name */
    public final File f95792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95794d;

    /* renamed from: e, reason: collision with root package name */
    public final long f95795e;

    /* renamed from: f, reason: collision with root package name */
    public final File f95796f;

    /* renamed from: g, reason: collision with root package name */
    public final File f95797g;

    /* renamed from: h, reason: collision with root package name */
    public final File f95798h;

    /* renamed from: i, reason: collision with root package name */
    public long f95799i;

    /* renamed from: j, reason: collision with root package name */
    public k f95800j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f95801k;

    /* renamed from: l, reason: collision with root package name */
    public int f95802l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f95803m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95804n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95805o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95806p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95807q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95808r;

    /* renamed from: s, reason: collision with root package name */
    public long f95809s;

    /* renamed from: t, reason: collision with root package name */
    public final TaskQueue f95810t;

    /* renamed from: u, reason: collision with root package name */
    public final DiskLruCache$cleanupTask$1 f95811u;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        public final Entry f95812a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f95813b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f95814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f95815d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f95815d = diskLruCache;
            this.f95812a = entry;
            this.f95813b = entry.f95822e ? null : new boolean[diskLruCache.f95794d];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f95815d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f95814c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.d(this.f95812a.f95824g, this)) {
                        diskLruCache.c(this, false);
                    }
                    this.f95814c = true;
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f95815d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f95814c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.d(this.f95812a.f95824g, this)) {
                        diskLruCache.c(this, true);
                    }
                    this.f95814c = true;
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void c() {
            Entry entry = this.f95812a;
            if (Intrinsics.d(entry.f95824g, this)) {
                DiskLruCache diskLruCache = this.f95815d;
                if (diskLruCache.f95804n) {
                    diskLruCache.c(this, false);
                } else {
                    entry.f95823f = true;
                }
            }
        }

        public final c0 d(int i13) {
            DiskLruCache diskLruCache = this.f95815d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f95814c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!Intrinsics.d(this.f95812a.f95824g, this)) {
                        return new f();
                    }
                    if (!this.f95812a.f95822e) {
                        boolean[] zArr = this.f95813b;
                        Intrinsics.f(zArr);
                        zArr[i13] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.f95791a.f((File) this.f95812a.f95821d.get(i13)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return new f();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public final String f95818a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f95819b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f95820c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f95821d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f95822e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95823f;

        /* renamed from: g, reason: collision with root package name */
        public Editor f95824g;

        /* renamed from: h, reason: collision with root package name */
        public int f95825h;

        /* renamed from: i, reason: collision with root package name */
        public long f95826i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f95827j;

        public Entry(DiskLruCache diskLruCache, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f95827j = diskLruCache;
            this.f95818a = key;
            this.f95819b = new long[diskLruCache.f95794d];
            this.f95820c = new ArrayList();
            this.f95821d = new ArrayList();
            StringBuilder sb3 = new StringBuilder(key);
            sb3.append('.');
            int length = sb3.length();
            for (int i13 = 0; i13 < diskLruCache.f95794d; i13++) {
                sb3.append(i13);
                this.f95820c.add(new File(this.f95827j.f95792b, sb3.toString()));
                sb3.append(".tmp");
                this.f95821d.add(new File(this.f95827j.f95792b, sb3.toString()));
                sb3.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v7, types: [okhttp3.internal.cache.DiskLruCache$Entry$newSource$1] */
        public final Snapshot a() {
            byte[] bArr = Util.f95757a;
            if (!this.f95822e) {
                return null;
            }
            final DiskLruCache diskLruCache = this.f95827j;
            if (!diskLruCache.f95804n && (this.f95824g != null || this.f95823f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f95819b.clone();
            try {
                int i13 = diskLruCache.f95794d;
                for (int i14 = 0; i14 < i13; i14++) {
                    final d e13 = diskLruCache.f95791a.e((File) this.f95820c.get(i14));
                    if (!diskLruCache.f95804n) {
                        this.f95825h++;
                        e13 = new p(e13) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                            /* renamed from: b, reason: collision with root package name */
                            public boolean f95828b;

                            @Override // wo2.p, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                super.close();
                                if (this.f95828b) {
                                    return;
                                }
                                this.f95828b = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    try {
                                        int i15 = entry.f95825h - 1;
                                        entry.f95825h = i15;
                                        if (i15 == 0 && entry.f95823f) {
                                            diskLruCache2.q(entry);
                                        }
                                        Unit unit = Unit.f80348a;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(e13);
                }
                return new Snapshot(this.f95827j, this.f95818a, this.f95826i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.c((e0) it.next());
                }
                try {
                    diskLruCache.q(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class Snapshot implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final String f95831a;

        /* renamed from: b, reason: collision with root package name */
        public final long f95832b;

        /* renamed from: c, reason: collision with root package name */
        public final List f95833c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f95834d;

        public Snapshot(DiskLruCache diskLruCache, String key, long j13, ArrayList sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f95834d = diskLruCache;
            this.f95831a = key;
            this.f95832b = j13;
            this.f95833c = sources;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.f95833c.iterator();
            while (it.hasNext()) {
                Util.c((e0) it.next());
            }
        }
    }

    static {
        new Companion(0);
        f95786v = "journal";
        f95787w = "journal.tmp";
        f95788x = "journal.bkp";
        f95789y = "libcore.io.DiskLruCache";
        f95790z = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        A = -1L;
        B = new Regex("[a-z0-9_-]{1,120}");
        C = "CLEAN";
        D = "DIRTY";
        E = "REMOVE";
        F = "READ";
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f95791a = fileSystem;
        this.f95792b = directory;
        this.f95793c = 201105;
        this.f95794d = 2;
        this.f95795e = 20971520L;
        this.f95801k = new LinkedHashMap(0, 0.75f, true);
        this.f95810t = taskRunner.f();
        final String p13 = a.p(new StringBuilder(), Util.f95763g, " Cache");
        this.f95811u = new Task(p13) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    if (!diskLruCache.f95805o || diskLruCache.f95806p) {
                        return -1L;
                    }
                    try {
                        diskLruCache.w();
                    } catch (IOException unused) {
                        diskLruCache.f95807q = true;
                    }
                    try {
                        if (diskLruCache.g()) {
                            diskLruCache.o();
                            diskLruCache.f95802l = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.f95808r = true;
                        diskLruCache.f95800j = m0.h(new f());
                    }
                    return -1L;
                }
            }
        };
        this.f95796f = new File(directory, f95786v);
        this.f95797g = new File(directory, f95787w);
        this.f95798h = new File(directory, f95788x);
    }

    public static void z(String str) {
        if (!B.e(str)) {
            throw new IllegalArgumentException(s1.b("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    public final synchronized void a() {
        if (!(!this.f95806p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void c(Editor editor, boolean z13) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Entry entry = editor.f95812a;
        if (!Intrinsics.d(entry.f95824g, editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z13 && !entry.f95822e) {
            int i13 = this.f95794d;
            for (int i14 = 0; i14 < i13; i14++) {
                boolean[] zArr = editor.f95813b;
                Intrinsics.f(zArr);
                if (!zArr[i14]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i14);
                }
                if (!this.f95791a.b((File) entry.f95821d.get(i14))) {
                    editor.a();
                    return;
                }
            }
        }
        int i15 = this.f95794d;
        for (int i16 = 0; i16 < i15; i16++) {
            File file = (File) entry.f95821d.get(i16);
            if (!z13 || entry.f95823f) {
                this.f95791a.h(file);
            } else if (this.f95791a.b(file)) {
                File file2 = (File) entry.f95820c.get(i16);
                this.f95791a.g(file, file2);
                long j13 = entry.f95819b[i16];
                long d2 = this.f95791a.d(file2);
                entry.f95819b[i16] = d2;
                this.f95799i = (this.f95799i - j13) + d2;
            }
        }
        entry.f95824g = null;
        if (entry.f95823f) {
            q(entry);
            return;
        }
        this.f95802l++;
        k writer = this.f95800j;
        Intrinsics.f(writer);
        if (!entry.f95822e && !z13) {
            this.f95801k.remove(entry.f95818a);
            writer.l0(E).p1(32);
            writer.l0(entry.f95818a);
            writer.p1(10);
            writer.flush();
            if (this.f95799i <= this.f95795e || g()) {
                this.f95810t.d(this.f95811u, 0L);
            }
        }
        entry.f95822e = true;
        writer.l0(C).p1(32);
        writer.l0(entry.f95818a);
        Intrinsics.checkNotNullParameter(writer, "writer");
        for (long j14 : entry.f95819b) {
            writer.p1(32).O0(j14);
        }
        writer.p1(10);
        if (z13) {
            long j15 = this.f95809s;
            this.f95809s = 1 + j15;
            entry.f95826i = j15;
        }
        writer.flush();
        if (this.f95799i <= this.f95795e) {
        }
        this.f95810t.d(this.f95811u, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f95805o && !this.f95806p) {
                Collection values = this.f95801k.values();
                Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    Editor editor = entry.f95824g;
                    if (editor != null && editor != null) {
                        editor.c();
                    }
                }
                w();
                k kVar = this.f95800j;
                Intrinsics.f(kVar);
                kVar.close();
                this.f95800j = null;
                this.f95806p = true;
                return;
            }
            this.f95806p = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized Editor d(long j13, String key) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            f();
            a();
            z(key);
            Entry entry = (Entry) this.f95801k.get(key);
            if (j13 != A && (entry == null || entry.f95826i != j13)) {
                return null;
            }
            if ((entry != null ? entry.f95824g : null) != null) {
                return null;
            }
            if (entry != null && entry.f95825h != 0) {
                return null;
            }
            if (!this.f95807q && !this.f95808r) {
                k kVar = this.f95800j;
                Intrinsics.f(kVar);
                kVar.l0(D).p1(32).l0(key).p1(10);
                kVar.flush();
                if (this.f95803m) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(this, key);
                    this.f95801k.put(key, entry);
                }
                Editor editor = new Editor(this, entry);
                entry.f95824g = editor;
                return editor;
            }
            this.f95810t.d(this.f95811u, 0L);
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized Snapshot e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f();
        a();
        z(key);
        Entry entry = (Entry) this.f95801k.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot a13 = entry.a();
        if (a13 == null) {
            return null;
        }
        this.f95802l++;
        k kVar = this.f95800j;
        Intrinsics.f(kVar);
        kVar.l0(F).p1(32).l0(key).p1(10);
        if (g()) {
            this.f95810t.d(this.f95811u, 0L);
        }
        return a13;
    }

    public final synchronized void f() {
        boolean z13;
        try {
            byte[] bArr = Util.f95757a;
            if (this.f95805o) {
                return;
            }
            if (this.f95791a.b(this.f95798h)) {
                if (this.f95791a.b(this.f95796f)) {
                    this.f95791a.h(this.f95798h);
                } else {
                    this.f95791a.g(this.f95798h, this.f95796f);
                }
            }
            FileSystem fileSystem = this.f95791a;
            File file = this.f95798h;
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            Intrinsics.checkNotNullParameter(file, "file");
            c f13 = fileSystem.f(file);
            try {
                try {
                    fileSystem.h(file);
                    b.J(f13, null);
                    z13 = true;
                } catch (IOException unused) {
                    Unit unit = Unit.f80348a;
                    b.J(f13, null);
                    fileSystem.h(file);
                    z13 = false;
                }
                this.f95804n = z13;
                if (this.f95791a.b(this.f95796f)) {
                    try {
                        k();
                        h();
                        this.f95805o = true;
                        return;
                    } catch (IOException e13) {
                        Platform.f96214a.getClass();
                        Platform platform = Platform.f96215b;
                        String str = "DiskLruCache " + this.f95792b + " is corrupt: " + e13.getMessage() + ", removing";
                        platform.getClass();
                        Platform.i(5, str, e13);
                        try {
                            close();
                            this.f95791a.a(this.f95792b);
                            this.f95806p = false;
                        } catch (Throwable th3) {
                            this.f95806p = false;
                            throw th3;
                        }
                    }
                }
                o();
                this.f95805o = true;
            } finally {
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f95805o) {
            a();
            w();
            k kVar = this.f95800j;
            Intrinsics.f(kVar);
            kVar.flush();
        }
    }

    public final boolean g() {
        int i13 = this.f95802l;
        return i13 >= 2000 && i13 >= this.f95801k.size();
    }

    public final void h() {
        File file = this.f95797g;
        FileSystem fileSystem = this.f95791a;
        fileSystem.h(file);
        Iterator it = this.f95801k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = (Entry) next;
            Editor editor = entry.f95824g;
            int i13 = this.f95794d;
            int i14 = 0;
            if (editor == null) {
                while (i14 < i13) {
                    this.f95799i += entry.f95819b[i14];
                    i14++;
                }
            } else {
                entry.f95824g = null;
                while (i14 < i13) {
                    fileSystem.h((File) entry.f95820c.get(i14));
                    fileSystem.h((File) entry.f95821d.get(i14));
                    i14++;
                }
                it.remove();
            }
        }
    }

    public final void k() {
        File file = this.f95796f;
        FileSystem fileSystem = this.f95791a;
        y i13 = m0.i(fileSystem.e(file));
        try {
            String Z = i13.Z(Long.MAX_VALUE);
            String Z2 = i13.Z(Long.MAX_VALUE);
            String Z3 = i13.Z(Long.MAX_VALUE);
            String Z4 = i13.Z(Long.MAX_VALUE);
            String Z5 = i13.Z(Long.MAX_VALUE);
            if (!Intrinsics.d(f95789y, Z) || !Intrinsics.d(f95790z, Z2) || !Intrinsics.d(String.valueOf(this.f95793c), Z3) || !Intrinsics.d(String.valueOf(this.f95794d), Z4) || Z5.length() > 0) {
                throw new IOException("unexpected journal header: [" + Z + ", " + Z2 + ", " + Z4 + ", " + Z5 + ']');
            }
            int i14 = 0;
            while (true) {
                try {
                    m(i13.Z(Long.MAX_VALUE));
                    i14++;
                } catch (EOFException unused) {
                    this.f95802l = i14 - this.f95801k.size();
                    if (i13.o1()) {
                        this.f95800j = m0.h(new FaultHidingSink(fileSystem.c(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                    } else {
                        o();
                    }
                    Unit unit = Unit.f80348a;
                    b.J(i13, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void m(String str) {
        String substring;
        int K = StringsKt.K(str, ' ', 0, false, 6);
        if (K == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = K + 1;
        int K2 = StringsKt.K(str, ' ', i13, false, 4);
        LinkedHashMap linkedHashMap = this.f95801k;
        if (K2 == -1) {
            substring = str.substring(i13);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = E;
            if (K == str2.length() && z.p(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i13, K2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) linkedHashMap.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            linkedHashMap.put(substring, entry);
        }
        if (K2 != -1) {
            String str3 = C;
            if (K == str3.length() && z.p(str, str3, false)) {
                String substring2 = str.substring(K2 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                List strings = StringsKt.V(substring2, new char[]{' '});
                entry.f95822e = true;
                entry.f95824g = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                if (strings.size() != entry.f95827j.f95794d) {
                    throw new IOException("unexpected journal line: " + strings);
                }
                try {
                    int size = strings.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        entry.f95819b[i14] = Long.parseLong((String) strings.get(i14));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + strings);
                }
            }
        }
        if (K2 == -1) {
            String str4 = D;
            if (K == str4.length() && z.p(str, str4, false)) {
                entry.f95824g = new Editor(this, entry);
                return;
            }
        }
        if (K2 == -1) {
            String str5 = F;
            if (K == str5.length() && z.p(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void o() {
        try {
            k kVar = this.f95800j;
            if (kVar != null) {
                kVar.close();
            }
            x writer = m0.h(this.f95791a.f(this.f95797g));
            try {
                writer.l0(f95789y);
                writer.p1(10);
                writer.l0(f95790z);
                writer.p1(10);
                writer.O0(this.f95793c);
                writer.p1(10);
                writer.O0(this.f95794d);
                writer.p1(10);
                writer.p1(10);
                Iterator it = this.f95801k.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    if (entry.f95824g != null) {
                        writer.l0(D);
                        writer.p1(32);
                        writer.l0(entry.f95818a);
                        writer.p1(10);
                    } else {
                        writer.l0(C);
                        writer.p1(32);
                        writer.l0(entry.f95818a);
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        for (long j13 : entry.f95819b) {
                            writer.p1(32);
                            writer.O0(j13);
                        }
                        writer.p1(10);
                    }
                }
                Unit unit = Unit.f80348a;
                b.J(writer, null);
                if (this.f95791a.b(this.f95796f)) {
                    this.f95791a.g(this.f95796f, this.f95798h);
                }
                this.f95791a.g(this.f95797g, this.f95796f);
                this.f95791a.h(this.f95798h);
                this.f95800j = m0.h(new FaultHidingSink(this.f95791a.c(this.f95796f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                this.f95803m = false;
                this.f95808r = false;
            } finally {
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void q(Entry entry) {
        k kVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f95804n) {
            if (entry.f95825h > 0 && (kVar = this.f95800j) != null) {
                kVar.l0(D);
                kVar.p1(32);
                kVar.l0(entry.f95818a);
                kVar.p1(10);
                kVar.flush();
            }
            if (entry.f95825h > 0 || entry.f95824g != null) {
                entry.f95823f = true;
                return;
            }
        }
        Editor editor = entry.f95824g;
        if (editor != null) {
            editor.c();
        }
        for (int i13 = 0; i13 < this.f95794d; i13++) {
            this.f95791a.h((File) entry.f95820c.get(i13));
            long j13 = this.f95799i;
            long[] jArr = entry.f95819b;
            this.f95799i = j13 - jArr[i13];
            jArr[i13] = 0;
        }
        this.f95802l++;
        k kVar2 = this.f95800j;
        String str = entry.f95818a;
        if (kVar2 != null) {
            kVar2.l0(E);
            kVar2.p1(32);
            kVar2.l0(str);
            kVar2.p1(10);
        }
        this.f95801k.remove(str);
        if (g()) {
            this.f95810t.d(this.f95811u, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "toEvict");
        q(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f95799i
            long r2 = r4.f95795e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            java.util.LinkedHashMap r0 = r4.f95801k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            okhttp3.internal.cache.DiskLruCache$Entry r1 = (okhttp3.internal.cache.DiskLruCache.Entry) r1
            boolean r2 = r1.f95823f
            if (r2 != 0) goto L12
            java.lang.String r0 = "toEvict"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r4.q(r1)
            goto L0
        L2b:
            return
        L2c:
            r0 = 0
            r4.f95807q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.w():void");
    }
}

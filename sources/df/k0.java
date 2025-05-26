package df;

import c2.n2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f54779h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLong f54780i;

    /* renamed from: a, reason: collision with root package name */
    public final String f54781a;

    /* renamed from: b, reason: collision with root package name */
    public final n2 f54782b;

    /* renamed from: c, reason: collision with root package name */
    public final File f54783c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54784d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f54785e;

    /* renamed from: f, reason: collision with root package name */
    public final Condition f54786f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f54787g;

    static {
        String simpleName = k0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "FileLruCache::class.java.simpleName");
        f54779h = simpleName;
        f54780i = new AtomicLong();
    }

    public k0(String tag, n2 limits) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f54781a = tag;
        this.f54782b = limits;
        le.v vVar = le.v.f83104a;
        k1.f();
        tb.c cVar = le.v.f83111h;
        if (cVar == null) {
            Intrinsics.r("cacheDir");
            throw null;
        }
        CountDownLatch countDownLatch = (CountDownLatch) cVar.f116960b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        File root = new File((File) cVar.f116959a, this.f54781a);
        this.f54783c = root;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f54785e = reentrantLock;
        this.f54786f = reentrantLock.newCondition();
        this.f54787g = new AtomicLong(0L);
        if (root.mkdirs() || root.isDirectory()) {
            Intrinsics.checkNotNullParameter(root, "root");
            File[] listFiles = root.listFiles(l.f54791c);
            if (listFiles != null) {
                int length = listFiles.length;
                int i13 = 0;
                while (i13 < length) {
                    File file = listFiles[i13];
                    i13++;
                    file.delete();
                }
            }
        }
    }

    public final BufferedInputStream a(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = this.f54783c;
        Intrinsics.checkNotNullParameter(key, "key");
        Charset charset = Charsets.UTF_8;
        if (key == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = key.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        File file2 = new File(file, j1.C0("MD5", bytes));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            try {
                JSONObject d2 = l.d(bufferedInputStream);
                if (d2 == null) {
                    return null;
                }
                if (!Intrinsics.d(d2.optString("key"), key)) {
                    return null;
                }
                String optString = d2.optString("tag", null);
                if (str == null && !Intrinsics.d(str, optString)) {
                    return null;
                }
                long time = new Date().getTime();
                wc.b bVar = u0.f54860d;
                wc.b.x(le.g0.CACHE, f54779h, "Setting lastModified to " + time + " for " + ((Object) file2.getName()));
                file2.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final BufferedOutputStream b(String key, String str) {
        String str2 = f54779h;
        Intrinsics.checkNotNullParameter(key, "key");
        File file = new File(this.f54783c, Intrinsics.n(Long.valueOf(f54780i.incrementAndGet()), "buffer"));
        file.delete();
        if (!file.createNewFile()) {
            throw new IOException(Intrinsics.n(file.getAbsolutePath(), "Could not create file at "));
        }
        try {
            BufferedOutputStream stream = new BufferedOutputStream(new g0(new FileOutputStream(file), new j0(System.currentTimeMillis(), this, file, key)), 8192);
            try {
                try {
                    JSONObject header = new JSONObject();
                    header.put("key", key);
                    if (!j1.V0(str)) {
                        header.put("tag", str);
                    }
                    Intrinsics.checkNotNullParameter(stream, "stream");
                    Intrinsics.checkNotNullParameter(header, "header");
                    String jSONObject = header.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "header.toString()");
                    byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    stream.write(0);
                    stream.write((bytes.length >> 16) & 255);
                    stream.write((bytes.length >> 8) & 255);
                    stream.write(bytes.length & 255);
                    stream.write(bytes);
                    return stream;
                } catch (JSONException e13) {
                    wc.b bVar = u0.f54860d;
                    wc.b.z(le.g0.CACHE, str2, Intrinsics.n(e13, "Error creating JSON header for cache file: "));
                    throw new IOException(e13.getMessage());
                }
            } catch (Throwable th3) {
                stream.close();
                throw th3;
            }
        } catch (FileNotFoundException e14) {
            wc.b bVar2 = u0.f54860d;
            wc.b.z(le.g0.CACHE, str2, Intrinsics.n(e14, "Error creating buffer output stream: "));
            throw new IOException(e14.getMessage());
        }
    }

    public final String toString() {
        return "{FileLruCache: tag:" + this.f54781a + " file:" + ((Object) this.f54783c.getName()) + '}';
    }
}

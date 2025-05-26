package x02;

import android.content.Context;
import android.util.LruCache;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final gi2.b f131544c = new gi2.b();

    /* renamed from: d, reason: collision with root package name */
    public static final LruCache f131545d = new LruCache(20);

    /* renamed from: e, reason: collision with root package name */
    public static final mc.g f131546e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f131547f;

    /* renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f131548g;

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f131549a;

    /* renamed from: b, reason: collision with root package name */
    public final mc.g f131550b;

    static {
        Context context = kb0.a.f79058b;
        f131546e = new mc.g(new x1(m60.f0.X()));
        f131547f = new AtomicBoolean(false);
        f131548g = new LinkedHashMap();
    }

    public z1() {
        LruCache memoryCache = f131545d;
        mc.g diskCache = f131546e;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        this.f131549a = memoryCache;
        this.f131550b = diskCache;
        if (f131547f.getAndSet(true)) {
            return;
        }
        synchronized (diskCache) {
            if (!diskCache.f86898c.a().exists()) {
                if (!diskCache.f86898c.a().mkdirs()) {
                    diskCache.f86898c.a().getAbsolutePath();
                }
                return;
            }
            File[] listFiles = diskCache.f86898c.a().listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                BufferedInputStream bufferedInputStream = null;
                try {
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                        try {
                            mc.e a13 = mc.e.a(bufferedInputStream2);
                            a13.f86887a = file.length();
                            diskCache.f(a13.f86888b, a13);
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                            bufferedInputStream = bufferedInputStream2;
                            if (file != null) {
                                file.delete();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream = bufferedInputStream2;
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused4) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    public static String a(String str) {
        String concat = "1_".concat(str);
        Intrinsics.checkNotNullExpressionValue(concat, "toString(...)");
        return concat;
    }
}

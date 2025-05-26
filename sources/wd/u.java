package wd;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f129205e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f129206f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f129207g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile u f129208h;

    /* renamed from: b, reason: collision with root package name */
    public int f129210b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f129211c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f129212d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f129209a = 20000;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f129205e = i13 < 29;
        f129206f = i13 >= 28;
        f129207g = new File("/proc/self/fd");
    }

    public static u b() {
        if (f129208h == null) {
            synchronized (u.class) {
                try {
                    if (f129208h == null) {
                        f129208h = new u();
                    }
                } finally {
                }
            }
        }
        return f129208h;
    }

    public final boolean a() {
        return f129205e && !this.f129212d.get();
    }

    public final int c() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f129209a;
    }

    public final synchronized boolean d() {
        try {
            boolean z13 = true;
            int i13 = this.f129210b + 1;
            this.f129210b = i13;
            if (i13 >= 50) {
                this.f129210b = 0;
                int length = f129207g.list().length;
                long c13 = c();
                if (length >= c13) {
                    z13 = false;
                }
                this.f129211c = z13;
                if (!z13 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c13);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f129211c;
    }

    public final boolean e(int i13, int i14, boolean z13, boolean z14) {
        if (!z13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f129206f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z14) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i13 < 0 || i14 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}

package qd;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f103551j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f103552a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f103553b;

    /* renamed from: c, reason: collision with root package name */
    public final wc.j f103554c;

    /* renamed from: d, reason: collision with root package name */
    public final long f103555d;

    /* renamed from: e, reason: collision with root package name */
    public long f103556e;

    /* renamed from: f, reason: collision with root package name */
    public int f103557f;

    /* renamed from: g, reason: collision with root package name */
    public int f103558g;

    /* renamed from: h, reason: collision with root package name */
    public int f103559h;

    /* renamed from: i, reason: collision with root package name */
    public int f103560i;

    public j(long j13) {
        o oVar = new o();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f103555d = j13;
        this.f103552a = oVar;
        this.f103553b = unmodifiableSet;
        this.f103554c = new wc.j(4);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f103557f + ", misses=" + this.f103558g + ", puts=" + this.f103559h + ", evictions=" + this.f103560i + ", currentSize=" + this.f103556e + ", maxSize=" + this.f103555d + "\nStrategy=" + this.f103552a);
    }

    @Override // qd.d
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f103552a.D(bitmap) <= this.f103555d && this.f103553b.contains(bitmap.getConfig())) {
                int D = this.f103552a.D(bitmap);
                this.f103552a.b(bitmap);
                this.f103554c.getClass();
                this.f103559h++;
                this.f103556e += D;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f103552a.u(bitmap));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                e(this.f103555d);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f103552a.u(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f103553b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized Bitmap c(int i13, int i14, Bitmap.Config config) {
        Bitmap g13;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            g13 = this.f103552a.g(i13, i14, config != null ? config : f103551j);
            if (g13 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f103552a.B(i13, i14, config));
                }
                this.f103558g++;
            } else {
                this.f103557f++;
                this.f103556e -= this.f103552a.D(g13);
                this.f103554c.getClass();
                g13.setHasAlpha(true);
                g13.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f103552a.B(i13, i14, config));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return g13;
    }

    public final long d() {
        return this.f103555d;
    }

    public final synchronized void e(long j13) {
        while (this.f103556e > j13) {
            try {
                Bitmap removeLast = this.f103552a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f103556e = 0L;
                    return;
                }
                this.f103554c.getClass();
                this.f103556e -= this.f103552a.D(removeLast);
                this.f103560i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f103552a.u(removeLast));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                removeLast.recycle();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // qd.d
    public final Bitmap g(int i13, int i14, Bitmap.Config config) {
        Bitmap c13 = c(i13, i14, config);
        if (c13 != null) {
            c13.eraseColor(0);
            return c13;
        }
        if (config == null) {
            config = f103551j;
        }
        return Bitmap.createBitmap(i13, i14, config);
    }

    @Override // qd.d
    public final Bitmap h(int i13, int i14, Bitmap.Config config) {
        Bitmap c13 = c(i13, i14, config);
        if (c13 != null) {
            return c13;
        }
        if (config == null) {
            config = f103551j;
        }
        return Bitmap.createBitmap(i13, i14, config);
    }

    @Override // qd.d
    public final void p(int i13) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i13);
        }
        if (i13 >= 40 || i13 >= 20) {
            q();
        } else if (i13 >= 20 || i13 == 15) {
            e(d() / 2);
        }
    }

    @Override // qd.d
    public final void q() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0L);
    }
}

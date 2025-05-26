package wd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static final nd.k f129190f = nd.k.a(nd.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final nd.k f129191g = new nd.k("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, nd.k.f90417e);

    /* renamed from: h, reason: collision with root package name */
    public static final nd.k f129192h;

    /* renamed from: i, reason: collision with root package name */
    public static final nd.k f129193i;

    /* renamed from: j, reason: collision with root package name */
    public static final wc.j f129194j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f129195k;

    /* renamed from: a, reason: collision with root package name */
    public final qd.d f129196a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f129197b;

    /* renamed from: c, reason: collision with root package name */
    public final qd.i f129198c;

    /* renamed from: d, reason: collision with root package name */
    public final List f129199d;

    /* renamed from: e, reason: collision with root package name */
    public final u f129200e = u.b();

    static {
        k kVar = m.f129183a;
        Boolean bool = Boolean.FALSE;
        f129192h = nd.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f129193i = nd.k.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f129194j = new wc.j(8);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = he.n.f68959a;
        f129195k = new ArrayDeque(0);
    }

    public o(List list, DisplayMetrics displayMetrics, qd.d dVar, qd.i iVar) {
        this.f129199d = list;
        d7.b.p(displayMetrics, "Argument must not be null");
        this.f129197b = displayMetrics;
        d7.b.p(dVar, "Argument must not be null");
        this.f129196a = dVar;
        d7.b.p(iVar, "Argument must not be null");
        this.f129198c = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(wd.v r5, android.graphics.BitmapFactory.Options r6, wd.n r7, qd.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.j()
            r5.f()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = wd.b0.f129157b
            r4.lock()
            android.graphics.Bitmap r5 = r5.c(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = f(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.b(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = wd.b0.f129157b
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = wd.b0.f129157b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.c(wd.v, android.graphics.BitmapFactory$Options, wd.n, qd.d):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(int i13, int i14, String str, BitmapFactory.Options options, Bitmap bitmap, int i15, int i16, long j13) {
        StringBuilder sb3 = new StringBuilder("Decoded ");
        sb3.append(d(bitmap));
        sb3.append(" from [");
        sb3.append(i13);
        sb3.append("x");
        a.a.A(sb3, i14, "] ", str, " with inBitmap ");
        sb3.append(d(options.inBitmap));
        sb3.append(" for [");
        sb3.append(i15);
        sb3.append("x");
        sb3.append(i16);
        sb3.append("], sample size: ");
        sb3.append(options.inSampleSize);
        sb3.append(", density: ");
        sb3.append(options.inDensity);
        sb3.append(", target density: ");
        sb3.append(options.inTargetDensity);
        sb3.append(", thread: ");
        sb3.append(Thread.currentThread().getName());
        sb3.append(", duration: ");
        sb3.append(he.i.a(j13));
        Log.v("Downsampler", sb3.toString());
    }

    public static IOException f(IllegalArgumentException illegalArgumentException, int i13, int i14, String str, BitmapFactory.Options options) {
        StringBuilder t13 = a.a.t("Exception decoding bitmap, outWidth: ", i13, ", outHeight: ", i14, ", outMimeType: ");
        t13.append(str);
        t13.append(", inBitmap: ");
        t13.append(d(options.inBitmap));
        return new IOException(t13.toString(), illegalArgumentException);
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(v vVar, int i13, int i14, nd.l lVar, n nVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f129198c.c(65536, byte[].class);
        synchronized (o.class) {
            arrayDeque = f129195k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        nd.b bVar = (nd.b) lVar.c(f129190f);
        nd.m mVar = (nd.m) lVar.c(f129191g);
        m mVar2 = (m) lVar.c(m.f129188f);
        boolean booleanValue = ((Boolean) lVar.c(f129192h)).booleanValue();
        nd.k kVar = f129193i;
        try {
            c e13 = c.e(b(vVar, options2, mVar2, bVar, mVar, lVar.c(kVar) != null && ((Boolean) lVar.c(kVar)).booleanValue(), i13, i14, booleanValue, nVar), this.f129196a);
            g(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f129198c.h(bArr);
            return e13;
        } catch (Throwable th3) {
            g(options2);
            ArrayDeque arrayDeque2 = f129195k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f129198c.h(bArr);
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(wd.v r39, android.graphics.BitmapFactory.Options r40, wd.m r41, nd.b r42, nd.m r43, boolean r44, int r45, int r46, boolean r47, wd.n r48) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.b(wd.v, android.graphics.BitmapFactory$Options, wd.m, nd.b, nd.m, boolean, int, int, boolean, wd.n):android.graphics.Bitmap");
    }
}

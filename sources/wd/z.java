package wd;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public final class z extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f129221c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(nd.h.f90415a);

    /* renamed from: b, reason: collision with root package name */
    public final int f129222b;

    public z(int i13) {
        d7.b.n("roundingRadius must be greater than 0.", i13 > 0);
        this.f129222b = i13;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f129221c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f129222b).array());
    }

    @Override // wd.d
    public final Bitmap c(qd.d dVar, Bitmap bitmap, int i13, int i14) {
        Bitmap g13;
        Paint paint = b0.f129156a;
        int i15 = this.f129222b;
        d7.b.n("roundingRadius must be greater than 0.", i15 > 0);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            g13 = bitmap;
        } else {
            g13 = dVar.g(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(g13).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap g14 = dVar.g(g13.getWidth(), g13.getHeight(), config2);
        g14.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g13, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, g14.getWidth(), g14.getHeight());
        Lock lock = b0.f129157b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(g14);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f13 = i15;
            canvas.drawRoundRect(rectF, f13, f13, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!g13.equals(bitmap)) {
                dVar.b(g13);
            }
            return g14;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        return (obj instanceof z) && this.f129222b == ((z) obj).f129222b;
    }

    @Override // nd.h
    public final int hashCode() {
        return he.n.g(-569625254, he.n.g(this.f129222b, 17));
    }
}

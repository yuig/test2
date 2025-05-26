package wd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p f129201a = new p();

    public static c a(qd.d dVar, Drawable drawable, int i13, int i14) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z13 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i13 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i14 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i13 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i14 = current.getIntrinsicHeight();
                    }
                    Lock lock = b0.f129157b;
                    lock.lock();
                    Bitmap g13 = dVar.g(i13, i14, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(g13);
                        current.setBounds(0, 0, i13, i14);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = g13;
                        z13 = true;
                    } catch (Throwable th3) {
                        lock.unlock();
                        throw th3;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z13 = true;
        }
        if (!z13) {
            dVar = f129201a;
        }
        return c.e(bitmap, dVar);
    }
}

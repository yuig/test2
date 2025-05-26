package c5;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class r extends x {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f25831b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f25832c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25833d;

    @Override // c5.x
    public final void b(z zVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(zVar.f25863b).setBigContentTitle(null);
        IconCompat iconCompat = this.f25831b;
        Context context = zVar.f25862a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                q.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f25831b;
                int i13 = iconCompat2.f17931a;
                if (i13 == -1) {
                    Object obj = iconCompat2.f17932b;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i13 == 1) {
                    bitmap = (Bitmap) iconCompat2.f17932b;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat2.f17932b;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    float f13 = min;
                    float f14 = 0.5f * f13;
                    float f15 = 0.9166667f * f14;
                    float f16 = 0.010416667f * f13;
                    paint.setColor(0);
                    paint.setShadowLayer(f16, 0.0f, f13 * 0.020833334f, 1023410176);
                    canvas.drawCircle(f14, f14, f15, paint);
                    paint.setShadowLayer(f16, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f14, f14, f15, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f14, f14, f15, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.f25833d) {
            IconCompat iconCompat3 = this.f25832c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                p.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            q.c(bigContentTitle, false);
            q.b(bigContentTitle, null);
        }
    }

    @Override // c5.x
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

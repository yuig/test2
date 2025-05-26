package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Base64;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import r72.j1;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f52062a = 0;

    static {
        Intrinsics.checkNotNullParameter("BitmapTransformations", "tag");
    }

    public static final Bitmap a(Bitmap bitmap, qd.d dVar, r72.a aVar, boolean z13) {
        Object m13;
        String mask = aVar.f106432b;
        Intrinsics.checkNotNullParameter(mask, "mask");
        try {
            xk2.q qVar = xk2.s.f135225b;
            byte[] decode = Base64.decode(mask, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ALPHA_8;
            m13 = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        xk2.s.a(m13);
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        Bitmap bitmap2 = (Bitmap) m13;
        if (bitmap2 == null) {
            return bitmap;
        }
        Paint paint = new Paint(3);
        j1 j1Var = aVar.f106431a;
        int width = (int) (j1Var.f106508c * bitmap.getWidth());
        int height = (int) (j1Var.f106509d * bitmap.getHeight());
        int width2 = (int) (j1Var.f106506a * bitmap.getWidth());
        int height2 = (int) (j1Var.f106507b * bitmap.getHeight());
        Bitmap g13 = dVar.g(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(g13, "get(...)");
        Canvas canvas = new Canvas(g13);
        canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, new Rect(width2, height2, width2 + width, height2 + height), new Rect(0, 0, width, height), paint);
        if (z13) {
            c(canvas, "BMP");
        }
        bitmap2.recycle();
        return g13;
    }

    public static final Bitmap b(Bitmap bitmap, qd.d dVar, String toScaledPath, boolean z13) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Intrinsics.checkNotNullParameter(toScaledPath, "$this$toScaledPath");
        Path J2 = k3.J(toScaledPath);
        Matrix matrix = new Matrix();
        matrix.postScale(width, height);
        J2.transform(matrix);
        Paint paint = new Paint(3);
        paint.setPathEffect(new CornerPathEffect(4.0f));
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap g13 = dVar.g(width2, height2, config);
        Intrinsics.checkNotNullExpressionValue(g13, "get(...)");
        Canvas canvas = new Canvas(g13);
        canvas.drawPath(J2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Rect rect = new Rect(0, 0, g13.getWidth(), g13.getHeight());
        RectF rectF = new RectF();
        J2.computeBounds(rectF, true);
        Rect rect2 = new Rect();
        rectF.roundOut(rect2);
        if (rect2.intersect(rect)) {
            Bitmap g14 = dVar.g(rect2.width(), rect2.height(), config);
            Intrinsics.checkNotNullExpressionValue(g14, "get(...)");
            new Canvas(g14).drawBitmap(g13, rect2, new Rect(0, 0, rect2.width(), rect2.height()), (Paint) null);
            g13 = g14;
        }
        if (z13) {
            c(new Canvas(g13), "SVG");
        }
        return g13;
    }

    public static final void c(Canvas canvas, String str) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(canvas.getWidth() * 0.1f);
        canvas.drawText(str, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-65536);
        paint.setStrokeWidth(canvas.getWidth() * 0.005f);
        canvas.drawText(str, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
    }
}

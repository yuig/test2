package eo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public interface d {
    void K1(Drawable drawable);

    void M1(int i13);

    void U1(int i13);

    void a2(boolean z13);

    void b2(float f13);

    Drawable getBackground();

    Drawable getDrawable();

    void o0(int i13);

    void onDraw(Canvas canvas);

    void setBackground(Drawable drawable);

    void setBackgroundColor(int i13);

    void setBackgroundDrawable(Drawable drawable);

    void setColorFilter(int i13);

    void setColorFilter(ColorFilter colorFilter);

    void setImageBitmap(Bitmap bitmap);

    void setImageDrawable(Drawable drawable);

    void setScaleType(ImageView.ScaleType scaleType);

    void setVisibility(int i13);
}

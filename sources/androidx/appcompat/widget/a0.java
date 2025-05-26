package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16505c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f16506a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f16507b;

    public a0(ProgressBar progressBar) {
        this.f16506a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i13) {
        ProgressBar progressBar = this.f16506a;
        x92.b N = x92.b.N(progressBar.getContext(), attributeSet, f16505c, i13, 0);
        Drawable y13 = N.y(0);
        if (y13 != null) {
            if (y13 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) y13;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i14 = 0; i14 < numberOfFrames; i14++) {
                    Drawable b13 = b(animationDrawable.getFrame(i14), true);
                    b13.setLevel(10000);
                    animationDrawable2.addFrame(b13, animationDrawable.getDuration(i14));
                }
                animationDrawable2.setLevel(10000);
                y13 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(y13);
        }
        Drawable y14 = N.y(1);
        if (y14 != null) {
            progressBar.setProgressDrawable(b(y14, false));
        }
        N.O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z13) {
        if (drawable instanceof g5.c) {
            ((g5.d) ((g5.c) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i13 = 0; i13 < numberOfLayers; i13++) {
                    int id3 = layerDrawable.getId(i13);
                    drawableArr[i13] = b(layerDrawable.getDrawable(i13), id3 == 16908301 || id3 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i14 = 0; i14 < numberOfLayers; i14++) {
                    layerDrawable2.setId(i14, layerDrawable.getId(i14));
                    layerDrawable2.setLayerGravity(i14, layerDrawable.getLayerGravity(i14));
                    layerDrawable2.setLayerWidth(i14, layerDrawable.getLayerWidth(i14));
                    layerDrawable2.setLayerHeight(i14, layerDrawable.getLayerHeight(i14));
                    layerDrawable2.setLayerInsetLeft(i14, layerDrawable.getLayerInsetLeft(i14));
                    layerDrawable2.setLayerInsetRight(i14, layerDrawable.getLayerInsetRight(i14));
                    layerDrawable2.setLayerInsetTop(i14, layerDrawable.getLayerInsetTop(i14));
                    layerDrawable2.setLayerInsetBottom(i14, layerDrawable.getLayerInsetBottom(i14));
                    layerDrawable2.setLayerInsetStart(i14, layerDrawable.getLayerInsetStart(i14));
                    layerDrawable2.setLayerInsetEnd(i14, layerDrawable.getLayerInsetEnd(i14));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f16507b == null) {
                    this.f16507b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z13 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}

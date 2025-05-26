package o5;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.BulletSpan;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source g(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable i(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* synthetic */ BulletSpan l(int i13, int i14) {
        return new BulletSpan(i13, i14, 5);
    }

    public static /* synthetic */ BulletSpan m(int i13, int i14, int i15) {
        return new BulletSpan(i13, i14, i15);
    }

    public static /* bridge */ /* synthetic */ void w(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean x(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}

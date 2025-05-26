package a;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.style.BulletSpan;
import android.view.DisplayCutout;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i0 {
    public static /* bridge */ /* synthetic */ boolean B(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ PrecomputedText h(Spannable spannable) {
        return (PrecomputedText) spannable;
    }

    public static /* synthetic */ BulletSpan k(int i13, int i14) {
        return new BulletSpan(i13, i14, 10);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout l(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DisplayCutout;
    }
}

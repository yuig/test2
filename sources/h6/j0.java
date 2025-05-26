package h6;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import kh2.m0;

/* loaded from: classes.dex */
public final class j0 implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f67723a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f67724b;

    public j0(Spannable spannable) {
        this.f67724b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f67724b;
        if (!this.f67723a) {
            int i13 = 16;
            if ((Build.VERSION.SDK_INT < 28 ? new v5.x(i13) : new i0(i13)).x(spannable)) {
                this.f67724b = new SpannableString(spannable);
            }
        }
        this.f67723a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f67724b.charAt(i13);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return m0.i(this.f67724b);
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return m0.k(this.f67724b);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f67724b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f67724b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f67724b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i13, int i14, Class cls) {
        return this.f67724b.getSpans(i13, i14, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67724b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i13, int i14, Class cls) {
        return this.f67724b.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f67724b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i13, int i14, int i15) {
        a();
        this.f67724b.setSpan(obj, i13, i14, i15);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return this.f67724b.subSequence(i13, i14);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f67724b.toString();
    }
}

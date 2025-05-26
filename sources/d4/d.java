package d4;

import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class d extends pp2.a {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f53669b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f53670c;

    public d(TextPaint textPaint, CharSequence charSequence) {
        this.f53669b = charSequence;
        this.f53670c = textPaint;
    }

    @Override // pp2.a
    public final int H0(int i13) {
        int textRunCursor;
        CharSequence charSequence = this.f53669b;
        textRunCursor = this.f53670c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 0);
        return textRunCursor;
    }

    @Override // pp2.a
    public final int I0(int i13) {
        int textRunCursor;
        CharSequence charSequence = this.f53669b;
        textRunCursor = this.f53670c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 2);
        return textRunCursor;
    }
}

package e4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57165b;

    public l(boolean z13, boolean z14) {
        this.f57164a = z13;
        this.f57165b = z14;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f57164a);
        textPaint.setStrikeThruText(this.f57165b);
    }
}

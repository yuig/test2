package e4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f57159a;

    /* renamed from: b, reason: collision with root package name */
    public final float f57160b;

    /* renamed from: c, reason: collision with root package name */
    public final float f57161c;

    /* renamed from: d, reason: collision with root package name */
    public final float f57162d;

    public j(float f13, float f14, float f15, int i13) {
        this.f57159a = i13;
        this.f57160b = f13;
        this.f57161c = f14;
        this.f57162d = f15;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f57162d, this.f57160b, this.f57161c, this.f57159a);
    }
}

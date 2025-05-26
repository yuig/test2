package cf0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final String f27637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27640d;

    public a(String fullText, int i13, int i14, String styledText) {
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(styledText, "styledText");
        this.f27637a = fullText;
        this.f27638b = styledText;
        this.f27639c = i13;
        this.f27640d = i14;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        String str = this.f27637a;
        String str2 = this.f27638b;
        int L = StringsKt.L(str, str2, 0, false, 6);
        int min = Math.min(str2.length() + L, str.length());
        float measureText = (z.p(str, str2, false) || Intrinsics.d(str, str2)) ? 0.0f : textPaint.measureText(str, 0, L);
        textPaint.setShader(new LinearGradient(measureText, 0.0f, measureText + textPaint.measureText(str, L, min), 0.0f, this.f27639c, this.f27640d, Shader.TileMode.REPEAT));
    }
}

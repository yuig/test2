package l4;

import a3.f;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import b3.v0;
import bs1.c;
import e0.t;
import i2.o0;
import i2.y3;
import j1.q0;
import y2.h;

/* loaded from: classes3.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f81528a;

    /* renamed from: b, reason: collision with root package name */
    public final float f81529b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f81530c = c.u1(new f(h.f136670b), y3.f71400a);

    /* renamed from: d, reason: collision with root package name */
    public final o0 f81531d = c.S(new q0(this, 24));

    public b(v0 v0Var, float f13) {
        this.f81528a = v0Var;
        this.f81529b = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        t.Q0(textPaint, this.f81529b);
        textPaint.setShader((Shader) this.f81531d.getValue());
    }
}

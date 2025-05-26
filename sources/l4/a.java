package l4;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b3.p0;
import b3.s0;
import d3.i;
import d3.k;
import d3.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final i f81527a;

    public a(i iVar) {
        this.f81527a = iVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            k kVar = k.f53660a;
            i iVar = this.f81527a;
            if (Intrinsics.d(iVar, kVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (iVar instanceof l) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((l) iVar).f53661a);
                textPaint.setStrokeMiter(((l) iVar).f53662b);
                int i13 = ((l) iVar).f53664d;
                textPaint.setStrokeJoin(s0.e(i13, 0) ? Paint.Join.MITER : s0.e(i13, 1) ? Paint.Join.ROUND : s0.e(i13, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i14 = ((l) iVar).f53663c;
                textPaint.setStrokeCap(s0.d(i14, 0) ? Paint.Cap.BUTT : s0.d(i14, 1) ? Paint.Cap.ROUND : s0.d(i14, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                p0 p0Var = ((l) iVar).f53665e;
                textPaint.setPathEffect(p0Var != null ? ((b3.l) p0Var).f21339a : null);
            }
        }
    }
}

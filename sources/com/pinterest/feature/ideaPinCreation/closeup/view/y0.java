package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextPaint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f46379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i13) {
        super(0);
        this.f46378i = i13;
        this.f46379j = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46378i;
        z0 z0Var = this.f46379j;
        switch (i13) {
            case 0:
                Bitmap bitmap = z0Var.f46409v;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                float f13 = z0Var.f46400m.f46332d;
                Path path = new Path();
                path.addRoundRect(0.0f, 0.0f, width, height, f13, f13, Path.Direction.CCW);
                return path;
            case 1:
                return (zf1.e) ((wk2.a) z0Var.f46397j.getValue()).get();
            case 2:
                return new n1(z0Var, z0Var, z0Var, z0Var, z0Var.f46394g, z0Var.f46395h, z0Var.f46396i, z0Var.f46393f);
            default:
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(bs1.c.W(z0Var, eo1.c.font_size_300) * z0Var.f46399l);
                zf1.e eVar = (zf1.e) z0Var.f46398k.getValue();
                Intrinsics.checkNotNullExpressionValue(eVar, "access$getFontManager(...)");
                Typeface d2 = eVar.d(zf1.f.REGULAR_ITALIC);
                if (d2 == null) {
                    d2 = Typeface.DEFAULT;
                }
                textPaint.setTypeface(Typeface.create(d2, 2));
                return textPaint;
        }
    }
}

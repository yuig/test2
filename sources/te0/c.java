package te0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117483a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f117484b;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117484b = f0.h.K(context);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint drawState) {
        int i13 = this.f117483a;
        Typeface typeface = this.f117484b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(drawState, "drawState");
                drawState.setFakeBoldText(false);
                drawState.setTypeface(typeface);
                break;
            default:
                Intrinsics.checkNotNullParameter(drawState, "paint");
                drawState.setTypeface(typeface);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        Typeface typeface = this.f117484b;
        switch (this.f117483a) {
            case 0:
                Intrinsics.checkNotNullParameter(paint, "paint");
                paint.setFakeBoldText(false);
                paint.setTypeface(typeface);
                break;
            default:
                Intrinsics.checkNotNullParameter(paint, "paint");
                paint.setTypeface(typeface);
                break;
        }
    }

    public c(Typeface typeface) {
        this.f117484b = typeface;
    }
}

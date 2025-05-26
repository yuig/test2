package ua;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class f0 implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121255a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f121256b;

    public /* synthetic */ f0(int i13, Rect rect) {
        this.f121255a = i13;
        this.f121256b = rect;
    }

    public final Rect a(float f13, Rect rect, Rect rect2) {
        Rect rect3 = this.f121256b;
        switch (this.f121255a) {
            case 0:
                int i13 = rect.left + ((int) ((rect2.left - r1) * f13));
                int i14 = rect.top + ((int) ((rect2.top - r2) * f13));
                int i15 = rect.right + ((int) ((rect2.right - r3) * f13));
                int i16 = rect.bottom + ((int) ((rect2.bottom - r7) * f13));
                if (rect3 != null) {
                    rect3.set(i13, i14, i15, i16);
                    break;
                } else {
                    break;
                }
            default:
                rect3.set(rect.left + ((int) ((rect2.left - r1) * f13)), rect.top + ((int) ((rect2.top - r2) * f13)), rect.right + ((int) ((rect2.right - r3) * f13)), rect.bottom + ((int) ((rect2.bottom - r7) * f13)));
                break;
        }
        return rect3;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f13, Object obj, Object obj2) {
        switch (this.f121255a) {
        }
        return a(f13, (Rect) obj, (Rect) obj2);
    }

    public f0() {
        this.f121255a = 0;
    }
}

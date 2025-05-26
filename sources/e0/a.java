package e0;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f56691a;

    /* renamed from: b, reason: collision with root package name */
    public final Rational f56692b;

    public a(Rational rational, Rational rational2) {
        this.f56692b = rational2 == null ? new Rational(4, 3) : rational2;
        this.f56691a = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public final RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = this.f56692b;
        return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z13 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF b13 = b(rational);
        RectF b14 = b(rational2);
        RectF rectF = this.f56691a;
        boolean z14 = b13.width() >= rectF.width() && b13.height() >= rectF.height();
        if (b14.width() >= rectF.width() && b14.height() >= rectF.height()) {
            z13 = true;
        }
        if (z14 && z13) {
            return (int) Math.signum((b13.height() * b13.width()) - (b14.height() * b14.width()));
        }
        if (z14) {
            return -1;
        }
        if (z13) {
            return 1;
        }
        return -((int) Math.signum(a(b13, rectF) - a(b14, rectF)));
    }
}

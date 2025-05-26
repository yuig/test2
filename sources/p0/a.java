package p0;

import android.util.Rational;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rational f98295a;

    public a(Rational rational) {
        this.f98295a = rational;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj2;
        float floatValue = ((Rational) obj).floatValue();
        Rational rational2 = this.f98295a;
        float floatValue2 = rational2.floatValue();
        float f13 = floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
        float floatValue3 = rational.floatValue();
        float floatValue4 = rational2.floatValue();
        return Float.compare(floatValue3 > floatValue4 ? floatValue4 / floatValue3 : floatValue3 / floatValue4, f13);
    }
}

package nt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f92297a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f92298b;

    /* renamed from: c, reason: collision with root package name */
    public int f92299c;

    public f(int i13) {
        this.f92297a = i13;
        this.f92298b = new ArrayList(i13);
    }

    public final Number a() {
        ArrayList arrayList = this.f92298b;
        Number number = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        j0.s(arrayList2);
        if (arrayList2.size() % 2 == 1) {
            return (Number) arrayList2.get(arrayList2.size() / 2);
        }
        int size = arrayList2.size() / 2;
        List subList = arrayList2.subList(size - 1, size + 1);
        Intrinsics.checkNotNullExpressionValue(subList, "subList(...)");
        List values = subList;
        Intrinsics.checkNotNullParameter(values, "values");
        Number number2 = (Number) CollectionsKt.T(values);
        if (number2 != null) {
            int i13 = 0;
            double d2 = 0.0d;
            if (number2 instanceof Byte) {
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    d2 += ((Number) it.next()).byteValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Byte.valueOf((byte) ml2.c.d(i13 != 0 ? d2 / i13 : Double.NaN));
            } else if (number2 instanceof Short) {
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    d2 += ((Number) it2.next()).shortValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Short.valueOf((short) ml2.c.d(i13 != 0 ? d2 / i13 : Double.NaN));
            } else if (number2 instanceof Integer) {
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it3 = values.iterator();
                while (it3.hasNext()) {
                    d2 += ((Number) it3.next()).intValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Integer.valueOf((int) ml2.c.d(i13 != 0 ? d2 / i13 : Double.NaN));
            } else if (number2 instanceof Long) {
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it4 = values.iterator();
                while (it4.hasNext()) {
                    d2 += ((Number) it4.next()).longValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Long.valueOf(ml2.c.d(i13 != 0 ? d2 / i13 : Double.NaN));
            } else if (number2 instanceof Float) {
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it5 = values.iterator();
                while (it5.hasNext()) {
                    d2 += ((Number) it5.next()).floatValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Float.valueOf((float) (i13 != 0 ? d2 / i13 : Double.NaN));
            } else {
                if (!(number2 instanceof Double)) {
                    throw new RuntimeException(a.a.k("Unhandled numeric type in average [", number2.getClass().getName(), "]"));
                }
                Intrinsics.checkNotNullParameter(values, "<this>");
                Iterator it6 = values.iterator();
                while (it6.hasNext()) {
                    d2 += ((Number) it6.next()).doubleValue();
                    i13++;
                    if (i13 < 0) {
                        f0.o();
                        throw null;
                    }
                }
                number = Double.valueOf(i13 != 0 ? d2 / i13 : Double.NaN);
            }
        }
        return number;
    }
}

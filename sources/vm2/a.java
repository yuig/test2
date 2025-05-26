package vm2;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.q0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f126210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126213d;

    /* renamed from: e, reason: collision with root package name */
    public final List f126214e;

    public a(int... numbers) {
        List list;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f126210a = numbers;
        Integer I = c0.I(numbers, 0);
        this.f126211b = I != null ? I.intValue() : -1;
        Integer I2 = c0.I(numbers, 1);
        this.f126212c = I2 != null ? I2.intValue() : -1;
        Integer I3 = c0.I(numbers, 2);
        this.f126213d = I3 != null ? I3.intValue() : -1;
        if (numbers.length <= 3) {
            list = q0.f80391a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(cb.l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            list = CollectionsKt.F0(z.e(numbers).subList(3, numbers.length));
        }
        this.f126214e = list;
    }

    public final boolean a(int i13, int i14, int i15) {
        int i16 = this.f126211b;
        if (i16 > i13) {
            return true;
        }
        if (i16 < i13) {
            return false;
        }
        int i17 = this.f126212c;
        if (i17 > i14) {
            return true;
        }
        return i17 >= i14 && this.f126213d >= i15;
    }

    public final boolean b() {
        int i13 = this.f126211b;
        if (i13 < 1) {
            return true;
        }
        if (i13 > 1) {
            return false;
        }
        int i14 = this.f126212c;
        if (i14 < 4) {
            return true;
        }
        return i14 <= 4 && this.f126213d <= 1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && Intrinsics.d(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f126211b == aVar.f126211b && this.f126212c == aVar.f126212c && this.f126213d == aVar.f126213d && Intrinsics.d(this.f126214e, aVar.f126214e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f126211b;
        int i14 = (i13 * 31) + this.f126212c + i13;
        int i15 = (i14 * 31) + this.f126213d + i14;
        return this.f126214e.hashCode() + (i15 * 31) + i15;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i13 : this.f126210a) {
            if (i13 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.Z(arrayList, ".", null, null, 0, null, null, 62);
    }
}

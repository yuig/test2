package p1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public final float f98522a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98523b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f98524c;

    /* renamed from: d, reason: collision with root package name */
    public final float f98525d;

    public i(float f13, boolean z13, Function2 function2) {
        this.f98522a = f13;
        this.f98523b = z13;
        this.f98524c = function2;
        this.f98525d = f13;
    }

    @Override // p1.h, p1.j
    public final float a() {
        return this.f98525d;
    }

    @Override // p1.j
    public final void b(n4.b bVar, int i13, int[] iArr, int[] iArr2) {
        c(bVar, i13, iArr, n4.k.Ltr, iArr2);
    }

    @Override // p1.h
    public final void c(n4.b bVar, int i13, int[] iArr, n4.k kVar, int[] iArr2) {
        int i14;
        int i15;
        if (iArr.length == 0) {
            return;
        }
        int R = bVar.R(this.f98522a);
        boolean z13 = this.f98523b && kVar == n4.k.Rtl;
        g gVar = l.f98543a;
        if (z13) {
            i14 = 0;
            i15 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i16 = iArr[length];
                int min = Math.min(i14, i13 - i16);
                iArr2[length] = min;
                i15 = Math.min(R, (i13 - min) - i16);
                i14 = iArr2[length] + i16 + i15;
            }
        } else {
            int length2 = iArr.length;
            int i17 = 0;
            i14 = 0;
            i15 = 0;
            int i18 = 0;
            while (i17 < length2) {
                int i19 = iArr[i17];
                int min2 = Math.min(i14, i13 - i19);
                iArr2[i18] = min2;
                int min3 = Math.min(R, (i13 - min2) - i19);
                int i23 = iArr2[i18] + i19 + min3;
                i17++;
                i18++;
                i15 = min3;
                i14 = i23;
            }
        }
        int i24 = i14 - i15;
        Function2 function2 = this.f98524c;
        if (function2 == null || i24 >= i13) {
            return;
        }
        int intValue = ((Number) function2.invoke(Integer.valueOf(i13 - i24), kVar)).intValue();
        int length3 = iArr2.length;
        for (int i25 = 0; i25 < length3; i25++) {
            iArr2[i25] = iArr2[i25] + intValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n4.e.a(this.f98522a, iVar.f98522a) && this.f98523b == iVar.f98523b && Intrinsics.d(this.f98524c, iVar.f98524c);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f98523b, Float.hashCode(this.f98522a) * 31, 31);
        Function2 function2 = this.f98524c;
        return e13 + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f98523b ? "" : "Absolute");
        sb3.append("Arrangement#spacedAligned(");
        sb3.append((Object) n4.e.b(this.f98522a));
        sb3.append(", ");
        sb3.append(this.f98524c);
        sb3.append(')');
        return sb3.toString();
    }
}

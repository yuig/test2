package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63347a = k0.f63281a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63348b = h1.a.f66447c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f63349c = j.f63276a;

    /* renamed from: d, reason: collision with root package name */
    public int f63350d;

    /* renamed from: e, reason: collision with root package name */
    public int f63351e;

    /* renamed from: f, reason: collision with root package name */
    public int f63352f;

    public y() {
        h(k0.g(6));
    }

    public final void a() {
        this.f63351e = 0;
        long[] jArr = this.f63347a;
        if (jArr != k0.f63281a) {
            kotlin.collections.z.q(jArr);
            long[] jArr2 = this.f63347a;
            int i13 = this.f63350d;
            int i14 = i13 >> 3;
            long j13 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j13)) | j13;
        }
        kotlin.collections.z.o(0, this.f63350d, null, this.f63348b);
        g();
    }

    public final boolean b() {
        return e(null) >= 0;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f63351e != this.f63351e) {
            return false;
        }
        Object[] objArr = this.f63348b;
        float[] fArr = this.f63349c;
        long[] jArr = this.f63347a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj2 = objArr[i16];
                            float f13 = fArr[i16];
                            int e13 = yVar.e(obj2);
                            if (e13 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f13 != yVar.f63349c[e13]) {
                                return false;
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return true;
    }

    public final int d(int i13) {
        int i14 = this.f63350d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63347a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j14 = j13 & ((~j13) << 7) & (-9187201950435737472L);
            if (j14 != 0) {
                return (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int e(Object obj) {
        int i13 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i16 = this.f63350d;
        int i17 = i14 >>> 7;
        while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f63347a;
            int i19 = i18 >> 3;
            int i23 = (i18 & 7) << 3;
            long j13 = ((jArr[i19 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr[i19] >>> i23);
            long j14 = (i15 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i18) & i16;
                if (Intrinsics.d(this.f63348b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        Object[] objArr = this.f63348b;
        float[] fArr = this.f63349c;
        long[] jArr = this.f63347a;
        int length = jArr.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j13) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = objArr[i18];
                            i15 += Float.hashCode(fArr[i18]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j13 >>= 8;
                    }
                    if (i16 != 8) {
                        return i15;
                    }
                }
                if (i14 == length) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
        }
        return i13;
    }

    public final void g() {
        this.f63352f = k0.c(this.f63350d) - this.f63351e;
    }

    public final void h(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63350d = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63347a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        g();
        this.f63348b = new Object[max];
        this.f63349c = new float[max];
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (this.f63351e == 0) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder("{");
        Object[] objArr = this.f63348b;
        float[] fArr = this.f63349c;
        long[] jArr = this.f63347a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            int i17 = (i13 << 3) + i16;
                            Object obj = objArr[i17];
                            float f13 = fArr[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb3.append(obj);
                            sb3.append("=");
                            sb3.append(f13);
                            i14++;
                            if (i14 < this.f63351e) {
                                sb3.append(", ");
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        sb3.append('}');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "s.append('}').toString()");
        return sb4;
    }
}

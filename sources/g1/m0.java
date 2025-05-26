package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63285a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f63286b;

    /* renamed from: c, reason: collision with root package name */
    public int f63287c;

    /* renamed from: d, reason: collision with root package name */
    public int f63288d;

    public final boolean a(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i15 = this.f63287c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f63285a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (i14 * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (Intrinsics.d(this.f63286b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    public final boolean b() {
        return this.f63288d == 0;
    }

    public final boolean c() {
        return this.f63288d != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (m0Var.f63288d != this.f63288d) {
            return false;
        }
        Object[] objArr = this.f63286b;
        long[] jArr = this.f63285a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !m0Var.a(objArr[(i13 << 3) + i15])) {
                            return false;
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

    public final int hashCode() {
        Object[] objArr = this.f63286b;
        long[] jArr = this.f63285a;
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
                            Object obj = objArr[(i14 << 3) + i17];
                            i15 += obj != null ? obj.hashCode() : 0;
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

    public final String toString() {
        int i13;
        q0.e eVar = new q0.e(this, 2);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        Object[] objArr = this.f63286b;
        long[] jArr = this.f63285a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i14 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j13 & 255) < 128) {
                            Object obj = objArr[(i14 << 3) + i18];
                            if (i15 == -1) {
                                sb3.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i15 != 0) {
                                sb3.append((CharSequence) ", ");
                            }
                            sb3.append((CharSequence) eVar.invoke(obj));
                            i15++;
                            i13 = 8;
                        } else {
                            i13 = i16;
                        }
                        j13 >>= i13;
                        i18++;
                        i16 = i13;
                    }
                    if (i17 != i16) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        sb3.append((CharSequence) "]");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}

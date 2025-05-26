package g1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f63342a = k0.f63281a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f63343b = o.f63291a;

    /* renamed from: c, reason: collision with root package name */
    public int f63344c;

    /* renamed from: d, reason: collision with root package name */
    public int f63345d;

    /* renamed from: e, reason: collision with root package name */
    public int f63346e;

    public x(int i13) {
        if (i13 >= 0) {
            e(k0.g(i13));
        } else {
            kh2.n.h0("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j13) {
        int hashCode = Long.hashCode(j13) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK;
        int i15 = this.f63344c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f63342a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j15 = (i14 * 72340172838076673L) ^ j14;
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (this.f63343b[numberOfTrailingZeros] == j13) {
                    return numberOfTrailingZeros >= 0;
                }
            }
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f63345d != this.f63345d) {
            return false;
        }
        long[] jArr = this.f63343b;
        long[] jArr2 = this.f63342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j13 = jArr2[i13];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j13) < 128 && !xVar.a(jArr[(i13 << 3) + i15])) {
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

    public final int c(int i13) {
        int i14 = this.f63344c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f63342a;
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

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        long[] jArr = this.f63343b;
        long[] jArr2 = this.f63342a;
        int length = jArr2.length - 2;
        int i13 = 0;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                long j13 = jArr2[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j13) < 128) {
                            i15 = Long.hashCode(jArr[(i14 << 3) + i17]) + i15;
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

    public final void e(int i13) {
        long[] jArr;
        int max = i13 > 0 ? Math.max(7, k0.f(i13)) : 0;
        this.f63344c = max;
        if (max == 0) {
            jArr = k0.f63281a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            kotlin.collections.z.q(jArr);
        }
        this.f63342a = jArr;
        int i14 = max >> 3;
        long j13 = 255 << ((max & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j13)) | j13;
        this.f63346e = k0.c(this.f63344c) - this.f63345d;
        this.f63343b = new long[max];
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "[");
        long[] jArr = this.f63343b;
        long[] jArr2 = this.f63342a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i16 = 0;
            int i17 = 0;
            loop0: while (true) {
                long j13 = jArr2[i16];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8;
                    int i19 = 8 - ((~(i16 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i19) {
                        if ((j13 & 255) < 128) {
                            i14 = i16;
                            long j14 = jArr[(i16 << 3) + i23];
                            if (i17 == -1) {
                                sb3.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i17 != 0) {
                                sb3.append((CharSequence) ", ");
                            }
                            sb3.append(j14);
                            i17++;
                            i15 = 8;
                        } else {
                            i14 = i16;
                            i15 = i18;
                        }
                        j13 >>= i15;
                        i23++;
                        i18 = i15;
                        i16 = i14;
                    }
                    int i24 = i16;
                    if (i19 != i18) {
                        break;
                    }
                    i13 = i24;
                } else {
                    i13 = i16;
                }
                if (i13 == length) {
                    break;
                }
                i16 = i13 + 1;
            }
        }
        sb3.append((CharSequence) "]");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}

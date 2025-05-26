package j1;

import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f74053a;

    public e1(d1 d1Var) {
        this.f74053a = d1Var;
    }

    @Override // j1.n
    public final u2 a(p2 p2Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i13;
        d1 d1Var = this.f74053a;
        g1.t tVar = new g1.t(d1Var.f74022b.f63329e + 2);
        g1.u uVar = d1Var.f74022b;
        g1.u uVar2 = new g1.u(uVar.f63329e);
        int[] iArr3 = uVar.f63326b;
        Object[] objArr3 = uVar.f63327c;
        long[] jArr = uVar.f63325a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j13 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            int i19 = iArr3[i18];
                            z0 z0Var = (z0) objArr3[i18];
                            tVar.b(i19);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            uVar2.l(i19, new Pair(p2Var.f74197a.invoke(z0Var.f74322a), z0Var.f74323b));
                            i13 = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i13 = i15;
                        }
                        j13 >>= i13;
                        i17++;
                        i15 = i13;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!uVar.b(0)) {
            tVar.a();
        }
        if (!uVar.b(d1Var.f74021a)) {
            tVar.b(d1Var.f74021a);
        }
        int i23 = tVar.f63324b;
        if (i23 != 0) {
            int[] iArr4 = tVar.f63323a;
            Intrinsics.checkNotNullParameter(iArr4, "<this>");
            Arrays.sort(iArr4, 0, i23);
        }
        return new b3(tVar, uVar2, d1Var.f74021a, Float.NaN);
    }
}

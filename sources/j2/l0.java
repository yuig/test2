package j2;

import ao2.m0;
import i2.y2;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 extends pk.a0 {

    /* renamed from: b, reason: collision with root package name */
    public int f74462b;

    /* renamed from: d, reason: collision with root package name */
    public int f74464d;

    /* renamed from: f, reason: collision with root package name */
    public int f74466f;

    /* renamed from: g, reason: collision with root package name */
    public int f74467g;

    /* renamed from: h, reason: collision with root package name */
    public int f74468h;

    /* renamed from: a, reason: collision with root package name */
    public j0[] f74461a = new j0[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f74463c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f74465e = new Object[16];

    public static final int z1(l0 l0Var, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i13);
    }

    public final void A1() {
        this.f74462b = 0;
        this.f74464d = 0;
        kotlin.collections.z.o(0, this.f74466f, null, this.f74465e);
        this.f74466f = 0;
    }

    public final void B1(i2.f fVar, y2 y2Var, i2.y yVar) {
        l0 l0Var;
        int i13;
        if (D1()) {
            k0 k0Var = new k0(this);
            do {
                l0Var = k0Var.f74459d;
                j0 j0Var = l0Var.f74461a[k0Var.f74456a];
                Intrinsics.f(j0Var);
                j0Var.a(k0Var, fVar, y2Var, yVar);
                int i14 = k0Var.f74456a;
                if (i14 >= l0Var.f74462b) {
                    break;
                }
                j0 j0Var2 = l0Var.f74461a[i14];
                Intrinsics.f(j0Var2);
                k0Var.f74457b += j0Var2.f74453a;
                k0Var.f74458c += j0Var2.f74454b;
                i13 = k0Var.f74456a + 1;
                k0Var.f74456a = i13;
            } while (i13 < l0Var.f74462b);
        }
        A1();
    }

    public final boolean C1() {
        return this.f74462b == 0;
    }

    public final boolean D1() {
        return this.f74462b != 0;
    }

    public final j0 E1() {
        j0 j0Var = this.f74461a[this.f74462b - 1];
        Intrinsics.f(j0Var);
        return j0Var;
    }

    public final void F1(j0 j0Var) {
        int i13 = j0Var.f74453a;
        int i14 = j0Var.f74454b;
        if (i13 == 0 && i14 == 0) {
            G1(j0Var);
            return;
        }
        m0.o0("Cannot push " + j0Var + " without arguments because it expects " + i13 + " ints and " + i14 + " objects.");
        throw null;
    }

    public final void G1(j0 j0Var) {
        this.f74467g = 0;
        this.f74468h = 0;
        int i13 = this.f74462b;
        j0[] j0VarArr = this.f74461a;
        if (i13 == j0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(j0VarArr, i13 + (i13 > 1024 ? 1024 : i13));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f74461a = (j0[]) copyOf;
        }
        int i14 = this.f74464d;
        int i15 = j0Var.f74453a;
        int i16 = i14 + i15;
        int[] iArr = this.f74463c;
        int length = iArr.length;
        if (i16 > length) {
            int i17 = length + (length > 1024 ? 1024 : length);
            if (i17 >= i16) {
                i16 = i17;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f74463c = copyOf2;
        }
        int i18 = this.f74466f;
        int i19 = j0Var.f74454b;
        int i23 = i18 + i19;
        Object[] objArr = this.f74465e;
        int length2 = objArr.length;
        if (i23 > length2) {
            int i24 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i24 >= i23) {
                i23 = i24;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i23);
            Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, newSize)");
            this.f74465e = copyOf3;
        }
        j0[] j0VarArr2 = this.f74461a;
        int i25 = this.f74462b;
        this.f74462b = i25 + 1;
        j0VarArr2[i25] = j0Var;
        this.f74464d += i15;
        this.f74466f += i19;
    }

    public final String toString() {
        return super.toString();
    }
}

package i2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f71370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71371b;

    /* renamed from: c, reason: collision with root package name */
    public int f71372c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f71373d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.u f71374e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f71375f;

    public y1(ArrayList arrayList, int i13) {
        this.f71370a = arrayList;
        this.f71371b = i13;
        if (!(i13 >= 0)) {
            ao2.m0.o0("Invalid start index");
            throw null;
        }
        this.f71373d = new ArrayList();
        g1.u uVar = new g1.u();
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            d1 d1Var = (d1) this.f71370a.get(i15);
            int i16 = d1Var.f71091c;
            int i17 = d1Var.f71092d;
            uVar.l(i16, new w0(i15, i14, i17));
            i14 += i17;
        }
        this.f71374e = uVar;
        this.f71375f = xk2.m.b(new androidx.activity.a0(this, 3));
    }

    public final boolean a(int i13, int i14) {
        int i15;
        g1.u uVar = this.f71374e;
        w0 w0Var = (w0) uVar.h(i13);
        if (w0Var == null) {
            return false;
        }
        int i16 = w0Var.f71333b;
        int i17 = i14 - w0Var.f71334c;
        w0Var.f71334c = i14;
        if (i17 == 0) {
            return true;
        }
        Object[] objArr = uVar.f63327c;
        long[] jArr = uVar.f63325a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i18 = 0;
        while (true) {
            long j13 = jArr[i18];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8 - ((~(i18 - length)) >>> 31);
                for (int i23 = 0; i23 < i19; i23++) {
                    if ((255 & j13) < 128) {
                        w0 w0Var2 = (w0) objArr[(i18 << 3) + i23];
                        if (w0Var2.f71333b >= i16 && !Intrinsics.d(w0Var2, w0Var) && (i15 = w0Var2.f71333b + i17) >= 0) {
                            w0Var2.a(i15);
                        }
                    }
                    j13 >>= 8;
                }
                if (i19 != 8) {
                    return true;
                }
            }
            if (i18 == length) {
                return true;
            }
            i18++;
        }
    }
}

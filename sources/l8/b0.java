package l8;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: h, reason: collision with root package name */
    public static final i2.t f81994h = new i2.t(10);

    /* renamed from: i, reason: collision with root package name */
    public static final i2.t f81995i = new i2.t(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f81996a;

    /* renamed from: e, reason: collision with root package name */
    public int f82000e;

    /* renamed from: f, reason: collision with root package name */
    public int f82001f;

    /* renamed from: g, reason: collision with root package name */
    public int f82002g;

    /* renamed from: c, reason: collision with root package name */
    public final a0[] f81998c = new a0[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f81997b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f81999d = -1;

    public b0(int i13) {
        this.f81996a = i13;
    }

    public final void a(int i13, float f13) {
        a0 a0Var;
        int i14 = this.f81999d;
        ArrayList arrayList = this.f81997b;
        if (i14 != 1) {
            Collections.sort(arrayList, f81994h);
            this.f81999d = 1;
        }
        int i15 = this.f82002g;
        a0[] a0VarArr = this.f81998c;
        if (i15 > 0) {
            int i16 = i15 - 1;
            this.f82002g = i16;
            a0Var = a0VarArr[i16];
        } else {
            a0Var = new a0();
        }
        int i17 = this.f82000e;
        this.f82000e = i17 + 1;
        a0Var.f81987a = i17;
        a0Var.f81988b = i13;
        a0Var.f81989c = f13;
        arrayList.add(a0Var);
        this.f82001f += i13;
        while (true) {
            int i18 = this.f82001f;
            int i19 = this.f81996a;
            if (i18 <= i19) {
                return;
            }
            int i23 = i18 - i19;
            a0 a0Var2 = (a0) arrayList.get(0);
            int i24 = a0Var2.f81988b;
            if (i24 <= i23) {
                this.f82001f -= i24;
                arrayList.remove(0);
                int i25 = this.f82002g;
                if (i25 < 5) {
                    this.f82002g = i25 + 1;
                    a0VarArr[i25] = a0Var2;
                }
            } else {
                a0Var2.f81988b = i24 - i23;
                this.f82001f -= i23;
            }
        }
    }

    public final float b() {
        int i13 = this.f81999d;
        ArrayList arrayList = this.f81997b;
        if (i13 != 0) {
            Collections.sort(arrayList, f81995i);
            this.f81999d = 0;
        }
        float f13 = 0.5f * this.f82001f;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            a0 a0Var = (a0) arrayList.get(i15);
            i14 += a0Var.f81988b;
            if (i14 >= f13) {
                return a0Var.f81989c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((a0) ep.b.h(arrayList, 1)).f81989c;
    }
}

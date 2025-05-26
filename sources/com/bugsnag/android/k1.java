package com.bugsnag.android;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile i1[] f29317a;

    public k1(i1[] i1VarArr) {
        this.f29317a = i1VarArr;
    }

    public final void a(String str, String str2) {
        i1[] i1VarArr;
        synchronized (this) {
            try {
                i1[] i1VarArr2 = this.f29317a;
                int length = i1VarArr2.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        i13 = -1;
                        break;
                    }
                    int i14 = i13 + 1;
                    if (Intrinsics.d(i1VarArr2[i13].f29271a, str)) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
                if (i13 == -1) {
                    i1VarArr = (i1[]) kotlin.collections.z.t(i1VarArr2, new i1(str, str2));
                } else {
                    if (Intrinsics.d(i1VarArr2[i13].f29272b, str2)) {
                        return;
                    }
                    Object[] copyOf = Arrays.copyOf(i1VarArr2, i1VarArr2.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                    ((i1[]) copyOf)[i13] = new i1(str, str2);
                    i1VarArr = (i1[]) copyOf;
                }
                this.f29317a = i1VarArr;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        i1[] i1VarArr = this.f29317a;
        o1Var.c();
        int length = i1VarArr.length;
        int i13 = 0;
        while (i13 < length) {
            i1 i1Var = i1VarArr[i13];
            i13++;
            String str = i1Var.f29271a;
            String str2 = i1Var.f29272b;
            o1Var.d();
            o1Var.K("featureFlag");
            o1Var.z(str);
            if (str2 != null) {
                o1Var.K("variant");
                o1Var.z(str2);
            }
            o1Var.g();
        }
        o1Var.f();
    }

    public k1() {
        this(new i1[0]);
    }
}

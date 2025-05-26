package nt;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92247i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f92248j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f92249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(int i13, wy0 wy0Var, int i14) {
        super(1);
        this.f92247i = i14;
        this.f92248j = i13;
        this.f92249k = wy0Var;
    }

    public final rn1.a b(rn1.a it) {
        String Z2;
        int i13 = this.f92247i;
        int i14 = this.f92248j;
        wy0 wy0Var = this.f92249k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String[] strArr = new String[1];
                Z2 = wy0Var != null ? wy0Var.Z2() : null;
                strArr[0] = Z2 != null ? Z2 : "";
                return rn1.a.y(it, bs1.c.j2(strArr, i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String[] strArr2 = new String[1];
                Z2 = wy0Var != null ? wy0Var.Z2() : null;
                strArr2[0] = Z2 != null ? Z2 : "";
                return rn1.a.y(it, bs1.c.j2(strArr2, i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f92247i) {
        }
        return b((rn1.a) obj);
    }
}

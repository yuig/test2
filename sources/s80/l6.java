package s80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l6 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f111663i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f111664j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f111665k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n6 f111666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f111667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f111668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(boolean z13, boolean z14, boolean z15, n6 n6Var, boolean z16, boolean z17) {
        super(1);
        this.f111663i = z13;
        this.f111664j = z14;
        this.f111665k = z15;
        this.f111666l = n6Var;
        this.f111667m = z16;
        this.f111668n = z17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j it = (j) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        w80.x1 x1Var = it.f111593b;
        w80.w1 w1Var = w80.w1.f128401d;
        w80.w1 w1Var2 = w80.w1.f128400c;
        w80.w1 w1Var3 = w80.w1.f128402e;
        boolean z13 = this.f111663i;
        boolean z14 = this.f111664j;
        w80.w1 w1Var4 = z13 ? z14 ? w1Var2 : w1Var : w1Var3;
        n6 n6Var = this.f111666l;
        boolean z15 = this.f111665k;
        w80.w1 w1Var5 = z15 ? (n6Var.f111714f && z14) ? w1Var2 : w1Var : w1Var3;
        w80.w1 w1Var6 = (z15 && n6Var.f111715g && z14) ? w1Var2 : w1Var3;
        w80.w1 w1Var7 = z15 ? this.f111667m ? w1Var2 : w1Var : w1Var3;
        if (!z15) {
            w1Var = w1Var3;
        } else if (this.f111668n && z14) {
            w1Var = w1Var2;
        }
        return j.e(it, null, w80.x1.e(x1Var, w1Var4, w1Var5, w1Var6, w1Var7, w1Var, null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL), null, null, null, null, null, null, null, null, null, null, false, false, false, null, 131069);
    }
}

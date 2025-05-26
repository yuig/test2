package ra0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q3.b1;
import q3.c1;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f107008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f107009j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f107010k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f107011l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ArrayList arrayList, kotlin.jvm.internal.h0 h0Var, float f13, boolean z13) {
        super(1);
        this.f107008i = arrayList;
        this.f107009j = h0Var;
        this.f107010k = f13;
        this.f107011l = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b1 layout = (b1) obj;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        for (c1 c1Var : this.f107008i) {
            kotlin.jvm.internal.h0 h0Var = this.f107009j;
            b1.f(layout, c1Var, h0Var.f80426a, 0);
            int i13 = (int) (c1Var.f102178a * this.f107010k);
            if (this.f107011l) {
                h0Var.f80426a += i13;
            } else {
                h0Var.f80426a -= i13;
            }
        }
        return Unit.f80348a;
    }
}

package es;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.p0;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f59989j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f59990k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p0 p0Var, String str, int i13) {
        super(1);
        this.f59988i = i13;
        this.f59989j = p0Var;
        this.f59990k = str;
    }

    public final void b(u50.j colorAttr) {
        int i13 = this.f59988i;
        String str = this.f59990k;
        p0 p0Var = this.f59989j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$colorAttr");
                p0Var.e(str);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$colorAttr");
                p0Var.e(str);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$color");
                p0Var.e(str);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$color");
                p0Var.e(str);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$color");
                p0Var.e(str);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$colorAttr");
                p0Var.e(str);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$color");
                p0Var.e(str);
                break;
            default:
                Intrinsics.checkNotNullParameter(colorAttr, "$this$color");
                p0Var.e(str);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59988i) {
            case 0:
                b((u50.j) obj);
                break;
            case 1:
                b((u50.j) obj);
                break;
            case 2:
                b((u50.j) obj);
                break;
            case 3:
                b((u50.j) obj);
                break;
            case 4:
                b((u50.j) obj);
                break;
            case 5:
                b((u50.j) obj);
                break;
            case 6:
                b((u50.j) obj);
                break;
            default:
                b((u50.j) obj);
                break;
        }
        return Unit.f80348a;
    }
}

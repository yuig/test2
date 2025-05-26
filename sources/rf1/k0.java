package rf1;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sf1.e1;
import sf1.k1;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107762i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f107763j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qf1.j0 f107764k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f107765l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(p0 p0Var, qf1.j0 j0Var, View view, int i13) {
        super(1);
        this.f107762i = i13;
        this.f107763j = p0Var;
        this.f107764k = j0Var;
        this.f107765l = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107762i;
        qf1.j0 j0Var = this.f107764k;
        View view = this.f107765l;
        p0 p0Var = this.f107763j;
        switch (i13) {
            case 0:
                ((e1) ((k1) p0Var.getView())).showLoadingSpinner(false);
                qf1.i0 i0Var = (qf1.i0) p0Var.R.getValue();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                i0Var.e(context, j0Var, (Boolean) obj);
                break;
            default:
                ((e1) ((k1) p0Var.getView())).showLoadingSpinner(false);
                qf1.i0 i0Var2 = (qf1.i0) p0Var.R.getValue();
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                i0Var2.e(context2, j0Var, Boolean.FALSE);
                break;
        }
        return Unit.f80348a;
    }
}

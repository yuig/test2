package uc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f121838j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, int i13) {
        super(1);
        this.f121837i = i13;
        this.f121838j = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f121837i;
        p0 p0Var = this.f121838j;
        switch (i13) {
            case 0:
                l0 l0Var = (l0) p0Var.f121825e.getValue();
                l0Var.getClass();
                Intrinsics.checkNotNullParameter("Sending feedback...", "text");
                l0Var.f121820g.i("Sending feedback...");
                break;
            default:
                l0 l0Var2 = (l0) p0Var.f121825e.getValue();
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter("There was an error. Try it later", "text");
                l0Var2.f121820g.i("There was an error. Try it later");
                p0Var.i(h.f121787a);
                break;
        }
        return Unit.f80348a;
    }
}

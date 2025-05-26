package rq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109643i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f109644j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i13) {
        super(0);
        this.f109643i = i13;
        this.f109644j = y0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f109643i;
        y0 y0Var = this.f109644j;
        switch (i13) {
            case 0:
                lh0.a0 a0Var = y0Var.f109659e;
                if (a0Var != null) {
                    return Boolean.valueOf(a0Var.v());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                lh0.a0 a0Var2 = y0Var.f109659e;
                if (a0Var2 != null) {
                    return Boolean.valueOf(a0Var2.Q());
                }
                Intrinsics.r("experiments");
                throw null;
            default:
                lh0.a0 a0Var3 = y0Var.f109659e;
                if (a0Var3 != null) {
                    return Boolean.valueOf(a0Var3.R());
                }
                Intrinsics.r("experiments");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f109643i) {
        }
        return invoke();
    }
}

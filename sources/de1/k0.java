package de1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54585i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f54586j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, int i13) {
        super(1);
        this.f54585i = i13;
        this.f54586j = l0Var;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f54585i;
        l0 l0Var = this.f54586j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], !l0Var.f54587d ? mz1.g.unified_filter_confirm_button : mz1.g.unified_inline_filter_confirm_button), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], !l0Var.f54587d ? mz1.g.unified_filter_clear_button : mz1.g.unified_inline_filter_clear_button), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54585i) {
        }
        return b((yl1.b) obj);
    }
}

package lh0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83312i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f83313j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(g1 g1Var, int i13) {
        super(0);
        this.f83312i = i13;
        this.f83313j = g1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f83312i;
        g1 g1Var = this.f83313j;
        switch (i13) {
            case 0:
                return (oh0.g) g1Var.f83352d.get();
            default:
                return (lb0.o) g1Var.f83356h.get();
        }
    }
}

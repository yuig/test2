package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c1 f46089j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, int i13) {
        super(0);
        this.f46088i = i13;
        this.f46089j = c1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46088i;
        c1 c1Var = this.f46089j;
        switch (i13) {
            case 0:
                return f1.a(c1Var.f46112p);
            case 1:
                return (zf1.e) ((wk2.a) c1Var.f46104h.getValue()).get();
            default:
                return new n1(c1Var, c1Var.f46106j, c1Var, c1Var, c1Var.f46101e, c1Var.f46102f, c1Var.f46103g, c1Var.f46100d);
        }
    }
}

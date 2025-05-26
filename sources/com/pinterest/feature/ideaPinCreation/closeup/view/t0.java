package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46324i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f46325j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, int i13) {
        super(0);
        this.f46324i = i13;
        this.f46325j = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46324i;
        u0 u0Var = this.f46325j;
        switch (i13) {
            case 0:
                return f1.a(u0Var.C);
            default:
                return new n1(u0Var, u0Var, u0Var, u0Var, u0Var.Q, u0Var.R, u0Var.S, u0Var.P);
        }
    }
}

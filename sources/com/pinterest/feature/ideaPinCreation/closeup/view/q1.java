package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46286i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1 f46287j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(r1 r1Var, int i13) {
        super(0);
        this.f46286i = i13;
        this.f46287j = r1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46286i;
        r1 r1Var = this.f46287j;
        switch (i13) {
            case 0:
                return f1.a(r1Var.C);
            default:
                return new n1(r1Var, r1Var, r1Var, r1Var, r1Var.Q, r1Var.R, r1Var.S, r1Var.P);
        }
    }
}

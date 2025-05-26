package com.pinterest.feature.ideaPinCreation.closeup.view;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f46282j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(s0 s0Var, int i13) {
        super(0);
        this.f46281i = i13;
        this.f46282j = s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f46281i;
        s0 s0Var = this.f46282j;
        switch (i13) {
            case 0:
                return f1.a(s0Var.f46310l);
            default:
                return new n1(s0Var, s0Var.f46319u, s0Var, s0Var, s0Var.f46304f, s0Var.f46307i, s0Var.f46305g, s0Var.f46303e);
        }
    }
}

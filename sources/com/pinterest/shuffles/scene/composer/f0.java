package com.pinterest.shuffles.scene.composer;

import ao2.k2;
import ao2.o1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52037i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o1 f52038j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(k2 k2Var, int i13) {
        super(1);
        this.f52037i = i13;
        this.f52038j = k2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o1 o1Var = this.f52038j;
        int i13 = this.f52037i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        o1Var.cancel((CancellationException) null);
                        break;
                    default:
                        o1Var.cancel((CancellationException) null);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        o1Var.cancel((CancellationException) null);
                        break;
                    default:
                        o1Var.cancel((CancellationException) null);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}

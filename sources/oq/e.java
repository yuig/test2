package oq;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97016i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f97017j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(0);
        this.f97016i = i13;
        this.f97017j = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f97016i) {
            case 0:
                return this.f97017j.f97020c.f97007b;
            default:
                rf1.s0 s0Var = rf1.r0.f107894c;
                g4.u uVar = new g4.u();
                boolean z13 = s0Var.f107897b;
                HashMap auxData = s0Var.f107899d;
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                return new rf1.s0(uVar, z13, s0Var.f107898c, auxData);
        }
    }
}

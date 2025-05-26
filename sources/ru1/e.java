package ru1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110030i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f110031j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f110032k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z13, i iVar, int i13) {
        super(1);
        this.f110030i = i13;
        this.f110031j = z13;
        this.f110032k = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110030i;
        i iVar = this.f110032k;
        boolean z13 = this.f110031j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(z13 ? iVar.f110048d.f106392m : iVar.f110048d.f106391l);
                return Unit.f80348a;
            case 1:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new e(z13, iVar, 0));
                bind.c(fm1.c.VISIBLE);
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, (z13 || iVar.k()) ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }
}

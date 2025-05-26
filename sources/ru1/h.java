package ru1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110043i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f110044j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f110043i = i13;
        this.f110044j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f110043i;
        i iVar = this.f110044j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(iVar.f110048d.f106391l);
                return Unit.f80348a;
            case 1:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new h(iVar, 0));
                bind.c(fm1.c.VISIBLE);
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                c cVar = iVar.f110052h.f110010e;
                return rn1.a.y(it, null, cVar.f110026j, null, null, cVar.f110027k, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
        }
    }
}

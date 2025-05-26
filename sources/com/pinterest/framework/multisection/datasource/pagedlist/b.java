package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49084i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f49085j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f49084i = i13;
        this.f49085j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f49084i;
        c cVar = this.f49085j;
        switch (i13) {
            case 0:
                wt1.c0 c0Var = (wt1.c0) obj;
                if (c0Var instanceof wt1.m) {
                    if (cVar.F != null) {
                        tl1.i iVar = c0Var.f131096b;
                        Intrinsics.g(iVar, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.Insert.Payload<com.pinterest.framework.repository.Model>");
                        int size = ((wt1.l) iVar).f131122b.size();
                        c.e0(cVar, cVar.F, cVar.G, size);
                    }
                } else if ((c0Var instanceof wt1.y) && cVar.F != null) {
                    tl1.i iVar2 = c0Var.f131096b;
                    Intrinsics.g(iVar2, "null cannot be cast to non-null type com.pinterest.multisection.datasource.StatefulList.State.SetAll.Payload<com.pinterest.framework.repository.Model>");
                    int size2 = ((wt1.x) iVar2).f131130b.size();
                    c.e0(cVar, cVar.F, cVar.G, size2);
                }
                break;
            case 1:
                List<gb2.i> list = (List) obj;
                Intrinsics.f(list);
                for (gb2.i iVar3 : list) {
                    cVar.f49088J.put(iVar3.f64753a, iVar3);
                }
                break;
            default:
                ol1.a aVar = (ol1.a) obj;
                ((qr0.c) cVar.K.getValue()).a(aVar.f96440a, aVar.f96441b);
                break;
        }
        return Unit.f80348a;
    }
}

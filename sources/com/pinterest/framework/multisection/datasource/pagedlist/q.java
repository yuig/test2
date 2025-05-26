package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f49154r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f49155s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f49156t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, s sVar, p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f49154r = lVar;
        this.f49155s = sVar;
        this.f49156t = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f49154r, this.f49155s, this.f49156t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l lVar = this.f49154r;
        boolean z13 = lVar.f49147c;
        List itemsToSet = lVar.f49145a;
        s sVar = this.f49155s;
        if (z13 && itemsToSet.isEmpty() && (str = lVar.f49146b) != null && (!kotlin.text.z.j(str))) {
            sVar.h(true);
        } else {
            sVar.f49179r = false;
            sVar.f49178q.c(new wt1.p(itemsToSet));
            if (this.f49156t instanceof n) {
                sVar.e(itemsToSet);
            } else {
                Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
                sVar.f(itemsToSet, new fk1.u(itemsToSet, 3));
            }
        }
        return Unit.f80348a;
    }
}

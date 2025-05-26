package com.pinterest.api.model;

import java.lang.ref.Reference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mw extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ nw f40246r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(nw nwVar, bl2.c<? super mw> cVar) {
        super(2, cVar);
        this.f40246r = nwVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new mw(this.f40246r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mw) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        kw kwVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        long currentTimeMillis = System.currentTimeMillis();
        nw nwVar = this.f40246r;
        nwVar.f40517b = currentTimeMillis;
        do {
            Reference poll = nwVar.f40519d.poll();
            kwVar = poll instanceof kw ? (kw) poll : null;
            if (kwVar != null) {
                nw.a(nwVar, kwVar);
            }
        } while (kwVar != null);
        nwVar.f40521f = null;
        return Unit.f80348a;
    }
}

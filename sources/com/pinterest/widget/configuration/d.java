package com.pinterest.widget.configuration;

import ao2.j0;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f52833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f52834s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f52833r = eVar;
        this.f52834s = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f52833r, this.f52834s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h hVar = this.f52833r.f52836b;
        o oVar = this.f52834s;
        int i13 = oVar.f52844a;
        hVar.getClass();
        r widgetContentSource = oVar.f52845b;
        Intrinsics.checkNotNullParameter(widgetContentSource, "widgetContentSource");
        ((lb0.b) lb0.n.f82725d.a()).n(j1.U("widget_content_source_key_%d", new Object[]{Integer.valueOf(i13)}), widgetContentSource.name());
        return Unit.f80348a;
    }
}

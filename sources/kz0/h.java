package kz0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.u0;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81158r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f81159s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, bl2.c cVar) {
        super(2, cVar);
        this.f81159s = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f81159s, cVar);
        hVar.f81158r = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((ti1.f) this.f81159s).bindDisplayState((u0) this.f81158r);
        return Unit.f80348a;
    }
}

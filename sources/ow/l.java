package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97822r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ww.g f97823s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p0 p0Var, ww.g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f97822r = p0Var;
        this.f97823s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f97822r, this.f97823s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        uw.b bVar = this.f97822r.f97860b;
        com.iab.omid.library.pinterest.adsession.media.b adEvents = this.f97823s.f131166d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        try {
            adEvents.h();
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

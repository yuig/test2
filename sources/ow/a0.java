package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97751r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.b f97752s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p0 p0Var, com.iab.omid.library.pinterest.adsession.media.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f97751r = p0Var;
        this.f97752s = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a0(this.f97751r, this.f97752s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97751r.f97860b.getClass();
        com.iab.omid.library.pinterest.adsession.media.b mediaEvents = this.f97752s;
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        try {
            mediaEvents.c();
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

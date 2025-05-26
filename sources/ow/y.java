package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97910r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.b f97911s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p0 p0Var, com.iab.omid.library.pinterest.adsession.media.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f97910r = p0Var;
        this.f97911s = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f97910r, this.f97911s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97910r.f97860b.getClass();
        com.iab.omid.library.pinterest.adsession.media.b mediaEvents = this.f97911s;
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        try {
            mediaEvents.b();
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

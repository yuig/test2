package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.b f97834s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.c f97835t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, com.iab.omid.library.pinterest.adsession.media.b bVar, com.iab.omid.library.pinterest.adsession.media.c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f97833r = p0Var;
        this.f97834s = bVar;
        this.f97835t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f97833r, this.f97834s, this.f97835t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97833r.f97860b.getClass();
        com.iab.omid.library.pinterest.adsession.media.b mediaEvents = this.f97834s;
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        com.iab.omid.library.pinterest.adsession.media.c playerState = this.f97835t;
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        try {
            mediaEvents.m(playerState);
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

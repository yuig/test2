package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97818r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.b f97819s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f97820t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f97821u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, com.iab.omid.library.pinterest.adsession.media.b bVar, float f13, float f14, bl2.c cVar) {
        super(2, cVar);
        this.f97818r = p0Var;
        this.f97819s = bVar;
        this.f97820t = f13;
        this.f97821u = f14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f97818r, this.f97819s, this.f97820t, this.f97821u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        uw.b bVar = this.f97818r.f97860b;
        float f13 = this.f97820t;
        float f14 = this.f97821u;
        bVar.getClass();
        com.iab.omid.library.pinterest.adsession.media.b mediaEvents = this.f97819s;
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        try {
            mediaEvents.o(f13, f14);
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

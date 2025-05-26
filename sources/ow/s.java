package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97890r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.iab.omid.library.pinterest.adsession.media.b f97891s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ww.b f97892t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p0 p0Var, com.iab.omid.library.pinterest.adsession.media.b bVar, ww.b bVar2, bl2.c cVar) {
        super(2, cVar);
        this.f97890r = p0Var;
        this.f97891s = bVar;
        this.f97892t = bVar2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f97890r, this.f97891s, this.f97892t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97890r.f97860b.getClass();
        com.iab.omid.library.pinterest.adsession.media.b mediaEvents = this.f97891s;
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        ww.b quartile = this.f97892t;
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        try {
            int i13 = uw.a.f123224a[quartile.ordinal()];
            if (i13 == 1) {
                mediaEvents.g();
            } else if (i13 == 2) {
                mediaEvents.k();
            } else if (i13 == 3) {
                mediaEvents.p();
            }
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

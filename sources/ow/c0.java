package ow;

import androidx.appcompat.widget.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97762r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ww.g f97763s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f97764t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p0 p0Var, ww.g gVar, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f97762r = p0Var;
        this.f97763s = gVar;
        this.f97764t = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f97762r, this.f97763s, this.f97764t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        uw.b bVar = this.f97762r.f97860b;
        com.iab.omid.library.pinterest.adsession.media.b adEvents = this.f97763s.f131166d;
        boolean z13 = this.f97764t;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        try {
            adEvents.j(z2.b(z13, com.iab.omid.library.pinterest.adsession.media.d.STANDALONE));
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

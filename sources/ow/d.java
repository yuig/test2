package ow;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97765r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fn.i f97766s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f97767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p0 p0Var, fn.i iVar, View view, bl2.c cVar) {
        super(2, cVar);
        this.f97765r = p0Var;
        this.f97766s = iVar;
        this.f97767t = view;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f97765r, this.f97766s, this.f97767t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97765r.f97860b.getClass();
        fn.i adSession = this.f97766s;
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        View view = this.f97767t;
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            adSession.e(view);
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}

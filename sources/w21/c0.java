package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f127656r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f127656r = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f127656r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ug0.i iVar = this.f127656r.f127699a;
        String placementId = String.valueOf(i32.y0.ANDROID_HOME_FEED_STORY_TAKEOVER.value());
        String experienceId = String.valueOf(i32.l.ANDROID_PIN_OR_SPIN_MVP.value());
        iVar.getClass();
        tg0.d sideEffect = tg0.d.f117578b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        iVar.e(placementId, experienceId, null, sideEffect, null);
        return Unit.f80348a;
    }
}

package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f87999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f88000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StringBuilder sb3, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f87999r = sb3;
        this.f88000s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f87999r, this.f88000s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        String sb3 = this.f87999r.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (!kotlin.text.z.j(sb3)) {
            int i13 = u.P0;
            this.f88000s.n8(sb3);
        }
        return Unit.f80348a;
    }
}

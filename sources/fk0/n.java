package fk0;

import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62313r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f62314s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f62314s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f62314s, cVar);
        nVar.f62313r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f62313r;
        GestaltButton gestaltButton = this.f62314s.f62321h0;
        if (gestaltButton != null) {
            bs1.c.s(gestaltButton, new hh0.a(aVar2, 21));
            return Unit.f80348a;
        }
        Intrinsics.r("createButton");
        throw null;
    }
}

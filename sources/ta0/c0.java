package ta0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f0 f116853r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f116854s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f116853r = f0Var;
        this.f116854s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f116853r, this.f116854s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return com.bumptech.glide.b.f(this.f116853r.f116870a).c().K(this.f116854s).L(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
    }
}

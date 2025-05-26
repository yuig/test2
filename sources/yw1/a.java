package yw1;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140312r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f140313s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f140314t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f140314t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f140314t, cVar);
        aVar.f140313s = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        do2.j jVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140312r;
        if (i13 == 0) {
            ue.c.H(obj);
            jVar = (do2.j) this.f140313s;
            do2.c a13 = kotlin.jvm.internal.j.a(this.f140314t.a());
            this.f140313s = jVar;
            this.f140312r = 1;
            obj = l0.f0(a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            jVar = (do2.j) this.f140313s;
            ue.c.H(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "first(...)");
        this.f140313s = null;
        this.f140312r = 2;
        if (jVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}

package fv;

import ao2.j0;
import cc2.h;
import com.pinterest.api.model.f30;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f62996r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f62997s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f30 f62998t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f62999u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f30 f30Var, h hVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f62997s = cVar;
        this.f62998t = f30Var;
        this.f62999u = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f62997s, this.f62998t, this.f62999u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f62996r;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ue.c.H(obj);
        do {
            this.f62997s.c(this.f62998t, this.f62999u, false);
            this.f62996r = 1;
        } while (l0.S(500L, this) != aVar);
        return aVar;
    }
}

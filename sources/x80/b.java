package x80;

import ao2.j0;
import dh0.d;
import dl2.j;
import i32.y0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nm.u;
import rg0.s;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f134160r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f134160r = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f134160r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        u x13;
        u x14;
        u x15;
        c cVar = this.f134160r;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        try {
            s sVar = cVar.f134161a;
            y0 y0Var = y0.COLLAGE_COMPOSER;
            u uVar = ((vd0.c) ((d) sVar).h(y0Var, kotlin.collections.y0.b(new Pair("from_empty_state", Boolean.TRUE)), false, tg0.d.f117578b).f()).f125623a;
            if (uVar == null || (x13 = uVar.x("data")) == null || (x14 = x13.x(String.valueOf(y0Var.getValue()))) == null || (x15 = x14.x("display_data")) == null) {
                return null;
            }
            return (y80.a) cVar.f134162b.e(x15, y80.a.class);
        } catch (Exception unused) {
            return null;
        }
    }
}

package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;

/* loaded from: classes3.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88008r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f88009s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88009s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f88009s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        uj2.q qVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88008r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = u.P0;
            u uVar = this.f88009s;
            String f83 = uVar.f8();
            if (f83.length() > 0) {
                i2 i2Var = uVar.f88035w0;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                qVar = i2Var.P(f83);
            } else {
                qVar = jk2.h0.f76488a;
                Intrinsics.checkNotNullExpressionValue(qVar, "empty(...)");
            }
            this.f88008r = 1;
            obj = kh2.j.q(qVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}

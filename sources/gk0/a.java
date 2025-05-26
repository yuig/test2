package gk0;

import ao2.j0;
import bl2.c;
import dl2.j;
import gx.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import s7.z;
import x02.x0;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f65204r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f65205s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f65206t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, z zVar, c cVar) {
        super(2, cVar);
        this.f65205s = eVar;
        this.f65206t = zVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f65205s, this.f65206t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f65204r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.c a13 = kotlin.jvm.internal.j.a(((x0) this.f65205s.f66246b).f0(this.f65206t));
            this.f65204r = 1;
            obj = l0.f0(a13, this);
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

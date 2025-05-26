package ey0;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import u50.r;

/* loaded from: classes5.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60637r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60638s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f60639t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i13, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f60638s = i13;
        this.f60639t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f60638s, this.f60639t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60637r;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f60638s;
            this.f60637r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f60639t.a(dy0.f.f56564a);
        return Unit.f80348a;
    }
}

package qp1;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f104788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f104789s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f104790t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f104789s = l0Var;
        this.f104790t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h0(this.f104789s, this.f104790t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f104788r;
        if (i13 == 0) {
            ue.c.H(obj);
            np1.j jVar = this.f104789s.f104803a;
            this.f104788r = 1;
            obj = ((np1.i) jVar).c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Uri uri = (Uri) obj;
        u50.r rVar = this.f104790t;
        if (uri == null) {
            rVar.a(u.f104845b);
        } else {
            rVar.a(u.f104846c);
        }
        return Unit.f80348a;
    }
}

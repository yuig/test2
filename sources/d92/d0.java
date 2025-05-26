package d92;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f54133r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f54134s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f54135t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f54134s = f0Var;
        this.f54135t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f54134s, this.f54135t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f54133r;
        if (i13 == 0) {
            ue.c.H(obj);
            z82.b bVar = this.f54134s.f54142a;
            this.f54133r = 1;
            obj = ((z82.j) bVar).c(this);
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
        u50.r rVar = this.f54135t;
        if (uri == null) {
            rVar.a(r.f54185b);
        } else {
            rVar.a(r.f54186c);
        }
        return Unit.f80348a;
    }
}

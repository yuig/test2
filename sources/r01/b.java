package r01;

import ao2.j0;
import com.pinterest.feature.pin.closeup.datasource.l;
import dl2.j;
import i01.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o1.f;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105698r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f105699s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f105700t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f105701u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, c cVar, t tVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f105699s = lVar;
        this.f105700t = cVar;
        this.f105701u = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f105699s, this.f105700t, this.f105701u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105698r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.c a13 = kotlin.jvm.internal.j.a(this.f105699s.f49129s);
            f fVar = new f(16, this.f105700t, this.f105701u);
            this.f105698r = 1;
            if (a13.collect(fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}

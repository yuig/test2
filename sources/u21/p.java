package u21;

import ao2.j0;
import b3.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ df2.b f120110s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f120111t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(df2.b bVar, d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f120110s = bVar;
        this.f120111t = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f120110s, this.f120111t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120109r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ao2.w a13 = df2.b.a(this.f120110s);
                this.f120109r = 1;
                obj = a13.v(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            this.f120111t.f120085g.e().a(new d(androidx.compose.ui.graphics.a.l((f0) obj)));
        } catch (Throwable unused) {
        }
        return Unit.f80348a;
    }
}

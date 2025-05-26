package u21;

import android.content.Context;
import ao2.j0;
import b3.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f120112r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ df2.b f120113s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d0 f120114t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f120115u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(df2.b bVar, d0 d0Var, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f120113s = bVar;
        this.f120114t = d0Var;
        this.f120115u = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f120113s, this.f120114t, this.f120115u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f120112r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ao2.w a13 = df2.b.a(this.f120113s);
                this.f120112r = 1;
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
            this.f120114t.f120085g.e().a(new e(this.f120115u, androidx.compose.ui.graphics.a.l((f0) obj)));
        } catch (Throwable unused) {
        }
        return Unit.f80348a;
    }
}

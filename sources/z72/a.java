package z72;

import ao2.j0;
import bl2.c;
import dl2.j;
import java.util.concurrent.CompletableFuture;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141039r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x72.j f141040s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x72.j jVar, c cVar) {
        super(2, cVar);
        this.f141040s = jVar;
    }

    @Override // dl2.a
    public final c create(Object obj, c cVar) {
        return new a(this.f141040s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((j0) obj, (c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141039r;
        if (i13 == 0) {
            ue.c.H(obj);
            CompletableFuture i14 = this.f141040s.i();
            this.f141039r = 1;
            obj = c3.q(i14, this);
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

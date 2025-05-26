package ea;

import android.net.Uri;
import android.view.InputEvent;
import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f57932r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f57933s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uri f57934t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InputEvent f57935u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Uri uri, InputEvent inputEvent, bl2.c cVar) {
        super(2, cVar);
        this.f57933s = hVar;
        this.f57934t = uri;
        this.f57935u = inputEvent;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f57933s, this.f57934t, this.f57935u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f57932r;
        if (i13 == 0) {
            ue.c.H(obj);
            fa.b bVar = this.f57933s.f57945a;
            this.f57932r = 1;
            if (bVar.c(this.f57934t, this.f57935u, this) == aVar) {
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

package ho2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public class u extends ao2.a implements dl2.e {

    /* renamed from: d, reason: collision with root package name */
    public final bl2.c f69787d;

    public u(bl2.c cVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f69787d = cVar;
    }

    @Override // ao2.a2
    public final boolean P() {
        return true;
    }

    @Override // dl2.e
    public final dl2.e getCallerFrame() {
        bl2.c cVar = this.f69787d;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // ao2.a2
    public void t(Object obj) {
        f.a(bs1.c.J1(obj), cl2.h.b(this.f69787d));
    }

    @Override // ao2.a2
    public void u(Object obj) {
        this.f69787d.resumeWith(bs1.c.J1(obj));
    }
}

package x52;

import kotlin.jvm.functions.Function0;
import m60.u;

/* loaded from: classes4.dex */
public final class b implements fd1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f133838a;

    public b(c cVar) {
        this.f133838a = cVar;
    }

    @Override // fd1.c
    public final void cancel() {
        this.f133838a.invoke();
        a.c.y(u.f85943a);
    }
}

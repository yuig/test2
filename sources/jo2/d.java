package jo2;

import ao2.o1;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class d implements ak2.d {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f77225a;

    public d(ao2.a aVar) {
        this.f77225a = aVar;
    }

    @Override // ak2.d
    public final void cancel() {
        this.f77225a.cancel((CancellationException) null);
    }
}

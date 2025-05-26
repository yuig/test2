package j5;

import android.os.OutcomeReceiver;
import ao2.o;
import java.util.concurrent.atomic.AtomicBoolean;
import xk2.q;
import xk2.s;

/* loaded from: classes3.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final bl2.c f74675a;

    public e(o oVar) {
        super(false);
        this.f74675a = oVar;
    }

    public final void onError(Throwable th3) {
        if (compareAndSet(false, true)) {
            bl2.c cVar = this.f74675a;
            q qVar = s.f135225b;
            cVar.resumeWith(ue.c.m(th3));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            bl2.c cVar = this.f74675a;
            q qVar = s.f135225b;
            cVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}

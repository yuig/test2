package g0;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f63215a;

    public n(Throwable th3) {
        this.f63215a = th3;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw new ExecutionException(this.f63215a);
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.f63215a + "]]";
    }
}

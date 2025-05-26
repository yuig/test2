package fk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class b0 extends AtomicReference implements xj2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62414a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62415b;

    public /* synthetic */ b0(Object obj, int i13) {
        this.f62414a = i13;
        this.f62415b = obj;
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f62414a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f62414a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f62414a;
        Object obj = this.f62415b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).a();
                break;
            default:
                ((uj2.d0) obj).onSuccess(0L);
                break;
        }
    }
}

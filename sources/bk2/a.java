package bk2;

import bp1.h;
import java.util.concurrent.atomic.AtomicReference;
import lb.l0;

/* loaded from: classes2.dex */
public final class a extends AtomicReference implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23393a = 1;

    public a() {
    }

    @Override // xj2.c
    public final void dispose() {
        ak2.d dVar;
        switch (this.f23393a) {
            case 0:
                if (get() != null && (dVar = (ak2.d) getAndSet(null)) != null) {
                    try {
                        dVar.cancel();
                        break;
                    } catch (Exception e13) {
                        h.H(e13);
                        l0.R0(e13);
                        return;
                    }
                }
                break;
            default:
                c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f23393a) {
            case 0:
                return get() == null;
            default:
                return c.isDisposed((xj2.c) get());
        }
    }

    public a(ak2.d dVar) {
        super(dVar);
    }

    public a(a aVar) {
        lazySet(aVar);
    }
}

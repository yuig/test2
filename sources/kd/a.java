package kd;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f79191a;

    public a(d dVar) {
        this.f79191a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f79191a) {
            try {
                d dVar = this.f79191a;
                if (dVar.f79208i == null) {
                    return null;
                }
                dVar.J();
                if (this.f79191a.k()) {
                    this.f79191a.z();
                    this.f79191a.f79210k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}

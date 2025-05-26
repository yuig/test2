package u0;

import androidx.camera.core.impl.t1;
import com.google.android.gms.internal.measurement.q4;
import java.util.Objects;
import java.util.concurrent.Executor;
import kh2.m0;

/* loaded from: classes2.dex */
public final class c implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0.j f119730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f119731b;

    public c(e eVar, y0.j jVar) {
        this.f119731b = eVar;
        this.f119730a = jVar;
    }

    @Override // androidx.camera.core.impl.t1
    public final void a(Object obj) {
        t0.b bVar = (t0.b) obj;
        Objects.requireNonNull(bVar);
        e eVar = this.f119731b;
        if (eVar.f119743l == this.f119730a) {
            m0.p("AudioSource", "Receive BufferProvider state change: " + eVar.f119739h + " to " + bVar);
            if (eVar.f119739h != bVar) {
                eVar.f119739h = bVar;
                eVar.f();
            }
        }
    }

    @Override // androidx.camera.core.impl.t1
    public final void onError(Throwable th3) {
        e eVar = this.f119731b;
        if (eVar.f119743l == this.f119730a) {
            Executor executor = eVar.f119741j;
            q4 q4Var = eVar.f119742k;
            if (executor == null || q4Var == null) {
                return;
            }
            executor.execute(new l0.e(15, q4Var, th3));
        }
    }
}

package e;

import i2.q1;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class l extends g.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f56690a;

    public l(a aVar, q1 q1Var) {
        this.f56690a = aVar;
    }

    @Override // g.b
    public final void a(Object obj) {
        Unit unit;
        g.b bVar = this.f56690a.f56661a;
        if (bVar != null) {
            bVar.a(obj);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    @Override // g.b
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}

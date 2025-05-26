package ao2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f20132a;

    public d(c[] cVarArr) {
        this.f20132a = cVarArr;
    }

    public final void a() {
        for (c cVar : this.f20132a) {
            x0 x0Var = cVar.f20125f;
            if (x0Var == null) {
                Intrinsics.r("handle");
                throw null;
            }
            x0Var.dispose();
        }
    }

    @Override // ao2.l
    public final void b(Throwable th3) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f20132a + ']';
    }
}

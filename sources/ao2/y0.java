package ao2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class y0 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20238e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20239f;

    public y0(Object obj, int i13) {
        this.f20238e = i13;
        this.f20239f = obj;
    }

    @Override // ao2.r1
    public final boolean i() {
        return false;
    }

    @Override // ao2.r1
    public final void j(Throwable th3) {
        int i13 = this.f20238e;
        Object obj = this.f20239f;
        switch (i13) {
            case 0:
                ((x0) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th3);
                break;
            default:
                xk2.q qVar = xk2.s.f135225b;
                ((bl2.c) obj).resumeWith(Unit.f80348a);
                break;
        }
    }
}

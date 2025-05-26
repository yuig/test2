package ao2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20167a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20168b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f20167a = i13;
        this.f20168b = obj;
    }

    @Override // ao2.l
    public final void b(Throwable th3) {
        int i13 = this.f20167a;
        Object obj = this.f20168b;
        switch (i13) {
            case 0:
                ((Function1) obj).invoke(th3);
                break;
            default:
                ((x0) obj).dispose();
                break;
        }
    }

    public final String toString() {
        int i13 = this.f20167a;
        Object obj = this.f20168b;
        switch (i13) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + m0.y(this) + ']';
            default:
                return "DisposeOnCancel[" + ((x0) obj) + ']';
        }
    }
}

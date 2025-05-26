package i2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class n3 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f71202b;

    public /* synthetic */ n3(b2 b2Var, int i13) {
        this.f71201a = i13;
        this.f71202b = b2Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        int i13 = this.f71201a;
        b2 b2Var = this.f71202b;
        switch (i13) {
            case 0:
                b2Var.setValue(obj);
                break;
            default:
                b2Var.setValue(obj);
                break;
        }
        return Unit.f80348a;
    }
}

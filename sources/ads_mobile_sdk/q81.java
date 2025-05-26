package ads_mobile_sdk;

import a.od;

/* loaded from: classes2.dex */
public final class q81 implements a.he {

    /* renamed from: a, reason: collision with root package name */
    public final a.he[] f9990a;

    public q81(a.he... heVarArr) {
        this.f9990a = heVarArr;
    }

    @Override // a.he
    public final boolean a(Class cls) {
        for (a.he heVar : this.f9990a) {
            if (heVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.he
    public final od b(Class cls) {
        for (a.he heVar : this.f9990a) {
            if (heVar.a(cls)) {
                return heVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

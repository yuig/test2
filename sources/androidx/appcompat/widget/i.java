package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class i implements n.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f16596a;

    public i(n nVar, int i13) {
        if (i13 != 1) {
            this.f16596a = nVar;
        } else {
            this.f16596a = nVar;
        }
    }

    @Override // n.z
    public final void b(n.o oVar, boolean z13) {
        if (oVar instanceof n.g0) {
            oVar.l().d(false);
        }
        n.z zVar = this.f16596a.f88565e;
        if (zVar != null) {
            zVar.b(oVar, z13);
        }
    }

    @Override // n.z
    public final boolean c(n.o oVar) {
        n nVar = this.f16596a;
        if (oVar == nVar.f88563c) {
            return false;
        }
        nVar.f16663w = ((n.g0) oVar).A.f88675a;
        n.z zVar = nVar.f88565e;
        if (zVar != null) {
            return zVar.c(oVar);
        }
        return false;
    }
}

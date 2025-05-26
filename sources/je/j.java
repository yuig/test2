package je;

/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75639a;

    public /* synthetic */ j(int i13) {
        this.f75639a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je.h
    public final boolean a(bb.p pVar, p1 p1Var) {
        switch (this.f75639a) {
            case 0:
                return !(p1Var instanceof n1) || ((n1) p1Var).getChildren().size() == 0;
            case 1:
                return p1Var.f75758b == null;
            default:
                if (pVar != null) {
                    return p1Var == ((p1) pVar.f22464b);
                }
                return false;
        }
    }

    public final String toString() {
        switch (this.f75639a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, int i14) {
        this(0);
        this.f75639a = i13;
        int i15 = 1;
        if (i13 == 1) {
            this(i15);
            return;
        }
        int i16 = 2;
        if (i13 != 2) {
        } else {
            this(i16);
        }
    }
}

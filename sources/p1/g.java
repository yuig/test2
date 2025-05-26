package p1;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98509a;

    public /* synthetic */ g(int i13) {
        this.f98509a = i13;
    }

    @Override // p1.h
    public final void c(n4.b bVar, int i13, int[] iArr, n4.k kVar, int[] iArr2) {
        switch (this.f98509a) {
            case 0:
                if (kVar != n4.k.Ltr) {
                    l.b(iArr, iArr2, true);
                    break;
                } else {
                    l.c(i13, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != n4.k.Ltr) {
                    l.c(i13, iArr, iArr2, true);
                    break;
                } else {
                    l.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f98509a) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}

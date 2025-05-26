package p1;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98500a;

    public /* synthetic */ e(int i13) {
        this.f98500a = i13;
    }

    @Override // p1.j
    public final void b(n4.b bVar, int i13, int[] iArr, int[] iArr2) {
        switch (this.f98500a) {
            case 0:
                l.c(i13, iArr, iArr2, false);
                break;
            default:
                l.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f98500a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}

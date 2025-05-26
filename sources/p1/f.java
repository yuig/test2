package p1;

/* loaded from: classes.dex */
public final class f implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98505a;

    /* renamed from: b, reason: collision with root package name */
    public final float f98506b;

    public f(int i13) {
        this.f98505a = i13;
        if (i13 == 1) {
            this.f98506b = 0;
            return;
        }
        if (i13 == 2) {
            this.f98506b = 0;
        } else if (i13 != 3) {
            this.f98506b = 0;
        } else {
            this.f98506b = 0;
        }
    }

    @Override // p1.h, p1.j
    public final float a() {
        return this.f98506b;
    }

    @Override // p1.j
    public final void b(n4.b bVar, int i13, int[] iArr, int[] iArr2) {
        switch (this.f98505a) {
            case 0:
                l.a(i13, iArr, iArr2, false);
                break;
            case 1:
                l.d(i13, iArr, iArr2, false);
                break;
            case 2:
                l.e(i13, iArr, iArr2, false);
                break;
            default:
                l.f(i13, iArr, iArr2, false);
                break;
        }
    }

    @Override // p1.h
    public final void c(n4.b bVar, int i13, int[] iArr, n4.k kVar, int[] iArr2) {
        switch (this.f98505a) {
            case 0:
                if (kVar != n4.k.Ltr) {
                    l.a(i13, iArr, iArr2, true);
                    break;
                } else {
                    l.a(i13, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (kVar != n4.k.Ltr) {
                    l.d(i13, iArr, iArr2, true);
                    break;
                } else {
                    l.d(i13, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (kVar != n4.k.Ltr) {
                    l.e(i13, iArr, iArr2, true);
                    break;
                } else {
                    l.e(i13, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != n4.k.Ltr) {
                    l.f(i13, iArr, iArr2, true);
                    break;
                } else {
                    l.f(i13, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f98505a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}

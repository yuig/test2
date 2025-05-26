package p1;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98489a;

    public /* synthetic */ c(int i13) {
        this.f98489a = i13;
    }

    @Override // p1.h
    public final void c(n4.b bVar, int i13, int[] iArr, n4.k kVar, int[] iArr2) {
        switch (this.f98489a) {
            case 1:
                l.b(iArr, iArr2, false);
                break;
            default:
                l.c(i13, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f98489a) {
            case 1:
                return "AbsoluteArrangement#Left";
            default:
                return "AbsoluteArrangement#Right";
        }
    }
}

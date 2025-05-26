package j1;

/* loaded from: classes.dex */
public interface u2 extends v2 {
    @Override // j1.r2
    default long b(t tVar, t tVar2, t tVar3) {
        return (r() + n()) * 1000000;
    }

    int n();

    int r();
}

package qd;

/* loaded from: classes3.dex */
public final class g implements a {
    @Override // qd.a
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // qd.a
    public final int b() {
        return 4;
    }

    @Override // qd.a
    public final int c(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // qd.a
    public final Object newArray(int i13) {
        return new int[i13];
    }
}

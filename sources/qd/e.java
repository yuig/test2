package qd;

/* loaded from: classes.dex */
public final class e implements a {
    @Override // qd.a
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // qd.a
    public final int b() {
        return 1;
    }

    @Override // qd.a
    public final int c(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // qd.a
    public final Object newArray(int i13) {
        return new byte[i13];
    }
}

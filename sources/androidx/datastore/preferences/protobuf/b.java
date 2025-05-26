package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class b {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(n1 n1Var) {
        g0 g0Var = (g0) this;
        int i13 = g0Var.memoizedSerializedSize;
        if (i13 != -1) {
            return i13;
        }
        int d2 = n1Var.d(this);
        g0Var.memoizedSerializedSize = d2;
        return d2;
    }

    public abstract void c(q qVar);
}

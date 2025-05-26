package ok2;

/* loaded from: classes2.dex */
public enum d implements dk2.f {
    INSTANCE;

    public static void complete(xp2.b bVar) {
        bVar.d(INSTANCE);
        bVar.a();
    }

    public static void error(Throwable th3, xp2.b bVar) {
        bVar.d(INSTANCE);
        bVar.onError(th3);
    }

    @Override // xp2.c
    public void cancel() {
    }

    @Override // dk2.i
    public void clear() {
    }

    @Override // dk2.i
    public boolean isEmpty() {
        return true;
    }

    @Override // dk2.i
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dk2.i
    public Object poll() {
        return null;
    }

    @Override // xp2.c
    public void request(long j13) {
        g.validate(j13);
    }

    @Override // dk2.e
    public int requestFusion(int i13) {
        return i13 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

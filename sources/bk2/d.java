package bk2;

import uj2.d0;
import uj2.m;
import uj2.v;

/* loaded from: classes2.dex */
public enum d implements dk2.d {
    INSTANCE,
    NEVER;

    public static void complete(v vVar) {
        vVar.b(INSTANCE);
        vVar.a();
    }

    public static void error(Throwable th3, v vVar) {
        vVar.b(INSTANCE);
        vVar.onError(th3);
    }

    @Override // dk2.i
    public void clear() {
    }

    @Override // xj2.c
    public void dispose() {
    }

    @Override // xj2.c
    public boolean isDisposed() {
        return this == INSTANCE;
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

    @Override // dk2.e
    public int requestFusion(int i13) {
        return i13 & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(m mVar) {
        mVar.b(INSTANCE);
        mVar.a();
    }

    public static void error(Throwable th3, uj2.d dVar) {
        dVar.b(INSTANCE);
        dVar.onError(th3);
    }

    public static void complete(uj2.d dVar) {
        dVar.b(INSTANCE);
        dVar.a();
    }

    public static void error(Throwable th3, d0 d0Var) {
        d0Var.b(INSTANCE);
        d0Var.onError(th3);
    }

    public static void error(Throwable th3, m mVar) {
        mVar.b(INSTANCE);
        mVar.onError(th3);
    }
}

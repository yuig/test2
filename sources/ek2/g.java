package ek2;

import uj2.v;

/* loaded from: classes2.dex */
public class g extends b {

    /* renamed from: a, reason: collision with root package name */
    public final v f59425a;

    /* renamed from: b, reason: collision with root package name */
    public Object f59426b;

    public g(v vVar) {
        this.f59425a = vVar;
    }

    @Override // dk2.i
    public final void clear() {
        lazySet(32);
        this.f59426b = null;
    }

    public final void d(Object obj) {
        int i13 = get();
        if ((i13 & 54) != 0) {
            return;
        }
        v vVar = this.f59425a;
        if (i13 == 8) {
            this.f59426b = obj;
            lazySet(16);
            vVar.c(null);
        } else {
            lazySet(2);
            vVar.c(obj);
        }
        if (get() != 4) {
            vVar.a();
        }
    }

    @Override // xj2.c
    public void dispose() {
        set(4);
        this.f59426b = null;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        d(obj);
    }

    @Override // dk2.i
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f59426b;
        this.f59426b = null;
        lazySet(32);
        return obj;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        lazySet(8);
        return 2;
    }
}

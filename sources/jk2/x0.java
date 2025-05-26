package jk2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x0 extends ek2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76739a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76740b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f76741c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76742d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f76744f;

    public x0(uj2.v vVar, Iterator it) {
        this.f76739a = vVar;
        this.f76740b = it;
    }

    @Override // dk2.i
    public final void clear() {
        this.f76743e = true;
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76741c = true;
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76741c;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return this.f76743e;
    }

    @Override // dk2.i
    public final Object poll() {
        if (this.f76743e) {
            return null;
        }
        boolean z13 = this.f76744f;
        Iterator it = this.f76740b;
        if (!z13) {
            this.f76744f = true;
        } else if (!it.hasNext()) {
            this.f76743e = true;
            return null;
        }
        Object next = it.next();
        ck2.i.b(next, "The iterator returned a null value");
        return next;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        this.f76742d = true;
        return 1;
    }
}

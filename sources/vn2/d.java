package vn2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class d implements Iterable, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public a f126314a;

    public final boolean isEmpty() {
        return this.f126314a.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f126314a.iterator();
    }
}

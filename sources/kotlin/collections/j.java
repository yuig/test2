package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class j extends s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f80374b;

    public j(m mVar) {
        this.f80374b = mVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f80374b.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f80374b.containsKey(obj);
    }

    @Override // kotlin.collections.s, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h3.f0(((n2.m) this.f80374b.c()).iterator(), 1);
    }
}

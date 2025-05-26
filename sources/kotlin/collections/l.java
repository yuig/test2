package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class l extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f80384a;

    public l(m mVar) {
        this.f80384a = mVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f80384a.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f80384a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h3.f0(((n2.m) this.f80384a.c()).iterator(), 2);
    }
}

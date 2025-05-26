package lm2;

import bm2.i;
import e82.l;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import on2.m;
import on2.q;
import yn2.a0;
import yn2.c0;
import yn2.h0;
import yn2.k;
import yn2.s;
import yn2.u;
import yn2.x;

/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final rg.a f83957a;

    /* renamed from: b, reason: collision with root package name */
    public final pm2.d f83958b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83959c;

    /* renamed from: d, reason: collision with root package name */
    public final m f83960d;

    public d(rg.a c13, pm2.d annotationOwner, boolean z13) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f83957a = c13;
        this.f83958b = annotationOwner;
        this.f83959c = z13;
        this.f83960d = ((q) ((a) c13.f107929a).f83931a).e(new l(this, 16));
    }

    @Override // bm2.i
    public final boolean Q(ym2.c cVar) {
        return j.s(this, cVar);
    }

    @Override // bm2.i
    public final bm2.c a(ym2.c fqName) {
        bm2.c cVar;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        pm2.d dVar = this.f83958b;
        pm2.a a13 = dVar.a(fqName);
        if (a13 != null && (cVar = (bm2.c) this.f83960d.invoke(a13)) != null) {
            return cVar;
        }
        ym2.g gVar = jm2.c.f77050a;
        return jm2.c.a(fqName, dVar, this.f83957a);
    }

    @Override // bm2.i
    public final boolean isEmpty() {
        return this.f83958b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        pm2.d dVar = this.f83958b;
        h0 p13 = c0.p(CollectionsKt.K(dVar.getAnnotations()), this.f83960d);
        ym2.g gVar = jm2.c.f77050a;
        km2.i a13 = jm2.c.a(xl2.q.f135307m, dVar, this.f83957a);
        Intrinsics.checkNotNullParameter(p13, "<this>");
        Sequence f13 = x.f(p13, x.f(a13));
        Intrinsics.checkNotNullParameter(f13, "<this>");
        s sVar = s.f139588i;
        k c13 = f13 instanceof h0 ? ((h0) f13).c(sVar) : new k(f13, u.f139590i, sVar);
        Intrinsics.checkNotNullParameter(c13, "<this>");
        return new yn2.h(c0.k(c13, a0.f139533i));
    }
}

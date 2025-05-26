package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class x0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.z f17324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f17325b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17326c;

    public x0(IntRange intRange, o oVar) {
        w0 m13 = oVar.m();
        int i13 = intRange.f80453a;
        if (i13 < 0) {
            throw new IllegalStateException("negative nearestRange.first".toString());
        }
        int min = Math.min(intRange.f80454b, m13.f17319b - 1);
        if (min < i13) {
            g1.z zVar = g1.h0.f63270a;
            Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f17324a = zVar;
            this.f17325b = new Object[0];
            this.f17326c = 0;
            return;
        }
        int i14 = (min - i13) + 1;
        this.f17325b = new Object[i14];
        this.f17326c = i13;
        g1.z zVar2 = new g1.z(i14);
        i1.p pVar = new i1.p(i13, min, zVar2, this);
        m13.b(i13);
        m13.b(min);
        if (min < i13) {
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i13 + ')').toString());
        }
        k2.e eVar = m13.f17318a;
        int g13 = o.g(i13, eVar);
        int i15 = ((f) eVar.f78182a[g13]).f17236a;
        while (i15 <= min) {
            f fVar = (f) eVar.f78182a[g13];
            pVar.invoke(fVar);
            i15 += fVar.f17237b;
            g13++;
        }
        this.f17324a = zVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.b0
    public final int b(Object obj) {
        g1.z zVar = this.f17324a;
        int e13 = zVar.e(obj);
        if (e13 >= 0) {
            return zVar.f63355c[e13];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.b0
    public final Object c(int i13) {
        int i14 = i13 - this.f17326c;
        if (i14 >= 0) {
            Object[] objArr = this.f17325b;
            if (i14 <= kotlin.collections.c0.F(objArr)) {
                return objArr[i14];
            }
        }
        return null;
    }
}

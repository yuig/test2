package c2;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class d3 implements p1.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f24632a;

    public d3(p1.m1 m1Var) {
        this.f24632a = bs1.c.u1(m1Var, i2.y3.f71400a);
    }

    @Override // p1.m1
    public final int a(n4.b bVar, n4.k kVar) {
        return ((p1.m1) this.f24632a.getValue()).a(bVar, kVar);
    }

    @Override // p1.m1
    public final int b(n4.b bVar) {
        return ((p1.m1) this.f24632a.getValue()).b(bVar);
    }

    @Override // p1.m1
    public final int c(n4.b bVar) {
        return ((p1.m1) this.f24632a.getValue()).c(bVar);
    }

    @Override // p1.m1
    public final int d(n4.b bVar, n4.k kVar) {
        return ((p1.m1) this.f24632a.getValue()).d(bVar, kVar);
    }
}

package l1;

import kh2.m2;
import q4.y;

/* loaded from: classes2.dex */
public final class h implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f81329a;

    public h(long j13) {
        this.f81329a = j13;
    }

    @Override // q4.y
    public final long a(n4.i iVar, long j13, n4.k kVar, long j14) {
        int i13 = iVar.f89182a;
        long j15 = this.f81329a;
        return d7.b.a(m2.c0(i13 + ((int) (j15 >> 32)), (int) (j14 >> 32), kVar == n4.k.Ltr, (int) (j13 >> 32)), m2.c0(iVar.f89183b + ((int) (j15 & 4294967295L)), (int) (j14 & 4294967295L), true, (int) (j13 & 4294967295L)));
    }
}

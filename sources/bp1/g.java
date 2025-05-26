package bp1;

import a.cb;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f23662a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23663b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23664c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23665d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23666e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23667f;

    public g(c cVar) {
        boolean y13;
        String Z2;
        String U2;
        String id3;
        this.f23662a = cVar;
        boolean z13 = cVar instanceof d;
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(((e) cVar).f23654b.X2(), "getFollowingCount(...)");
        }
        int i13 = 0;
        if (z13) {
            Boolean h10 = ((d) cVar).f23653b.h();
            y13 = h10 != null ? h10.booleanValue() : false;
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            y13 = cb.y(((e) cVar).f23654b, "getIsVerifiedMerchant(...)");
        }
        this.f23663b = y13;
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            Boolean s22 = ((e) cVar).f23654b.s2();
            Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
            s22.getClass();
        }
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((e) cVar).f23654b.getClass();
        }
        if (z13) {
            Z2 = ((d) cVar).f23653b.f();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            Z2 = ((e) cVar).f23654b.Z2();
        }
        this.f23664c = Z2;
        if (z13) {
            U2 = ((d) cVar).f23653b.l();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            U2 = ((e) cVar).f23654b.U2();
        }
        this.f23665d = U2;
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((e) cVar).f23654b.getClass();
        }
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((e) cVar).f23654b.getClass();
        }
        if (z13) {
            ((d) cVar).f23653b.getClass();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((e) cVar).f23654b.getClass();
        }
        if (z13) {
            Integer c13 = ((d) cVar).f23653b.c();
            if (c13 != null) {
                i13 = c13.intValue();
            }
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            Integer V2 = ((e) cVar).f23654b.V2();
            Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
            i13 = V2.intValue();
        }
        this.f23666e = i13;
        if (z13) {
            id3 = ((d) cVar).f23653b.a();
        } else {
            if (!(cVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            id3 = ((e) cVar).f23654b.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        }
        this.f23667f = id3;
    }

    public final int a() {
        return this.f23666e;
    }

    public final String b() {
        return this.f23664c;
    }
}

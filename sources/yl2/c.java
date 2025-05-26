package yl2;

import am2.c0;
import am2.g1;
import am2.i0;
import am2.q;
import am2.s;
import am2.v0;
import am2.w0;
import dm2.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import on2.u;
import pn2.b1;
import pn2.w1;
import xl2.r;

/* loaded from: classes4.dex */
public final class c extends dm2.b {

    /* renamed from: l, reason: collision with root package name */
    public static final ym2.b f139363l = new ym2.b(r.f135332l, ym2.g.e("Function"));

    /* renamed from: m, reason: collision with root package name */
    public static final ym2.b f139364m = new ym2.b(r.f135329i, ym2.g.e("KFunction"));

    /* renamed from: e, reason: collision with root package name */
    public final u f139365e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f139366f;

    /* renamed from: g, reason: collision with root package name */
    public final l f139367g;

    /* renamed from: h, reason: collision with root package name */
    public final int f139368h;

    /* renamed from: i, reason: collision with root package name */
    public final b f139369i;

    /* renamed from: j, reason: collision with root package name */
    public final f f139370j;

    /* renamed from: k, reason: collision with root package name */
    public final List f139371k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u storageManager, xl2.d containingDeclaration, l functionTypeKind, int i13) {
        super(storageManager, functionTypeKind.a(i13));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.f139365e = storageManager;
        this.f139366f = containingDeclaration;
        this.f139367g = functionTypeKind;
        this.f139368h = i13;
        this.f139369i = new b(this);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "containingClass");
        this.f139370j = new f(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i13, 1);
        ArrayList arrayList2 = new ArrayList(g0.q(intRange, 10));
        ql2.k it = intRange.iterator();
        while (it.f104109c) {
            int b13 = it.b();
            arrayList.add(z0.x0(this, w1.IN_VARIANCE, ym2.g.e("P" + b13), arrayList.size(), this.f139365e));
            arrayList2.add(Unit.f80348a);
        }
        arrayList.add(z0.x0(this, w1.OUT_VARIANCE, ym2.g.e("R"), arrayList.size(), this.f139365e));
        this.f139371k = CollectionsKt.F0(arrayList);
        d dVar = e.Companion;
        l functionTypeKind2 = this.f139367g;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(functionTypeKind2, "functionTypeKind");
        if (Intrinsics.d(functionTypeKind2, h.f139372c) || Intrinsics.d(functionTypeKind2, k.f139375c) || Intrinsics.d(functionTypeKind2, i.f139373c)) {
            return;
        }
        Intrinsics.d(functionTypeKind2, j.f139374c);
    }

    @Override // am2.g
    public final g1 J() {
        return null;
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    @Override // am2.g
    public final boolean P() {
        return false;
    }

    @Override // am2.g
    public final boolean S() {
        return false;
    }

    @Override // am2.g
    public final boolean Y() {
        return false;
    }

    @Override // am2.a0
    public final boolean Z() {
        return false;
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f139370j;
    }

    @Override // am2.n
    public final w0 b() {
        v0 NO_SOURCE = w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // am2.g
    public final /* bridge */ /* synthetic */ in2.n b0() {
        return in2.m.f72874b;
    }

    @Override // am2.g
    public final am2.h c() {
        return am2.h.INTERFACE;
    }

    @Override // am2.g
    public final /* bridge */ /* synthetic */ am2.g c0() {
        return null;
    }

    @Override // am2.j
    public final b1 e() {
        return this.f139369i;
    }

    @Override // am2.m
    public final am2.m g() {
        return this.f139366f;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return bm2.h.f23540a;
    }

    @Override // am2.g, am2.p
    public final q getVisibility() {
        am2.r PUBLIC = s.f15577e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // am2.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // am2.g
    public final boolean isInline() {
        return false;
    }

    @Override // am2.g, am2.k
    public final List k() {
        return this.f139371k;
    }

    @Override // am2.g, am2.a0
    public final c0 l() {
        return c0.ABSTRACT;
    }

    @Override // am2.g
    public final Collection n() {
        return q0.f80391a;
    }

    @Override // am2.g
    public final Collection p() {
        return q0.f80391a;
    }

    @Override // am2.k
    public final boolean q() {
        return false;
    }

    @Override // am2.g
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        String b13 = getName().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return b13;
    }

    @Override // am2.g
    public final /* bridge */ /* synthetic */ am2.f u() {
        return null;
    }
}

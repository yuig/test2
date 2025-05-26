package androidx.compose.foundation;

import android.view.View;
import bp1.h;
import k1.g2;
import k1.t1;
import k1.u1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import s3.e1;
import u2.p;
import z3.x;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Ls3/e1;", "Lk1/t1;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MagnifierElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f17097b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f17098c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f17099d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17100e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17101f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17102g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17103h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17104i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17105j;

    /* renamed from: k, reason: collision with root package name */
    public final g2 f17106k;

    public MagnifierElement(e0 e0Var, Function1 function1, Function1 function12, float f13, boolean z13, long j13, float f14, float f15, boolean z14, g2 g2Var) {
        this.f17097b = e0Var;
        this.f17098c = function1;
        this.f17099d = function12;
        this.f17100e = f13;
        this.f17101f = z13;
        this.f17102g = j13;
        this.f17103h = f14;
        this.f17104i = f15;
        this.f17105j = z14;
        this.f17106k = g2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f17097b == magnifierElement.f17097b && this.f17098c == magnifierElement.f17098c && this.f17100e == magnifierElement.f17100e && this.f17101f == magnifierElement.f17101f && this.f17102g == magnifierElement.f17102g && n4.e.a(this.f17103h, magnifierElement.f17103h) && n4.e.a(this.f17104i, magnifierElement.f17104i) && this.f17105j == magnifierElement.f17105j && this.f17099d == magnifierElement.f17099d && Intrinsics.d(this.f17106k, magnifierElement.f17106k);
    }

    public final int hashCode() {
        int hashCode = this.f17097b.hashCode() * 31;
        Function1 function1 = this.f17098c;
        int e13 = ep.b.e(this.f17105j, a.a.a(this.f17104i, a.a.a(this.f17103h, a.a.c(this.f17102g, ep.b.e(this.f17101f, a.a.a(this.f17100e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
        Function1 function12 = this.f17099d;
        return this.f17106k.hashCode() + ((e13 + (function12 != null ? function12.hashCode() : 0)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        return new t1(this.f17097b, this.f17098c, this.f17099d, this.f17100e, this.f17101f, this.f17102g, this.f17103h, this.f17104i, this.f17105j, this.f17106k);
    }

    @Override // s3.e1
    public final void m(p pVar) {
        t1 t1Var = (t1) pVar;
        float f13 = t1Var.f78016q;
        long j13 = t1Var.f78018s;
        float f14 = t1Var.f78019t;
        boolean z13 = t1Var.f78017r;
        float f15 = t1Var.f78020u;
        boolean z14 = t1Var.f78021v;
        g2 g2Var = t1Var.f78022w;
        View view = t1Var.f78023x;
        n4.b bVar = t1Var.f78024y;
        t1Var.f78013n = this.f17097b;
        t1Var.f78014o = this.f17098c;
        float f16 = this.f17100e;
        t1Var.f78016q = f16;
        boolean z15 = this.f17101f;
        t1Var.f78017r = z15;
        long j14 = this.f17102g;
        t1Var.f78018s = j14;
        float f17 = this.f17103h;
        t1Var.f78019t = f17;
        float f18 = this.f17104i;
        t1Var.f78020u = f18;
        boolean z16 = this.f17105j;
        t1Var.f78021v = z16;
        t1Var.f78015p = this.f17099d;
        g2 g2Var2 = this.f17106k;
        t1Var.f78022w = g2Var2;
        View G = h.G(t1Var);
        n4.b bVar2 = com.bumptech.glide.c.U0(t1Var).f110830r;
        if (t1Var.f78025z != null) {
            x xVar = u1.f78043a;
            if (((!Float.isNaN(f16) || !Float.isNaN(f13)) && f16 != f13 && !g2Var2.b()) || j14 != j13 || !n4.e.a(f17, f14) || !n4.e.a(f18, f15) || z15 != z13 || z16 != z14 || !Intrinsics.d(g2Var2, g2Var) || !Intrinsics.d(G, view) || !Intrinsics.d(bVar2, bVar)) {
                t1Var.N0();
            }
        }
        t1Var.O0();
    }
}

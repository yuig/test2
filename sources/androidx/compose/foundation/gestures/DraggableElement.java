package androidx.compose.foundation.gestures;

import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1.a1;
import m1.b1;
import m1.f;
import m1.f1;
import o1.l;
import s3.e1;
import u2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Ls3/e1;", "Lm1/a1;", "d0/o", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DraggableElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final b1 f17126b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f17127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17128d;

    /* renamed from: e, reason: collision with root package name */
    public final l f17129e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17130f;

    /* renamed from: g, reason: collision with root package name */
    public final kl2.l f17131g;

    /* renamed from: h, reason: collision with root package name */
    public final kl2.l f17132h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17133i;

    public DraggableElement(b1 b1Var, f1 f1Var, boolean z13, l lVar, boolean z14, kl2.l lVar2, kl2.l lVar3, boolean z15) {
        this.f17126b = b1Var;
        this.f17127c = f1Var;
        this.f17128d = z13;
        this.f17129e = lVar;
        this.f17130f = z14;
        this.f17131g = lVar2;
        this.f17132h = lVar3;
        this.f17133i = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.d(this.f17126b, draggableElement.f17126b) && this.f17127c == draggableElement.f17127c && this.f17128d == draggableElement.f17128d && Intrinsics.d(this.f17129e, draggableElement.f17129e) && this.f17130f == draggableElement.f17130f && Intrinsics.d(this.f17131g, draggableElement.f17131g) && Intrinsics.d(this.f17132h, draggableElement.f17132h) && this.f17133i == draggableElement.f17133i;
    }

    public final int hashCode() {
        int e13 = b.e(this.f17128d, (this.f17127c.hashCode() + (this.f17126b.hashCode() * 31)) * 31, 31);
        l lVar = this.f17129e;
        return Boolean.hashCode(this.f17133i) + ((this.f17132h.hashCode() + ((this.f17131g.hashCode() + b.e(this.f17130f, (e13 + (lVar != null ? lVar.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    @Override // s3.e1
    public final p l() {
        f fVar = f.f85334k;
        boolean z13 = this.f17128d;
        l lVar = this.f17129e;
        f1 f1Var = this.f17127c;
        a1 a1Var = new a1(fVar, z13, lVar, f1Var);
        a1Var.f85281x = this.f17126b;
        a1Var.f85282y = f1Var;
        a1Var.f85283z = this.f17130f;
        a1Var.A = this.f17131g;
        a1Var.B = this.f17132h;
        a1Var.C = this.f17133i;
        return a1Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        boolean z13;
        boolean z14;
        a1 a1Var = (a1) pVar;
        f fVar = f.f85334k;
        b1 b1Var = a1Var.f85281x;
        b1 b1Var2 = this.f17126b;
        if (Intrinsics.d(b1Var, b1Var2)) {
            z13 = false;
        } else {
            a1Var.f85281x = b1Var2;
            z13 = true;
        }
        f1 f1Var = a1Var.f85282y;
        f1 f1Var2 = this.f17127c;
        if (f1Var != f1Var2) {
            a1Var.f85282y = f1Var2;
            z13 = true;
        }
        boolean z15 = a1Var.C;
        boolean z16 = this.f17133i;
        if (z15 != z16) {
            a1Var.C = z16;
            z14 = true;
        } else {
            z14 = z13;
        }
        a1Var.A = this.f17131g;
        a1Var.B = this.f17132h;
        a1Var.f85283z = this.f17130f;
        a1Var.X0(fVar, this.f17128d, this.f17129e, f1Var2, z14);
    }
}

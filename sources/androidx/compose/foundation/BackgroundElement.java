package androidx.compose.foundation;

import b3.s;
import b3.w;
import b3.x0;
import k1.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import u2.p;
import xk2.d0;
import xk2.e0;
import y2.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Ls3/e1;", "Lk1/r;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class BackgroundElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final long f17070b;

    /* renamed from: c, reason: collision with root package name */
    public final s f17071c = null;

    /* renamed from: d, reason: collision with root package name */
    public final float f17072d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f17073e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f17074f;

    public BackgroundElement(long j13, x0 x0Var) {
        this.f17070b = j13;
        this.f17073e = x0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && w.c(this.f17070b, backgroundElement.f17070b) && Intrinsics.d(this.f17071c, backgroundElement.f17071c) && this.f17072d == backgroundElement.f17072d && Intrinsics.d(this.f17073e, backgroundElement.f17073e);
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        int hashCode = Long.hashCode(this.f17070b) * 31;
        s sVar = this.f17071c;
        return this.f17073e.hashCode() + a.a.a(this.f17072d, (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31, 31);
    }

    @Override // s3.e1
    public final p l() {
        r rVar = new r();
        rVar.f77982n = this.f17070b;
        rVar.f77983o = this.f17071c;
        rVar.f77984p = this.f17072d;
        rVar.f77985q = this.f17073e;
        rVar.f77986r = h.f136670b;
        return rVar;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        r rVar = (r) pVar;
        rVar.f77982n = this.f17070b;
        rVar.f77983o = this.f17071c;
        rVar.f77984p = this.f17072d;
        rVar.f77985q = this.f17073e;
    }
}

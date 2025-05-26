package androidx.compose.ui.draw;

import b3.r;
import b3.w;
import b3.x0;
import com.bumptech.glide.c;
import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n4.e;
import s3.e1;
import s3.q1;
import u2.p;
import xk2.d0;
import xk2.e0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Ls3/e1;", "Lb3/r;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final /* data */ class ShadowGraphicsLayerElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17394b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f17395c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17396d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17397e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17398f;

    public ShadowGraphicsLayerElement(float f13, x0 x0Var, boolean z13, long j13, long j14) {
        this.f17394b = f13;
        this.f17395c = x0Var;
        this.f17396d = z13;
        this.f17397e = j13;
        this.f17398f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return e.a(this.f17394b, shadowGraphicsLayerElement.f17394b) && Intrinsics.d(this.f17395c, shadowGraphicsLayerElement.f17395c) && this.f17396d == shadowGraphicsLayerElement.f17396d && w.c(this.f17397e, shadowGraphicsLayerElement.f17397e) && w.c(this.f17398f, shadowGraphicsLayerElement.f17398f);
    }

    public final int hashCode() {
        int e13 = b.e(this.f17396d, (this.f17395c.hashCode() + (Float.hashCode(this.f17394b) * 31)) * 31, 31);
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Long.hashCode(this.f17398f) + a.a.c(this.f17397e, e13, 31);
    }

    @Override // s3.e1
    public final p l() {
        return new r(new q0.e(this, 24));
    }

    @Override // s3.e1
    public final void m(p pVar) {
        r rVar = (r) pVar;
        rVar.f21348n = new q0.e(this, 24);
        q1 q1Var = c.S0(rVar, 2).f110900n;
        if (q1Var != null) {
            q1Var.t1(rVar.f21348n, true);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb3.append((Object) e.b(this.f17394b));
        sb3.append(", shape=");
        sb3.append(this.f17395c);
        sb3.append(", clip=");
        sb3.append(this.f17396d);
        sb3.append(", ambientColor=");
        jq.b.t(this.f17397e, sb3, ", spotColor=");
        sb3.append((Object) w.i(this.f17398f));
        sb3.append(')');
        return sb3.toString();
    }
}

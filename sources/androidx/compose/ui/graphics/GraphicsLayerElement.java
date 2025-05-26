package androidx.compose.ui.graphics;

import b3.b1;
import b3.s0;
import b3.w;
import b3.x0;
import b3.y0;
import com.bumptech.glide.c;
import ep.b;
import k1.s2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s3.e1;
import s3.q1;
import u2.p;
import xk2.d0;
import xk2.e0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Ls3/e1;", "Lb3/y0;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final float f17415b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17416c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17417d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17418e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17419f;

    /* renamed from: g, reason: collision with root package name */
    public final float f17420g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17421h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17422i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17423j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17424k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17425l;

    /* renamed from: m, reason: collision with root package name */
    public final x0 f17426m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17427n;

    /* renamed from: o, reason: collision with root package name */
    public final long f17428o;

    /* renamed from: p, reason: collision with root package name */
    public final long f17429p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17430q;

    public GraphicsLayerElement(float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, long j13, x0 x0Var, boolean z13, long j14, long j15, int i13) {
        this.f17415b = f13;
        this.f17416c = f14;
        this.f17417d = f15;
        this.f17418e = f16;
        this.f17419f = f17;
        this.f17420g = f18;
        this.f17421h = f19;
        this.f17422i = f23;
        this.f17423j = f24;
        this.f17424k = f25;
        this.f17425l = j13;
        this.f17426m = x0Var;
        this.f17427n = z13;
        this.f17428o = j14;
        this.f17429p = j15;
        this.f17430q = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f17415b, graphicsLayerElement.f17415b) == 0 && Float.compare(this.f17416c, graphicsLayerElement.f17416c) == 0 && Float.compare(this.f17417d, graphicsLayerElement.f17417d) == 0 && Float.compare(this.f17418e, graphicsLayerElement.f17418e) == 0 && Float.compare(this.f17419f, graphicsLayerElement.f17419f) == 0 && Float.compare(this.f17420g, graphicsLayerElement.f17420g) == 0 && Float.compare(this.f17421h, graphicsLayerElement.f17421h) == 0 && Float.compare(this.f17422i, graphicsLayerElement.f17422i) == 0 && Float.compare(this.f17423j, graphicsLayerElement.f17423j) == 0 && Float.compare(this.f17424k, graphicsLayerElement.f17424k) == 0 && b1.a(this.f17425l, graphicsLayerElement.f17425l) && Intrinsics.d(this.f17426m, graphicsLayerElement.f17426m) && this.f17427n == graphicsLayerElement.f17427n && Intrinsics.d(null, null) && w.c(this.f17428o, graphicsLayerElement.f17428o) && w.c(this.f17429p, graphicsLayerElement.f17429p) && s0.b(this.f17430q, graphicsLayerElement.f17430q);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f17424k, a.a.a(this.f17423j, a.a.a(this.f17422i, a.a.a(this.f17421h, a.a.a(this.f17420g, a.a.a(this.f17419f, a.a.a(this.f17418e, a.a.a(this.f17417d, a.a.a(this.f17416c, Float.hashCode(this.f17415b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i13 = b1.f21305c;
        int e13 = b.e(this.f17427n, (this.f17426m.hashCode() + a.a.c(this.f17425l, a13, 31)) * 31, 961);
        int i14 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Integer.hashCode(this.f17430q) + a.a.c(this.f17429p, a.a.c(this.f17428o, e13, 31), 31);
    }

    @Override // s3.e1
    public final p l() {
        y0 y0Var = new y0();
        y0Var.f21399n = this.f17415b;
        y0Var.f21400o = this.f17416c;
        y0Var.f21401p = this.f17417d;
        y0Var.f21402q = this.f17418e;
        y0Var.f21403r = this.f17419f;
        y0Var.f21404s = this.f17420g;
        y0Var.f21405t = this.f17421h;
        y0Var.f21406u = this.f17422i;
        y0Var.f21407v = this.f17423j;
        y0Var.f21408w = this.f17424k;
        y0Var.f21409x = this.f17425l;
        y0Var.f21410y = this.f17426m;
        y0Var.f21411z = this.f17427n;
        y0Var.A = this.f17428o;
        y0Var.B = this.f17429p;
        y0Var.C = this.f17430q;
        y0Var.D = new s2(y0Var, 9);
        return y0Var;
    }

    @Override // s3.e1
    public final void m(p pVar) {
        y0 y0Var = (y0) pVar;
        y0Var.f21399n = this.f17415b;
        y0Var.f21400o = this.f17416c;
        y0Var.f21401p = this.f17417d;
        y0Var.f21402q = this.f17418e;
        y0Var.f21403r = this.f17419f;
        y0Var.f21404s = this.f17420g;
        y0Var.f21405t = this.f17421h;
        y0Var.f21406u = this.f17422i;
        y0Var.f21407v = this.f17423j;
        y0Var.f21408w = this.f17424k;
        y0Var.f21409x = this.f17425l;
        y0Var.f21410y = this.f17426m;
        y0Var.f21411z = this.f17427n;
        y0Var.A = this.f17428o;
        y0Var.B = this.f17429p;
        y0Var.C = this.f17430q;
        q1 q1Var = c.S0(y0Var, 2).f110900n;
        if (q1Var != null) {
            q1Var.t1(y0Var.D, true);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb3.append(this.f17415b);
        sb3.append(", scaleY=");
        sb3.append(this.f17416c);
        sb3.append(", alpha=");
        sb3.append(this.f17417d);
        sb3.append(", translationX=");
        sb3.append(this.f17418e);
        sb3.append(", translationY=");
        sb3.append(this.f17419f);
        sb3.append(", shadowElevation=");
        sb3.append(this.f17420g);
        sb3.append(", rotationX=");
        sb3.append(this.f17421h);
        sb3.append(", rotationY=");
        sb3.append(this.f17422i);
        sb3.append(", rotationZ=");
        sb3.append(this.f17423j);
        sb3.append(", cameraDistance=");
        sb3.append(this.f17424k);
        sb3.append(", transformOrigin=");
        sb3.append((Object) b1.d(this.f17425l));
        sb3.append(", shape=");
        sb3.append(this.f17426m);
        sb3.append(", clip=");
        sb3.append(this.f17427n);
        sb3.append(", renderEffect=null, ambientShadowColor=");
        jq.b.t(this.f17428o, sb3, ", spotShadowColor=");
        sb3.append((Object) w.i(this.f17429p));
        sb3.append(", compositingStrategy=");
        sb3.append((Object) ("CompositingStrategy(value=" + this.f17430q + ')'));
        sb3.append(')');
        return sb3.toString();
    }
}

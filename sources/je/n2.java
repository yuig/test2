package je;

import android.graphics.Path;
import android.view.View;

/* loaded from: classes3.dex */
public final class n2 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public float f75712a;

    /* renamed from: b, reason: collision with root package name */
    public float f75713b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f75714c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f75715d;

    public n2(View view, float f13, float f14, bh.b bVar) {
        this.f75714c = view;
        this.f75712a = f13;
        this.f75713b = f14;
        this.f75715d = bVar;
    }

    @Override // je.t0
    public final void a(float f13, float f14, float f15, float f16) {
        ((Path) this.f75714c).quadTo(f13, f14, f15, f16);
        this.f75712a = f15;
        this.f75713b = f16;
    }

    @Override // je.t0
    public final void b(float f13, float f14) {
        ((Path) this.f75714c).moveTo(f13, f14);
        this.f75712a = f13;
        this.f75713b = f14;
    }

    @Override // je.t0
    public final void c(float f13, float f14, float f15, float f16, float f17, float f18) {
        ((Path) this.f75714c).cubicTo(f13, f14, f15, f16, f17, f18);
        this.f75712a = f17;
        this.f75713b = f18;
    }

    @Override // je.t0
    public final void close() {
        ((Path) this.f75714c).close();
    }

    @Override // je.t0
    public final void d(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
        t2.a(this.f75712a, this.f75713b, f13, f14, f15, z13, z14, f16, f17, this);
        this.f75712a = f16;
        this.f75713b = f17;
    }

    @Override // je.t0
    public final void f(float f13, float f14) {
        ((Path) this.f75714c).lineTo(f13, f14);
        this.f75712a = f13;
        this.f75713b = f14;
    }

    public n2(t2 t2Var, g.i iVar) {
        this.f75715d = t2Var;
        this.f75714c = new Path();
        if (iVar == null) {
            return;
        }
        iVar.t(this);
    }
}

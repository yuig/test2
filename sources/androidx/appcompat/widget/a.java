package androidx.appcompat.widget;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements q5.e1 {

    /* renamed from: a, reason: collision with root package name */
    public int f16502a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16503b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16504c;

    @Override // q5.e1
    public final void a() {
        super/*android.view.View*/.setVisibility(0);
        this.f16503b = false;
    }

    @Override // q5.e1
    public final void b() {
        this.f16503b = true;
    }

    public final void c(boolean z13) {
        pe.i.J(new e.e(this, z13, 3), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' bool uniform"));
    }

    @Override // q5.e1
    public final void d(View view) {
        if (this.f16503b) {
            return;
        }
        Object obj = this.f16504c;
        ((ActionBarContextView) obj).f16208f = null;
        super/*android.view.View*/.setVisibility(this.f16502a);
    }

    public final void e(id2.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        pe.i.J(new et1.r0(27, value, this), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' color uniform"));
    }

    public final void f(float f13) {
        pe.i.J(new ml1.k(this, f13, 1), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' float uniform"));
    }

    public final void g(float f13, float f14) {
        pe.i.J(new c2.v1(this, f13, f14), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' float2 uniform"));
    }

    public final void h(float f13, float f14, float f15, float f16) {
        pe.i.J(new zd2.f(this, f13, f14, f15, f16), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' float4 uniform"));
    }

    public final void i(int i13) {
        pe.i.J(new zd2.e(this, i13), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' int uniform"));
    }

    public final void j(ae2.f texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        pe.i.J(new et1.r0(28, this, texture), a.a.p(new StringBuilder("set '"), (String) this.f16504c, "' texture sampler uniform"));
    }
}

package p0;

import a.z0;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.u1;
import c0.r1;
import c0.s1;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f98324a;

    /* renamed from: b, reason: collision with root package name */
    public final i f98325b;

    /* renamed from: c, reason: collision with root package name */
    public final j f98326c;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f98327d;

    public f(j0 j0Var, r1 r1Var, z0 z0Var) {
        this.f98324a = j0Var;
        this.f98327d = r1Var;
        this.f98325b = new i(j0Var.d(), z0Var);
        this.f98326c = new j(j0Var.g());
    }

    @Override // c0.r1
    public final void b(s1 s1Var) {
        f0.h.s();
        this.f98327d.b(s1Var);
    }

    @Override // c0.r1
    public final void c(s1 s1Var) {
        f0.h.s();
        this.f98327d.c(s1Var);
    }

    @Override // androidx.camera.core.impl.j0
    public final g0 d() {
        return this.f98325b;
    }

    @Override // androidx.camera.core.impl.j0
    public final h0 g() {
        return this.f98326c;
    }

    @Override // c0.r1
    public final void h(s1 s1Var) {
        f0.h.s();
        this.f98327d.h(s1Var);
    }

    @Override // androidx.camera.core.impl.j0
    public final u1 j() {
        return this.f98324a.j();
    }

    @Override // androidx.camera.core.impl.j0
    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.j0
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.j0
    public final boolean m() {
        return false;
    }

    @Override // c0.r1
    public final void o(s1 s1Var) {
        f0.h.s();
        this.f98327d.o(s1Var);
    }
}

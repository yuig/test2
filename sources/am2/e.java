package am2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pn2.w1;

/* loaded from: classes4.dex */
public final class e implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f15545a;

    /* renamed from: b, reason: collision with root package name */
    public final m f15546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15547c;

    public e(c1 originalDescriptor, m declarationDescriptor, int i13) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f15545a = originalDescriptor;
        this.f15546b = declarationDescriptor;
        this.f15547c = i13;
    }

    @Override // am2.c1
    public final on2.u B() {
        return this.f15545a.B();
    }

    @Override // am2.c1
    public final boolean F() {
        return true;
    }

    @Override // am2.n
    public final w0 b() {
        return this.f15545a.b();
    }

    @Override // am2.c1, am2.j
    public final pn2.b1 e() {
        return this.f15545a.e();
    }

    @Override // am2.m
    public final m g() {
        return this.f15546b;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return this.f15545a.getAnnotations();
    }

    @Override // am2.c1
    public final int getIndex() {
        return this.f15545a.getIndex() + this.f15547c;
    }

    @Override // am2.m
    public final ym2.g getName() {
        return this.f15545a.getName();
    }

    @Override // am2.c1
    public final List getUpperBounds() {
        return this.f15545a.getUpperBounds();
    }

    @Override // am2.j
    public final pn2.h0 j() {
        return this.f15545a.j();
    }

    @Override // am2.m
    public final Object l0(ul2.e eVar, Object obj) {
        return this.f15545a.l0(eVar, obj);
    }

    @Override // am2.c1
    public final boolean o() {
        return this.f15545a.o();
    }

    @Override // am2.c1
    public final w1 r() {
        return this.f15545a.r();
    }

    public final String toString() {
        return this.f15545a + "[inner-copy]";
    }

    @Override // am2.m
    /* renamed from: a */
    public final c1 o0() {
        c1 o03 = this.f15545a.o0();
        Intrinsics.checkNotNullExpressionValue(o03, "getOriginal(...)");
        return o03;
    }
}

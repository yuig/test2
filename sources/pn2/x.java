package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends v implements u1 {

    /* renamed from: d, reason: collision with root package name */
    public final v f100853d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f100854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v origin, b0 enhancement) {
        super(origin.f100850b, origin.f100851c);
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f100853d = origin;
        this.f100854e = enhancement;
    }

    @Override // pn2.v1
    public final v1 A0(boolean z13) {
        return com.bumptech.glide.c.w1(this.f100853d.A0(z13), this.f100854e.z0().A0(z13));
    }

    @Override // pn2.v1
    /* renamed from: B0 */
    public final v1 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((qn2.h) kotlinTypeRefiner).getClass();
        v type = this.f100853d;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        b0 type2 = this.f100854e;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new x(type, type2);
    }

    @Override // pn2.v1
    public final v1 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return com.bumptech.glide.c.w1(this.f100853d.C0(newAttributes), this.f100854e);
    }

    @Override // pn2.v
    public final h0 D0() {
        return this.f100853d.D0();
    }

    @Override // pn2.v
    public final String E0(an2.y renderer, an2.b0 options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return options.d() ? renderer.d0(this.f100854e) : this.f100853d.E0(renderer, options);
    }

    @Override // pn2.u1
    public final b0 X() {
        return this.f100854e;
    }

    @Override // pn2.u1
    public final v1 r0() {
        return this.f100853d;
    }

    @Override // pn2.v
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f100854e + ")] " + this.f100853d;
    }

    @Override // pn2.b0
    public final b0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((qn2.h) kotlinTypeRefiner).getClass();
        v type = this.f100853d;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        b0 type2 = this.f100854e;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new x(type, type2);
    }
}

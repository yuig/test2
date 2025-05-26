package cn2;

import in2.n;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.b1;
import pn2.g1;
import pn2.h0;
import pn2.u0;
import pn2.v1;
import qn2.i;
import rn2.m;

/* loaded from: classes2.dex */
public final class a extends h0 implements sn2.c {

    /* renamed from: b, reason: collision with root package name */
    public final g1 f28259b;

    /* renamed from: c, reason: collision with root package name */
    public final b f28260c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28261d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f28262e;

    public a(g1 typeProjection, b constructor, boolean z13, u0 attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f28259b = typeProjection;
        this.f28260c = constructor;
        this.f28261d = z13;
        this.f28262e = attributes;
    }

    @Override // pn2.h0, pn2.v1
    public final v1 A0(boolean z13) {
        if (z13 == this.f28261d) {
            return this;
        }
        return new a(this.f28259b, this.f28260c, z13, this.f28262e);
    }

    @Override // pn2.v1
    /* renamed from: B0 */
    public final v1 y0(i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        g1 a13 = this.f28259b.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(a13, "refine(...)");
        return new a(a13, this.f28260c, this.f28261d, this.f28262e);
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        if (z13 == this.f28261d) {
            return this;
        }
        return new a(this.f28259b, this.f28260c, z13, this.f28262e);
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new a(this.f28259b, this.f28260c, this.f28261d, newAttributes);
    }

    @Override // pn2.h0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Captured(");
        sb3.append(this.f28259b);
        sb3.append(')');
        sb3.append(this.f28261d ? "?" : "");
        return sb3.toString();
    }

    @Override // pn2.b0
    public final List u0() {
        return q0.f80391a;
    }

    @Override // pn2.b0
    public final u0 v0() {
        return this.f28262e;
    }

    @Override // pn2.b0
    public final n w() {
        return m.a(rn2.i.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // pn2.b0
    public final b1 w0() {
        return this.f28260c;
    }

    @Override // pn2.b0
    public final boolean x0() {
        return this.f28261d;
    }

    @Override // pn2.b0
    public final b0 y0(i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        g1 a13 = this.f28259b.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(a13, "refine(...)");
        return new a(a13, this.f28260c, this.f28261d, this.f28262e);
    }
}

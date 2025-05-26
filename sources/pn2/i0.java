package pn2;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final b1 f100799b;

    /* renamed from: c, reason: collision with root package name */
    public final List f100800c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100801d;

    /* renamed from: e, reason: collision with root package name */
    public final in2.n f100802e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f100803f;

    public i0(b1 constructor, List arguments, boolean z13, in2.n memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.f100799b = constructor;
        this.f100800c = arguments;
        this.f100801d = z13;
        this.f100802e = memberScope;
        this.f100803f = refinedTypeFactory;
        if (!(memberScope instanceof rn2.h) || (memberScope instanceof rn2.n)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // pn2.v1
    /* renamed from: B0 */
    public final v1 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        h0 h0Var = (h0) this.f100803f.invoke(kotlinTypeRefiner);
        return h0Var == null ? this : h0Var;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        if (z13 == this.f100801d) {
            return this;
        }
        if (!z13) {
            return new e0(this);
        }
        Intrinsics.checkNotNullParameter(this, "delegate");
        return new f0(this);
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new j0(this, newAttributes);
    }

    @Override // pn2.b0
    public final List u0() {
        return this.f100800c;
    }

    @Override // pn2.b0
    public final u0 v0() {
        u0.f100848b.getClass();
        return u0.f100849c;
    }

    @Override // pn2.b0
    public final in2.n w() {
        return this.f100802e;
    }

    @Override // pn2.b0
    public final b1 w0() {
        return this.f100799b;
    }

    @Override // pn2.b0
    public final boolean x0() {
        return this.f100801d;
    }

    @Override // pn2.b0
    public final b0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        h0 h0Var = (h0) this.f100803f.invoke(kotlinTypeRefiner);
        return h0Var == null ? this : h0Var;
    }
}

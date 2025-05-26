package rn2;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.b1;
import pn2.h0;
import pn2.u0;
import pn2.v1;
import t3.s1;

/* loaded from: classes2.dex */
public final class j extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final b1 f108917b;

    /* renamed from: c, reason: collision with root package name */
    public final in2.n f108918c;

    /* renamed from: d, reason: collision with root package name */
    public final l f108919d;

    /* renamed from: e, reason: collision with root package name */
    public final List f108920e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f108921f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f108922g;

    /* renamed from: h, reason: collision with root package name */
    public final String f108923h;

    public j(b1 constructor, in2.n memberScope, l kind, List arguments, boolean z13, String... formatParams) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f108917b = constructor;
        this.f108918c = memberScope;
        this.f108919d = kind;
        this.f108920e = arguments;
        this.f108921f = z13;
        this.f108922g = formatParams;
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f108923h = s1.d(copyOf, copyOf.length, debugMessage, "format(...)");
    }

    @Override // pn2.v1
    /* renamed from: B0 */
    public final v1 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pn2.h0, pn2.v1
    public final v1 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        String[] strArr = this.f108922g;
        return new j(this.f108917b, this.f108918c, this.f108919d, this.f108920e, z13, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    @Override // pn2.b0
    public final List u0() {
        return this.f108920e;
    }

    @Override // pn2.b0
    public final u0 v0() {
        u0.f100848b.getClass();
        return u0.f100849c;
    }

    @Override // pn2.b0
    public final in2.n w() {
        return this.f108918c;
    }

    @Override // pn2.b0
    public final b1 w0() {
        return this.f108917b;
    }

    @Override // pn2.b0
    public final boolean x0() {
        return this.f108921f;
    }

    @Override // pn2.b0
    public final b0 y0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}

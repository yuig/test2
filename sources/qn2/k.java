package qn2;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;
import pn2.h0;
import pn2.u0;
import pn2.v1;

/* loaded from: classes2.dex */
public final class k extends h0 implements sn2.c {

    /* renamed from: b, reason: collision with root package name */
    public final sn2.b f104500b;

    /* renamed from: c, reason: collision with root package name */
    public final l f104501c;

    /* renamed from: d, reason: collision with root package name */
    public final v1 f104502d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f104503e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104504f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104505g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(sn2.b r8, qn2.l r9, pn2.v1 r10, pn2.u0 r11, boolean r12, int r13) {
        /*
            r7 = this;
            r0 = r13 & 8
            if (r0 == 0) goto Lb
            pn2.t0 r11 = pn2.u0.f100848b
            r11.getClass()
            pn2.u0 r11 = pn2.u0.f100849c
        Lb:
            r4 = r11
            r11 = r13 & 16
            if (r11 == 0) goto L11
            r12 = 0
        L11:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.k.<init>(sn2.b, qn2.l, pn2.v1, pn2.u0, boolean, int):void");
    }

    @Override // pn2.h0, pn2.v1
    public final v1 A0(boolean z13) {
        return new k(this.f104500b, this.f104501c, this.f104502d, this.f104503e, z13, 32);
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        return new k(this.f104500b, this.f104501c, this.f104502d, this.f104503e, z13, 32);
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new k(this.f104500b, this.f104501c, this.f104502d, newAttributes, this.f104504f, this.f104505g);
    }

    @Override // pn2.b0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final k y0(i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        l e13 = this.f104501c.e(kotlinTypeRefiner);
        v1 type = this.f104502d;
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
        } else {
            type = null;
        }
        return new k(this.f104500b, e13, type, this.f104503e, this.f104504f, 32);
    }

    @Override // pn2.b0
    public final List u0() {
        return q0.f80391a;
    }

    @Override // pn2.b0
    public final u0 v0() {
        return this.f104503e;
    }

    @Override // pn2.b0
    public final in2.n w() {
        return rn2.m.a(rn2.i.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // pn2.b0
    public final b1 w0() {
        return this.f104501c;
    }

    @Override // pn2.b0
    public final boolean x0() {
        return this.f104504f;
    }

    public k(sn2.b captureStatus, l constructor, v1 v1Var, u0 attributes, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f104500b = captureStatus;
        this.f104501c = constructor;
        this.f104502d = v1Var;
        this.f104503e = attributes;
        this.f104504f = z13;
        this.f104505g = z14;
    }
}

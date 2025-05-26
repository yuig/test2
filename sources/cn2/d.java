package cn2;

import am2.c1;
import am2.j;
import bm2.i;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.g1;
import pn2.l1;
import pn2.w1;

/* loaded from: classes4.dex */
public final class d extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f28265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28266c;

    public d(l1 substitution, boolean z13) {
        this.f28266c = z13;
        Intrinsics.checkNotNullParameter(substitution, "substitution");
        this.f28265b = substitution;
    }

    @Override // pn2.l1
    public final boolean a() {
        return this.f28265b.a();
    }

    @Override // pn2.l1
    public final boolean b() {
        return this.f28266c;
    }

    @Override // pn2.l1
    public final i d(i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f28265b.d(annotations);
    }

    @Override // pn2.l1
    public final g1 e(b0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        g1 e13 = this.f28265b.e(key);
        if (e13 == null) {
            return null;
        }
        j b13 = key.w0().b();
        return l0.P(e13, b13 instanceof c1 ? (c1) b13 : null);
    }

    @Override // pn2.l1
    public final boolean f() {
        return this.f28265b.f();
    }

    @Override // pn2.l1
    public final b0 g(b0 topLevelType, w1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f28265b.g(topLevelType, position);
    }
}

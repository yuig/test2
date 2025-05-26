package w00;

import kotlin.jvm.internal.Intrinsics;
import pc.d;
import pc.m;
import pc.o0;
import pc.v;
import tc.g;

/* loaded from: classes.dex */
public final class a implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f126952a;

    public a(o0 apolloOperation) {
        Intrinsics.checkNotNullParameter(apolloOperation, "apolloOperation");
        this.f126952a = apolloOperation;
    }

    @Override // pc.o0
    public final String a() {
        return this.f126952a.a();
    }

    @Override // pc.o0
    public final pc.a b() {
        return new d(this.f126952a.b(), 2);
    }

    @Override // pc.o0
    public final String c() {
        return this.f126952a.c();
    }

    @Override // pc.o0
    public final m d() {
        return this.f126952a.d();
    }

    @Override // pc.o0
    public final void e(g writer, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        this.f126952a.e(writer, customScalarAdapters);
    }

    @Override // pc.o0
    public final String name() {
        return this.f126952a.name();
    }
}

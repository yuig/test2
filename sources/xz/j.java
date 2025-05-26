package xz;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pq2.g0;
import t00.m;

/* loaded from: classes3.dex */
public final class j extends rz.b {

    /* renamed from: e, reason: collision with root package name */
    public final Type f136236e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Type responseType, m failureRouter, w eventManager, boolean z13) {
        super(failureRouter, eventManager, z13);
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(failureRouter, "failureRouter");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f136236e = responseType;
    }

    @Override // pq2.k
    public final Object a(g0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new h(this, call, this.f110218a, this.f110220c);
    }

    @Override // pq2.k
    public final Type b() {
        return this.f136236e;
    }
}

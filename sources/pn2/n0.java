package pn2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f100822c;

    public n0(ArrayList arrayList) {
        this.f100822c = arrayList;
    }

    @Override // pn2.d1
    public final g1 h(b1 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f100822c.contains(key)) {
            return null;
        }
        am2.j b13 = key.b();
        Intrinsics.g(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return t1.n((am2.c1) b13);
    }
}

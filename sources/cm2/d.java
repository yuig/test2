package cm2;

import kotlin.jvm.internal.Intrinsics;
import nn2.j;
import nn2.t;

/* loaded from: classes4.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f28033a = new d();

    @Override // cm2.e
    public final boolean d(j classDescriptor, t functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return !functionDescriptor.getAnnotations().Q(f.f28034a);
    }
}

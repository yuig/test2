package qm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.g0;
import pn2.v1;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n f104433i = new n(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v1 it = (v1) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof g0);
    }
}

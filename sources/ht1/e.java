package ht1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f70209i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        et1.k it = (et1.k) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        throw new RuntimeException("Cannot decode before input format is set");
    }
}

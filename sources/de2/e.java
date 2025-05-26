package de2;

import java.util.concurrent.CompletableFuture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f54692a;

    /* renamed from: b, reason: collision with root package name */
    public final CompletableFuture f54693b;

    public e(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f54692a = block;
        this.f54693b = new CompletableFuture();
    }
}

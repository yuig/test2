package me2;

import java.util.concurrent.CompletableFuture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f87062a;

    /* renamed from: b, reason: collision with root package name */
    public final CompletableFuture f87063b;

    public h(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f87062a = block;
        this.f87063b = new CompletableFuture();
    }
}

package com.pinterest.shuffles.scene.composer;

import android.content.Context;
import android.util.Size;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends s0 {

    /* renamed from: h, reason: collision with root package name */
    public final Size f52155h;

    /* renamed from: i, reason: collision with root package name */
    public final ke2.c f52156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, ao2.j0 coroutineScope, Size canvasSize) {
        super(context, coroutineScope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(canvasSize, "canvasSize");
        this.f52155h = canvasSize;
        this.f52156i = new ke2.c();
    }

    @Override // com.pinterest.shuffles.scene.composer.f
    public final Size d() {
        return this.f52155h;
    }

    @Override // com.pinterest.shuffles.scene.composer.s0
    public final CompletableFuture i() {
        CompletableFuture completedFuture = CompletableFuture.completedFuture(Unit.f80348a);
        Intrinsics.checkNotNullExpressionValue(completedFuture, "completedFuture(...)");
        return completedFuture;
    }

    @Override // com.pinterest.shuffles.scene.composer.s0
    public final ke2.c l() {
        return this.f52156i;
    }
}

package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n70 implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final b22.c f40340a;

    public n70(@NotNull b22.c pinDeserializer) {
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f40340a = pinDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return new VTOPinFeed(pinterestJsonObject, "", this.f40340a);
    }
}

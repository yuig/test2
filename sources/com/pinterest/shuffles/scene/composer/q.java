package com.pinterest.shuffles.scene.composer;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;
import r72.y1;

/* loaded from: classes4.dex */
public final class q implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f52124a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f52125b;

    /* renamed from: c, reason: collision with root package name */
    public final n72.b f52126c;

    /* renamed from: d, reason: collision with root package name */
    public final n72.m f52127d;

    public q(Context context, a1 stickerRenderConfig, n72.b fontProvider, n72.m logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stickerRenderConfig, "stickerRenderConfig");
        Intrinsics.checkNotNullParameter(fontProvider, "fontProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f52124a = context;
        this.f52125b = stickerRenderConfig;
        this.f52126c = fontProvider;
        this.f52127d = logger;
    }

    @Override // com.pinterest.shuffles.scene.composer.z0
    public final Object p(y1 y1Var, Function0 function0, c1 c1Var, Function0 function02, bl2.c cVar) {
        return kotlin.jvm.internal.j.M(cVar, ao2.v0.f20219a, new p(c1Var, function0, y1Var, this, function02, null));
    }

    @Override // com.pinterest.shuffles.scene.composer.z0
    public final Object t(u1 u1Var, Function0 function0, h hVar, Function0 function02, bl2.c cVar) {
        return kotlin.jvm.internal.j.M(cVar, ao2.v0.f20219a, new o(u1Var, this, hVar, function0, function02, null));
    }
}

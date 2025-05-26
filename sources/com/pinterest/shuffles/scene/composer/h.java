package com.pinterest.shuffles.scene.composer;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;

/* loaded from: classes4.dex */
public final class h extends c {

    /* renamed from: o, reason: collision with root package name */
    public ee.c f52049o;

    /* renamed from: p, reason: collision with root package name */
    public float f52050p;

    public final void g(n72.m logger, com.bumptech.glide.l requestBuilder, r72.y0 image, u1 item, Function0 getCanvasWidth, Function0 onProcessingComplete) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(getCanvasWidth, "getCanvasWidth");
        Intrinsics.checkNotNullParameter(onProcessingComplete, "onProcessingComplete");
        this.f52011m = true;
        nd.b bVar = nd.b.PREFER_ARGB_8888;
        requestBuilder.getClass();
        d7.b.o(bVar);
        com.bumptech.glide.l lVar = (com.bumptech.glide.l) requestBuilder.s(wd.o.f129190f, bVar).s(yd.i.f138747a, bVar);
        g gVar = new g(item, image, getCanvasWidth, logger, this, onProcessingComplete);
        lVar.H(gVar);
        this.f52049o = gVar;
    }
}

package com.pinterest.xrenderer.legacy.multipass_processing;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f52873c;

    /* renamed from: a, reason: collision with root package name */
    public final p f52874a;

    /* renamed from: b, reason: collision with root package name */
    public final p f52875b;

    static {
        d0 d0Var = new d0(d.class, "origSampler", "getOrigSampler()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0);
        l0 l0Var = k0.f80436a;
        f52873c = new u[]{l0Var.g(d0Var), a.c.l(d.class, "srcSampler", "getSrcSampler()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var)};
    }

    public d(bn0.a program) {
        Intrinsics.checkNotNullParameter(program, "program");
        this.f52874a = new p(program, Constants.UNIFORM_ORIGINAL_TEXTURE_SAMPLER);
        this.f52875b = new p(program, "s_sourceTexture");
    }
}

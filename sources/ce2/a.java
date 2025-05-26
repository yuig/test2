package ce2;

import a.c;
import com.pinterest.xrenderer.legacy.postprocessing.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f27616d;

    /* renamed from: a, reason: collision with root package name */
    public final p f27617a;

    /* renamed from: b, reason: collision with root package name */
    public final p f27618b;

    /* renamed from: c, reason: collision with root package name */
    public final p f27619c;

    static {
        d0 d0Var = new d0(a.class, "time", "getTime()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0);
        l0 l0Var = k0.f80436a;
        f27616d = new u[]{l0Var.g(d0Var), c.l(a.class, "srcSampler", "getSrcSampler()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), c.l(a.class, "indexSampler", "getIndexSampler()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var)};
    }

    public a(bn0.a program) {
        Intrinsics.checkNotNullParameter(program, "program");
        this.f27617a = new p(program, "u_time");
        this.f27618b = new p(program, "s_sourceTexture");
        this.f27619c = new p(program, Constants.UNIFORM_INDEX_TEXTURE_SAMPLER);
    }
}

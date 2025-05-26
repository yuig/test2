package ge2;

import com.pinterest.xrenderer.legacy.stickers.base.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f64848h;

    /* renamed from: a, reason: collision with root package name */
    public final p f64849a;

    /* renamed from: b, reason: collision with root package name */
    public final p f64850b;

    /* renamed from: c, reason: collision with root package name */
    public final p f64851c;

    /* renamed from: d, reason: collision with root package name */
    public final p f64852d;

    /* renamed from: e, reason: collision with root package name */
    public final p f64853e;

    /* renamed from: f, reason: collision with root package name */
    public final p f64854f;

    /* renamed from: g, reason: collision with root package name */
    public final p f64855g;

    static {
        d0 d0Var = new d0(b.class, "mvp", "getMvp()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0);
        l0 l0Var = k0.f80436a;
        f64848h = new u[]{l0Var.g(d0Var), a.c.l(b.class, "size", "getSize()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), a.c.l(b.class, "time", "getTime()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), a.c.l(b.class, "hitTestingEnabled", "getHitTestingEnabled()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), a.c.l(b.class, "itemID", "getItemID()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), a.c.l(b.class, "opacity", "getOpacity()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var), a.c.l(b.class, "srcSampler", "getSrcSampler()Lcom/pinterest/xrenderer/legacy/gl/shaders/UniformHandle;", 0, l0Var)};
    }

    public b(bn0.a program) {
        Intrinsics.checkNotNullParameter(program, "program");
        this.f64849a = new p(program, Constants.UNIFORM_MVP_NAME);
        this.f64850b = new p(program, Constants.UNIFORM_SIZE_NAME);
        this.f64851c = new p(program, "u_time");
        this.f64852d = new p(program, Constants.UNIFORM_HIT_TESTING_ENABLED);
        this.f64853e = new p(program, Constants.UNIFORM_ITEM_ID_NAME);
        this.f64854f = new p(program, Constants.UNIFORM_OPACITY_NAME);
        this.f64855g = new p(program, "s_sourceTexture");
    }
}

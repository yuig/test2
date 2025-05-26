package de2;

import android.view.Surface;
import com.pinterest.xrenderer.legacy.render_view.GLRenderView;
import java.util.List;
import kd2.i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final GLRenderView f54681a;

    /* renamed from: b, reason: collision with root package name */
    public Thread f54682b;

    /* renamed from: c, reason: collision with root package name */
    public k f54683c;

    /* renamed from: d, reason: collision with root package name */
    public g01.a f54684d;

    /* renamed from: e, reason: collision with root package name */
    public a f54685e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f54686f;

    /* renamed from: g, reason: collision with root package name */
    public final v f54687g;

    /* renamed from: h, reason: collision with root package name */
    public final v f54688h;

    /* renamed from: i, reason: collision with root package name */
    public long f54689i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f54690j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54691k;

    public d(GLRenderView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f54681a = view;
        this.f54686f = new Object();
        this.f54687g = new v();
        this.f54688h = new v();
    }

    public final void a() {
        List<e> F0;
        List F02;
        synchronized (this.f54686f) {
            F0 = CollectionsKt.F0(this.f54687g);
            this.f54687g.clear();
            F02 = CollectionsKt.F0(this.f54688h);
            this.f54688h.clear();
        }
        List<e> list = F02;
        for (e eVar : F0) {
            a renderer = this.f54685e;
            Intrinsics.f(renderer);
            eVar.getClass();
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            eVar.f54693b.complete(eVar.f54692a.invoke(renderer));
        }
        a aVar = this.f54685e;
        Intrinsics.f(aVar);
        aVar.a((System.currentTimeMillis() - this.f54689i) / 1000.0f);
        for (e eVar2 : list) {
            a renderer2 = this.f54685e;
            Intrinsics.f(renderer2);
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(renderer2, "renderer");
            eVar2.f54693b.complete(eVar2.f54692a.invoke(renderer2));
        }
        g01.a aVar2 = this.f54684d;
        Intrinsics.f(aVar2);
        int i13 = b.f54677a[aVar2.i().ordinal()];
        if (i13 == 2) {
            i iVar = i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).a(c.f54678j);
            throw new f("bad surface");
        }
        if (i13 != 3) {
            if (i13 == 4) {
                throw new f("unknown error");
            }
            return;
        }
        i iVar2 = i.f79272h;
        if (iVar2 == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        ((kd2.e) iVar2.a()).a(c.f54679k);
        throw new f("context lost");
    }

    public final void b(Surface surface, Function0 rendererFactory) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(rendererFactory, "rendererFactory");
        if (this.f54682b != null) {
            throw new IllegalStateException("Render thread is already running".toString());
        }
        Thread thread = new Thread(new g0.k(this, true, surface, rendererFactory, 2));
        thread.setName("GLRenderThread-" + thread.getId());
        thread.setUncaughtExceptionHandler(this.f54681a.f52889f);
        thread.start();
        this.f54682b = thread;
    }
}

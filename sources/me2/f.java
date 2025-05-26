package me2;

import android.util.Size;
import android.view.Surface;
import com.pinterest.xrenderer.RustBridge$Scene;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import v.c2;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a f87048a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Thread f87049b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f87050c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ke2.f f87051d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f87052e;

    /* renamed from: f, reason: collision with root package name */
    public final v f87053f;

    /* renamed from: g, reason: collision with root package name */
    public final v f87054g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f87055h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f87056i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f87057j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f87058k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f87059l;

    /* renamed from: m, reason: collision with root package name */
    public long f87060m;

    public f(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f87048a = view;
        this.f87052e = new Object();
        this.f87053f = new v();
        this.f87054g = new v();
        this.f87060m = System.currentTimeMillis() - 1000;
    }

    public final void a() {
        synchronized (this.f87052e) {
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).b(new e(this, 0), "RenderThread");
            this.f87057j = true;
            Unit unit = Unit.f80348a;
        }
    }

    public final void b() {
        synchronized (this.f87052e) {
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).b(new e(this, 1), "RenderThread");
            this.f87057j = false;
            Unit unit = Unit.f80348a;
        }
    }

    public final void c() {
        synchronized (this.f87052e) {
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).b(new e(this, 3), "RenderThread");
            this.f87058k = true;
            Unit unit = Unit.f80348a;
        }
    }

    public final void d() {
        Unit unit;
        List<h> F0;
        List F02;
        if (this.f87059l == 0 || this.f87050c == 0) {
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).b(new e(this, 4), "RenderThread");
            return;
        }
        ke2.f fVar = this.f87051d;
        if (fVar != null) {
            fVar.d();
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            return;
        }
        synchronized (this.f87052e) {
            F0 = CollectionsKt.F0(this.f87053f);
            this.f87053f.clear();
            F02 = CollectionsKt.F0(this.f87054g);
            this.f87054g.clear();
        }
        List<h> list = F02;
        for (h hVar : F0) {
            hVar.f87063b.complete(hVar.f87062a.invoke());
        }
        boolean z13 = this.f87056i && ((double) (System.currentTimeMillis() - this.f87060m)) > 200.0d;
        if (z13) {
            this.f87060m = System.currentTimeMillis();
        }
        ke2.f fVar2 = this.f87051d;
        if (fVar2 != null) {
            long j13 = this.f87050c;
            float currentTimeMillis = (System.currentTimeMillis() - this.f87055h) / 1000.0f;
            if (fVar2.a() && j13 != 0) {
                RustBridge$Scene.f52862a.renderOnSurface(j13, fVar2.f79327d, z13, currentTimeMillis);
            }
        }
        for (h hVar2 : list) {
            hVar2.f87063b.complete(hVar2.f87062a.invoke());
        }
    }

    public final void e(Size newSize) {
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        fe2.a block = new fe2.a(5, this, newSize);
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f87052e) {
            this.f87053f.addLast(new h(block));
        }
    }

    public final void f() {
        synchronized (this.f87052e) {
            kd2.i iVar = kd2.i.f79272h;
            if (iVar == null) {
                throw new IllegalStateException("XRendererApp must be initialized first.".toString());
            }
            ((kd2.e) iVar.a()).b(new e(this, 7), "RenderThread");
            this.f87058k = false;
            Unit unit = Unit.f80348a;
        }
    }

    public final void g(Surface surface, boolean z13) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f87049b != null) {
            throw new IllegalStateException("Render thread is already running".toString());
        }
        if (((d) this.f87048a).getF52904e() == null) {
            throw new IllegalStateException("GPU backend is not set".toString());
        }
        kd2.i iVar = kd2.i.f79272h;
        if (iVar == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        ((kd2.e) iVar.a()).b(new e(this, 11), "RenderThread");
        kd2.i iVar2 = kd2.i.f79272h;
        if (iVar2 == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        ((kd2.e) iVar2.a()).b(new e(this, 8), "RenderThread");
        Thread thread = new Thread(new c2(this, z13, surface, 6));
        thread.setName("SceneRenderThread-" + thread.getId());
        thread.setUncaughtExceptionHandler(this.f87048a.getF52906g());
        thread.start();
        this.f87049b = thread;
    }

    public final void h(boolean z13) {
        Thread thread;
        kd2.i iVar = kd2.i.f79272h;
        if (iVar == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        ((kd2.e) iVar.a()).b(new e(this, 12), "RenderThread");
        Thread thread2 = this.f87049b;
        if (thread2 != null) {
            thread2.interrupt();
        }
        if (z13 && (thread = this.f87049b) != null) {
            thread.join();
        }
        this.f87049b = null;
        kd2.i iVar2 = kd2.i.f79272h;
        if (iVar2 == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        ((kd2.e) iVar2.a()).b(new e(this, 13), "RenderThread");
    }
}

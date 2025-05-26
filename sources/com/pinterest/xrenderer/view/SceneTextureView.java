package com.pinterest.xrenderer.view;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import java.lang.Thread;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import ke2.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ld2.i;
import me2.a;
import me2.d;
import me2.e;
import me2.f;
import me2.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u000bB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/xrenderer/view/SceneTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lme2/a;", "Lme2/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class SceneTextureView extends TextureView implements TextureView.SurfaceTextureListener, a, d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLong f52899i = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final c f52900a;

    /* renamed from: b, reason: collision with root package name */
    public TextureView.SurfaceTextureListener f52901b;

    /* renamed from: c, reason: collision with root package name */
    public final f f52902c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f52903d;

    /* renamed from: e, reason: collision with root package name */
    public me2.c f52904e;

    /* renamed from: f, reason: collision with root package name */
    public final float f52905f;

    /* renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f52906g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52907h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneTextureView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        f52899i.getAndIncrement();
        c cVar = new c();
        cVar.f79318j = new i().a(ld2.f.DarkenBG);
        cVar.f79309a = true;
        this.f52900a = cVar;
        this.f52902c = new f(this);
        this.f52903d = new Object();
        this.f52904e = me2.c.GLES;
        super.setSurfaceTextureListener(this);
        this.f52905f = 60.0f;
        this.f52907h = true;
    }

    @Override // me2.a
    public final Size a() {
        return new Size(getWidth(), getHeight());
    }

    @Override // me2.a
    public final CompletableFuture c(Point position, int i13) {
        CompletableFuture completableFuture;
        Intrinsics.checkNotNullParameter(position, "position");
        f fVar = this.f52902c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(position, "position");
        e preRendering = new e(fVar, 2);
        mu0.i postRendering = new mu0.i(fVar, position, i13, 7);
        Intrinsics.checkNotNullParameter(preRendering, "preRendering");
        Intrinsics.checkNotNullParameter(postRendering, "postRendering");
        synchronized (fVar.f87052e) {
            fVar.f87053f.addLast(new h(preRendering));
            h hVar = new h(postRendering);
            fVar.f87054g.addLast(hVar);
            completableFuture = hVar.f87063b;
        }
        return completableFuture;
    }

    @Override // me2.d
    /* renamed from: d, reason: from getter */
    public final me2.c getF52904e() {
        return this.f52904e;
    }

    @Override // me2.a
    /* renamed from: e, reason: from getter */
    public final float getF52905f() {
        return this.f52905f;
    }

    @Override // me2.a
    /* renamed from: f, reason: from getter */
    public final c getF52900a() {
        return this.f52900a;
    }

    @Override // me2.a
    public final void g(uv.d dVar) {
        synchronized (this.f52903d) {
            this.f52906g = dVar;
            Thread thread = this.f52902c.f87049b;
            if (thread != null) {
                thread.setUncaughtExceptionHandler(dVar);
            }
            Unit unit = Unit.f80348a;
        }
    }

    @Override // me2.a
    public final void h(boolean z13) {
        synchronized (this.f52903d) {
            try {
                if (z13) {
                    this.f52902c.f();
                } else {
                    this.f52902c.c();
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // me2.a
    public final CompletableFuture i() {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.complete(getBitmap());
        return completableFuture;
    }

    @Override // me2.a
    public final CompletableFuture j() {
        CompletableFuture completableFuture;
        f fVar = this.f52902c;
        me2.i block = me2.i.f87064i;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (fVar.f87052e) {
            h hVar = new h(block);
            fVar.f87054g.addLast(hVar);
            completableFuture = hVar.f87063b;
        }
        return completableFuture;
    }

    @Override // me2.a
    /* renamed from: l, reason: from getter */
    public final Thread.UncaughtExceptionHandler getF52906g() {
        return this.f52906g;
    }

    public final void m(me2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f52904e = cVar;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        this.f52902c.a();
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f52902c.b();
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.f52903d) {
            this.f52902c.g(new Surface(surface), true);
            Unit unit = Unit.f80348a;
        }
        this.f52907h = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52901b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i13, i14);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.f52903d) {
            this.f52902c.h(false);
            Unit unit = Unit.f80348a;
        }
        if (this.f52907h) {
            surface.release();
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52901b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f52902c.e(new Size(i13, i14));
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52901b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i13, i14);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52901b;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f52901b = surfaceTextureListener;
    }
}

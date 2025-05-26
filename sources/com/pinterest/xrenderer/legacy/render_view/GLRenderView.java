package com.pinterest.xrenderer.legacy.render_view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import de2.d;
import de2.e;
import ha2.i;
import java.lang.Thread;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/xrenderer/legacy/render_view/GLRenderView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class GLRenderView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f52884a;

    /* renamed from: b, reason: collision with root package name */
    public final d f52885b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f52886c;

    /* renamed from: d, reason: collision with root package name */
    public TextureView.SurfaceTextureListener f52887d;

    /* renamed from: e, reason: collision with root package name */
    public final float f52888e;

    /* renamed from: f, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f52889f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLRenderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52885b = new d(this);
        this.f52886c = new Object();
        super.setSurfaceTextureListener(this);
        this.f52888e = 60.0f;
        this.f52890g = true;
    }

    public final Size a() {
        return new Size(getWidth(), getHeight());
    }

    public final CompletableFuture d(Function1 block) {
        CompletableFuture completableFuture;
        Intrinsics.checkNotNullParameter(block, "block");
        d dVar = this.f52885b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (dVar.f54686f) {
            e eVar = new e(block);
            dVar.f54688h.addLast(eVar);
            completableFuture = eVar.f54693b;
        }
        return completableFuture;
    }

    /* renamed from: e, reason: from getter */
    public final float getF52888e() {
        return this.f52888e;
    }

    public final void g(uv.d dVar) {
        synchronized (this.f52886c) {
            this.f52889f = dVar;
            Thread thread = this.f52885b.f54682b;
            if (thread != null) {
                thread.setUncaughtExceptionHandler(dVar);
            }
            Unit unit = Unit.f80348a;
        }
    }

    public final void h(boolean z13) {
        d dVar = this.f52885b;
        if (z13) {
            synchronized (dVar) {
                dVar.f54691k = false;
                Unit unit = Unit.f80348a;
            }
        } else {
            synchronized (dVar) {
                dVar.f54691k = true;
                Unit unit2 = Unit.f80348a;
            }
        }
    }

    /* renamed from: l, reason: from getter */
    public final Thread.UncaughtExceptionHandler getF52889f() {
        return this.f52889f;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        d dVar = this.f52885b;
        synchronized (dVar) {
            dVar.f54690j = true;
            Unit unit = Unit.f80348a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        d dVar = this.f52885b;
        synchronized (dVar) {
            dVar.f54690j = false;
            Unit unit = Unit.f80348a;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17 = i13 * i14;
        d dVar = this.f52885b;
        if (i17 == 0) {
            synchronized (dVar) {
                dVar.f54691k = true;
                Unit unit = Unit.f80348a;
            }
        } else if (i15 * i16 == 0) {
            synchronized (dVar) {
                dVar.f54691k = false;
                Unit unit2 = Unit.f80348a;
            }
        }
        super.onSizeChanged(i13, i14, i15, i16);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (this.f52884a == null) {
            throw new IllegalStateException("Renderer factory is not set".toString());
        }
        synchronized (this.f52886c) {
            d dVar = this.f52885b;
            Surface surface2 = new Surface(surface);
            Function0 function0 = this.f52884a;
            Intrinsics.f(function0);
            dVar.b(surface2, function0);
            Unit unit = Unit.f80348a;
        }
        this.f52890g = false;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52887d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surface, i13, i14);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        synchronized (this.f52886c) {
            d dVar = this.f52885b;
            Thread thread = dVar.f54682b;
            if (thread != null) {
                thread.interrupt();
            }
            dVar.f54682b = null;
            Unit unit = Unit.f80348a;
        }
        if (this.f52890g) {
            surface.release();
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52887d;
        if (surfaceTextureListener == null) {
            return false;
        }
        surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i13, int i14) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        d dVar = this.f52885b;
        Size newSize = new Size(i13, i14);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        i block = new i(20, dVar, newSize);
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (dVar.f54686f) {
            dVar.f54687g.addLast(new e(block));
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52887d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i13, i14);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f52887d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        d dVar = this.f52885b;
        if (i13 == 4) {
            synchronized (dVar) {
                dVar.f54691k = true;
                Unit unit = Unit.f80348a;
            }
        } else {
            synchronized (dVar) {
                dVar.f54691k = false;
                Unit unit2 = Unit.f80348a;
            }
        }
        super.onVisibilityChanged(changedView, i13);
    }

    @Override // android.view.TextureView, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f52887d = surfaceTextureListener;
    }
}

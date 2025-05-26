package com.pinterest.xrenderer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicLong;
import ke2.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ld2.i;
import me2.a;
import me2.d;
import me2.f;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u000bB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/xrenderer/view/SceneSurfaceView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback2;", "Lme2/a;", "Lme2/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class SceneSurfaceView extends SurfaceView implements SurfaceHolder.Callback2, a, d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLong f52893f = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final c f52894a;

    /* renamed from: b, reason: collision with root package name */
    public final f f52895b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f52896c;

    /* renamed from: d, reason: collision with root package name */
    public final me2.c f52897d;

    /* renamed from: e, reason: collision with root package name */
    public final float f52898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SceneSurfaceView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        f52893f.getAndIncrement();
        c cVar = new c();
        cVar.f79318j = new i().a(ld2.f.DarkenBG);
        cVar.f79309a = true;
        this.f52894a = cVar;
        this.f52895b = new f(this);
        this.f52896c = new Object();
        this.f52897d = me2.c.GLES;
        getHolder().addCallback(this);
        setZOrderOnTop(true);
        getHolder().setFormat(-2);
        this.f52898e = 60.0f;
    }

    @Override // me2.a
    public final Size a() {
        return new Size(getWidth(), getHeight());
    }

    @Override // me2.d
    /* renamed from: d, reason: from getter */
    public final me2.c getF52897d() {
        return this.f52897d;
    }

    @Override // me2.a
    /* renamed from: e, reason: from getter */
    public final float getF52898e() {
        return this.f52898e;
    }

    @Override // me2.a
    /* renamed from: f, reason: from getter */
    public final c getF52894a() {
        return this.f52894a;
    }

    @Override // me2.a
    /* renamed from: l */
    public final Thread.UncaughtExceptionHandler getF52906g() {
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onAttachedToWindow() {
        this.f52895b.a();
        super.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        this.f52895b.b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f52895b.e(new Size(i14, i15));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        synchronized (this.f52896c) {
            f fVar = this.f52895b;
            Surface surface = getHolder().getSurface();
            Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
            fVar.g(surface, false);
            Unit unit = Unit.f80348a;
        }
        setWillNotDraw(false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        synchronized (this.f52896c) {
            this.f52895b.h(true);
            Unit unit = Unit.f80348a;
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }
}

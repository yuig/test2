package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h0;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.l0;
import b1.f;
import b1.g;
import b1.i;
import b1.j;
import b1.k;
import b1.l;
import b1.m;
import b1.n;
import b1.o;
import b1.p;
import c0.p1;
import d1.a;
import f0.h;
import gi2.b;
import java.util.concurrent.atomic.AtomicReference;
import q5.v0;

/* loaded from: classes2.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final k f17038m = k.PERFORMANCE;

    /* renamed from: a, reason: collision with root package name */
    public final k f17039a;

    /* renamed from: b, reason: collision with root package name */
    public n f17040b;

    /* renamed from: c, reason: collision with root package name */
    public final ScreenFlashView f17041c;

    /* renamed from: d, reason: collision with root package name */
    public final f f17042d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17043e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f17044f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f17045g;

    /* renamed from: h, reason: collision with root package name */
    public final o f17046h;

    /* renamed from: i, reason: collision with root package name */
    public h0 f17047i;

    /* renamed from: j, reason: collision with root package name */
    public final j f17048j;

    /* renamed from: k, reason: collision with root package name */
    public final g f17049k;

    /* renamed from: l, reason: collision with root package name */
    public final i f17050l;

    public PreviewView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean c(p1 p1Var, k kVar) {
        boolean equals = p1Var.f24303e.g().n().equals("androidx.camera.camera2.legacy");
        boolean z13 = (a.f53592a.b(SurfaceViewStretchedQuirk.class) == null && a.f53592a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z13) {
            return true;
        }
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + kVar);
    }

    public final void a() {
        h.s();
        h.s();
        if (getDisplay() == null) {
            return;
        }
        getDisplay().getRotation();
        h.s();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        new Rational(getWidth(), getHeight());
        h.s();
        f fVar = this.f17042d;
        int ordinal = fVar.f20806h.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            getLayoutDirection();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Unexpected scale type: ");
        h.s();
        sb3.append(fVar.f20806h);
        throw new IllegalStateException(sb3.toString());
    }

    public final void b() {
        Rect rect;
        Display display;
        h0 h0Var;
        h.s();
        if (this.f17040b != null) {
            if (this.f17043e && (display = getDisplay()) != null && (h0Var = this.f17047i) != null) {
                int o13 = h0Var.o(display.getRotation());
                int rotation = display.getRotation();
                f fVar = this.f17042d;
                if (fVar.f20805g) {
                    fVar.f20801c = o13;
                    fVar.f20803e = rotation;
                }
            }
            this.f17040b.e();
        }
        o oVar = this.f17046h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        oVar.getClass();
        h.s();
        synchronized (oVar) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = oVar.f20816c) != null) {
                    oVar.f20815b.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getApplicationContext().getSystemService("display");
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f17048j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f17049k);
        n nVar = this.f17040b;
        if (nVar != null) {
            nVar.b();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f17049k);
        n nVar = this.f17040b;
        if (nVar != null) {
            nVar.c();
        }
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getApplicationContext().getSystemService("display");
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f17048j);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [b1.g] */
    public PreviewView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 0);
        k kVar = f17038m;
        this.f17039a = kVar;
        f fVar = new f();
        fVar.f20806h = f.f20798i;
        this.f17042d = fVar;
        this.f17043e = true;
        this.f17044f = new l0(m.IDLE);
        this.f17045g = new AtomicReference();
        this.f17046h = new o(fVar);
        this.f17048j = new j(this);
        this.f17049k = new View.OnLayoutChangeListener() { // from class: b1.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
                k kVar2 = PreviewView.f17038m;
                PreviewView previewView = PreviewView.this;
                previewView.getClass();
                if (i16 - i14 == i23 - i18 && i17 - i15 == i24 - i19) {
                    return;
                }
                previewView.b();
                previewView.a();
            }
        };
        this.f17050l = new i(this);
        h.s();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.PreviewView, i13, 0);
        v0.n(this, context, p.PreviewView, attributeSet, obtainStyledAttributes, i13, 0);
        try {
            l fromId = l.fromId(obtainStyledAttributes.getInteger(p.PreviewView_scaleType, fVar.f20806h.getId()));
            h.s();
            fVar.f20806h = fromId;
            b();
            a();
            k fromId2 = k.fromId(obtainStyledAttributes.getInteger(p.PreviewView_implementationMode, kVar.getId()));
            h.s();
            this.f17039a = fromId2;
            obtainStyledAttributes.recycle();
            new b(context, new b1.h(this));
            if (getBackground() == null) {
                Context context2 = getContext();
                Object obj = d5.a.f53679a;
                setBackgroundColor(context2.getColor(R.color.black));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context, null);
            this.f17041c = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}

package ads_mobile_sdk;

import a.s5;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yh1 implements a.pf {

    /* renamed from: b */
    public FrameLayout f14247b;

    /* renamed from: c */
    public FrameLayout f14248c;

    /* renamed from: d */
    public final AtomicBoolean f14249d;

    /* renamed from: e */
    public View f14250e;

    /* renamed from: f */
    public ImageView.ScaleType f14251f;

    /* renamed from: g */
    public GestureDetector f14252g;

    /* renamed from: h */
    public final LinkedHashMap f14253h;

    /* renamed from: i */
    public InternalNativeAd f14254i;

    public yh1(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f14247b = frameLayout;
        this.f14248c = frameLayout2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        FrameLayout frameLayout3 = this.f14247b;
        if (frameLayout3 != null) {
            frameLayout3.setOnTouchListener(this);
        }
        this.f14249d = new AtomicBoolean(false);
        this.f14253h = new LinkedHashMap();
    }

    public static final void a(yh1 this$0, String watermark) {
        Context context;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(watermark, "$watermark");
        synchronized (this$0) {
            try {
                if (this$0.f14249d.get()) {
                    return;
                }
                FrameLayout frameLayout = this$0.f14248c;
                if (frameLayout != null && (context = frameLayout.getContext()) != null) {
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    kh2.d.d(context, frameLayout2, watermark);
                    frameLayout.addView(frameLayout2);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final View b(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        synchronized (this) {
            if (this.f14249d.get()) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f14253h.get(assetName);
            return weakReference != null ? (View) weakReference.get() : null;
        }
    }

    public final FrameLayout c() {
        synchronized (this) {
            if (this.f14249d.get()) {
                return null;
            }
            return this.f14247b;
        }
    }

    public final FrameLayout d() {
        synchronized (this) {
            if (this.f14249d.get()) {
                return null;
            }
            return this.f14248c;
        }
    }

    public final ImageView.ScaleType e() {
        synchronized (this) {
            if (this.f14249d.get()) {
                return null;
            }
            return this.f14251f;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xf1 xf1Var;
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (this) {
            try {
                if (!this.f14249d.get() && this.f14252g == null) {
                    InternalNativeAd internalNativeAd = this.f14254i;
                    if (internalNativeAd != null && (xf1Var = internalNativeAd.f32087o) != null) {
                        FrameLayout frameLayout = this.f14247b;
                        LinkedHashMap linkedHashMap = this.f14253h;
                        ImageView.ScaleType scaleType = this.f14251f;
                        if (scaleType == null) {
                            scaleType = ci1.f3919i;
                        }
                        xf1Var.a(view, frameLayout, linkedHashMap, scaleType);
                        Unit unit = Unit.f80348a;
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xf1 xf1Var;
        xf1 xf1Var2;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        synchronized (this) {
            try {
                if (this.f14249d.get()) {
                    return false;
                }
                InternalNativeAd internalNativeAd = this.f14254i;
                if (internalNativeAd != null && (xf1Var2 = internalNativeAd.f32087o) != null) {
                    xf1Var2.a(this.f14247b, motionEvent);
                }
                InternalNativeAd internalNativeAd2 = this.f14254i;
                if (internalNativeAd2 == null || (xf1Var = internalNativeAd2.f32087o) == null || xf1Var.d() != 0) {
                    InternalNativeAd internalNativeAd3 = this.f14254i;
                    xf1 xf1Var3 = internalNativeAd3 != null ? internalNativeAd3.f32087o : null;
                    if (xf1Var3 != null) {
                        WeakReference weakReference = new WeakReference(view);
                        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
                        xf1Var3.f13643e = weakReference;
                    }
                    GestureDetector gestureDetector = this.f14252g;
                    if (gestureDetector != null) {
                        gestureDetector.onTouchEvent(motionEvent);
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(InternalNativeAd internalNativeAd) {
        synchronized (this) {
            try {
                FrameLayout frameLayout = this.f14248c;
                if (frameLayout != null) {
                    frameLayout.setClickable(false);
                }
                FrameLayout frameLayout2 = this.f14248c;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                }
                s5 s5Var = internalNativeAd.f32089q.f7330a;
                View view = s5Var.f6834e;
                if (view != null) {
                    view.removeOnAttachStateChangeListener(s5Var);
                }
                s5Var.a();
                s5Var.f6834e = null;
                internalNativeAd.f32087o.a(this.f14247b, this.f14253h);
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Map b() {
        synchronized (this) {
            if (this.f14249d.get()) {
                return kotlin.collections.z0.d();
            }
            return kotlin.collections.z0.n(this.f14253h);
        }
    }

    public final void b(InternalNativeAd internalNativeAd) {
        synchronized (this) {
            if (this.f14249d.get()) {
                return;
            }
            internalNativeAd.f32089q.a(this);
            ci1 ci1Var = internalNativeAd.f32088p;
            ci1Var.getClass();
            Intrinsics.checkNotNullParameter(this, "nativeAdViewContainer");
            kotlin.jvm.internal.j.z(ci1Var.f3920a, null, null, new bi1(ci1Var, this, null), 3);
            internalNativeAd.f32087o.a(new WeakReference(this), this.f14247b, this.f14253h, this, this);
            Unit unit = Unit.f80348a;
        }
    }

    public static final void a(yh1 this$0) {
        Context context;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            try {
                if (this$0.f14249d.get()) {
                    return;
                }
                FrameLayout frameLayout2 = this$0.f14247b;
                if (frameLayout2 != null && (context = frameLayout2.getContext()) != null) {
                    if (this$0.f14250e == null) {
                        View view = new View(context);
                        view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        this$0.f14250e = view;
                    }
                    FrameLayout frameLayout3 = this$0.f14247b;
                    View view2 = this$0.f14250e;
                    if (!Intrinsics.d(frameLayout3, view2 != null ? view2.getParent() : null) && (frameLayout = this$0.f14247b) != null) {
                        frameLayout.addView(this$0.f14250e);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(InternalNativeAd newNativeAd) {
        Context context;
        Intrinsics.checkNotNullParameter(newNativeAd, "newNativeAd");
        synchronized (this) {
            try {
                if (this.f14249d.get()) {
                    return;
                }
                InternalNativeAd internalNativeAd = this.f14254i;
                if (internalNativeAd != null) {
                    c(internalNativeAd);
                }
                a();
                b(newNativeAd);
                String str = newNativeAd.f32086n.f6389v;
                if (str != null) {
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        a(str);
                    }
                }
                FrameLayout frameLayout = this.f14247b;
                if (frameLayout != null && (context = frameLayout.getContext()) != null) {
                    this.f14252g = newNativeAd.f32087o.d() != 0 ? new GestureDetector(context, new qj1(newNativeAd.f32087o, new WeakReference(this.f14247b))) : null;
                }
                this.f14254i = newNativeAd;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a(View view, String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        synchronized (this) {
            try {
                if (this.f14249d.get()) {
                    return;
                }
                if (view != null) {
                    this.f14253h.put(assetName, new WeakReference(view));
                } else {
                    this.f14253h.remove(assetName);
                }
                if (Intrinsics.d("3011", assetName)) {
                    return;
                }
                if (view != null) {
                    view.setOnTouchListener(this);
                }
                if (view != null) {
                    view.setClickable(true);
                }
                if (view != null) {
                    view.setOnClickListener(this);
                    Unit unit = Unit.f80348a;
                }
            } finally {
            }
        }
    }

    public final void a() {
        a.pf.Qm.getClass();
        wh1.f13044b.post(new a.ig(this, 0));
    }

    public final void a(String str) {
        a.pf.Qm.getClass();
        wh1.f13044b.post(new a.jg(0, this, str));
    }
}

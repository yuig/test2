package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class xf1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13639a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f13640b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f13641c = new WeakReference(null);

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f13642d = new WeakReference(null);

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f13643e = new WeakReference(null);

    public abstract nm.u a(FrameLayout frameLayout, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void a(View view, int i13);

    public abstract void a(View view, FrameLayout frameLayout, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType);

    public abstract void a(FrameLayout frameLayout, MotionEvent motionEvent);

    public abstract void a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map);

    public abstract void a(FrameLayout frameLayout, LinkedHashMap linkedHashMap);

    public abstract void a(String str);

    public abstract void a(WeakReference weakReference, FrameLayout frameLayout, LinkedHashMap linkedHashMap, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    public abstract nm.u b(FrameLayout frameLayout, ImageView.ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void b();

    public abstract boolean c();

    public abstract int d();

    public final WeakReference f() {
        return this.f13640b;
    }

    public final WeakReference g() {
        return this.f13642d;
    }

    public final WeakReference h() {
        return this.f13641c;
    }

    public abstract boolean i();
}

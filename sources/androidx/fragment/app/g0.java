package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f18324a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18325b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18326c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f18327d;

    public g0(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f18327d = new x0();
        this.f18324a = fragmentActivity;
        com.bumptech.glide.d.s(fragmentActivity, "context == null");
        this.f18325b = fragmentActivity;
        this.f18326c = handler;
    }

    public abstract void d();
}

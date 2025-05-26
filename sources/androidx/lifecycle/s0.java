package androidx.lifecycle;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 implements z {

    /* renamed from: i, reason: collision with root package name */
    public static final s0 f18675i = new s0();

    /* renamed from: a, reason: collision with root package name */
    public int f18676a;

    /* renamed from: b, reason: collision with root package name */
    public int f18677b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f18680e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18678c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18679d = true;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f18681f = new b0(this);

    /* renamed from: g, reason: collision with root package name */
    public final androidx.activity.d f18682g = new androidx.activity.d(this, 8);

    /* renamed from: h, reason: collision with root package name */
    public final r0 f18683h = new r0(this);

    public final void a() {
        int i13 = this.f18677b + 1;
        this.f18677b = i13;
        if (i13 == 1) {
            if (this.f18678c) {
                this.f18681f.e(q.ON_RESUME);
                this.f18678c = false;
            } else {
                Handler handler = this.f18680e;
                Intrinsics.f(handler);
                handler.removeCallbacks(this.f18682g);
            }
        }
    }

    @Override // androidx.lifecycle.z
    public final s getLifecycle() {
        return this.f18681f;
    }
}

package t3;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class u1 implements e4 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f116206a;

    public u1(ViewConfiguration viewConfiguration) {
        this.f116206a = viewConfiguration;
    }

    @Override // t3.e4
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // t3.e4
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // t3.e4
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return v1.f116234a.b(this.f116206a);
        }
        return 2.0f;
    }

    @Override // t3.e4
    public final float e() {
        return this.f116206a.getScaledMaximumFlingVelocity();
    }

    @Override // t3.e4
    public final float f() {
        return this.f116206a.getScaledTouchSlop();
    }

    @Override // t3.e4
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return v1.f116234a.a(this.f116206a);
        }
        return 16.0f;
    }
}

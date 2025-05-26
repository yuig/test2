package ads_mobile_sdk;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xn0 {

    /* renamed from: b, reason: collision with root package name */
    public static xn0 f13727b;

    /* renamed from: a, reason: collision with root package name */
    public final yn0 f13728a;

    public xn0(Context context) {
        this.f13728a = yn0.a(context);
    }

    public final boolean a() {
        boolean z13;
        synchronized (xn0.class) {
            z13 = this.f13728a.f14342b.getBoolean("paidv2_publisher_option", true);
        }
        return z13;
    }

    public final boolean b() {
        boolean z13;
        synchronized (xn0.class) {
            z13 = this.f13728a.f14342b.getBoolean("paidv2_user_option", true);
        }
        return z13;
    }

    public static final xn0 a(Context context) {
        xn0 xn0Var;
        synchronized (xn0.class) {
            try {
                if (f13727b == null) {
                    f13727b = new xn0(context);
                }
                xn0Var = f13727b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return xn0Var;
    }
}

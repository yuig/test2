package le;

import android.content.IntentFilter;
import df.k1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f83049d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.i0 f83050a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.c f83051b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83052c;

    static {
        Intrinsics.checkNotNullExpressionValue(h.class.getSimpleName(), "AccessTokenTracker::class.java.simpleName");
    }

    public h() {
        k1.f();
        androidx.appcompat.app.i0 i0Var = new androidx.appcompat.app.i0((mf.b) this);
        this.f83050a = i0Var;
        z6.c a13 = z6.c.a(v.a());
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(FacebookSdk.getApplicationContext())");
        this.f83051b = a13;
        if (this.f83052c) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        a13.b(i0Var, intentFilter);
        this.f83052c = true;
    }
}

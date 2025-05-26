package le;

import android.content.IntentFilter;
import com.facebook.Profile;
import df.k1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.i0 f83066a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.c f83067b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83068c;

    public k0() {
        k1.f();
        this.f83066a = new androidx.appcompat.app.i0(this);
        z6.c a13 = z6.c.a(v.a());
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(FacebookSdk.getApplicationContext())");
        this.f83067b = a13;
        b();
    }

    public abstract void a(Profile profile);

    public final void b() {
        if (this.f83068c) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        this.f83067b.b(this.f83066a, intentFilter);
        this.f83068c = true;
    }
}

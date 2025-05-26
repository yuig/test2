package rd;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f107501a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f107502b;

    /* renamed from: c, reason: collision with root package name */
    public final j f107503c;

    /* renamed from: d, reason: collision with root package name */
    public final float f107504d;

    public i(Context context) {
        this.f107504d = 1;
        this.f107501a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f107502b = activityManager;
        this.f107503c = new j(context.getResources().getDisplayMetrics(), 0);
        if (activityManager.isLowRamDevice()) {
            this.f107504d = 0.0f;
        }
    }
}

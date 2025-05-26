package vj;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f125889a;

    /* renamed from: b, reason: collision with root package name */
    public final View f125890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125893e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.activity.b f125894f;

    public a(View view) {
        this.f125890b = view;
        Context context = view.getContext();
        this.f125889a = tb.f.d0(context, fj.c.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f125891c = tb.f.c0(context, fj.c.motionDurationMedium2, AdSize.MEDIUM_RECTANGLE_WIDTH);
        this.f125892d = tb.f.c0(context, fj.c.motionDurationShort3, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY);
        this.f125893e = tb.f.c0(context, fj.c.motionDurationShort2, 100);
    }

    public final androidx.activity.b a() {
        if (this.f125894f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = this.f125894f;
        this.f125894f = null;
        return bVar;
    }
}

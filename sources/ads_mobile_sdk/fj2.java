package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public final class fj2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5164a;

    public fj2(a.o8 o8Var) {
        this.f5164a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        DisplayMetrics displayMetrics = ((Context) this.f5164a.get()).getResources().getDisplayMetrics();
        kh2.a1.p(displayMetrics);
        return displayMetrics;
    }
}

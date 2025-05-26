package fu;

import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu/j;", "Lfu/h;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends m {
    public final boolean R0 = true;
    public final v S0 = xk2.m.b(new lr.v(this, 11));

    @Override // fu.h, cu.m
    public final cu.i a8() {
        return (i) this.S0.getValue();
    }

    @Override // fu.h
    /* renamed from: k8 */
    public final AdsBrowserBottomSheet a8() {
        return (i) this.S0.getValue();
    }

    @Override // fu.h, dt.b
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.f53234n0) {
            o8(url, true);
        } else {
            q8(url);
        }
    }

    @Override // fu.h
    /* renamed from: m8, reason: from getter */
    public final boolean getR0() {
        return this.R0;
    }
}

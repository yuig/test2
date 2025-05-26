package ads_mobile_sdk;

import android.view.View;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p3 extends hg {

    /* renamed from: d, reason: collision with root package name */
    public static final p3 f9528d = new p3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.hg
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(u3.f11813c.f11815b).iterator();
        while (it.hasNext()) {
            View view = (View) ((t3) it.next()).f11328c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.hg
    public final void a(boolean z13) {
        Iterator it = Collections.unmodifiableCollection(u3.f11813c.f11814a).iterator();
        while (it.hasNext()) {
            v3 v3Var = ((t3) it.next()).f11329d;
            if (v3Var.f12300b.get() != 0) {
                fr1.f5252a.a((WebView) v3Var.f12300b.get(), "setState", z13 ? "foregrounded" : "backgrounded", v3Var.f12299a);
            }
        }
    }
}

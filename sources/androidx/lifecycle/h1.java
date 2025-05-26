package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h1 implements ma.f {

    /* renamed from: a, reason: collision with root package name */
    public final ma.g f18641a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18642b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f18643c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f18644d;

    public h1(ma.g savedStateRegistry, u1 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f18641a = savedStateRegistry;
        this.f18644d = xk2.m.b(new androidx.activity.a0(viewModelStoreOwner, 22));
    }

    @Override // ma.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18643c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((i1) this.f18644d.getValue()).f18648b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a13 = ((b1) ((c1) entry.getValue()).b()).a();
            if (!Intrinsics.d(a13, Bundle.EMPTY)) {
                bundle.putBundle(str, a13);
            }
        }
        this.f18642b = false;
        return bundle;
    }

    public final void b() {
        if (this.f18642b) {
            return;
        }
        Bundle a13 = this.f18641a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f18643c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a13 != null) {
            bundle.putAll(a13);
        }
        this.f18643c = bundle;
        this.f18642b = true;
    }
}

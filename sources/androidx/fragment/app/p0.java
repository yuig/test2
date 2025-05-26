package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class p0 implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18395a = "com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f18396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.s f18397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f18398d;

    public p0(w0 w0Var, a.z0 z0Var, androidx.lifecycle.s sVar) {
        this.f18398d = w0Var;
        this.f18396b = z0Var;
        this.f18397c = sVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        Bundle bundle;
        androidx.lifecycle.q qVar2 = androidx.lifecycle.q.ON_START;
        w0 w0Var = this.f18398d;
        String str = this.f18395a;
        if (qVar == qVar2 && (bundle = (Bundle) w0Var.f18459k.get(str)) != null) {
            this.f18396b.a(str, bundle);
            w0Var.f18459k.remove(str);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Clearing fragment result with key " + str);
            }
        }
        if (qVar == androidx.lifecycle.q.ON_DESTROY) {
            this.f18397c.b(this);
            w0Var.f18460l.remove(str);
        }
    }
}

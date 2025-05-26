package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f18424a;

    public r(Fragment fragment) {
        this.f18424a = fragment;
    }

    @Override // androidx.fragment.app.z
    public final void a() {
        Fragment fragment = this.f18424a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.g1.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}

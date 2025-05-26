package androidx.fragment.app;

import a.cb;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f18436a;

    public t(Fragment fragment) {
        this.f18436a = fragment;
    }

    @Override // androidx.fragment.app.d0
    public final View b(int i13) {
        Fragment fragment = this.f18436a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i13);
        }
        throw new IllegalStateException(cb.k("Fragment ", fragment, " does not have a view"));
    }

    @Override // androidx.fragment.app.d0
    public final boolean c() {
        return this.f18436a.mView != null;
    }
}

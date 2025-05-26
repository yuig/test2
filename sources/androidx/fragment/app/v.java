package androidx.fragment.app;

/* loaded from: classes.dex */
public final class v implements q.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f18443a;

    public v(Fragment fragment) {
        this.f18443a = fragment;
    }

    @Override // q.a
    public final Object apply(Object obj) {
        Fragment fragment = this.f18443a;
        Object obj2 = fragment.mHost;
        return obj2 instanceof g.h ? ((g.h) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}

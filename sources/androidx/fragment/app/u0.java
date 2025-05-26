package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f18442d;

    public u0(w0 w0Var, String str, int i13, int i14) {
        this.f18442d = w0Var;
        this.f18439a = str;
        this.f18440b = i13;
        this.f18441c = i14;
    }

    @Override // androidx.fragment.app.t0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.f18442d.f18473y;
        if (fragment != null && this.f18440b < 0 && this.f18439a == null && fragment.getChildFragmentManager().U()) {
            return false;
        }
        return this.f18442d.W(arrayList, arrayList2, this.f18439a, this.f18440b, this.f18441c);
    }
}

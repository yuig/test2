package k21;

import kotlin.jvm.internal.Intrinsics;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final int f78195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78196b;

    public a(int i13, int i14) {
        this.f78195a = i13;
        this.f78196b = i14;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        o21.a view = (o21.a) nVar;
        h21.a model = (h21.a) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.e4(model.f66542a.a(), model.f66543b);
        view.V(this.f78195a, this.f78196b);
        view.q0(i13);
        view.setSelected(model.f66544c);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        h21.a model = (h21.a) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}

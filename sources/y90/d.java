package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f138142a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.a0 f138143b;

    /* renamed from: c, reason: collision with root package name */
    public final m62.s f138144c;

    /* renamed from: d, reason: collision with root package name */
    public final m62.f0 f138145d;

    public /* synthetic */ d(u50.f0 f0Var, int i13) {
        this((i13 & 1) != 0 ? u50.h0.f120562a : f0Var, new zy.a0(), new m62.s(), null);
    }

    public static d e(d dVar, zy.a0 pinalyticsState, m62.s effectsModel, m62.f0 f0Var, int i13) {
        u50.i0 title = dVar.f138142a;
        if ((i13 & 2) != 0) {
            pinalyticsState = dVar.f138143b;
        }
        if ((i13 & 4) != 0) {
            effectsModel = dVar.f138144c;
        }
        if ((i13 & 8) != 0) {
            f0Var = dVar.f138145d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(effectsModel, "effectsModel");
        return new d(title, pinalyticsState, effectsModel, f0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f138142a, dVar.f138142a) && Intrinsics.d(this.f138143b, dVar.f138143b) && Intrinsics.d(this.f138144c, dVar.f138144c) && Intrinsics.d(this.f138145d, dVar.f138145d);
    }

    public final int hashCode() {
        int hashCode = (this.f138144c.hashCode() + ((this.f138143b.hashCode() + (this.f138142a.hashCode() * 31)) * 31)) * 31;
        m62.f0 f0Var = this.f138145d;
        return hashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }

    public final String toString() {
        return "CollageEffectsDisplayState(title=" + this.f138142a + ", pinalyticsState=" + this.f138143b + ", effectsModel=" + this.f138144c + ", effectsViewAction=" + this.f138145d + ")";
    }

    public d(u50.i0 title, zy.a0 pinalyticsState, m62.s effectsModel, m62.f0 f0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(effectsModel, "effectsModel");
        this.f138142a = title;
        this.f138143b = pinalyticsState;
        this.f138144c = effectsModel;
        this.f138145d = f0Var;
    }
}

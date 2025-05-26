package um0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final z f122695a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0.e f122696b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f122697c;

    /* renamed from: d, reason: collision with root package name */
    public final List f122698d;

    /* renamed from: e, reason: collision with root package name */
    public final xm0.d f122699e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f122700f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122701g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f122702h;

    public e(z mode, tk0.e organizeToolsState, x0 pinSelectionState) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(organizeToolsState, "organizeToolsState");
        Intrinsics.checkNotNullParameter(pinSelectionState, "pinSelectionState");
        this.f122695a = mode;
        this.f122696b = organizeToolsState;
        this.f122697c = pinSelectionState;
        this.f122698d = organizeToolsState.f117955a;
        this.f122699e = pinSelectionState.f122780a;
        this.f122700f = mode == z.Organize || mode == z.OrganizeSelectAll;
        this.f122701g = mode.isSelectAll();
        this.f122702h = organizeToolsState.f117959e;
    }

    public static e e(e eVar, z mode, tk0.e organizeToolsState, x0 pinSelectionState, int i13) {
        if ((i13 & 1) != 0) {
            mode = eVar.f122695a;
        }
        if ((i13 & 2) != 0) {
            organizeToolsState = eVar.f122696b;
        }
        if ((i13 & 4) != 0) {
            pinSelectionState = eVar.f122697c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(organizeToolsState, "organizeToolsState");
        Intrinsics.checkNotNullParameter(pinSelectionState, "pinSelectionState");
        return new e(mode, organizeToolsState, pinSelectionState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f122695a == eVar.f122695a && Intrinsics.d(this.f122696b, eVar.f122696b) && Intrinsics.d(this.f122697c, eVar.f122697c);
    }

    public final int hashCode() {
        return this.f122697c.f122780a.hashCode() + ((this.f122696b.hashCode() + (this.f122695a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OrganizeDisplayState(mode=" + this.f122695a + ", organizeToolsState=" + this.f122696b + ", pinSelectionState=" + this.f122697c + ")";
    }

    public e() {
        this(z.Normal, o0.f122747a, o0.f122749c);
    }
}

package oj0;

import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f95357d;

    /* renamed from: a, reason: collision with root package name */
    public final g0 f95358a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f95359b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f95360c;

    static {
        HashMap hashMap = null;
        int i13 = 4;
        new b(g0.FLOWED_PIN, u0.MORE_IDEAS_ONE_TAP_SAVE_BUTTON, hashMap, i13);
        f95357d = new b(g0.BOARD_PINS_GRID, u0.ONE_TAP_SAVE_BUTTON, hashMap, i13);
    }

    public b(g0 componentType, u0 elementType, HashMap auxData) {
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f95358a = componentType;
        this.f95359b = elementType;
        this.f95360c = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f95358a == bVar.f95358a && this.f95359b == bVar.f95359b && Intrinsics.d(this.f95360c, bVar.f95360c);
    }

    public final int hashCode() {
        return this.f95360c.hashCode() + ((this.f95359b.hashCode() + (this.f95358a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SaveActionLoggingData(componentType=" + this.f95358a + ", elementType=" + this.f95359b + ", auxData=" + this.f95360c + ")";
    }

    public /* synthetic */ b(g0 g0Var, u0 u0Var, HashMap hashMap, int i13) {
        this((i13 & 1) != 0 ? g0.FLOWED_PIN : g0Var, (i13 & 2) != 0 ? u0.MORE_IDEAS_ONE_TAP_SAVE_BUTTON : u0Var, (i13 & 4) != 0 ? new HashMap() : hashMap);
    }
}

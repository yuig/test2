package tk0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f117955a;

    /* renamed from: b, reason: collision with root package name */
    public final xm0.a f117956b;

    /* renamed from: c, reason: collision with root package name */
    public final a f117957c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117958d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f117959e;

    public e(ArrayList arrayList, xm0.a aVar, a aVar2, int i13) {
        this((i13 & 1) != 0 ? q0.f80391a : arrayList, (i13 & 2) != 0 ? new xm0.a(false, 7) : aVar, (i13 & 4) != 0 ? new a(63) : aVar2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static e e(e eVar, ArrayList arrayList, xm0.a headerDisplayState, a deletePinsAlertDisplayState, boolean z13, int i13) {
        ArrayList toolDisplayStates = arrayList;
        if ((i13 & 1) != 0) {
            toolDisplayStates = eVar.f117955a;
        }
        if ((i13 & 2) != 0) {
            headerDisplayState = eVar.f117956b;
        }
        if ((i13 & 4) != 0) {
            deletePinsAlertDisplayState = eVar.f117957c;
        }
        if ((i13 & 8) != 0) {
            z13 = eVar.f117958d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(toolDisplayStates, "toolDisplayStates");
        Intrinsics.checkNotNullParameter(headerDisplayState, "headerDisplayState");
        Intrinsics.checkNotNullParameter(deletePinsAlertDisplayState, "deletePinsAlertDisplayState");
        return new e(toolDisplayStates, headerDisplayState, deletePinsAlertDisplayState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f117955a, eVar.f117955a) && Intrinsics.d(this.f117956b, eVar.f117956b) && Intrinsics.d(this.f117957c, eVar.f117957c) && this.f117958d == eVar.f117958d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117958d) + ((this.f117957c.hashCode() + ((this.f117956b.hashCode() + (this.f117955a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OrganizeFloatingToolbarDisplayState(toolDisplayStates=" + this.f117955a + ", headerDisplayState=" + this.f117956b + ", deletePinsAlertDisplayState=" + this.f117957c + ", removeSelectedPins=" + this.f117958d + ")";
    }

    public e(List toolDisplayStates, xm0.a headerDisplayState, a deletePinsAlertDisplayState, boolean z13) {
        Intrinsics.checkNotNullParameter(toolDisplayStates, "toolDisplayStates");
        Intrinsics.checkNotNullParameter(headerDisplayState, "headerDisplayState");
        Intrinsics.checkNotNullParameter(deletePinsAlertDisplayState, "deletePinsAlertDisplayState");
        this.f117955a = toolDisplayStates;
        this.f117956b = headerDisplayState;
        this.f117957c = deletePinsAlertDisplayState;
        this.f117958d = z13;
        this.f117959e = deletePinsAlertDisplayState.f117939a;
    }
}

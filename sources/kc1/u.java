package kc1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f79175a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f79176b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f79177c;

    public u(Set savedPronouns, Set currentlySelectedPronouns, j0 listVMState) {
        Intrinsics.checkNotNullParameter(savedPronouns, "savedPronouns");
        Intrinsics.checkNotNullParameter(currentlySelectedPronouns, "currentlySelectedPronouns");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        this.f79175a = savedPronouns;
        this.f79176b = currentlySelectedPronouns;
        this.f79177c = listVMState;
    }

    public static u b(u uVar, Set currentlySelectedPronouns, j0 listVMState, int i13) {
        Set savedPronouns = uVar.f79175a;
        if ((i13 & 2) != 0) {
            currentlySelectedPronouns = uVar.f79176b;
        }
        if ((i13 & 4) != 0) {
            listVMState = uVar.f79177c;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(savedPronouns, "savedPronouns");
        Intrinsics.checkNotNullParameter(currentlySelectedPronouns, "currentlySelectedPronouns");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        return new u(savedPronouns, currentlySelectedPronouns, listVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f79175a, uVar.f79175a) && Intrinsics.d(this.f79176b, uVar.f79176b) && Intrinsics.d(this.f79177c, uVar.f79177c);
    }

    public final int hashCode() {
        return this.f79177c.f93634a.hashCode() + ((this.f79176b.hashCode() + (this.f79175a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PronounsVMState(savedPronouns=" + this.f79175a + ", currentlySelectedPronouns=" + this.f79176b + ", listVMState=" + this.f79177c + ")";
    }
}

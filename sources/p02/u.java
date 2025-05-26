package p02;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes4.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98462b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f98463c;

    public u(boolean z13, String str, j0 listVMState) {
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        this.f98461a = z13;
        this.f98462b = str;
        this.f98463c = listVMState;
    }

    public static u b(u uVar, j0 listVMState) {
        boolean z13 = uVar.f98461a;
        String str = uVar.f98462b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        return new u(z13, str, listVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f98461a == uVar.f98461a && Intrinsics.d(this.f98462b, uVar.f98462b) && Intrinsics.d(this.f98463c, uVar.f98463c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f98461a) * 31;
        String str = this.f98462b;
        return this.f98463c.f93634a.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RVCSectionVMState(isYourAccountTab=" + this.f98461a + ", userId=" + this.f98462b + ", listVMState=" + this.f98463c + ")";
    }
}

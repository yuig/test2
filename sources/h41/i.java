package h41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f67638a;

    /* renamed from: b, reason: collision with root package name */
    public final h f67639b;

    public i(h hVar, h hVar2) {
        this.f67638a = hVar;
        this.f67639b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f67638a, iVar.f67638a) && Intrinsics.d(this.f67639b, iVar.f67639b);
    }

    public final int hashCode() {
        h hVar = this.f67638a;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        h hVar2 = this.f67639b;
        return hashCode + (hVar2 != null ? hVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UserUrlDisplays(websiteUrlDisplay=" + this.f67638a + ", impressumUrlDisplay=" + this.f67639b + ")";
    }
}

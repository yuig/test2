package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final f f120391a;

    /* renamed from: b, reason: collision with root package name */
    public final e f120392b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120393c;

    public n(f fVar, e eVar, String str) {
        this.f120391a = fVar;
        this.f120392b = eVar;
        this.f120393c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f120391a, nVar.f120391a) && Intrinsics.d(this.f120392b, nVar.f120392b) && Intrinsics.d(this.f120393c, nVar.f120393c);
    }

    public final int hashCode() {
        f fVar = this.f120391a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        e eVar = this.f120392b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f120393c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("V3EditSettingsHandlerMutation(v3UsersMeViewerResponse=");
        sb3.append(this.f120391a);
        sb3.append(", v3EditSettingsHandlerResponse=");
        sb3.append(this.f120392b);
        sb3.append(", clientMutationId=");
        return a.a.p(sb3, this.f120393c, ")");
    }
}

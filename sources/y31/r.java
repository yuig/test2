package y31;

import com.pinterest.api.model.vz0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f136849a;

    /* renamed from: b, reason: collision with root package name */
    public final a f136850b;

    /* renamed from: c, reason: collision with root package name */
    public final f f136851c;

    /* renamed from: d, reason: collision with root package name */
    public final e f136852d;

    /* renamed from: e, reason: collision with root package name */
    public final vz0 f136853e;

    /* renamed from: f, reason: collision with root package name */
    public final List f136854f;

    public r(b coverMediaState, a avatarState, f informationState, e statisticsState, vz0 vz0Var, List linkStates) {
        Intrinsics.checkNotNullParameter(coverMediaState, "coverMediaState");
        Intrinsics.checkNotNullParameter(avatarState, "avatarState");
        Intrinsics.checkNotNullParameter(informationState, "informationState");
        Intrinsics.checkNotNullParameter(statisticsState, "statisticsState");
        Intrinsics.checkNotNullParameter(linkStates, "linkStates");
        this.f136849a = coverMediaState;
        this.f136850b = avatarState;
        this.f136851c = informationState;
        this.f136852d = statisticsState;
        this.f136853e = vz0Var;
        this.f136854f = linkStates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    public static r e(r rVar, b bVar, a aVar, f fVar, e eVar, vz0 vz0Var, ArrayList arrayList, int i13) {
        if ((i13 & 1) != 0) {
            bVar = rVar.f136849a;
        }
        b coverMediaState = bVar;
        if ((i13 & 2) != 0) {
            aVar = rVar.f136850b;
        }
        a avatarState = aVar;
        if ((i13 & 4) != 0) {
            fVar = rVar.f136851c;
        }
        f informationState = fVar;
        if ((i13 & 8) != 0) {
            eVar = rVar.f136852d;
        }
        e statisticsState = eVar;
        if ((i13 & 16) != 0) {
            vz0Var = rVar.f136853e;
        }
        vz0 vz0Var2 = vz0Var;
        ArrayList arrayList2 = arrayList;
        if ((i13 & 32) != 0) {
            arrayList2 = rVar.f136854f;
        }
        ArrayList linkStates = arrayList2;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(coverMediaState, "coverMediaState");
        Intrinsics.checkNotNullParameter(avatarState, "avatarState");
        Intrinsics.checkNotNullParameter(informationState, "informationState");
        Intrinsics.checkNotNullParameter(statisticsState, "statisticsState");
        Intrinsics.checkNotNullParameter(linkStates, "linkStates");
        return new r(coverMediaState, avatarState, informationState, statisticsState, vz0Var2, linkStates);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f136849a, rVar.f136849a) && Intrinsics.d(this.f136850b, rVar.f136850b) && Intrinsics.d(this.f136851c, rVar.f136851c) && Intrinsics.d(this.f136852d, rVar.f136852d) && Intrinsics.d(this.f136853e, rVar.f136853e) && Intrinsics.d(this.f136854f, rVar.f136854f);
    }

    public final int hashCode() {
        int hashCode = (this.f136852d.hashCode() + ((this.f136851c.hashCode() + ((this.f136850b.hashCode() + (this.f136849a.hashCode() * 31)) * 31)) * 31)) * 31;
        vz0 vz0Var = this.f136853e;
        return this.f136854f.hashCode() + ((hashCode + (vz0Var == null ? 0 : vz0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "UserProfileHeaderDisplayState(coverMediaState=" + this.f136849a + ", avatarState=" + this.f136850b + ", informationState=" + this.f136851c + ", statisticsState=" + this.f136852d + ", verifiedMerchant=" + this.f136853e + ", linkStates=" + this.f136854f + ")";
    }
}

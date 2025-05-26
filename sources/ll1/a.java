package ll1;

import a.cb;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f83823a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83824b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f83825c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f83826d;

    public a(String navTarget, String objectId, HashMap timeSpentAuxData, HashMap viewAuxData, int i13) {
        timeSpentAuxData = (i13 & 4) != 0 ? bs1.c.o(new Pair[0]) : timeSpentAuxData;
        viewAuxData = (i13 & 8) != 0 ? bs1.c.o(new Pair[0]) : viewAuxData;
        Intrinsics.checkNotNullParameter(navTarget, "navTarget");
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(timeSpentAuxData, "timeSpentAuxData");
        Intrinsics.checkNotNullParameter(viewAuxData, "viewAuxData");
        this.f83823a = navTarget;
        this.f83824b = objectId;
        this.f83825c = timeSpentAuxData;
        this.f83826d = viewAuxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f83823a, aVar.f83823a) && Intrinsics.d(this.f83824b, aVar.f83824b) && Intrinsics.d(this.f83825c, aVar.f83825c) && Intrinsics.d(this.f83826d, aVar.f83826d);
    }

    public final int hashCode() {
        return this.f83826d.hashCode() + a.c.d(this.f83825c, cb.d(this.f83824b, this.f83823a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnActivate(navTarget=");
        sb3.append(this.f83823a);
        sb3.append(", objectId=");
        sb3.append(this.f83824b);
        sb3.append(", timeSpentAuxData=");
        sb3.append(this.f83825c);
        sb3.append(", viewAuxData=");
        return jq.b.f(sb3, this.f83826d, ")");
    }
}

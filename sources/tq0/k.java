package tq0;

import ca0.y;
import h32.r2;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.v0;
import u50.r;

/* loaded from: classes5.dex */
public final class k implements zy.m {

    /* renamed from: a, reason: collision with root package name */
    public final r f119023a;

    public k(y eventIntake) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.f119023a = eventIntake;
    }

    @Override // zy.m
    public final void c(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        boolean z13 = impression instanceof r2;
        r rVar = this.f119023a;
        if (!z13) {
            if (impression instanceof v0) {
                rVar.a(new zy.j((v0) impression));
                return;
            }
            return;
        }
        r2 impression2 = (r2) impression;
        Intrinsics.checkNotNullParameter(impression2, "impression");
        String str = impression2.f67220b;
        HashMap hashMap = new HashMap();
        String str2 = impression2.f67220b;
        if (str2 != null) {
            hashMap.put("shuffle_id", str2);
        }
        Unit unit = Unit.f80348a;
        rVar.a(new zy.j(new v0(impression2, str, hashMap)));
    }
}

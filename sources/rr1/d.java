package rr1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yq1.u1;

/* loaded from: classes4.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f109940a;

    public d(u1 scoringFunction) {
        Intrinsics.checkNotNullParameter(scoringFunction, "scoringFunction");
        this.f109940a = scoringFunction;
    }

    @Override // rr1.f
    public final boolean test(Object obj) {
        String password = (String) obj;
        Intrinsics.checkNotNullParameter(password, "password");
        return ((a) this.f109940a.invoke(password)).f109934a >= 1;
    }
}

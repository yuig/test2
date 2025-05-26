package lg0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.h;
import s30.n;
import s30.r;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f83213i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r rVar;
        h response = (h) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        s30.s sVar = (s30.s) response.f99563c;
        if (sVar == null || (rVar = sVar.f111053a) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        n nVar = rVar instanceof n ? (n) rVar : null;
        if (nVar != null) {
            return nVar.f111046e;
        }
        return null;
    }
}

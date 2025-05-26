package jr1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f77551i = new d(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qr1.b activityResult = (qr1.b) obj2;
        Intrinsics.checkNotNullParameter((uj2.b) obj, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        return activityResult;
    }
}

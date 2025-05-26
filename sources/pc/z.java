package pc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z extends q {

    /* renamed from: h, reason: collision with root package name */
    public final List f99613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List values) {
        super("ContactRequestReportReasons");
        Intrinsics.checkNotNullParameter("ContactRequestReportReasons", "name");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f99613h = values;
    }
}

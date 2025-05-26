package pd2;

import java.util.TreeMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 extends q0 {

    /* renamed from: c */
    public final Function0 f99872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(TreeMap spec, nd2.a onChange) {
        super(spec);
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        this.f99872c = onChange;
    }

    @Override // pd2.q0
    public final void b(String paramName, p0 newValue) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        super.b(paramName, newValue);
        this.f99872c.invoke();
    }
}

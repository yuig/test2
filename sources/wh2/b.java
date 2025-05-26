package wh2;

import io.embrace.android.embracesdk.internal.payload.NativeCrashData;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p03 = (String) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return (NativeCrashData) ((Map) this.receiver).get(p03);
    }
}

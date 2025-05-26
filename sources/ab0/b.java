package ab0;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1692a = new b();

    public b() {
        super(2, Bundle.class, "getInt", "getInt(Ljava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle p03 = (Bundle) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return Integer.valueOf(p03.getInt((String) obj2));
    }
}

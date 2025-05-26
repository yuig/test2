package ab0;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1691a = new a();

    public a() {
        super(2, Bundle.class, "getBoolean", "getBoolean(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle p03 = (Bundle) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return Boolean.valueOf(p03.getBoolean((String) obj2));
    }
}

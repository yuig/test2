package ab0;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1694a = new d();

    public d() {
        super(2, Bundle.class, "getString", "getString(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle p03 = (Bundle) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return p03.getString((String) obj2);
    }
}

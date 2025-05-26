package ab0;

import android.os.Bundle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class c extends p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1693a = new c();

    public c() {
        super(2, Bundle.class, "getParcelable", "getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bundle p03 = (Bundle) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return p03.getParcelable((String) obj2);
    }
}

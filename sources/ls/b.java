package ls;

import com.pinterest.api.model.f30;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f84610i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f30 pin = (f30) obj;
        vd0.c adPreview = (vd0.c) obj2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(adPreview, "adPreview");
        return new Pair(pin, adPreview);
    }
}

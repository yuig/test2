package co0;

import com.pinterest.api.model.ba;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f28273i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ba section1 = (ba) obj;
        ba section2 = (ba) obj2;
        Intrinsics.checkNotNullParameter(section1, "section1");
        Intrinsics.checkNotNullParameter(section2, "section2");
        return new Pair(section1, section2);
    }
}

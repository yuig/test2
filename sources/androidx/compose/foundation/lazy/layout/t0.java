package androidx.compose.foundation.lazy.layout;

import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f17292i = new t0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map c13 = ((v0) obj2).c();
        if (c13.isEmpty()) {
            return null;
        }
        return c13;
    }
}

package x01;

import com.pinterest.api.model.vh;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f131277i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vh it = (vh) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.q() + ":" + it.f42865w.size();
    }
}

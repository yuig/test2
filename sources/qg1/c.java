package qg1;

import com.pinterest.api.model.eq0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f103826i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String b13 = ((eq0) obj).b();
        Intrinsics.checkNotNullExpressionValue(b13, "getText(...)");
        return StringsKt.i0(b13).toString();
    }
}

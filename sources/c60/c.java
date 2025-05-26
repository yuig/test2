package c60;

import android.util.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f26512i = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte[] bytes = "1431602:492124fd20e80e0f678f7a03344875f9b6234e2b".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return Base64.encodeToString(bytes, 2);
    }
}

package oo1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final i f96853i = new i(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 != null) {
            Boolean s43 = f13.s4();
            Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
            z13 = s43.booleanValue();
        } else {
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }
}

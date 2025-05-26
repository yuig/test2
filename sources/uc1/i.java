package uc1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qr1.v;

/* loaded from: classes5.dex */
public final class i extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final i f121904i = new i(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v mfaData = (v) obj;
        wy0 user = (wy0) obj2;
        Intrinsics.checkNotNullParameter(mfaData, "mfaData");
        Intrinsics.checkNotNullParameter(user, "user");
        return new h(user, mfaData);
    }
}

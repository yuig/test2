package ot0;

import com.pinterest.navigation.Navigation;
import com.pinterest.screens.d2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f97521i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation navigation = (Navigation) obj;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        return Boolean.valueOf(Intrinsics.d(navigation.getF49939a(), d2.m()));
    }
}

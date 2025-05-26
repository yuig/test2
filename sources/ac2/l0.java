package ac2;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f1989i = new l0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair playerState1 = (Pair) obj;
        Boolean backgroundState1 = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(playerState1, "playerState1");
        Intrinsics.checkNotNullParameter(backgroundState1, "backgroundState1");
        return new xk2.w(playerState1.f80346a, playerState1.f80347b, backgroundState1);
    }
}

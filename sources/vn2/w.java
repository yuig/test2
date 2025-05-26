package vn2;

import am2.i1;
import dm2.b1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final w f126348i = new w(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.x $receiver = (am2.x) obj;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        List x13 = $receiver.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        i1 i1Var = (i1) CollectionsKt.d0(x13);
        boolean z13 = false;
        if (i1Var != null && !fn2.d.a(i1Var) && ((b1) i1Var).f55398j == null) {
            z13 = true;
        }
        List list = z.f126351g;
        if (z13) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}

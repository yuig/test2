package yv1;

import android.content.res.Resources;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f140232i = new h(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
        return a.a.j("+", qb0.j.b(intValue));
    }
}

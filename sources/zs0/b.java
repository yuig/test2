package zs0;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o82.l0;
import xs0.h;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f142752i = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o12.b response = (o12.b) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        List<dl1.s> list = response.f92783a;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (dl1.s sVar : list) {
            Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.api.model.Board");
            boolean z13 = false;
            arrayList.add(new h((v7) sVar, z13, z13, 14));
        }
        return new l0(arrayList, response.f92784b);
    }
}

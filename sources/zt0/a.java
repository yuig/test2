package zt0;

import com.pinterest.api.model.ln0;
import hv0.d;
import kh2.k3;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f142764i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ln0 localData = (ln0) obj;
        Intrinsics.checkNotNullParameter(localData, "localData");
        return localData.G() ? e0.b(new d(localData.y(), k3.a0(localData))) : q0.f80391a;
    }
}

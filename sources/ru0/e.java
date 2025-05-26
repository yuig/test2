package ru0;

import com.pinterest.api.model.dk;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.uk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pu0.u;
import pu0.w;
import pu0.y;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109980i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f109981j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(y yVar, int i13) {
        super(1);
        this.f109980i = i13;
        this.f109981j = yVar;
    }

    public final tq b(tq durationConfig) {
        int i13 = this.f109980i;
        y yVar = this.f109981j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
                return tq.b(durationConfig, 0L, 0L, ((dk) ((u) yVar).f101426a.getSpec()).getType(), null, 11);
            default:
                Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
                return tq.b(durationConfig, 0L, 0L, null, ((uk) ((w) yVar).f101428a.getSpec()).getType(), 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109980i) {
        }
        return b((tq) obj);
    }
}

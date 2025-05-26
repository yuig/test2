package p21;

import gb2.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wa2.a0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f98687j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f98688k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f98689l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f98690m = new d(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f98691i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f98691i) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof k ? m0.F(list, k.class) : q0.f80391a;
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 2:
                List updates = (List) obj;
                Intrinsics.checkNotNullParameter(updates, "updates");
                return updates;
            default:
                k it2 = (k) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(it2.f64759b.compareTo(a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN) > 0);
        }
    }
}

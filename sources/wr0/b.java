package wr0;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.z2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f130868j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f130869k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f130870l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f130871m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f130872n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f130873o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f130874p = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130875i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f130875i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130875i) {
            case 0:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122909q = 3;
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                z2 aggregatedComment = (z2) obj;
                Intrinsics.checkNotNullParameter(aggregatedComment, "aggregatedComment");
                return new rp0.b(aggregatedComment);
            case 3:
                return Unit.f80348a;
            case 4:
                return Unit.f80348a;
            case 5:
                az0 userDidItData = (az0) obj;
                Intrinsics.checkNotNullParameter(userDidItData, "userDidItData");
                return new rp0.c(userDidItData);
            default:
                return Unit.f80348a;
        }
    }
}

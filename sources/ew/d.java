package ew;

import ads_mobile_sdk.nh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f60295j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f60296k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60297i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(2);
        this.f60297i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60297i) {
            case 0:
                nh nhVar = (nh) obj2;
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                if (nhVar != null) {
                    nhVar.destroy();
                }
                break;
            default:
                bj.f fVar = (bj.f) obj2;
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                if (fVar != null) {
                    fVar.destroy();
                }
                break;
        }
        return Unit.f80348a;
    }
}

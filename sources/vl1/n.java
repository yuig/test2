package vl1;

import com.pinterest.gestalt.banner.GestaltBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126129i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltBanner f126130j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f126131k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(GestaltBanner gestaltBanner, d dVar, int i13) {
        super(1);
        this.f126129i = i13;
        this.f126130j = gestaltBanner;
        this.f126131k = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126129i;
        GestaltBanner gestaltBanner = this.f126130j;
        d dVar = this.f126131k;
        switch (i13) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                h0 h0Var = GestaltBanner.f49286o;
                gestaltBanner.T(dVar, newState);
                break;
            default:
                ((Number) obj).intValue();
                gestaltBanner.setId(dVar.f126116g);
                break;
        }
        return Unit.f80348a;
    }
}

package com.pinterest.feature.unauth.sba;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j */
    public static final v f48874j = new v(0);

    /* renamed from: k */
    public static final v f48875k = new v(1);

    /* renamed from: l */
    public static final v f48876l = new v(2);

    /* renamed from: m */
    public static final v f48877m = new v(3);

    /* renamed from: i */
    public final /* synthetic */ int f48878i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f48878i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f48878i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48878i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                return Unit.f80348a;
            default:
                e0 vmState = (e0) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                y yVar = y.f48879a;
                return e0.n(vmState);
        }
    }
}

package com.pinterest.qrCodeLogin;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f50361j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(i iVar, int i13) {
        super(1);
        this.f50360i = i13;
        this.f50361j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f50360i;
        i iVar = this.f50361j;
        switch (i13) {
            case 0:
                rm1.d it = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                cm1.d it2 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                yl1.b f13 = yl1.b.f(it2.f28012a, iVar.f50316f.f28012a.f139300a, false, null, null, null, null, null, null, 0, null, 1022);
                cm1.d dVar = iVar.f50316f;
                yl1.b bVar = dVar.f28013b;
                break;
            case 2:
                rn1.k bind = (rn1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.e(iVar.f50311a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.g(iVar.f50312b);
                        break;
                }
                break;
            default:
                rn1.k bind2 = (rn1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.e(iVar.f50311a);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.g(iVar.f50312b);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}

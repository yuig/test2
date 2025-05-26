package ads_mobile_sdk;

import a.l7;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qr0 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.a5 f10229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zr f10230b;

    public qr0(a.a5 a5Var, zr zrVar) {
        this.f10229a = a5Var;
        this.f10230b = zrVar;
    }

    @Override // a.l7
    public final Unit a() {
        a.a5 a5Var = this.f10229a;
        zr consentStringsProvider = this.f10230b;
        g31 g31Var = (g31) a5Var;
        g31Var.getClass();
        Intrinsics.checkNotNullParameter(consentStringsProvider, "consentStringsProvider");
        g31Var.f5380n = consentStringsProvider;
        return Unit.f80348a;
    }
}

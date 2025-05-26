package s71;

import h32.a4;
import h32.w3;
import h32.x3;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.f0;

/* loaded from: classes5.dex */
public final class q extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final String f111403g;

    /* renamed from: h, reason: collision with root package name */
    public final String f111404h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f111405i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111406j;

    /* renamed from: k, reason: collision with root package name */
    public a4 f111407k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String entryPoint, f0 pinalyticsFactory, boolean z13, a4 originalViewParameterType) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(originalViewParameterType, "originalViewParameterType");
        this.f111403g = str;
        this.f111404h = entryPoint;
        this.f111405i = z13;
        this.f111406j = "";
        this.f111407k = originalViewParameterType;
    }

    @Override // uk1.d
    public final x3 h(String str) {
        Long h03;
        x3 h10 = super.h(str);
        w3 w3Var = h10 == null ? new w3() : new w3(h10);
        w3Var.f67371j = this.f111406j;
        String str2 = this.f111403g;
        if (str2 != null && (h03 = StringsKt.h0(str2)) != null) {
            w3Var.f67364c = Long.valueOf(h03.longValue());
        }
        return w3Var.a();
    }

    @Override // uk1.d
    public final a4 i() {
        return this.f111407k;
    }

    public final void l(a4 a4Var) {
        Intrinsics.checkNotNullParameter(a4Var, "<set-?>");
        this.f111407k = a4Var;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap auxData = super.getF63135d0();
        if (auxData == null) {
            auxData = new HashMap();
        }
        String entryPoint = this.f111404h;
        if (entryPoint.length() > 0) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            nm.u uVar = new nm.u();
            uVar.u("entrypoint", entryPoint);
            uVar.t("pin_is_stela", Boolean.valueOf(this.f111405i));
            String sVar = uVar.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            auxData.put("commerce_data", sVar);
        }
        return auxData;
    }

    public /* synthetic */ q(String str, f0 f0Var, a4 a4Var) {
        this(null, str, f0Var, false, a4Var);
    }
}

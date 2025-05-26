package ads_mobile_sdk;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class kq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1 f7447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f7448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts f7450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr0 f7451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu1 f7452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lu1 f7453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq1(zq1 zq1Var, ym0 ym0Var, String str, ts tsVar, fr0 fr0Var, lu1 lu1Var, lu1 lu1Var2) {
        super(0);
        this.f7447a = zq1Var;
        this.f7448b = ym0Var;
        this.f7449c = str;
        this.f7450d = tsVar;
        this.f7451e = fr0Var;
        this.f7452f = lu1Var;
        this.f7453g = lu1Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r3 a13 = r3.a(this.f7447a.f14870k, this.f7448b, this.f7449c, "");
        q3 a14 = q3.a(this.f7450d, this.f7451e, this.f7452f, this.f7453g, true);
        if (a.ng.f126a.f12616a) {
            return new t3(a14, a13, UUID.randomUUID().toString());
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}

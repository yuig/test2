package ads_mobile_sdk;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class nq1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq1 f8928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f8929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ts f8931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr0 f8932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lu1 f8933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lu1 f8934h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq1(String str, zq1 zq1Var, ym0 ym0Var, String str2, ts tsVar, fr0 fr0Var, lu1 lu1Var, lu1 lu1Var2) {
        super(0);
        this.f8927a = str;
        this.f8928b = zq1Var;
        this.f8929c = ym0Var;
        this.f8930d = str2;
        this.f8931e = tsVar;
        this.f8932f = fr0Var;
        this.f8933g = lu1Var;
        this.f8934h = lu1Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r3 b13 = r3.b(rv1.a(this.f8927a, this.f8928b.f14868i), this.f8929c, this.f8930d, "");
        q3 a13 = q3.a(this.f8931e, this.f8932f, this.f8933g, this.f8934h, true);
        if (a.ng.f126a.f12616a) {
            return new t3(a13, b13, UUID.randomUUID().toString());
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}

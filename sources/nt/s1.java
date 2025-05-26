package nt;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92173i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m60.w f92174j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e1 f92175k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(m60.w wVar, e1 e1Var, int i13) {
        super(1);
        this.f92173i = i13;
        this.f92174j = wVar;
        this.f92175k = e1Var;
    }

    public final hu.e b(List it) {
        int i13 = this.f92173i;
        m60.w wVar = this.f92174j;
        e1 e1Var = this.f92175k;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return new hu.e(0, it, new s1(wVar, e1Var, 0));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new hu.e(1, it, new s1(wVar, e1Var, 2));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f92173i;
        e1 e1Var = this.f92175k;
        m60.w wVar = this.f92174j;
        switch (i13) {
            case 0:
                m91.b country = (m91.b) obj;
                Intrinsics.checkNotNullParameter(country, "country");
                if (wVar != null) {
                    wVar.d(new jc0.s(true));
                }
                String str = country.f86724d;
                if (str == null) {
                    str = "";
                }
                e1Var.a(str);
                return Unit.f80348a;
            case 1:
                return b((List) obj);
            case 2:
                ju.i month = (ju.i) obj;
                Intrinsics.checkNotNullParameter(month, "month");
                if (wVar != null) {
                    wVar.d(new jc0.s(true));
                }
                e1Var.a(month.f77608a.name());
                return Unit.f80348a;
            default:
                return b((List) obj);
        }
    }
}

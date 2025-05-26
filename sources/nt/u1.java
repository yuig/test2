package nt;

import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g1 f92186i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f92187j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltRadioGroup f92188k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u50.r f92189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h32.u0 f92190m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f92191n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CharSequence f92192o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g1 g1Var, List list, GestaltRadioGroup gestaltRadioGroup, u50.r rVar, h32.u0 u0Var, boolean z13, String str) {
        super(1);
        this.f92186i = g1Var;
        this.f92187j = list;
        this.f92188k = gestaltRadioGroup;
        this.f92189l = rVar;
        this.f92190m = u0Var;
        this.f92191n = z13;
        this.f92192o = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        an1.q it = (an1.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof an1.p) {
            String str = (String) this.f92187j.get(((an1.p) it).f15758c);
            g1 g1Var = this.f92186i;
            g1Var.getClass();
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            g1Var.f92046f = str;
            this.f92188k.t(d1.f92006n);
            if (g1Var.f92044d) {
                g1Var.f92044d = false;
                u50.r rVar = this.f92189l;
                if (rVar != null) {
                    rVar.a(new g0(this.f92191n ? this.f92192o.toString() : null, this.f92190m));
                }
            }
        }
        return Unit.f80348a;
    }
}

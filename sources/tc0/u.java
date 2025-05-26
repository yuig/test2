package tc0;

import i2.q1;
import i2.v3;
import k1.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117326i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f117327j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f117328k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f117329l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f117330m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f117331n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f117332o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f117333p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dg2.e eVar, String str, th2.l lVar, String str2, String str3, String str4, Integer num) {
        super(1);
        this.f117328k = eVar;
        this.f117327j = str;
        this.f117329l = lVar;
        this.f117330m = str2;
        this.f117331n = str3;
        this.f117332o = str4;
        this.f117333p = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f117326i;
        Object obj2 = this.f117333p;
        Object obj3 = this.f117332o;
        Object obj4 = this.f117331n;
        Object obj5 = this.f117330m;
        Object obj6 = this.f117329l;
        String str = this.f117327j;
        Object obj7 = this.f117328k;
        switch (i13) {
            case 0:
                q1.x LazyColumn = (q1.x) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                v3 v3Var = (v3) obj7;
                p pVar = new p(v3Var, r3);
                Object obj8 = q2.i.f102113a;
                q1.x.a(LazyColumn, null, new q2.h(pVar, true, 542456050), 3);
                q1.x.a(LazyColumn, null, new q2.h(new r(v3Var, (v3) obj6, r3), true, -2038387287), 3);
                q1.x.a(LazyColumn, null, new q2.h(new r((v3) obj5, v3Var, 1), true, -1774690262), 3);
                q1.x.a(LazyColumn, null, new q2.h(new c2.c0(v3Var, (v3) obj4, (v3) obj3, 7), true, -1510993237), 3);
                q1.x.a(LazyColumn, null, new q2.h(new n1(11, str, (uc0.p0) obj2), true, -1247296212), 3);
                break;
            default:
                vf2.c captureData = (vf2.c) obj;
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                dg2.e eVar = (dg2.e) obj7;
                boolean isFcmPiiDataCaptureEnabled = ((tg2.i) eVar.f54948d).f117610b.isFcmPiiDataCaptureEnabled();
                String str2 = isFcmPiiDataCaptureEnabled ? str : null;
                String type = ((th2.l) obj6).getType();
                String str3 = isFcmPiiDataCaptureEnabled ? (String) obj5 : null;
                String str4 = (String) obj4;
                if (str4 == null) {
                    str4 = "";
                }
                Integer num = (Integer) obj2;
                ((ei2.a) captureData).i(new xf2.l0(num != null ? num.intValue() : 0, str2, type, str3, str4, isFcmPiiDataCaptureEnabled ? (String) obj3 : null), eVar.f54949e.now());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q1 q1Var, q1 q1Var2, q1 q1Var3, q1 q1Var4, q1 q1Var5, String str, uc0.p0 p0Var) {
        super(1);
        this.f117328k = q1Var;
        this.f117329l = q1Var2;
        this.f117330m = q1Var3;
        this.f117331n = q1Var4;
        this.f117332o = q1Var5;
        this.f117327j = str;
        this.f117333p = p0Var;
    }
}

package i1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f70905j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70906k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f70907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, long j13, Object obj2, int i13) {
        super(1);
        this.f70904i = i13;
        this.f70906k = obj;
        this.f70905j = j13;
        this.f70907l = obj2;
    }

    public final void b(ei2.v captureSpanData) {
        long j13 = this.f70905j;
        int i13 = this.f70904i;
        Object obj = this.f70907l;
        Object obj2 = this.f70906k;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                ((bg2.e) obj).f22794e = kh2.s0.T0(captureSpanData, new xf2.o0((qg2.k) obj2), j13);
                break;
            default:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                ((lg2.d) obj).f83283h = kh2.s0.T0(captureSpanData, new xf2.m0(((Integer) obj2).intValue()), j13);
                break;
        }
    }

    public final void e(vf2.c captureData) {
        String str;
        int i13 = this.f70904i;
        long j13 = this.f70905j;
        Object obj = this.f70907l;
        str = "";
        Object obj2 = this.f70906k;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                String str2 = (String) obj;
                ((dg2.c) obj2).getClass();
                if (str2 != null && str2.length() >= 256) {
                    StringBuilder sb3 = new StringBuilder();
                    String substring = str2.substring(0, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb3.append(substring);
                    sb3.append("...");
                    str2 = sb3.toString();
                }
                ((ei2.a) captureData).i(new xf2.m0(str2 != null ? str2 : "", 1), j13);
                break;
            default:
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                String str3 = (String) obj2;
                String str4 = str3 == null ? "" : str3;
                if (!((tg2.i) ((dg2.m) obj).f54969d).f117610b.isWebViewBreadcrumbQueryParamCaptureEnabled()) {
                    int L = str3 != null ? StringsKt.L(str3, "?", 0, false, 6) : 0;
                    if (L > 0) {
                        if (str3 != null) {
                            String substring2 = str3.substring(0, L);
                            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (substring2 != null) {
                                str = substring2;
                            }
                        }
                        str4 = str;
                    }
                }
                ((ei2.a) captureData).i(new xf2.m0(str4, 6), j13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70904i;
        Object obj2 = this.f70907l;
        Object obj3 = this.f70906k;
        switch (i13) {
            case 0:
                q3.c1 c1Var = (q3.c1) obj2;
                q3.b1.e((q3.b1) obj, c1Var, ((x) obj3).f70927b.a(lb.l0.d(c1Var.f102178a, c1Var.f102179b), this.f70905j, n4.k.Ltr));
                return Unit.f80348a;
            case 1:
                b((ei2.v) obj);
                return Unit.f80348a;
            case 2:
                e((vf2.c) obj);
                return Unit.f80348a;
            case 3:
                e((vf2.c) obj);
                return Unit.f80348a;
            case 4:
                b((ei2.v) obj);
                return Unit.f80348a;
            default:
                yh2.c initial = (yh2.c) obj;
                Intrinsics.checkNotNullParameter(initial, "initial");
                di2.j jVar = (di2.j) obj3;
                ci2.d dVar = jVar.f55089a;
                bi2.f state = jVar.f55101m;
                String crashId = (String) obj2;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(initial, "initial");
                Intrinsics.checkNotNullParameter(crashId, "crashId");
                int i14 = ci2.c.f27767a[state.ordinal()];
                ci2.e eVar = dVar.f27768a;
                if (i14 == 1) {
                    return eVar.a(new e2.g0(initial, di2.k.JVM_CRASH, dVar.f27771d, false, crashId));
                }
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (dVar.b()) {
                    return eVar.a(new e2.g0(initial, di2.k.JVM_CRASH, dVar.f27771d, false, crashId));
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, long j13, int i13) {
        super(1);
        this.f70904i = i13;
        this.f70906k = obj;
        this.f70907l = obj2;
        this.f70905j = j13;
    }
}

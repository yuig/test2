package nt;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d1 f92002j = new d1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f92003k = new d1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d1 f92004l = new d1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d1 f92005m = new d1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d1 f92006n = new d1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d1 f92007o = new d1(6);

    /* renamed from: p, reason: collision with root package name */
    public static final d1 f92008p = new d1(7);

    /* renamed from: q, reason: collision with root package name */
    public static final d1 f92009q = new d1(8);

    /* renamed from: r, reason: collision with root package name */
    public static final d1 f92010r = new d1(9);

    /* renamed from: s, reason: collision with root package name */
    public static final d1 f92011s = new d1(10);

    /* renamed from: t, reason: collision with root package name */
    public static final d1 f92012t = new d1(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i13) {
        super(1);
        this.f92013i = i13;
    }

    public final rn1.a b(rn1.a state) {
        switch (this.f92013i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 4:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(state, "it");
                break;
        }
        return rn1.a.y(state, null, null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u50.h0 h0Var = u50.h0.f120562a;
        switch (this.f92013i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            case 4:
                an1.l radioGroup = (an1.l) obj;
                Intrinsics.checkNotNullParameter(radioGroup, "radioGroup");
                return an1.l.e(radioGroup, null, null, h0Var, null, 0, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE);
            case 5:
                ((Boolean) obj).getClass();
                return Unit.f80348a;
            case 6:
                return b((rn1.a) obj);
            case 7:
                return b((rn1.a) obj);
            case 8:
                em1.d state = (em1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return em1.d.e(state, null, em1.e.ENABLED, null, null, new u50.f0(""), null, 0, null, false, 0, 1005);
            case 9:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            case 10:
                return b((rn1.a) obj);
            default:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ao1.b.e(it2, null, null, h0Var, null, yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }
}

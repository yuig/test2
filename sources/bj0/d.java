package bj0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22947i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f22948j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f22949k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, d0 d0Var, int i13) {
        super(0);
        this.f22947i = i13;
        this.f22948j = eVar;
        this.f22949k = d0Var;
    }

    public final b b() {
        int i13 = this.f22947i;
        d0 d0Var = this.f22949k;
        e eVar = this.f22948j;
        switch (i13) {
            case 2:
                Context context = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new b(context, d0Var, false);
            default:
                Context context2 = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new b(context2, d0Var, true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f22947i;
        d0 pinalytics = this.f22949k;
        e eVar = this.f22948j;
        switch (i13) {
            case 0:
                Context context = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                h hVar = new h(context, pinalytics);
                hVar.f22955b = hVar.b();
                hVar.f22956c = hVar.e();
                hVar.f22957d = hVar.a();
                hVar.addView(hVar.f22955b);
                hVar.addView(hVar.f22956c);
                hVar.addView(hVar.f22957d);
                break;
            case 1:
                Context context2 = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                break;
        }
        return b();
    }
}

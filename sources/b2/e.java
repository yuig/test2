package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21133i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21134j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f21135k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f21136l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, boolean z13, boolean z14) {
        super(1);
        this.f21136l = lVar;
        this.f21134j = z13;
        this.f21135k = z14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u50.f0 f0Var;
        int i13 = this.f21133i;
        boolean z13 = this.f21135k;
        Object obj2 = this.f21136l;
        boolean z14 = this.f21134j;
        switch (i13) {
            case 0:
                z3.y yVar = (z3.y) obj;
                long a13 = ((l) obj2).a();
                ((z3.j) yVar).e(d0.f21132c, new c0(z14 ? w1.v0.SelectionStart : w1.v0.SelectionEnd, a13, z13 ? b0.Left : b0.Right, com.bumptech.glide.c.y0(a13)));
                break;
            default:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                if (z14) {
                    String string = ((ea1.v0) obj2).getResources().getString(b52.c.disable_auto_publishing);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Intrinsics.checkNotNullParameter(string, "string");
                    f0Var = new u50.f0(string);
                } else {
                    String string2 = ((ea1.v0) obj2).getResources().getString(b52.c.auto_publishing_disabled);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Intrinsics.checkNotNullParameter(string2, "string");
                    f0Var = new u50.f0(string2);
                }
                String string3 = ((ea1.v0) obj2).getResources().getString(b52.c.disable_description);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Intrinsics.checkNotNullParameter(string3, "string");
                wm1.q middleItem = new wm1.q(f0Var, new u50.f0(string3), false, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.k endItem = new wm1.k(!z13, false, 6);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z13, ea1.v0 v0Var, boolean z14) {
        super(1);
        this.f21134j = z13;
        this.f21136l = v0Var;
        this.f21135k = z14;
    }
}

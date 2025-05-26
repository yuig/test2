package gg0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64917i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rg0.h f64918j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(rg0.h hVar, int i13) {
        super(1);
        this.f64917i = i13;
        this.f64918j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64917i;
        rg0.h hVar = this.f64918j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                rm1.q icon = hVar.f108024a;
                if (icon != null) {
                    standard.getClass();
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    standard.f108714a = icon;
                }
                rm1.i size = hVar.f108026c;
                if (size != null) {
                    standard.getClass();
                    Intrinsics.checkNotNullParameter(size, "size");
                    standard.f108715b = size;
                }
                break;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new d0(hVar, 0));
                rm1.c color = hVar.f108025b;
                if (color != null) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    bind.f108710b = color;
                }
                break;
        }
        return Unit.f80348a;
    }
}

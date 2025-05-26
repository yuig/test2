package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.api.model.dk0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f46125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i13, Function0 function0) {
        super(1);
        this.f46124i = i13;
        this.f46125j = function0;
    }

    public final void b(Throwable error) {
        int i13 = this.f46124i;
        Function0 function0 = this.f46125j;
        switch (i13) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 1:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 2:
            default:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(error, "error");
                function0.invoke();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String B;
        gd1.d dVar;
        int i13 = this.f46124i;
        Function0 boundView = this.f46125j;
        switch (i13) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                boundView.invoke();
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                b((Throwable) obj);
                break;
            case 6:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 7:
                dk0 upsellAction = (dk0) obj;
                Intrinsics.checkNotNullParameter(upsellAction, "upsellAction");
                Intrinsics.checkNotNullParameter(boundView, "boundView");
                if (upsellAction != null && (B = upsellAction.B()) != null && (dVar = (gd1.d) boundView.invoke()) != null) {
                    dVar.O5(B, new HashMap());
                }
                break;
            case 8:
                xl1.a it2 = (xl1.a) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        boundView.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        boundView.invoke();
                        break;
                }
                break;
            case 9:
                xl1.a it3 = (xl1.a) obj;
                switch (i13) {
                    case 8:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        boundView.invoke();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        boundView.invoke();
                        break;
                }
                break;
            case 10:
                Intrinsics.checkNotNullParameter((yb0.d) obj, "it");
                boundView.invoke();
                break;
            case 11:
                Intrinsics.checkNotNullParameter((oa2.i) obj, "it");
                boundView.invoke();
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}

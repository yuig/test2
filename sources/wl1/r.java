package wl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f130209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f130210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f130211d;

    public /* synthetic */ r(Function1 function1, Function1 function12, Function1 function13, int i13) {
        this.f130208a = i13;
        this.f130209b = function1;
        this.f130210c = function12;
        this.f130211d = function13;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f130208a;
        Function1 onSecondaryActionClick = this.f130211d;
        Function1 onPrimaryActionClick = this.f130210c;
        Function1 onDismiss = this.f130209b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
                Intrinsics.checkNotNullParameter(onPrimaryActionClick, "$onPrimaryActionClick");
                Intrinsics.checkNotNullParameter(onSecondaryActionClick, "$onSecondaryActionClick");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof q) {
                    q qVar = (q) event;
                    if (!(qVar instanceof n)) {
                        if (!(qVar instanceof o)) {
                            if (qVar instanceof p) {
                                onSecondaryActionClick.invoke(event);
                                break;
                            }
                        } else {
                            onPrimaryActionClick.invoke(event);
                            break;
                        }
                    } else {
                        onDismiss.invoke(event);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(onDismiss, "$onDismiss");
                Intrinsics.checkNotNullParameter(onPrimaryActionClick, "$onPrimaryActionClick");
                Intrinsics.checkNotNullParameter(onSecondaryActionClick, "$onSecondaryActionClick");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof dm1.n) {
                    dm1.n nVar = (dm1.n) event;
                    if (!(nVar instanceof dm1.k)) {
                        if (!(nVar instanceof dm1.l)) {
                            if (nVar instanceof dm1.m) {
                                onSecondaryActionClick.invoke(event);
                                break;
                            }
                        } else {
                            onPrimaryActionClick.invoke(event);
                            break;
                        }
                    } else {
                        onDismiss.invoke(event);
                        break;
                    }
                }
                break;
        }
    }
}

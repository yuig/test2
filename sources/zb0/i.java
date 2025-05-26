package zb0;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes5.dex */
public final class i implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ac0.a f141565a;

    public i(ac0.a alertForSEP) {
        Intrinsics.checkNotNullParameter(alertForSEP, "alertForSEP");
        this.f141565a = alertForSEP;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, k request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof j) {
            p alert = new p(((j) request).f141566a);
            g onConfirmClicked = new g(eventIntake, request, 0);
            g onCancelClicked = new g(eventIntake, request, 1);
            g onAlertDisplayed = new g(eventIntake, request, 2);
            h onAlertDismissed = new h(eventIntake, request);
            ac0.a aVar = this.f141565a;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(onConfirmClicked, "onConfirmClicked");
            Intrinsics.checkNotNullParameter(onCancelClicked, "onCancelClicked");
            Intrinsics.checkNotNullParameter(onAlertDisplayed, "onAlertDisplayed");
            Intrinsics.checkNotNullParameter(onAlertDismissed, "onAlertDismissed");
            Intrinsics.checkNotNullParameter(onConfirmClicked, "<set-?>");
            alert.f141575a = onConfirmClicked;
            Intrinsics.checkNotNullParameter(onCancelClicked, "<set-?>");
            alert.f141576b = onCancelClicked;
            Intrinsics.checkNotNullParameter(onAlertDisplayed, "<set-?>");
            alert.f141577c = onAlertDisplayed;
            Intrinsics.checkNotNullParameter(onAlertDismissed, "<set-?>");
            alert.f141578d = onAlertDismissed;
            aVar.f1905a.d(alert);
        }
    }
}

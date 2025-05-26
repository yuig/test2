package ch0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f27733i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dm1.c it = (dm1.c) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        fm1.c visibility = fm1.c.GONE;
        rn1.a titleText = it.f55355a;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        rn1.a messageText = it.f55356b;
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        cm1.d buttonGroup = it.f55357c;
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        rm1.d workflowStatusIcon = it.f55358d;
        Intrinsics.checkNotNullParameter(workflowStatusIcon, "workflowStatusIcon");
        om1.c dismissIconButton = it.f55359e;
        Intrinsics.checkNotNullParameter(dismissIconButton, "dismissIconButton");
        dm1.d variant = it.f55360f;
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new dm1.c(titleText, messageText, buttonGroup, workflowStatusIcon, dismissIconButton, variant, it.f55361g, visibility);
    }
}

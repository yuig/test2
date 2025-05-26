package em1;

import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestaltCheckBox f59633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f59634c;

    public /* synthetic */ l(GestaltCheckBox gestaltCheckBox, Function1 function1, int i13) {
        this.f59632a = i13;
        this.f59633b = gestaltCheckBox;
        this.f59634c = function1;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        b bVar;
        int i13 = this.f59632a;
        Function1 invokeAfterStateMutation = this.f59634c;
        GestaltCheckBox this_bindDefaultBinaryCheckboxEventHandler = this.f59633b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this_bindDefaultBinaryCheckboxEventHandler, "$this_bindDefaultBinaryCheckboxEventHandler");
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "$invokeAfterStateMutation");
                Intrinsics.checkNotNullParameter(event, "event");
                c cVar = (c) event;
                b Z = c0.d.Z(cVar.f59597c);
                this_bindDefaultBinaryCheckboxEventHandler.L(new n(0, Z));
                invokeAfterStateMutation.invoke(c.k(cVar, Z));
                return;
            default:
                Intrinsics.checkNotNullParameter(this_bindDefaultBinaryCheckboxEventHandler, "$this_bindDefaultTernaryCheckboxEventHandler");
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "$invokeAfterStateMutation");
                Intrinsics.checkNotNullParameter(event, "event");
                c cVar2 = (c) event;
                b currentCheckboxState = cVar2.f59597c;
                Intrinsics.checkNotNullParameter(currentCheckboxState, "currentCheckboxState");
                int i14 = m.f59635a[currentCheckboxState.ordinal()];
                if (i14 == 1) {
                    bVar = b.INDETERMINATE;
                } else if (i14 == 2) {
                    bVar = b.CHECKED;
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = b.UNCHECKED;
                }
                this_bindDefaultBinaryCheckboxEventHandler.L(new n(1, bVar));
                invokeAfterStateMutation.invoke(c.k(cVar2, bVar));
                return;
        }
    }
}

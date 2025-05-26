package yb1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class o implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f138570b;

    public /* synthetic */ o(p pVar, int i13) {
        this.f138569a = i13;
        this.f138570b = pVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        List split$default;
        boolean z13 = false;
        int i13 = this.f138569a;
        p this$0 = this.f138570b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.a) {
                    boolean d2 = Intrinsics.d(String.valueOf(((xn1.a) event).f135436c), this$0.f138574d);
                    int i14 = 25;
                    GestaltButton gestaltButton = this$0.f138573c;
                    if (!d2) {
                        gestaltButton.d(new u81.h(true, i14));
                        break;
                    } else {
                        gestaltButton.d(new u81.h(z13, i14));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                va1.t tVar = this$0.f138575e;
                GestaltTextField gestaltTextField = this$0.f138572b;
                if (tVar != null) {
                    split$default = StringsKt__StringsKt.split$default(gestaltTextField.B0(), new String[]{","}, false, 0, 6, null);
                    List list = split$default;
                    ArrayList arrayList = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt.i0((String) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((String) next).length() > 0) {
                            arrayList2.add(next);
                        }
                    }
                    this$0.f138571a.invoke(tVar, CollectionsKt.Z(arrayList2, ", ", null, null, 0, null, null, 62));
                }
                gestaltTextField.clearFocus();
                break;
        }
    }
}

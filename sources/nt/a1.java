package nt;

import android.view.View;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a1 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f91979c;

    /* renamed from: d, reason: collision with root package name */
    public final List f91980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1 questionId, View view) {
        super(questionId, view);
        ArrayList gestaltCheckBoxList = new ArrayList();
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(gestaltCheckBoxList, "gestaltCheckBoxList");
        this.f91979c = false;
        this.f91980d = gestaltCheckBoxList;
    }

    @Override // nt.h1
    public final String a() {
        List list = this.f91980d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) obj;
            if (c0.d.a2(gestaltCheckBox)) {
                Intrinsics.g(gestaltCheckBox.a0().f59601d, "null cannot be cast to non-null type com.pinterest.architecture.primitives.StringLiteral");
                if (!kotlin.text.z.j(((u50.f0) r4).f120559a)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u50.i0 i0Var = ((GestaltCheckBox) it.next()).a0().f59601d;
            Intrinsics.g(i0Var, "null cannot be cast to non-null type com.pinterest.architecture.primitives.StringLiteral");
            String checkBoxText = ((u50.f0) i0Var).f120559a.toString();
            Intrinsics.checkNotNullParameter(checkBoxText, "checkBoxText");
            arrayList2.add("\"" + kotlin.text.z.n(checkBoxText, "\"", "\"\"") + "\"");
        }
        return CollectionsKt.Z(arrayList2, ",", null, null, 0, null, null, 62);
    }

    @Override // nt.h1
    public final void b(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
    }
}

package up0;

import android.text.Editable;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTextField f122976a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122977b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f122978c;

    public m(GestaltTextField inputText, Function0 deleteHandler) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(deleteHandler, "deleteHandler");
        this.f122976a = inputText;
        this.f122977b = deleteHandler;
        this.f122978c = new ArrayList();
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        Editable editable;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z13 = event instanceof xn1.b;
        ArrayList arrayList = this.f122978c;
        if (!z13) {
            if (!(event instanceof xn1.a) || (editable = ((xn1.a) event).f135436c) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (editable.length() != 0) {
                    int min = Math.min(editable.length(), cVar.f122944c);
                    int length = editable.length();
                    int i13 = cVar.f122943b;
                    if (i13 < length) {
                        if (Intrinsics.d(editable.subSequence(i13, min).toString(), cVar.f122942a)) {
                            editable.setSpan(cVar.f122945d, i13, cVar.f122944c, 33);
                        } else {
                            editable.delete(i13, min);
                            this.f122977b.invoke();
                        }
                    }
                }
            }
            arrayList.clear();
            return;
        }
        xn1.b bVar = (xn1.b) event;
        CharSequence charSequence = bVar.f135438c;
        int i14 = bVar.f135439d;
        int i15 = bVar.f135440e;
        int i16 = bVar.f135441f;
        int i17 = i15 + i14;
        Editable z03 = this.f122976a.z0();
        if (z03 != null) {
            me0.a[] aVarArr = (me0.a[]) z03.getSpans(i14, i17, me0.a.class);
            Intrinsics.f(aVarArr);
            for (me0.a aVar : aVarArr) {
                int spanStart = z03.getSpanStart(aVar);
                int spanEnd = z03.getSpanEnd(aVar);
                if (spanStart < i17 && spanEnd > i14) {
                    String obj = z03.subSequence(spanStart, spanEnd).toString();
                    Intrinsics.f(aVar);
                    arrayList.add(new c(obj, spanStart, spanEnd, aVar));
                    z03.removeSpan(aVar);
                }
            }
        }
    }

    public /* synthetic */ m(GestaltTextField gestaltTextField) {
        this(gestaltTextField, e.f122947k);
    }
}

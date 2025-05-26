package s11;

import aq.d;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import ry1.f;
import wt1.e0;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final q11.c f110591h;

    /* renamed from: i, reason: collision with root package name */
    public final v f110592i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f110593j;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0386  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(aq.j r48, q11.c r49, uk1.d r50, yk1.v r51, lh0.q2 r52) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.c.<init>(aq.j, q11.c, uk1.d, yk1.v, lh0.q2):void");
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return ((a) d().get(i13)).f110576b.getViewType();
    }

    public final void u(List list) {
        HashMap hashMap = this.f110593j;
        hashMap.clear();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            hashMap.put(((a) obj).f110575a, Integer.valueOf(i13));
            i13 = i14;
        }
    }

    public final void v(d editablePinField, Integer num, String value) {
        a aVar;
        Intrinsics.checkNotNullParameter(editablePinField, "editablePinField");
        Intrinsics.checkNotNullParameter(value, "value");
        Integer num2 = (Integer) this.f110593j.get(editablePinField);
        if (num2 == null || (aVar = (a) getItem(num2.intValue())) == null) {
            return;
        }
        u1(num2.intValue(), new a(aVar.f110575a, aVar.f110576b, aVar.f110577c, aVar.f110578d, num, null, null, value, aVar.f110583i, aVar.f110584j, aVar.f110585k, aVar.f110586l, aVar.f110587m, null, null, 24672));
    }

    public final void w(String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        d editablePinField = d.SECTION_ID;
        Intrinsics.checkNotNullParameter(editablePinField, "editablePinField");
        HashMap hashMap = this.f110593j;
        if (hashMap.containsKey(editablePinField)) {
            x(editablePinField, sectionName);
            return;
        }
        Integer num = (Integer) hashMap.get(d.BOARD_ID);
        if (num != null) {
            g(num.intValue() + 1, new a(editablePinField, q11.b.VIEW_TYPE_ACTIONABLE_FIELD, Integer.valueOf(f.board_section_fully_named), null, null, null, null, sectionName, null, null, null, this.f110591h, null, null, null, 30584));
        }
        u(d());
    }

    public final void x(d editablePinField, String value) {
        a aVar;
        Intrinsics.checkNotNullParameter(editablePinField, "editablePinField");
        Intrinsics.checkNotNullParameter(value, "value");
        Integer num = (Integer) this.f110593j.get(editablePinField);
        if (num == null || (aVar = (a) getItem(num.intValue())) == null) {
            return;
        }
        u1(num.intValue(), new a(aVar.f110575a, aVar.f110576b, aVar.f110577c, aVar.f110578d, null, null, null, value, aVar.f110583i, aVar.f110584j, aVar.f110585k, aVar.f110586l, aVar.f110587m, null, null, 24688));
    }
}

package ho;

import a7.o0;
import a7.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f69675a;

    /* renamed from: b, reason: collision with root package name */
    public List f69676b;

    public /* synthetic */ i(int i13, List list) {
        this.f69675a = i13;
        this.f69676b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v9.i0 a(int r7, h0.i r8) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ho.i.a(int, h0.i):v9.i0");
    }

    public List b(h0.i iVar) {
        String str;
        int i13;
        List list;
        boolean c13 = c(32);
        List list2 = this.f69676b;
        if (c13) {
            return list2;
        }
        d0 d0Var = new d0((byte[]) iVar.f66410e);
        while (d0Var.a() > 0) {
            int y13 = d0Var.y();
            int y14 = d0Var.f53807b + d0Var.y();
            if (y13 == 134) {
                ArrayList arrayList = new ArrayList();
                int y15 = d0Var.y() & 31;
                for (int i14 = 0; i14 < y15; i14++) {
                    String w13 = d0Var.w(3, StandardCharsets.UTF_8);
                    int y16 = d0Var.y();
                    boolean z13 = (y16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
                    if (z13) {
                        i13 = y16 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i13 = 1;
                    }
                    byte y17 = (byte) d0Var.y();
                    d0Var.L(1);
                    if (z13) {
                        boolean z14 = (y17 & 64) != 0;
                        byte[] bArr = d7.f.f53817a;
                        list = Collections.singletonList(z14 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    q qVar = new q();
                    qVar.f1181n = o0.r(str);
                    qVar.f1171d = w13;
                    qVar.I = i13;
                    qVar.f1184q = list;
                    arrayList.add(new androidx.media3.common.b(qVar));
                }
                list2 = arrayList;
            }
            d0Var.K(y14);
        }
        return list2;
    }

    public boolean c(int i13) {
        return (i13 & this.f69675a) != 0;
    }

    public i() {
        this.f69676b = new ArrayList();
        this.f69675a = 0;
    }
}

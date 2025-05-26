package b22;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import n60.o;

/* loaded from: classes2.dex */
public final class e implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21291a;

    /* renamed from: b, reason: collision with root package name */
    public final d12.i f21292b;

    public e(d12.i repoBatcher, int i13) {
        this.f21291a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(repoBatcher, "repoBatcher");
            this.f21292b = repoBatcher;
        } else {
            Intrinsics.checkNotNullParameter(repoBatcher, "repoBatcher");
            this.f21292b = repoBatcher;
        }
    }

    @Override // rz.d
    public final Object b(vd0.c cVar) {
        String str;
        int i13 = this.f21291a;
        d12.i iVar = this.f21292b;
        int i14 = 0;
        switch (i13) {
            case 0:
                vd0.a o13 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList = new ArrayList();
                int d2 = o13.d();
                while (i14 < d2) {
                    vd0.c j13 = o13.j(i14);
                    String d13 = j13.d("type");
                    if (d13 != null) {
                        str = d13.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    } else {
                        str = null;
                    }
                    if (Intrinsics.d(str, "pin")) {
                        Object e13 = vd0.c.f125622b.e(j13.f125623a, f30.class);
                        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                        arrayList.add((f30) e13);
                    }
                    i14++;
                }
                String o14 = cVar.o("bookmark", "");
                Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                ow owVar = new ow();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    owVar.a((f30) it.next());
                }
                d12.i.a(iVar, owVar);
                return new d(arrayList, o14);
            default:
                vd0.a o15 = o.o(cVar, "pinterestJsonObject", "data", "optJsonArray(...)");
                ArrayList arrayList2 = new ArrayList();
                int d14 = o15.d();
                while (i14 < d14) {
                    Object e14 = vd0.c.f125622b.e(o15.j(i14).f125623a, wy0.class);
                    Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.User");
                    arrayList2.add((wy0) e14);
                    i14++;
                }
                String o16 = cVar.o("bookmark", "");
                Intrinsics.checkNotNullExpressionValue(o16, "optString(...)");
                ow owVar2 = new ow();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    owVar2.a((wy0) it2.next());
                }
                d12.i.a(iVar, owVar2);
                return new k22.i(arrayList2, o16);
        }
    }
}

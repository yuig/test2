package iw0;

import com.pinterest.api.model.f30;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nk1.h;
import tl1.i;
import wt1.c0;
import wt1.o;
import wt1.p;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73748i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f73749j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f73748i = i13;
        this.f73749j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        int i13 = this.f73748i;
        c cVar = this.f73749j;
        switch (i13) {
            case 0:
                h hVar = (h) obj;
                Intrinsics.f(hVar);
                cVar.x3(hVar);
                break;
            default:
                c0 c0Var = (c0) obj;
                if (c0Var instanceof p) {
                    i iVar = c0Var.f131096b;
                    o oVar = iVar instanceof o ? (o) iVar : null;
                    List list = oVar != null ? oVar.f131124b : null;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (obj2 instanceof f30) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && (!arrayList.isEmpty()) && cVar.f73754a) {
                        HashMap hashMap = new HashMap();
                        String uid = ((f30) arrayList.get(0)).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        hashMap.put("first_pin_id", uid);
                        cVar.getPinalytics().g(f1.SEO_LANDING_PAGE_VIEW, null, hashMap, false);
                    }
                }
                break;
        }
        return Unit.f80348a;
    }
}

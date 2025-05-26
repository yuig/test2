package d12;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.v10;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f53632j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f53633k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, List list, int i13) {
        super(0);
        this.f53631i = i13;
        this.f53632j = hVar;
        this.f53633k = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f53631i) {
            case 0:
                m126invoke();
                break;
            default:
                m126invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m126invoke() {
        switch (this.f53631i) {
            case 0:
                gw gwVar = this.f53632j.f53634a;
                List list = this.f53633k;
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Partner>");
                List t13 = dl2.b.t(list);
                gwVar.getClass();
                if (t13 == null || t13.size() == 0) {
                    return;
                }
                Iterator it = t13.iterator();
                while (it.hasNext()) {
                    String uid = ((v10) it.next()).getUid();
                    if (uid == null) {
                        LruCache lruCache = ew.f37357a;
                    } else {
                        LruCache lruCache2 = ew.f37366j;
                        synchronized (lruCache2) {
                            lruCache2.remove(uid);
                        }
                    }
                }
                return;
            default:
                gw gwVar2 = this.f53632j.f53634a;
                List list2 = this.f53633k;
                Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.Message>");
                List t14 = dl2.b.t(list2);
                gwVar2.getClass();
                if (t14 != null) {
                    Iterator it2 = t14.iterator();
                    while (it2.hasNext()) {
                        ew.k((mv) it2.next());
                    }
                    return;
                }
                return;
        }
    }
}

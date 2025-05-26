package d12;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.vh;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53628i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f53629j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f53630k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, List list) {
        super(0);
        this.f53630k = hVar;
        this.f53629j = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f53628i) {
            case 0:
                m125invoke();
                break;
            default:
                m125invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, h hVar) {
        super(0);
        this.f53629j = list;
        this.f53630k = hVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m125invoke() {
        switch (this.f53628i) {
            case 0:
                gw gwVar = this.f53630k.f53634a;
                List list = this.f53629j;
                Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.pinterest.api.model.DynamicStory>");
                List<vh> t13 = dl2.b.t(list);
                gwVar.getClass();
                if (t13 == null) {
                    return;
                }
                for (vh vhVar : t13) {
                    LruCache lruCache = ew.f37357a;
                    if (vhVar != null && vhVar.getUid() != null) {
                        LruCache lruCache2 = ew.f37362f;
                        synchronized (lruCache2) {
                            lruCache2.put(vhVar.getUid(), vhVar);
                        }
                    }
                }
                return;
            default:
                List<f3> list2 = this.f53629j;
                Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<com.pinterest.api.model.AggregatedPinData>");
                h hVar = this.f53630k;
                for (f3 f3Var : list2) {
                    hVar.f53634a.getClass();
                    if (f3Var != null) {
                        String uid = f3Var.getUid();
                        if (uid == null) {
                            LruCache lruCache3 = ew.f37357a;
                        } else {
                            LruCache lruCache4 = ew.f37365i;
                            synchronized (lruCache4) {
                                lruCache4.remove(uid);
                            }
                        }
                    }
                }
                return;
        }
    }
}

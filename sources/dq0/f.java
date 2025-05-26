package dq0;

import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56084i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f56085j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f56086k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str) {
        super(1);
        this.f56085j = hVar;
        this.f56086k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56084i;
        String str = this.f56086k;
        h hVar = this.f56085j;
        switch (i13) {
            case 0:
                wy0 wy0Var = (wy0) obj;
                oq0.a aVar = (oq0.a) oq0.b.f97216b.get(str);
                if (aVar != null) {
                    hVar.f56108m.add(new Pair(wy0Var, aVar));
                }
                break;
            default:
                Map K = hVar.f56096a.K();
                nq0.a aVar2 = null;
                HashMap hashMap = K != null ? new HashMap(K) : null;
                if (hashMap != null) {
                    String uid = hVar.f56098c.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    hashMap.put(uid, str);
                }
                if (hashMap != null) {
                    String uid2 = hVar.f56096a.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    aVar2 = new nq0.a(uid2, hashMap);
                }
                u.f85943a.d(aVar2);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, h hVar) {
        super(1);
        this.f56086k = str;
        this.f56085j = hVar;
    }
}

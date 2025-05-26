package tw0;

import com.pinterest.api.model.tv;
import com.pinterest.api.model.vv;
import fk2.f0;
import java.util.Map;
import jk2.h0;
import jk2.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vv f119605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f119606j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f119607k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vv vvVar, g gVar, long j13) {
        super(1);
        this.f119605i = vvVar;
        this.f119606j = gVar;
        this.f119607k = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        vv.a endpoint = (vv.a) obj;
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        String id3 = endpoint.getId();
        HttpUrl httpUrl = null;
        tv tvVar = id3 != null ? new tv(0, id3, null, 5, null) : null;
        Map ids = this.f119605i.getIds();
        if (ids != null && (str = (String) ids.get(endpoint.getId())) != null) {
            HttpUrl.f95629k.getClass();
            httpUrl = HttpUrl.Companion.f(str);
        }
        return (tvVar == null || httpUrl == null || endpoint.getAttempts() <= 0) ? h0.f76488a : new f0(new n0(new ol1.d(new uv0.a(6, endpoint, httpUrl), 2), new wv0.a(6, new b(this.f119606j, this.f119607k)), false, 2), tvVar, new ep.g(15, c.f119604i)).u();
    }
}

package zx;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nm.r;
import nm.s;
import nm.u;
import qm.e0;

/* loaded from: classes3.dex */
public final class m implements r {
    @Override // nm.r
    public final Object a(s json, Type typeOfT, ll.j context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        l lVar = (l) new nm.o().e(json, l.class);
        u i13 = json.i();
        TypeToken<List<? extends b>> typeToken = new TypeToken<List<? extends b>>() { // from class: com.pinterest.analytics.filter.model.FilterParamsDeserializer$deserialize$claimedAccountOptionsType$1
        };
        s v13 = i13.v("claimedAccountOptions");
        nm.o oVar = ((e0) context.f83754b).f104151c;
        oVar.getClass();
        List list = (List) (v13 == null ? null : oVar.f(new qm.m(v13), new TypeToken(typeToken.f33847b)));
        Intrinsics.f(lVar);
        Intrinsics.f(list);
        return l.b(lVar, null, list, 991);
    }
}

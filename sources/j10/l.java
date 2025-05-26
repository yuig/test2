package j10;

import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.wy0;
import java.util.List;

/* loaded from: classes3.dex */
public final class l extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserDeserializer f74377e;

    public l(List<wy0> list, UserDeserializer userDeserializer) {
        this.f74376d = list;
        this.f74377e = userDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (wy0 wy0Var : this.f74376d) {
            o10.e a13 = cVar.a(wy0Var);
            if (a13 != null) {
                a13.a(wy0Var, owVar);
            }
        }
        d12.i.a(this.f74377e.f36815d, owVar);
    }
}

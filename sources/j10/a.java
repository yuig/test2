package j10;

import com.pinterest.api.model.deserializer.BoardDeserializer;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.v7;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BoardDeserializer f74344e;

    public a(List<? extends v7> list, BoardDeserializer boardDeserializer) {
        this.f74343d = list;
        this.f74344e = boardDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (v7 v7Var : this.f74343d) {
            o10.e a13 = cVar.a(v7Var);
            if (a13 != null) {
                a13.a(v7Var, owVar);
            }
        }
        d12.i.a(this.f74344e.f36743c, owVar);
    }
}

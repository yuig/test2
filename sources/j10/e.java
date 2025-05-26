package j10;

import com.pinterest.api.model.deserializer.GenericModelDeserializer;
import com.pinterest.api.model.ow;
import dl1.s;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GenericModelDeserializer f74352e;

    public e(List<s> list, GenericModelDeserializer genericModelDeserializer) {
        this.f74351d = list;
        this.f74352e = genericModelDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (s sVar : this.f74351d) {
            o10.e a13 = cVar.a(sVar);
            if (a13 != null) {
                a13.a(sVar, owVar);
            }
        }
        d12.i.a(this.f74352e.G, owVar);
    }
}

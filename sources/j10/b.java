package j10;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.deserializer.BoardSectionDeserializer;
import com.pinterest.api.model.ow;
import java.util.List;

/* loaded from: classes3.dex */
public final class b extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BoardSectionDeserializer f74346e;

    public b(List<? extends ba> list, BoardSectionDeserializer boardSectionDeserializer) {
        this.f74345d = list;
        this.f74346e = boardSectionDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (ba baVar : this.f74345d) {
            o10.e a13 = cVar.a(baVar);
            if (a13 != null) {
                a13.a(baVar, owVar);
            }
        }
        d12.i.a(this.f74346e.f36750b, owVar);
    }
}

package j10;

import com.pinterest.api.model.deserializer.ConversationDeserializer;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.ue;
import java.util.List;

/* loaded from: classes3.dex */
public final class c extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConversationDeserializer f74348e;

    public c(List<? extends ue> list, ConversationDeserializer conversationDeserializer) {
        this.f74347d = list;
        this.f74348e = conversationDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (ue ueVar : this.f74347d) {
            o10.e a13 = cVar.a(ueVar);
            if (a13 != null) {
                a13.a(ueVar, owVar);
            }
        }
        d12.i.a(this.f74348e.f36756c, owVar);
    }
}

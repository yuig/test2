package j10;

import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.ow;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f74349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConversationMessageDeserializer f74350e;

    public d(List<? extends mv> list, ConversationMessageDeserializer conversationMessageDeserializer) {
        this.f74349d = list;
        this.f74350e = conversationMessageDeserializer;
    }

    @Override // hb0.c
    public final void c() {
        o10.c cVar = o10.c.f92770a;
        ow owVar = new ow();
        for (mv mvVar : this.f74349d) {
            o10.e a13 = cVar.a(mvVar);
            if (a13 != null) {
                a13.a(mvVar, owVar);
            }
        }
        d12.i.a(this.f74350e.f36760c, owVar);
    }
}

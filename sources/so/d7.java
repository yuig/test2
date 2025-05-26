package so;

import android.content.Context;
import android.content.res.Resources;
import com.pinterest.api.model.deserializer.ConversationMessageDeserializer;

/* loaded from: classes3.dex */
public final class d7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113385a;

    public d7(r8 r8Var) {
        this.f113385a = r8Var;
    }

    public final dq0.p a(String str, Resources resources, lq0.b1 b1Var, q12.b bVar, Context context, r12.a aVar) {
        r8 r8Var = this.f113385a;
        uk1.e eVar = (uk1.e) r8Var.f114090a.f113702ga.get();
        oa oaVar = r8Var.f114090a;
        uj2.q qVar = (uj2.q) oaVar.f113947u9.get();
        m60.w wVar = (m60.w) oaVar.f113885r0.get();
        b60.b bVar2 = (b60.b) oaVar.f113850p0.get();
        ConversationMessageDeserializer conversationMessageDeserializer = (ConversationMessageDeserializer) oaVar.f113952ue.get();
        s8 s8Var = r8Var.f114091b;
        return new dq0.p(str, resources, b1Var, bVar, context, aVar, eVar, qVar, wVar, bVar2, conversationMessageDeserializer, s8Var.q5(), s8Var.C5(), (oc.c) oaVar.f113907s5.get(), (i92.k) oaVar.f113921t1.get(), (nx.d1) oaVar.f113730i2.get(), (kq0.d) oaVar.Fe.get());
    }
}

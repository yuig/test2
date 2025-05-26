package r11;

import aq.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import q11.c;
import y11.f;

/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s11.a f106023a;

    public a(s11.a aVar) {
        this.f106023a = aVar;
    }

    @Override // y11.f
    public final void m2(String description, ArrayList userMentionTags) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
        c cVar = this.f106023a.f110586l;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(userMentionTags, "userMentionTags");
            LinkedHashMap linkedHashMap = ((t11.f) cVar).f115812l;
            linkedHashMap.put(d.DESCRIPTION, description);
            d dVar = d.USER_MENTION_TAGS;
            String k13 = vd0.c.f125622b.k(userMentionTags);
            Intrinsics.checkNotNullExpressionValue(k13, "toJson(...)");
            linkedHashMap.put(dVar, k13);
        }
    }
}

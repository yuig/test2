package i61;

import c71.b0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f71626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, b0 b0Var, String str2, f0 pinalyticsFactory) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f71626g = linkedHashMap;
        if (str != null) {
            linkedHashMap.put("story_id", str);
            linkedHashMap.put("article_id", str);
        }
        if (b0Var != null) {
            linkedHashMap.put("query", b0Var.f26730b);
            String str3 = b0Var.W;
            if (str3 != null) {
                linkedHashMap.put("pin_id", str3);
            }
            String str4 = b0Var.X;
            if (str4 != null) {
                linkedHashMap.put("image_signature", str4);
            }
            String str5 = b0Var.f26738j;
            if (str5 != null) {
                linkedHashMap.put("today_article_id", str5);
            }
        }
        if (str2 != null) {
            linkedHashMap.put("insight_id", str2);
            linkedHashMap.put("referrer", "style_summary");
        }
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        f63135d0.putAll(this.f71626g);
        return f63135d0;
    }
}

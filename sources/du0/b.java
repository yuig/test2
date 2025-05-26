package du0;

import ag1.h;
import ag1.i;
import ag1.k;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    public final h f56271g;

    /* renamed from: h, reason: collision with root package name */
    public final d4 f56272h;

    /* renamed from: i, reason: collision with root package name */
    public final String f56273i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f0 pinalyticsFactory, h sessionDataManager, d4 viewType, String str, boolean z13) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(sessionDataManager, "sessionDataManager");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f56271g = sessionDataManager;
        this.f56272h = viewType;
        this.f56273i = str;
        this.f56274j = z13;
    }

    @Override // uk1.d
    public final a4 i() {
        return a4.STORY_PIN_CREATE;
    }

    @Override // uk1.d
    public final d4 j() {
        return this.f56272h;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        k kVar = this.f56271g.f15145a;
        f63135d0.put("idea_pin_creation_session_id", kVar.f15146a);
        String str = this.f56273i;
        if (str != null && !z.j(str)) {
            f63135d0.put("entry_type", str);
        }
        f63135d0.put("is_draft", String.valueOf(this.f56274j));
        i iVar = kVar.f15151f;
        if (iVar != null) {
            f63135d0.put("idea_pin_media_type", iVar.getValue());
        }
        return f63135d0;
    }
}

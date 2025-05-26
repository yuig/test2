package sw0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final pw0.x f115522g;

    /* renamed from: h, reason: collision with root package name */
    public final ag1.h f115523h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f115524i;

    /* renamed from: j, reason: collision with root package name */
    public final String f115525j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(nx.f0 pinalyticsFactory, pw0.x type, ag1.h ideaPinSessionDataManager, boolean z13, String str) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        this.f115522g = type;
        this.f115523h = ideaPinSessionDataManager;
        this.f115524i = z13;
        this.f115525j = str;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        ag1.k kVar = this.f115523h.f15145a;
        f63135d0.put("idea_pin_creation_session_id", kVar.f15146a);
        f63135d0.put("is_draft", String.valueOf(this.f115524i));
        String str = this.f115525j;
        if (str != null && !kotlin.text.z.j(str)) {
            f63135d0.put("entry_type", str);
        }
        int i13 = l0.f115516a[this.f115522g.ordinal()];
        if (i13 == 1) {
            f63135d0.put("ipc_asset_picker_type", h.ADD_CLIP.getValue());
        } else if (i13 == 2) {
            f63135d0.put("ipc_asset_picker_type", h.ADD_PAGE.getValue());
        }
        ag1.i iVar = kVar.f15151f;
        if (iVar != null) {
            f63135d0.put("idea_pin_media_type", iVar.getValue());
        }
        return f63135d0;
    }
}

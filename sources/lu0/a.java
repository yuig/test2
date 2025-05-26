package lu0;

import android.content.Context;
import h32.d4;
import java.util.HashMap;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.f0;
import uk1.d;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: g, reason: collision with root package name */
    public final Context f84967g;

    /* renamed from: h, reason: collision with root package name */
    public final de0.d f84968h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84969i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84970j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 pinalyticsFactory, Context context, de0.d draftDataProvider, String sessionId, String str) {
        super(pinalyticsFactory);
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f84967g = context;
        this.f84968h = draftDataProvider;
        this.f84969i = sessionId;
        this.f84970j = str;
    }

    @Override // uk1.d
    public final d4 j() {
        return d4.STORY_PIN_MULTI_DRAFTS;
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new HashMap();
        }
        f63135d0.put("idea_pin_creation_session_id", this.f84969i);
        String str = this.f84970j;
        if (str != null && !z.j(str)) {
            f63135d0.put("entry_type", str);
        }
        de0.d dVar = this.f84968h;
        Context context = this.f84967g;
        f63135d0.put("android_room_database_size", String.valueOf(dVar.a(context)));
        f63135d0.put("idea_pin_adjusted_images_folder_size", String.valueOf(s0.F(context)));
        return f63135d0;
    }
}

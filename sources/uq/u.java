package uq;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.pinterest.activity.pin.view.unifiedcomments.CommentsQuickReplies;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import h32.f1;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.j0;
import rl1.z;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123029c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123030d;

    public /* synthetic */ u(Object obj, Object obj2, int i13, int i14) {
        this.f123027a = i14;
        this.f123029c = obj;
        this.f123030d = obj2;
        this.f123028b = i13;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f123027a;
        int i14 = this.f123028b;
        Object obj = this.f123030d;
        Object obj2 = this.f123029c;
        switch (i13) {
            case 0:
                CommentsQuickReplies this$0 = (CommentsQuickReplies) obj2;
                String replyText = (String) obj;
                int i15 = CommentsQuickReplies.f35113k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(replyText, "$replyText");
                Intrinsics.checkNotNullParameter(it, "it");
                j0 j0Var = this$0.f35117g;
                if (j0Var == null) {
                    Intrinsics.r("pinalytics");
                    throw null;
                }
                f1 f1Var = f1.COMMENT_HELPER_SELECTED;
                String str = this$0.f35118h;
                if (str == null) {
                    Intrinsics.r("pinUid");
                    throw null;
                }
                HashMap o13 = bs1.c.o(new Pair[0]);
                o13.put("comment_helper_carousel_index", String.valueOf(i14));
                Unit unit = Unit.f80348a;
                j0Var.g(f1Var, str, o13, false);
                this$0.f35115e.invoke(replyText);
                return;
            case 1:
                vs.a viewHolder = (vs.a) obj2;
                vs.b this$02 = (vs.b) obj;
                Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    Context context = viewHolder.f19717a.getContext();
                    ClipData newPlainText = ClipData.newPlainText((CharSequence) ((Pair) ((List) this$02.f126470e).get(i14)).f80346a, (CharSequence) ((Pair) ((List) this$02.f126470e).get(i14)).f80347b);
                    Object systemService = context.getSystemService("clipboard");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
                    ((i92.k) this$02.f126471f).m(bs1.c.d2(context, x0.row_copied));
                    return;
                }
                return;
            default:
                List avatarInfo = (List) obj2;
                GestaltAvatarGroup this$03 = (GestaltAvatarGroup) obj;
                al1.n nVar = GestaltAvatarGroup.f49251e;
                Intrinsics.checkNotNullParameter(avatarInfo, "$avatarInfo");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if ((it instanceof rl1.t) || (it instanceof z)) {
                    sl1.m mVar = new sl1.m(this$03.getId(), ((sl1.e) avatarInfo.get(i14)).f113171a, ((sl1.e) avatarInfo.get(i14)).f113172b, avatarInfo);
                    gm1.a aVar = (gm1.a) this$03.f49255a.f33804b;
                    if (aVar != null) {
                        aVar.h3(mVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u(List list, int i13, GestaltAvatarGroup gestaltAvatarGroup) {
        this.f123027a = 2;
        this.f123029c = list;
        this.f123028b = i13;
        this.f123030d = gestaltAvatarGroup;
    }
}

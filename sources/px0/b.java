package px0;

import com.pinterest.api.model.AggregatedCommentFeed;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.y2;
import com.pinterest.api.model.z2;
import com.pinterest.api.model.zy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e82.z;
import h32.f1;
import h32.u0;
import i92.k;
import java.util.HashMap;
import java.util.List;
import k11.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import oh1.m;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f101583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f101584e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f101580a = i13;
        this.f101581b = obj;
        this.f101582c = obj2;
        this.f101583d = obj3;
        this.f101584e = obj4;
    }

    @Override // ak2.a
    public final void run() {
        Object cVar;
        int i13 = this.f101580a;
        int i14 = 0;
        Object obj = this.f101584e;
        Object obj2 = this.f101583d;
        Object obj3 = this.f101582c;
        Object obj4 = this.f101581b;
        switch (i13) {
            case 0:
                Integer num = (Integer) obj4;
                j this$0 = (j) obj3;
                String itemId = (String) obj2;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(itemId, "$itemId");
                if (num != null) {
                    this$0.f101622g.c(new jq0.a(num.intValue(), f.f101598i, new g((Object) this$0, (Object) itemId, (Object) str, i14), 1));
                    return;
                }
                return;
            case 1:
                f30 repinPin = (f30) obj4;
                d0 pinalytics = (d0) obj3;
                p this$02 = (p) obj2;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(repinPin, "$repinPin");
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                f1 f1Var = f1.PIN_DELETE;
                String uid = repinPin.getUid();
                u0 u0Var = u0.PIN_REPIN_BUTTON;
                HashMap hashMap = new HashMap();
                v7 D3 = repinPin.D3();
                String uid2 = D3 != null ? D3.getUid() : null;
                if (uid2 == null) {
                    uid2 = "";
                }
                hashMap.put("board_id", uid2);
                hashMap.put("pin_id", pin.getUid());
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                this$02.f78172k.k(pin, repinPin, pinalytics);
                return;
            case 2:
                z2 z2Var = (z2) obj4;
                m this$03 = (m) obj3;
                rp0.d parent = (rp0.d) obj2;
                AggregatedCommentFeed feed = (AggregatedCommentFeed) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(parent, "$parent");
                Intrinsics.checkNotNullParameter(feed, "$feed");
                if (z2Var != null) {
                    this$03.G3(z2Var, parent, feed);
                    return;
                }
                return;
            case 3:
                Function1 function1 = (Function1) obj4;
                rp0.d validComment = (rp0.d) obj3;
                String validText = (String) obj2;
                List textTags = (List) obj;
                Intrinsics.checkNotNullParameter(validComment, "$validComment");
                Intrinsics.checkNotNullParameter(validText, "$validText");
                Intrinsics.checkNotNullParameter(textTags, "$textTags");
                if (function1 != null) {
                    if (validComment instanceof rp0.b) {
                        y2 c03 = ((rp0.b) validComment).f109053a.c0();
                        c03.f43900w = validText;
                        boolean[] zArr = c03.f43903z;
                        if (zArr.length > 22) {
                            zArr[22] = true;
                        }
                        c03.f43899v = textTags;
                        if (zArr.length > 21) {
                            zArr[21] = true;
                        }
                        z2 a13 = c03.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        cVar = new rp0.b(a13);
                    } else {
                        if (!(validComment instanceof rp0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zy0 V = ((rp0.c) validComment).f109054a.V();
                        V.f44512d = validText;
                        boolean[] zArr2 = V.f44532x;
                        if (zArr2.length > 3) {
                            zArr2[3] = true;
                        }
                        az0 a14 = V.a();
                        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                        cVar = new rp0.c(a14);
                    }
                    function1.invoke(cVar);
                    return;
                }
                return;
            default:
                d0 pinalytics2 = (d0) obj4;
                e82.j this$04 = (e82.j) obj3;
                k toastUtils = (k) obj2;
                w eventManager = (w) obj;
                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(toastUtils, "$toastUtils");
                Intrinsics.checkNotNullParameter(eventManager, "$eventManager");
                d0.v(pinalytics2, f1.USER_DISABLE_ETSY, "0", false, 12);
                this$04.f57878d.a(e82.i.f57867j);
                toastUtils.k(g82.a.disconnected_to_social);
                e82.w wVar = e82.w.FACEBOOK;
                eventManager.d(new z());
                return;
        }
    }
}

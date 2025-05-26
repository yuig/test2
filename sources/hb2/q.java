package hb2;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.ts0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.view.NoticeView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends pe0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts0 f68600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NoticeView f68601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx.d0 f68602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HashMap f68603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, ts0 ts0Var, NoticeView noticeView, nx.d0 d0Var, HashMap hashMap, String str, int i13) {
        super(context, Integer.valueOf(i13), str);
        this.f68600c = ts0Var;
        this.f68601d = noticeView;
        this.f68602e = d0Var;
        this.f68603f = hashMap;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        kg.n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        String j13 = this.f68600c.j();
        if (j13 != null) {
            int i13 = NoticeView.f52709r;
            NoticeView noticeView = this.f68601d;
            noticeView.j(j13);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = this.f68603f;
            if (hashMap2 != null) {
                hashMap.putAll(hashMap2);
            }
            hashMap.put("url", j13);
            f1 f1Var = f1.TAP;
            u0 u0Var = u0.EXTERNAL_LINK;
            g0 g0Var = g0.NOTICE;
            nx.d0 d0Var = this.f68602e;
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            noticeView.k(d0Var, "client.events.searchAdvisories.action", hashMap);
        }
    }
}

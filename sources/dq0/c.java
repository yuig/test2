package dq0;

import android.view.View;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.ue;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a1;
import com.pinterest.screens.y0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import uj2.q;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f56074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56077d;

    /* renamed from: e, reason: collision with root package name */
    public final v f56078e;

    /* renamed from: f, reason: collision with root package name */
    public final kp.m f56079f;

    /* renamed from: g, reason: collision with root package name */
    public final w f56080g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d pinalytics, q networkStateStream, String contactRequestId, String conversationId, String senderName, int i13, v viewResources, kp.m contactRequestUtils, w eventManager) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(contactRequestUtils, "contactRequestUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f56074a = contactRequestId;
        this.f56075b = conversationId;
        this.f56076c = senderName;
        this.f56077d = i13;
        this.f56078e = viewResources;
        this.f56079f = contactRequestUtils;
        this.f56080g = eventManager;
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(aq0.b view) {
        GestaltText gestaltText;
        GestaltButton gestaltButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        final lq0.e eVar = (lq0.e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.f84300p0 = this;
        View view2 = eVar.getView();
        if (view2 != null && (gestaltButton = (GestaltButton) view2.findViewById(xc0.e.okay_capsule_button)) != null) {
            final int i13 = 0;
            gestaltButton.e(new gm1.a() { // from class: lq0.c
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i14 = i13;
                    e this$0 = eVar;
                    switch (i14) {
                        case 0:
                            int i15 = e.f84293s0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dq0.c cVar = this$0.f84300p0;
                            if (cVar != null) {
                                cVar.r3();
                                break;
                            }
                            break;
                        default:
                            int i16 = e.f84293s0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            dq0.c cVar2 = this$0.f84300p0;
                            if (cVar2 != null) {
                                cVar2.q3();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        View view3 = eVar.getView();
        if (view3 == null || (gestaltText = (GestaltText) view3.findViewById(xc0.e.community_guidelines_text_view)) == null) {
            return;
        }
        final int i14 = 1;
        gestaltText.j(new gm1.a() { // from class: lq0.c
            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                e this$0 = eVar;
                switch (i142) {
                    case 0:
                        int i15 = e.f84293s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        dq0.c cVar = this$0.f84300p0;
                        if (cVar != null) {
                            cVar.r3();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.f84293s0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        dq0.c cVar2 = this$0.f84300p0;
                        if (cVar2 != null) {
                            cVar2.q3();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void q3() {
        this.f56080g.d(Navigation.z0((ScreenLocation) a1.f50495b.getValue(), ((yk1.a) this.f56078e).f139224a.getString(fb0.f.url_community_guidelines)));
    }

    public final void r3() {
        kp.m mVar = this.f56079f;
        mVar.getClass();
        String conversationId = this.f56075b;
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        String contactRequestId = this.f56074a;
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        String validName = this.f56076c;
        Intrinsics.checkNotNullParameter(validName, "validName");
        mVar.f80551f.getClass();
        ue b13 = ew.b(conversationId);
        fp.b bVar = mVar.f80550e;
        if (!bVar.f62754a.isEmpty()) {
            bVar.a(mVar.f80555j, null);
        }
        NavigationImpl z03 = Navigation.z0((ScreenLocation) y0.f51579b.getValue(), conversationId);
        if (b13 != null) {
            z03.e(b13);
        }
        Boolean bool = Boolean.TRUE;
        z03.y0(bool, "com.pinterest.EXTRA_IS_CONTACT_REQUEST");
        z03.y0(bool, "com.pinterest.EXTRA_IS_CONTACT_REQUEST_PREVIEW");
        z03.y0(contactRequestId, "com.pinterest.EXTRA_CONTACT_REQUEST_ID");
        z03.y0(validName, "com.pinterest.EXTRA_CONTACT_REQUEST_SENDER");
        z03.y0(Integer.valueOf(this.f56077d), "com.pinterest.EXTRA_CONTACT_REQUEST_POSITION");
        w wVar = mVar.f80547b;
        wVar.d(z03);
        wVar.d(new m92.b());
        wVar.f(new pg0.q());
        this.f56080g.d(new za.c(Navigation.w1((ScreenLocation) a1.f50497d.getValue())));
    }
}

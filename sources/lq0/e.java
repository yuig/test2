package lq0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.ve;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatargroup.legacy.AvatarGroup;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.c7;
import x40.rc;
import x40.uc;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llq0/e;", "Lyk1/k;", "Laq0/b;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends l1 implements aq0.b {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f84293s0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public c7 f84294j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f84295k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f84296l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f84297m0;

    /* renamed from: n0, reason: collision with root package name */
    public bp1.g f84298n0;

    /* renamed from: o0, reason: collision with root package name */
    public AvatarGroup f84299o0;

    /* renamed from: p0, reason: collision with root package name */
    public dq0.c f84300p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f84301q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public final d4 f84302r0;

    public e() {
        this.E = xc0.f.contact_request_under_18_warning;
        this.f84302r0 = d4.CONVERSATION;
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        bp1.g M;
        super.R7(navigation);
        if (navigation != null) {
            Object X0 = navigation.X0();
            if (X0 instanceof ve) {
                ve veVar = (ve) X0;
                this.f84296l0 = veVar.getUid();
                this.f84297m0 = veVar.a();
            } else {
                if (!(X0 instanceof z40.f)) {
                    throw new IllegalArgumentException("Invalid type for cachedModel");
                }
                uc ucVar = (uc) ((z40.f) X0);
                this.f84296l0 = ucVar.b();
                rc a13 = ucVar.a();
                this.f84297m0 = a13 != null ? a13.a() : null;
            }
            Object i03 = navigation.i0("sender");
            if (i03 instanceof z40.d0) {
                M = org.chromium.net.y.M(i03);
            } else {
                if (!(i03 instanceof wy0)) {
                    throw new IllegalArgumentException("Sender must be a User or UserAvatarFields");
                }
                M = org.chromium.net.y.M(i03);
            }
            this.f84298n0 = M;
            Object i04 = navigation.i0("position");
            Intrinsics.g(i04, "null cannot be cast to non-null type kotlin.Int");
            this.f84301q0 = ((Integer) i04).intValue();
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        c7 c7Var = this.f84294j0;
        if (c7Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f84295k0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        String str = this.f84296l0;
        if (str == null) {
            str = "";
        }
        String str2 = this.f84297m0;
        String str3 = str2 != null ? str2 : "";
        bp1.g gVar = this.f84298n0;
        if (gVar != null) {
            return c7Var.a(f13, p73, str, str3, bp1.h.p(gVar), this.f84301q0);
        }
        Intrinsics.r("sender");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22878k0() {
        return this.f84302r0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Context context = onCreateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AvatarGroup avatarGroup = new AvatarGroup(context, new tl1.d(tl1.a.a(tl1.g.a(), bs1.c.W(onCreateView, rl1.j0.lego_avatar_size_large)), null, new tl1.m(k60.a.bottom_nav_content_badge_circle_bg, sm1.b.ic_exclamation_point_circle_gestalt, eo1.b.color_themed_light_gray, sl1.r.avatar_group_icon_chip_padding_none, d.f84269j, 64), 0, 0.25f, null, false, true, false, 874));
        ((FrameLayout) onCreateView.findViewById(xc0.e.image_chips_layout)).addView(avatarGroup);
        this.f84299o0 = avatarGroup;
        View findViewById = onCreateView.findViewById(xc0.e.contact_request_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        Resources resources = onCreateView.getResources();
        int i13 = xc0.i.contact_request_first_time_warning;
        Object[] objArr = new Object[1];
        bp1.g gVar = this.f84298n0;
        if (gVar == null) {
            Intrinsics.r("sender");
            throw null;
        }
        objArr[0] = gVar.b();
        String string = resources.getString(i13, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        View findViewById2 = onCreateView.findViewById(xc0.e.followers_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        Resources resources2 = onCreateView.getResources();
        int i14 = m60.w0.creator_profile_community_followers;
        bp1.g gVar2 = this.f84298n0;
        if (gVar2 == null) {
            Intrinsics.r("sender");
            throw null;
        }
        int a13 = gVar2.a();
        Object[] objArr2 = new Object[1];
        bp1.g gVar3 = this.f84298n0;
        if (gVar3 == null) {
            Intrinsics.r("sender");
            throw null;
        }
        objArr2[0] = qb0.j.b(gVar3.a());
        String quantityString = resources2.getQuantityString(i14, a13, objArr2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        pk.a0.p(gestaltText2, quantityString);
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        bp1.g gVar = this.f84298n0;
        if (gVar == null) {
            Intrinsics.r("sender");
            throw null;
        }
        String m13 = bp1.h.m(gVar);
        AvatarGroup avatarGroup = this.f84299o0;
        if (avatarGroup != null) {
            avatarGroup.j(1, kotlin.collections.e0.b(m13));
        } else {
            Intrinsics.r("senderAvatarGroup");
            throw null;
        }
    }
}

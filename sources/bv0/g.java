package bv0;

import android.content.Context;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.wy0;
import cv0.p;
import cv0.r;
import cv0.s;
import cv0.v;
import cv0.w;
import cv0.x;
import cv0.z;
import dl1.t;
import dv0.o;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.s1;
import lh0.z3;
import m60.x0;
import om0.m1;
import uj2.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class g extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final String f23922k;

    /* renamed from: l, reason: collision with root package name */
    public final av0.j f23923l;

    /* renamed from: m, reason: collision with root package name */
    public final o f23924m;

    /* renamed from: n, reason: collision with root package name */
    public final o f23925n;

    /* renamed from: o, reason: collision with root package name */
    public final o f23926o;

    /* renamed from: p, reason: collision with root package name */
    public final t f23927p;

    /* renamed from: q, reason: collision with root package name */
    public final x2 f23928q;

    /* renamed from: r, reason: collision with root package name */
    public final s1 f23929r;

    /* renamed from: s, reason: collision with root package name */
    public final b60.b f23930s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f23931t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String draftId, av0.j altTextSaveListener, o enableCommentsListener, o paidPartnershipSettingsListener, o shopSimilarItemsListener, t storyPinLocalDataRepository, x2 userRepository, s1 experiments, b60.b activeUserManager) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(altTextSaveListener, "altTextSaveListener");
        Intrinsics.checkNotNullParameter(enableCommentsListener, "enableCommentsListener");
        Intrinsics.checkNotNullParameter(paidPartnershipSettingsListener, "paidPartnershipSettingsListener");
        Intrinsics.checkNotNullParameter(shopSimilarItemsListener, "shopSimilarItemsListener");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f23922k = draftId;
        this.f23923l = altTextSaveListener;
        this.f23924m = enableCommentsListener;
        this.f23925n = paidPartnershipSettingsListener;
        this.f23926o = shopSimilarItemsListener;
        this.f23927p = storyPinLocalDataRepository;
        this.f23928q = userRepository;
        this.f23929r = experiments;
        this.f23930s = activeUserManager;
        this.f23931t = el.a.j2(activeUserManager);
        o(1, new gv0.a(context));
        o(2, new pk0.b(16));
        o(3, new pk0.b(17));
        o(4, new nu0.f(experiments, 1));
        o(8, new pk0.b(10));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object obj = CollectionsKt.F0(this.f135191h).get(i13);
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f53309a;
        }
        return -1;
    }

    @Override // xk1.c
    public final q k() {
        q t13 = ((dl1.l) this.f23927p).S(this.f23922k).t(new wr0.l(23, new f(this, 1)));
        Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
        return t13;
    }

    public final x v(ln0 ln0Var) {
        int E = ln0Var.E();
        boolean z13 = this.f23931t;
        return new x(E <= 0 && !ln0Var.getMetadata().s() && z13 && ln0Var.getMetadata().getShopSimilarEnabled(), ln0Var.E() <= 0 && !ln0Var.getMetadata().s() && z13, Integer.valueOf((ln0Var.getMetadata().s() || ln0Var.E() > 0) ? f62.e.pin_advanced_settings_has_tagged_products : !z13 ? f62.e.show_shopping_recommendations_disabled : f62.e.show_shopping_recommendations_details), Integer.valueOf((ln0Var.getMetadata().s() || ln0Var.E() > 0) ? f62.e.pin_advanced_settings_has_tagged_products : !z13 ? f62.e.show_shopping_recommendations_disabled : f62.e.show_shopping_recommendations_details), new f(this, 0));
    }

    public final ArrayList w(ln0 ln0Var, wy0 wy0Var) {
        cv0.q qVar = new cv0.q();
        Boolean r43 = com.bumptech.glide.d.Q(this.f23930s).r4();
        Intrinsics.checkNotNullExpressionValue(r43, "getShouldDefaultCommentsOff(...)");
        int i13 = 0;
        ArrayList l13 = f0.l(qVar, x(r43.booleanValue(), ln0Var.getCommentsEnabled()));
        l13.add(new cv0.a(ln0Var.getAltText(), this.f23923l));
        s1 s1Var = this.f23929r;
        s1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) s1Var.f83476a;
        if (g1Var.o("android_idea_pin_sponsor_tagging", "enabled", z3Var) || g1Var.l("android_idea_pin_sponsor_tagging")) {
            boolean d2 = s1Var.d();
            l13.add(new r(d2));
            cv0.f fVar = new cv0.f(d2, new e(this, i13));
            l13.add(new v(ln0Var.getMetadata().s(), new go0.r(this, fVar, wy0Var, 22), 0));
            if (ln0Var.getMetadata().s()) {
                l13.add(fVar);
                if (wy0Var != null) {
                    String Z2 = wy0Var.Z2();
                    String str = Z2 == null ? "" : Z2;
                    String l33 = wy0Var.l3();
                    String str2 = l33 == null ? "" : l33;
                    String g13 = dl2.b.g1(wy0Var);
                    Integer q23 = wy0Var.q2();
                    Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                    l13.add(new p(str, str2, g13, q23.intValue(), false, new m1(16, this, wy0Var), 16, null));
                }
            }
        }
        l13.add(new s());
        l13.add(v(ln0Var));
        return l13;
    }

    public final w x(boolean z13, boolean z14) {
        return new w(z14, !z13, null, z13 ? Integer.valueOf(x0.comments_turned_off_in_social_permissions) : null, new f(this, 2), z13 ? Integer.valueOf(x0.social_permissions) : null, z13 ? new e(this, 1) : null, 4, null);
    }
}

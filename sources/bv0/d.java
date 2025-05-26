package bv0;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import cv0.p;
import cv0.r;
import cv0.s;
import cv0.v;
import cv0.w;
import cv0.x;
import cv0.z;
import dv0.o;
import java.util.ArrayList;
import jk2.i1;
import jk2.j1;
import kotlin.collections.CollectionsKt;
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
public final class d extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final s1 f23910k;

    /* renamed from: l, reason: collision with root package name */
    public final av0.j f23911l;

    /* renamed from: m, reason: collision with root package name */
    public final o f23912m;

    /* renamed from: n, reason: collision with root package name */
    public final o f23913n;

    /* renamed from: o, reason: collision with root package name */
    public final PinEditAdvanceMeta f23914o;

    /* renamed from: p, reason: collision with root package name */
    public final b60.b f23915p;

    /* renamed from: q, reason: collision with root package name */
    public final o f23916q;

    /* renamed from: r, reason: collision with root package name */
    public final x2 f23917r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, s1 experiments, av0.j altTextSaveListener, o enableCommentsListener, o shopSimilarItemsListener, PinEditAdvanceMeta pinEditData, b60.b activeUserManager, o partnershipListener, x2 userRepository) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(altTextSaveListener, "altTextSaveListener");
        Intrinsics.checkNotNullParameter(enableCommentsListener, "enableCommentsListener");
        Intrinsics.checkNotNullParameter(shopSimilarItemsListener, "shopSimilarItemsListener");
        Intrinsics.checkNotNullParameter(pinEditData, "pinEditData");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(partnershipListener, "partnershipListener");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f23910k = experiments;
        this.f23911l = altTextSaveListener;
        this.f23912m = enableCommentsListener;
        this.f23913n = shopSimilarItemsListener;
        this.f23914o = pinEditData;
        this.f23915p = activeUserManager;
        this.f23916q = partnershipListener;
        this.f23917r = userRepository;
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
        Boolean r43 = com.bumptech.glide.d.Q(this.f23915p).r4();
        Intrinsics.checkNotNullExpressionValue(r43, "getShouldDefaultCommentsOff(...)");
        boolean booleanValue = r43.booleanValue();
        s1 s1Var = this.f23910k;
        s1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) s1Var.f83476a;
        boolean o13 = g1Var.o("android_scheduled_pin_sponsor_tagging", "enabled", z3Var);
        PinEditAdvanceMeta pinEditAdvanceMeta = this.f23914o;
        if (o13 || g1Var.l("android_scheduled_pin_sponsor_tagging")) {
            String str = pinEditAdvanceMeta.f46542h;
            return new j1(q.h((!pinEditAdvanceMeta.f46543i || str == null || str.length() == 0 || Intrinsics.d(str, "-1")) ? q.y(new wy0()) : this.f23917r.P(str), q.y(Boolean.TRUE), new ep.g(10, b.f23907i)), new wr0.l(22, new r1.f(this, booleanValue, 20)), 0);
        }
        i1 y13 = q.y(v(pinEditAdvanceMeta.f46541g, true, pinEditAdvanceMeta.f46537c, booleanValue, pinEditAdvanceMeta.f46538d, null));
        Intrinsics.checkNotNullExpressionValue(y13, "just(...)");
        return y13;
    }

    public final ArrayList v(String str, boolean z13, boolean z14, boolean z15, boolean z16, wy0 wy0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cv0.q());
        int i13 = 0;
        arrayList.add(w(!z13 || z15, z13 && !z15 && z14));
        arrayList.add(new cv0.a(str, this.f23911l));
        arrayList.add(new s());
        b60.b bVar = this.f23915p;
        boolean j23 = el.a.j2(bVar);
        PinEditAdvanceMeta pinEditAdvanceMeta = this.f23914o;
        String str2 = pinEditAdvanceMeta.f46542h;
        boolean z17 = !(str2 == null || str2.length() == 0);
        if (pinEditAdvanceMeta.f46543i) {
            s1 s1Var = this.f23910k;
            s1Var.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) s1Var.f83476a;
            if (g1Var.o("android_scheduled_pin_sponsor_tagging", "enabled", z3Var) || g1Var.l("android_scheduled_pin_sponsor_tagging")) {
                boolean d2 = s1Var.d();
                arrayList.add(new r(d2));
                cv0.f fVar = new cv0.f(d2, new a(this, i13));
                arrayList.add(new v(z17, new go0.r(this, fVar, wy0Var, 21), 0));
                if (z17) {
                    arrayList.add(fVar);
                    if (wy0Var != null) {
                        String Z2 = wy0Var.Z2();
                        String str3 = Z2 == null ? "" : Z2;
                        String l33 = wy0Var.l3();
                        String str4 = l33 == null ? "" : l33;
                        String uid = wy0Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        Integer q23 = wy0Var.q2();
                        Intrinsics.checkNotNullExpressionValue(q23, "getAvatarColorIndex(...)");
                        arrayList.add(new p(str3, str4, uid, q23.intValue(), false, new m1(15, this, wy0Var), 16, null));
                    }
                }
            }
        }
        boolean j24 = el.a.j2(bVar);
        boolean z18 = pinEditAdvanceMeta.f46539e;
        int i14 = !j24 ? f62.e.show_shopping_recommendations_disabled : (z18 || z17) ? f62.e.pin_advanced_settings_has_tagged_products : f62.e.show_shopping_recommendations_details;
        arrayList.add(new x((z18 || z17 || !j23) ? false : z16, (z18 || z17 || !j23) ? false : true, Integer.valueOf(i14), Integer.valueOf(i14), new c(this, i13)));
        return arrayList;
    }

    public final w w(boolean z13, boolean z14) {
        int i13 = 1;
        return new w(z14, !z13, null, Integer.valueOf(z13 ? x0.comments_turned_off_in_social_permissions : x0.comment_unavailable_subtitle_with_period), new c(this, i13), z13 ? Integer.valueOf(x0.social_permissions) : null, z13 ? new a(this, i13) : null, 4, null);
    }
}

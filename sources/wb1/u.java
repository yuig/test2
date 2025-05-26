package wb1;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import va1.k1;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129058i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ go0.c f129059j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(go0.c cVar, int i13) {
        super(1);
        this.f129058i = i13;
        this.f129059j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f129058i;
        go0.c cVar = this.f129059j;
        switch (i13) {
            case 0:
                wy0 it = (wy0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                cVar.f65832p = it;
                if (it == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                cVar.f65828l = it.e4() == null;
                h20.a aVar = (h20.a) cVar.f65830n;
                wy0 wy0Var = (wy0) cVar.f65832p;
                if (wy0Var == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                String uid = wy0Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return aVar.b(uid).u().H(tk2.e.f118017c).A(wj2.c.a());
            default:
                tt1.a it2 = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                wy0 wy0Var2 = (wy0) cVar.f65832p;
                if (wy0Var2 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vd0.c cVar2 = new vd0.c((nm.u) it2.c());
                boolean f13 = ((kc2.b) ((kc2.a) cVar.f65831o)).f79189a.f("PREF_AUTOPLAY_OVER_MOBILE_DATA", true);
                boolean f14 = ((kc2.b) ((kc2.a) cVar.f65831o)).f79190b.f("PREF_AUTOPLAY_OVER_WIFI", true);
                Boolean bool = Boolean.FALSE;
                Boolean h10 = cVar2.h("comments_phrase_filter_list_enabled", bool);
                Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
                boolean z13 = h10.booleanValue() && !wy0Var2.r4().booleanValue();
                vd0.a k13 = cVar2.k("comments_phrase_filter_list");
                Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
                Boolean h13 = cVar2.h("pinner_comments_phrase_filter_list_enabled", bool);
                Intrinsics.checkNotNullExpressionValue(h13, "optBoolean(...)");
                boolean booleanValue = h13.booleanValue();
                vd0.a k14 = cVar2.k("pinner_comments_phrase_filter_list");
                Intrinsics.checkNotNullExpressionValue(k14, "optJsonArray(...)");
                int d2 = k13.d();
                String[] strArr = new String[d2];
                int i14 = 0;
                while (true) {
                    String str = "";
                    if (i14 >= d2) {
                        ArrayList arrayList = new ArrayList();
                        for (int i15 = 0; i15 < d2; i15++) {
                            String str2 = strArr[i15];
                            Intrinsics.f(str2);
                            if (str2.length() > 0) {
                                arrayList.add(str2);
                            }
                        }
                        List F0 = CollectionsKt.F0(arrayList);
                        Intrinsics.checkNotNullParameter(F0, "<set-?>");
                        cVar.f65833q = F0;
                        int d13 = k14.d();
                        String[] strArr2 = new String[d13];
                        for (int i16 = 0; i16 < d13; i16++) {
                            String l13 = k14.l(i16);
                            if (l13 == null) {
                                l13 = "";
                            }
                            strArr2[i16] = l13;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i17 = 0; i17 < d13; i17++) {
                            String str3 = strArr2[i17];
                            Intrinsics.f(str3);
                            if (str3.length() > 0) {
                                arrayList2.add(str3);
                            }
                        }
                        List F02 = CollectionsKt.F0(arrayList2);
                        Intrinsics.checkNotNullParameter(F02, "<set-?>");
                        cVar.f65834r = F02;
                        ArrayList arrayList3 = new ArrayList();
                        wy0 f15 = ((b60.d) com.bumptech.glide.d.E()).f();
                        if (f15 != null && dl2.b.G2(f15)) {
                            arrayList3.add(new o0(g52.c.settings_social_permissions_header_title));
                            arrayList3.add(new e0(g52.c.settings_social_permissions_messages_title));
                            arrayList3.add(new i0(c52.e.settings_message_settings_title, n91.z.b(g52.c.settings_message_settings_subtitle)));
                        }
                        arrayList3.add(new e0(g52.c.settings_social_permissions_comments_title));
                        arrayList3.add(new a0(g52.c.settings_social_permissions_comment_account_level_control_title, n91.z.b(g52.c.settings_social_permissions_comment_account_level_control_description), !wy0Var2.r4().booleanValue()));
                        arrayList3.add(new d0(g52.c.settings_social_permissions_creator_manual_filter_title, n91.z.b(g52.c.settings_social_permissions_creator_filter_description), z13, !wy0Var2.r4().booleanValue()));
                        if (z13) {
                            List list = (List) cVar.f65833q;
                            if (list == null) {
                                Intrinsics.r("creatorCommentsPhraseFilterList");
                                throw null;
                            }
                            arrayList3.add(new c0(list));
                        }
                        arrayList3.add(new m0(n91.z.b(g52.c.settings_social_permissions_pinner_filter_description), booleanValue));
                        if (booleanValue) {
                            List list2 = (List) cVar.f65834r;
                            if (list2 == null) {
                                Intrinsics.r("pinnerCommentsPhraseFilterList");
                                throw null;
                            }
                            arrayList3.add(new l0(list2));
                        }
                        int i18 = g52.c.settings_social_permissions_mention_control_title;
                        k1 b13 = n91.z.b(g52.c.settings_social_permissions_mention_control_description);
                        Integer m23 = wy0Var2.m2();
                        Intrinsics.checkNotNullExpressionValue(m23, "getAllowMentions(...)");
                        arrayList3.add(new b0(i18, b13, m23.intValue()));
                        arrayList3.add(new e0(g52.c.settings_social_permissions_block_list_title));
                        arrayList3.add(new z(g52.c.settings_social_permissions_blocked_accounts_title, n91.z.b(g52.c.settings_social_permissions_blocked_accounts_description)));
                        if (cVar.f65828l) {
                            arrayList3.add(new e0(g52.c.settings_social_permissions_shopping_recommendations_title));
                            arrayList3.add(new n0(n91.z.b(g52.c.settings_social_permissions_show_pins_description), !wy0Var2.q4().booleanValue()));
                        }
                        arrayList3.add(new e0(g52.c.settings_social_permissions_downloads_title));
                        k1 b14 = n91.z.b(g52.c.settings_social_permissions_allow_video_pin_downloads_description);
                        Boolean l23 = wy0Var2.l2();
                        Intrinsics.checkNotNullExpressionValue(l23, "getAllowIdeaPinDownloads(...)");
                        arrayList3.add(new g0(b14, l23.booleanValue()));
                        ac2.f fVar = ac2.f.f1945a;
                        if (!((Boolean) ac2.f.f1949e.getValue()).booleanValue()) {
                            arrayList3.add(new x(f13));
                            boolean z14 = (f13 && f14) ? false : true;
                            if (z14) {
                                arrayList3.add(new y(f14, z14));
                            }
                        }
                        return arrayList3;
                    }
                    String l14 = k13.l(i14);
                    if (l14 != null) {
                        str = l14;
                    }
                    strArr[i14] = str;
                    i14++;
                }
                break;
        }
    }
}

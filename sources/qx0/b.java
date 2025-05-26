package qx0;

import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import xq0.d;
import yn2.c0;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105331a;

    public /* synthetic */ b(int i13) {
        this.f105331a = i13;
    }

    public static String c(String str) {
        if (!StringsKt.E(str, "/", false)) {
            return str;
        }
        String substring = str.substring(StringsKt.N(str, "/", 0, 6) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // xq0.d
    public final boolean a(s model) {
        switch (this.f105331a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                return model instanceof qx;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                return model instanceof g00;
        }
    }

    @Override // xq0.d
    public final List b(s model) {
        List list;
        Object obj;
        String p03;
        switch (this.f105331a) {
            case 0:
                Intrinsics.checkNotNullParameter(model, "model");
                if (!a(model)) {
                    return q0.f80391a;
                }
                qx qxVar = (qx) model;
                ArrayList arrayList = new ArrayList();
                if (qxVar.a().intValue() != 0 && (list = qxVar.f41414u) != null) {
                    Intrinsics.checkNotNullExpressionValue(list, "getContentItems(...)");
                    List<String> t13 = c0.t(c0.q(c0.r(c0.j(c0.p(CollectionsKt.K(list), a.f105326o), a.f105321j), 3), a.f105327p));
                    String message = a.a.e("prefetch a NewsHubItem:Pin models, size (", t13.size(), ")");
                    t13.isEmpty();
                    Intrinsics.checkNotNullParameter(message, "message");
                    for (String str : t13) {
                        String message2 = "prefetch image: " + str;
                        Intrinsics.checkNotNullParameter(message2, "message");
                        arrayList.add(str);
                    }
                    List list2 = qxVar.f41414u;
                    Intrinsics.checkNotNullExpressionValue(list2, "getContentItems(...)");
                    List<String> t14 = c0.t(c0.q(c0.r(c0.j(c0.p(CollectionsKt.K(list2), a.f105328q), a.f105322k), 4), a.f105329r));
                    String message3 = a.a.e("prefetch a NewsHubItem:NewsHubSearch models, size (", t14.size(), ")");
                    t14.isEmpty();
                    Intrinsics.checkNotNullParameter(message3, "message");
                    for (String str2 : t14) {
                        String message4 = "prefetch image: " + str2;
                        Intrinsics.checkNotNullParameter(message4, "message");
                        arrayList.add(str2);
                    }
                    List list3 = qxVar.f41414u;
                    Intrinsics.checkNotNullExpressionValue(list3, "getContentItems(...)");
                    v7 v7Var = (v7) CollectionsKt.firstOrNull(c0.t(c0.j(c0.p(CollectionsKt.K(list3), a.f105325n), a.f105323l)));
                    if (v7Var != null) {
                        String a13 = v7Var.a1();
                        if (a13 == null) {
                            a13 = "";
                        }
                        String c13 = c(a13);
                        String a14 = v7Var.a1();
                        if (a14 != null) {
                            String message5 = "prefetch the first NewsHubItem:Board model: ".concat(a14);
                            Intrinsics.checkNotNullParameter(message5, "message");
                            arrayList.add(a14);
                        }
                        List<String> y03 = CollectionsKt.y0(c0.t(c0.j(c0.q(CollectionsKt.K(kh2.d.U0(v7Var)), a.f105324m), new r0(29, this, c13))), 4);
                        String message6 = a.a.e("prefetch the NewsHubItem:Board models, size (", y03.size(), ")");
                        y03.isEmpty();
                        Intrinsics.checkNotNullParameter(message6, "message");
                        for (String str3 : y03) {
                            String message7 = "prefetch image: " + str3;
                            Intrinsics.checkNotNullParameter(message7, "message");
                            arrayList.add(str3);
                        }
                    }
                    List list4 = qxVar.f41415v;
                    obj = list4 != null ? (s) CollectionsKt.firstOrNull(list4) : null;
                    if (obj instanceof wy0) {
                        String s03 = dl2.b.s0((wy0) obj);
                        String message8 = "prefetch the NewsHubItem's headerIcon as a User model, ".concat(s03);
                        Intrinsics.checkNotNullParameter(message8, "message");
                        arrayList.add(s03);
                    } else if (obj instanceof v7) {
                        String v13 = kh2.d.v((v7) obj);
                        String message9 = "prefetch the NewsHubItem's headerIcon as a Board model, " + v13;
                        Intrinsics.checkNotNullParameter(message9, "message");
                        arrayList.add(v13);
                    } else if ((obj instanceof f30) && (p03 = c.p0((f30) obj)) != null) {
                        String message10 = "prefetch the NewsHubItem's headerIcon as a Pin model, ".concat(p03);
                        Intrinsics.checkNotNullParameter(message10, "message");
                        arrayList.add(p03);
                    }
                }
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                if (!a(model)) {
                    return q0.f80391a;
                }
                o00 v14 = ((g00) model).v();
                obj = v14 != null ? v14.t() : null;
                return obj != null ? e0.b(obj) : q0.f80391a;
        }
    }
}

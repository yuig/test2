package bc1;

import ab1.o;
import ac1.e;
import ac1.f;
import com.pinterest.api.model.s10;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.settings.notifications.y0;
import dl1.s;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lb0.r;
import lh0.a4;
import lh0.g1;
import lh0.q3;
import lh0.z3;
import ll.j;
import m60.w;
import sq0.c0;
import wk1.i;
import wk1.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f22639a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f22640b;

    /* renamed from: c, reason: collision with root package name */
    public final w f22641c;

    /* renamed from: d, reason: collision with root package name */
    public final j f22642d;

    /* renamed from: e, reason: collision with root package name */
    public final q3 f22643e;

    /* renamed from: f, reason: collision with root package name */
    public final r f22644f;

    /* renamed from: g, reason: collision with root package name */
    public wy0 f22645g;

    /* renamed from: h, reason: collision with root package name */
    public final bo0.a f22646h;

    /* renamed from: i, reason: collision with root package name */
    public final b f22647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oc.c apolloClient, uk1.d pinalytics, uj2.q networkStateStream, x2 userRepository, w eventManager, j settingsTextUtils, q3 experiments, r prefsManagerUser) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(settingsTextUtils, "settingsTextUtils");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f22639a = apolloClient;
        this.f22640b = userRepository;
        this.f22641c = eventManager;
        this.f22642d = settingsTextUtils;
        this.f22643e = experiments;
        this.f22644f = prefsManagerUser;
        this.f22646h = new bo0.a(userRepository, settingsTextUtils, experiments, prefsManagerUser);
        this.f22647i = new b(this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f22646h);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f22641c.j(this.f22647i);
        ((cc1.d) ((zb1.a) getView())).B0 = null;
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(zb1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((cc1.d) view).B0 = this;
        xj2.c F = this.f22640b.d0().Q("me").I(1L).F(new o(28, new y0(this, 23)), new o(29, c.f22636j), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void u3(bd1.b apiFieldName, String apiFieldValue) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        List split$default;
        Object obj8;
        List split$default2;
        List split$default3;
        Intrinsics.checkNotNullParameter(apiFieldName, "apiFieldName");
        Intrinsics.checkNotNullParameter(apiFieldValue, "apiFieldValue");
        int i13 = a.f22634a[apiFieldName.ordinal()];
        j jVar = this.f22642d;
        bo0.a aVar = this.f22646h;
        switch (i13) {
            case 1:
                wy0 wy0Var = this.f22645g;
                if (wy0Var == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                v10 Y3 = wy0Var.Y3();
                if (Y3 != null) {
                    wy0 wy0Var2 = this.f22645g;
                    if (wy0Var2 == null) {
                        Intrinsics.r("user");
                        throw null;
                    }
                    vy0 H4 = wy0Var2.H4();
                    s10 s10Var = new s10(Y3, 0);
                    s10Var.d(apiFieldValue);
                    H4.L0(s10Var.a());
                    wy0 a13 = H4.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    this.f22645g = a13;
                }
                Iterator it = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((s) next) instanceof ac1.c) {
                            obj = next;
                        }
                    } else {
                        obj = null;
                    }
                }
                s sVar = (s) obj;
                Intrinsics.g(sVar, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.ContactNamePage");
                Intrinsics.checkNotNullParameter(apiFieldValue, "<set-?>");
                ((ac1.c) sVar).f1914f = apiFieldValue;
                return;
            case 2:
                wy0 wy0Var3 = this.f22645g;
                if (wy0Var3 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                v10 Y32 = wy0Var3.Y3();
                if (Y32 != null) {
                    wy0 wy0Var4 = this.f22645g;
                    if (wy0Var4 == null) {
                        Intrinsics.r("user");
                        throw null;
                    }
                    vy0 H42 = wy0Var4.H4();
                    s10 s10Var2 = new s10(Y32, 0);
                    s10Var2.f41758c = apiFieldValue;
                    boolean[] zArr = s10Var2.f41771p;
                    if (zArr.length > 2) {
                        zArr[2] = true;
                    }
                    H42.L0(s10Var2.a());
                    wy0 a14 = H42.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    this.f22645g = a14;
                }
                Iterator it2 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((s) next2) instanceof ac1.b) {
                            obj2 = next2;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                s sVar2 = (s) obj2;
                Intrinsics.g(sVar2, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.BusinessTypePage");
                String l13 = jVar.l(apiFieldValue);
                Intrinsics.checkNotNullParameter(l13, "<set-?>");
                ((ac1.b) sVar2).f1910f = l13;
                return;
            case 3:
                wy0 wy0Var5 = this.f22645g;
                if (wy0Var5 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vy0 H43 = wy0Var5.H4();
                H43.O(apiFieldValue);
                wy0 a15 = H43.a();
                Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                this.f22645g = a15;
                Iterator it3 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (((s) obj3) instanceof e) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                s sVar3 = (s) obj3;
                Intrinsics.g(sVar3, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.GenderPage");
                e eVar = (e) sVar3;
                wy0 wy0Var6 = this.f22645g;
                if (wy0Var6 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                String o13 = jVar.o(apiFieldValue, wy0Var6.J2());
                Intrinsics.checkNotNullParameter(o13, "<set-?>");
                eVar.f1922f = o13;
                return;
            case 4:
                wy0 wy0Var7 = this.f22645g;
                if (wy0Var7 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vy0 H44 = wy0Var7.H4();
                H44.O("unspecified");
                wy0 a16 = H44.a();
                Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
                this.f22645g = a16;
                vy0 H45 = a16.H4();
                H45.G = apiFieldValue;
                boolean[] zArr2 = H45.V1;
                if (zArr2.length > 32) {
                    zArr2[32] = true;
                }
                wy0 a17 = H45.a();
                Intrinsics.checkNotNullExpressionValue(a17, "build(...)");
                this.f22645g = a17;
                Iterator it4 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next3 = it4.next();
                        if (((s) next3) instanceof e) {
                            obj4 = next3;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                s sVar4 = (s) obj4;
                Intrinsics.g(sVar4, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.GenderPage");
                String o14 = jVar.o("unspecified", apiFieldValue);
                Intrinsics.checkNotNullParameter(o14, "<set-?>");
                ((e) sVar4).f1922f = o14;
                return;
            case 5:
                wy0 wy0Var8 = this.f22645g;
                if (wy0Var8 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vy0 H46 = wy0Var8.H4();
                H46.D = apiFieldValue;
                boolean[] zArr3 = H46.V1;
                if (zArr3.length > 29) {
                    zArr3[29] = true;
                }
                wy0 a18 = H46.a();
                Intrinsics.checkNotNullExpressionValue(a18, "build(...)");
                this.f22645g = a18;
                Iterator it5 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next4 = it5.next();
                        if (((s) next4) instanceof ac1.d) {
                            obj5 = next4;
                        }
                    } else {
                        obj5 = null;
                    }
                }
                s sVar5 = (s) obj5;
                Intrinsics.g(sVar5, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.CountryAndRegionPage");
                jVar.getClass();
                String n13 = j.n(apiFieldValue, this.f22644f);
                Intrinsics.checkNotNullParameter(n13, "<set-?>");
                ((ac1.d) sVar5).f1918f = n13;
                return;
            case 6:
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
                calendar.setTimeInMillis(Long.parseLong(apiFieldValue));
                double timeInMillis = calendar.getTimeInMillis() / 1000;
                wy0 wy0Var9 = this.f22645g;
                if (wy0Var9 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vy0 H47 = wy0Var9.H4();
                H47.f43062n = Double.valueOf(timeInMillis);
                boolean[] zArr4 = H47.V1;
                if (zArr4.length > 13) {
                    zArr4[13] = true;
                }
                wy0 a19 = H47.a();
                Intrinsics.checkNotNullExpressionValue(a19, "build(...)");
                this.f22645g = a19;
                Iterator it6 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next5 = it6.next();
                        if (((s) next5) instanceof ac1.a) {
                            obj6 = next5;
                        }
                    } else {
                        obj6 = null;
                    }
                }
                s sVar6 = (s) obj6;
                Intrinsics.g(sVar6, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.BirthdayPage");
                DateFormat dateInstance = DateFormat.getDateInstance();
                dateInstance.setTimeZone(calendar.getTimeZone());
                String format = dateInstance.format(calendar.getTime());
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                Intrinsics.checkNotNullParameter(format, "<set-?>");
                ((ac1.a) sVar6).f1906f = format;
                return;
            case 7:
                wy0 wy0Var10 = this.f22645g;
                if (wy0Var10 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                vy0 H48 = wy0Var10.H4();
                H48.U0 = apiFieldValue;
                boolean[] zArr5 = H48.V1;
                if (zArr5.length > 98) {
                    zArr5[98] = true;
                }
                wy0 a23 = H48.a();
                Intrinsics.checkNotNullExpressionValue(a23, "build(...)");
                this.f22645g = a23;
                Iterator it7 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj7 = it7.next();
                        if (((s) obj7) instanceof f) {
                        }
                    } else {
                        obj7 = null;
                    }
                }
                s sVar7 = (s) obj7;
                Intrinsics.g(sVar7, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.LanguagePage");
                f fVar = (f) sVar7;
                String str = (String) bd1.e.f22722a.get(apiFieldValue);
                if (str != null) {
                    q3 q3Var = this.f22643e;
                    q3Var.getClass();
                    z3 z3Var = a4.f83297a;
                    g1 g1Var = (g1) q3Var.f83464a;
                    if (g1Var.o("android_additional_languages", "enabled", z3Var) || g1Var.l("android_additional_languages")) {
                        wy0 wy0Var11 = this.f22645g;
                        if (wy0Var11 == null) {
                            Intrinsics.r("user");
                            throw null;
                        }
                        String h23 = wy0Var11.h2();
                        if (h23 != null) {
                            split$default = StringsKt__StringsKt.split$default(h23, new String[]{","}, false, 0, 6, null);
                            String str2 = split$default.size() + "+";
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    fVar.f1926f = str;
                    return;
                }
                return;
            case 8:
                Iterator it8 = CollectionsKt.F0(aVar.f135191h).iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj8 = it8.next();
                        if (((s) obj8) instanceof f) {
                        }
                    } else {
                        obj8 = null;
                    }
                }
                s sVar8 = (s) obj8;
                Intrinsics.g(sVar8, "null cannot be cast to non-null type com.pinterest.feature.settings.personalinformation.model.PersonalInformationMenuItem.LanguagePage");
                f fVar2 = (f) sVar8;
                split$default2 = StringsKt__StringsKt.split$default(apiFieldValue, new String[]{","}, false, 0, 6, null);
                if (((CharSequence) split$default2.get(0)).length() > 0) {
                    split$default3 = StringsKt__StringsKt.split$default(apiFieldValue, new String[]{","}, false, 0, 6, null);
                    String str3 = split$default3.size() + "+";
                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                    fVar2.f1926f = str3;
                    return;
                }
                HashMap hashMap = bd1.e.f22722a;
                wy0 wy0Var12 = this.f22645g;
                if (wy0Var12 == null) {
                    Intrinsics.r("user");
                    throw null;
                }
                String str4 = (String) hashMap.get(wy0Var12.R3());
                if (str4 != null) {
                    Intrinsics.checkNotNullParameter(str4, "<set-?>");
                    fVar2.f1926f = str4;
                    return;
                }
                return;
            default:
                return;
        }
    }
}

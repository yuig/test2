package re1;

import com.pinterest.api.model.fj;
import com.pinterest.api.model.zh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z32.x2;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f107639a;

    /* renamed from: b, reason: collision with root package name */
    public final fj f107640b;

    /* renamed from: c, reason: collision with root package name */
    public final e f107641c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107642d;

    /* renamed from: e, reason: collision with root package name */
    public final x2 f107643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107644f;

    /* renamed from: g, reason: collision with root package name */
    public final q f107645g;

    /* renamed from: h, reason: collision with root package name */
    public final String f107646h;

    /* renamed from: i, reason: collision with root package name */
    public final d f107647i;

    /* renamed from: j, reason: collision with root package name */
    public final v f107648j;

    /* renamed from: k, reason: collision with root package name */
    public final String f107649k;

    /* renamed from: l, reason: collision with root package name */
    public final v f107650l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f107651m;

    /* renamed from: n, reason: collision with root package name */
    public final s f107652n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f107653o;

    /* renamed from: p, reason: collision with root package name */
    public final List f107654p;

    /* renamed from: q, reason: collision with root package name */
    public final t f107655q;

    /* renamed from: r, reason: collision with root package name */
    public final zh f107656r;

    /* renamed from: s, reason: collision with root package name */
    public final Function1 f107657s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f107658t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f107659u;

    public r(String storyId, fj headerDisplay, e eVar, String str, x2 titlePosition, boolean z13, q headerDimensionSpec, String str2, d dVar, v subtitleStyleSpec, String str3, v descriptionStyleSpec, boolean z14, s sVar, boolean z15, List list, t tVar, zh zhVar, Function1 function1, boolean z16, boolean z17) {
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(headerDisplay, "headerDisplay");
        Intrinsics.checkNotNullParameter(titlePosition, "titlePosition");
        Intrinsics.checkNotNullParameter(headerDimensionSpec, "headerDimensionSpec");
        Intrinsics.checkNotNullParameter(subtitleStyleSpec, "subtitleStyleSpec");
        Intrinsics.checkNotNullParameter(descriptionStyleSpec, "descriptionStyleSpec");
        this.f107639a = storyId;
        this.f107640b = headerDisplay;
        this.f107641c = eVar;
        this.f107642d = str;
        this.f107643e = titlePosition;
        this.f107644f = z13;
        this.f107645g = headerDimensionSpec;
        this.f107646h = str2;
        this.f107647i = dVar;
        this.f107648j = subtitleStyleSpec;
        this.f107649k = str3;
        this.f107650l = descriptionStyleSpec;
        this.f107651m = z14;
        this.f107652n = sVar;
        this.f107653o = z15;
        this.f107654p = list;
        this.f107655q = tVar;
        this.f107656r = zhVar;
        this.f107657s = function1;
        this.f107658t = z16;
        this.f107659u = z17;
    }

    public static r a(r rVar, String str, String str2, String str3, Function1 function1, int i13) {
        String storyId = (i13 & 1) != 0 ? rVar.f107639a : str;
        String str4 = (i13 & 8) != 0 ? rVar.f107642d : str2;
        String str5 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? rVar.f107646h : str3;
        Function1 function12 = (i13 & 262144) != 0 ? rVar.f107657s : function1;
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        fj headerDisplay = rVar.f107640b;
        Intrinsics.checkNotNullParameter(headerDisplay, "headerDisplay");
        x2 titlePosition = rVar.f107643e;
        Intrinsics.checkNotNullParameter(titlePosition, "titlePosition");
        q headerDimensionSpec = rVar.f107645g;
        Intrinsics.checkNotNullParameter(headerDimensionSpec, "headerDimensionSpec");
        v subtitleStyleSpec = rVar.f107648j;
        Intrinsics.checkNotNullParameter(subtitleStyleSpec, "subtitleStyleSpec");
        v descriptionStyleSpec = rVar.f107650l;
        Intrinsics.checkNotNullParameter(descriptionStyleSpec, "descriptionStyleSpec");
        return new r(storyId, headerDisplay, rVar.f107641c, str4, titlePosition, rVar.f107644f, headerDimensionSpec, str5, rVar.f107647i, subtitleStyleSpec, rVar.f107649k, descriptionStyleSpec, rVar.f107651m, rVar.f107652n, rVar.f107653o, rVar.f107654p, rVar.f107655q, rVar.f107656r, function12, rVar.f107658t, rVar.f107659u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f107639a, rVar.f107639a) && Intrinsics.d(this.f107640b, rVar.f107640b) && Intrinsics.d(this.f107641c, rVar.f107641c) && Intrinsics.d(this.f107642d, rVar.f107642d) && this.f107643e == rVar.f107643e && this.f107644f == rVar.f107644f && Intrinsics.d(this.f107645g, rVar.f107645g) && Intrinsics.d(this.f107646h, rVar.f107646h) && Intrinsics.d(this.f107647i, rVar.f107647i) && Intrinsics.d(this.f107648j, rVar.f107648j) && Intrinsics.d(this.f107649k, rVar.f107649k) && Intrinsics.d(this.f107650l, rVar.f107650l) && this.f107651m == rVar.f107651m && Intrinsics.d(this.f107652n, rVar.f107652n) && this.f107653o == rVar.f107653o && Intrinsics.d(this.f107654p, rVar.f107654p) && Intrinsics.d(this.f107655q, rVar.f107655q) && Intrinsics.d(this.f107656r, rVar.f107656r) && Intrinsics.d(this.f107657s, rVar.f107657s) && this.f107658t == rVar.f107658t && this.f107659u == rVar.f107659u;
    }

    public final int hashCode() {
        int hashCode = (this.f107640b.hashCode() + (this.f107639a.hashCode() * 31)) * 31;
        e eVar = this.f107641c;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f107642d;
        int hashCode3 = (this.f107645g.hashCode() + ep.b.e(this.f107644f, (this.f107643e.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31)) * 31;
        String str2 = this.f107646h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f107647i;
        int hashCode5 = (this.f107648j.hashCode() + ((hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        String str3 = this.f107649k;
        int e13 = ep.b.e(this.f107651m, (this.f107650l.hashCode() + ((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31);
        s sVar = this.f107652n;
        int e14 = ep.b.e(this.f107653o, (e13 + (sVar == null ? 0 : sVar.hashCode())) * 31, 31);
        List list = this.f107654p;
        int hashCode6 = (e14 + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.f107655q;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        zh zhVar = this.f107656r;
        int hashCode8 = (hashCode7 + (zhVar == null ? 0 : zhVar.hashCode())) * 31;
        Function1 function1 = this.f107657s;
        return Boolean.hashCode(this.f107659u) + ep.b.e(this.f107658t, (hashCode8 + (function1 != null ? function1.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeaderModel(storyId=");
        sb3.append(this.f107639a);
        sb3.append(", headerDisplay=");
        sb3.append(this.f107640b);
        sb3.append(", action=");
        sb3.append(this.f107641c);
        sb3.append(", title=");
        sb3.append(this.f107642d);
        sb3.append(", titlePosition=");
        sb3.append(this.f107643e);
        sb3.append(", shouldForceHideTitle=");
        sb3.append(this.f107644f);
        sb3.append(", headerDimensionSpec=");
        sb3.append(this.f107645g);
        sb3.append(", subtitle=");
        sb3.append(this.f107646h);
        sb3.append(", headerUserViewModel=");
        sb3.append(this.f107647i);
        sb3.append(", subtitleStyleSpec=");
        sb3.append(this.f107648j);
        sb3.append(", description=");
        sb3.append(this.f107649k);
        sb3.append(", descriptionStyleSpec=");
        sb3.append(this.f107650l);
        sb3.append(", shouldShowArrowOnly=");
        sb3.append(this.f107651m);
        sb3.append(", singleThumbnail=");
        sb3.append(this.f107652n);
        sb3.append(", isHeroHeader=");
        sb3.append(this.f107653o);
        sb3.append(", thumbnailStack=");
        sb3.append(this.f107654p);
        sb3.append(", heroImageData=");
        sb3.append(this.f107655q);
        sb3.append(", attributionDisplayOptions=");
        sb3.append(this.f107656r);
        sb3.append(", attributionNavigator=");
        sb3.append(this.f107657s);
        sb3.append(", shouldUseLightMetadata=");
        sb3.append(this.f107658t);
        sb3.append(", shouldShowBetaBadge=");
        return a.a.r(sb3, this.f107659u, ")");
    }
}

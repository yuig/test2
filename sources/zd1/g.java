package zd1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends h {

    /* renamed from: a */
    public final t32.f f141710a;

    /* renamed from: b */
    public final q f141711b;

    /* renamed from: c */
    public final List f141712c;

    /* renamed from: d */
    public final String f141713d;

    /* renamed from: e */
    public final String f141714e;

    /* renamed from: f */
    public final String f141715f;

    /* renamed from: g */
    public final String f141716g;

    /* renamed from: h */
    public final String f141717h;

    /* renamed from: i */
    public final t32.i f141718i;

    /* renamed from: j */
    public boolean f141719j;

    /* renamed from: k */
    public final boolean f141720k;

    /* renamed from: l */
    public final boolean f141721l;

    /* renamed from: m */
    public final boolean f141722m;

    /* renamed from: n */
    public final boolean f141723n;

    /* renamed from: o */
    public final String f141724o;

    /* renamed from: p */
    public final Integer f141725p;

    /* renamed from: q */
    public final String f141726q;

    /* renamed from: r */
    public final String f141727r;

    public /* synthetic */ g(t32.f fVar, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, t32.i iVar, boolean z13, boolean z14, boolean z15, boolean z16, String str6, Integer num, String str7, String str8, int i13) {
        this(fVar, q.MULTI_SELECT_FILTER_ITEM, (i13 & 4) != 0 ? null : arrayList, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, str3, str4, str5, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : iVar, z13, (i13 & 1024) != 0 ? false : z14, (i13 & 2048) != 0 ? false : z15, (i13 & 4096) != 0 ? false : z16, false, (i13 & 16384) != 0 ? null : str6, (32768 & i13) != 0 ? null : num, (65536 & i13) != 0 ? null : str7, (i13 & 131072) != 0 ? null : str8);
    }

    @Override // zd1.h
    public final h a() {
        boolean z13 = this.f141719j;
        q filterType = this.f141711b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        String label = this.f141715f;
        Intrinsics.checkNotNullParameter(label, "label");
        String value = this.f141716g;
        Intrinsics.checkNotNullParameter(value, "value");
        String imageUrl = this.f141717h;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new g(this.f141710a, filterType, this.f141712c, this.f141713d, this.f141714e, label, value, imageUrl, this.f141718i, z13, this.f141720k, this.f141721l, this.f141722m, this.f141723n, this.f141724o, this.f141725p, this.f141726q, this.f141727r);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141711b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f141710a == gVar.f141710a && this.f141711b == gVar.f141711b && Intrinsics.d(this.f141712c, gVar.f141712c) && Intrinsics.d(this.f141713d, gVar.f141713d) && Intrinsics.d(this.f141714e, gVar.f141714e) && Intrinsics.d(this.f141715f, gVar.f141715f) && Intrinsics.d(this.f141716g, gVar.f141716g) && Intrinsics.d(this.f141717h, gVar.f141717h) && this.f141718i == gVar.f141718i && this.f141719j == gVar.f141719j && this.f141720k == gVar.f141720k && this.f141721l == gVar.f141721l && this.f141722m == gVar.f141722m && this.f141723n == gVar.f141723n && Intrinsics.d(this.f141724o, gVar.f141724o) && Intrinsics.d(this.f141725p, gVar.f141725p) && Intrinsics.d(this.f141726q, gVar.f141726q) && Intrinsics.d(this.f141727r, gVar.f141727r);
    }

    public final int hashCode() {
        t32.f fVar = this.f141710a;
        int hashCode = (this.f141711b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31;
        List list = this.f141712c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f141713d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141714e;
        int d2 = cb.d(this.f141717h, cb.d(this.f141716g, cb.d(this.f141715f, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31);
        t32.i iVar = this.f141718i;
        int e13 = ep.b.e(this.f141723n, ep.b.e(this.f141722m, ep.b.e(this.f141721l, ep.b.e(this.f141720k, ep.b.e(this.f141719j, (d2 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str3 = this.f141724o;
        int hashCode4 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f141725p;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f141726q;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f141727r;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        boolean z13 = this.f141719j;
        StringBuilder sb3 = new StringBuilder("MultiSelectFilter(thriftProductFilterType=");
        sb3.append(this.f141710a);
        sb3.append(", filterType=");
        sb3.append(this.f141711b);
        sb3.append(", rules=");
        sb3.append(this.f141712c);
        sb3.append(", filterOptionId=");
        sb3.append(this.f141713d);
        sb3.append(", filterId=");
        sb3.append(this.f141714e);
        sb3.append(", label=");
        sb3.append(this.f141715f);
        sb3.append(", value=");
        sb3.append(this.f141716g);
        sb3.append(", imageUrl=");
        sb3.append(this.f141717h);
        sb3.append(", searchType=");
        sb3.append(this.f141718i);
        sb3.append(", isSelected=");
        sb3.append(z13);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f141720k);
        sb3.append(", isSingleSelect=");
        sb3.append(this.f141721l);
        sb3.append(", isRadio=");
        sb3.append(this.f141722m);
        sb3.append(", isDisabled=");
        sb3.append(this.f141723n);
        sb3.append(", domain=");
        sb3.append(this.f141724o);
        sb3.append(", numericValue=");
        sb3.append(this.f141725p);
        sb3.append(", moduleId=");
        sb3.append(this.f141726q);
        sb3.append(", errorStateLabel=");
        return a.a.p(sb3, this.f141727r, ")");
    }

    public g(t32.f fVar, q filterType, List list, String str, String str2, String label, String value, String imageUrl, t32.i iVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f141710a = fVar;
        this.f141711b = filterType;
        this.f141712c = list;
        this.f141713d = str;
        this.f141714e = str2;
        this.f141715f = label;
        this.f141716g = value;
        this.f141717h = imageUrl;
        this.f141718i = iVar;
        this.f141719j = z13;
        this.f141720k = z14;
        this.f141721l = z15;
        this.f141722m = z16;
        this.f141723n = z17;
        this.f141724o = str3;
        this.f141725p = num;
        this.f141726q = str4;
        this.f141727r = str5;
    }
}

package dc0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.b0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f54337a;

    /* renamed from: b, reason: collision with root package name */
    public final g f54338b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f54339c;

    /* renamed from: d, reason: collision with root package name */
    public final k f54340d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f54341e;

    /* renamed from: f, reason: collision with root package name */
    public final vn1.c f54342f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54343g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54344h;

    /* renamed from: i, reason: collision with root package name */
    public final String f54345i;

    /* renamed from: j, reason: collision with root package name */
    public final String f54346j;

    /* renamed from: k, reason: collision with root package name */
    public final String f54347k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f54348l;

    /* renamed from: m, reason: collision with root package name */
    public final u50.n f54349m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f54350n;

    /* renamed from: o, reason: collision with root package name */
    public final int f54351o;

    /* renamed from: p, reason: collision with root package name */
    public final l f54352p;

    /* renamed from: q, reason: collision with root package name */
    public final n f54353q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f54354r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f54355s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f54356t;

    /* renamed from: u, reason: collision with root package name */
    public final f f54357u;

    /* renamed from: v, reason: collision with root package name */
    public final d f54358v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f54359w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f54360x;

    public o(q boardRepSize, g imageData, Integer num, k kVar, Integer num2, vn1.c primaryTextColor, String titleText, String primaryDescriptor, String str, String str2, String contentDescription, boolean z13, u50.n titleCreatorsSpacing, boolean z14, int i13, l lVar, n nVar, boolean z15, boolean z16, boolean z17, f metadataStyle, d dVar, boolean z18, boolean z19) {
        Intrinsics.checkNotNullParameter(boardRepSize, "boardRepSize");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(primaryTextColor, "primaryTextColor");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(primaryDescriptor, "primaryDescriptor");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(titleCreatorsSpacing, "titleCreatorsSpacing");
        Intrinsics.checkNotNullParameter(metadataStyle, "metadataStyle");
        this.f54337a = boardRepSize;
        this.f54338b = imageData;
        this.f54339c = num;
        this.f54340d = kVar;
        this.f54341e = num2;
        this.f54342f = primaryTextColor;
        this.f54343g = titleText;
        this.f54344h = primaryDescriptor;
        this.f54345i = str;
        this.f54346j = str2;
        this.f54347k = contentDescription;
        this.f54348l = z13;
        this.f54349m = titleCreatorsSpacing;
        this.f54350n = z14;
        this.f54351o = i13;
        this.f54352p = lVar;
        this.f54353q = nVar;
        this.f54354r = z15;
        this.f54355s = z16;
        this.f54356t = z17;
        this.f54357u = metadataStyle;
        this.f54358v = dVar;
        this.f54359w = z18;
        this.f54360x = z19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f54337a == oVar.f54337a && Intrinsics.d(this.f54338b, oVar.f54338b) && Intrinsics.d(this.f54339c, oVar.f54339c) && Intrinsics.d(this.f54340d, oVar.f54340d) && Intrinsics.d(this.f54341e, oVar.f54341e) && this.f54342f == oVar.f54342f && Intrinsics.d(this.f54343g, oVar.f54343g) && Intrinsics.d(this.f54344h, oVar.f54344h) && Intrinsics.d(this.f54345i, oVar.f54345i) && Intrinsics.d(this.f54346j, oVar.f54346j) && Intrinsics.d(this.f54347k, oVar.f54347k) && this.f54348l == oVar.f54348l && Intrinsics.d(this.f54349m, oVar.f54349m) && this.f54350n == oVar.f54350n && this.f54351o == oVar.f54351o && Intrinsics.d(this.f54352p, oVar.f54352p) && Intrinsics.d(this.f54353q, oVar.f54353q) && this.f54354r == oVar.f54354r && this.f54355s == oVar.f54355s && this.f54356t == oVar.f54356t && this.f54357u == oVar.f54357u && this.f54358v == oVar.f54358v && this.f54359w == oVar.f54359w && this.f54360x == oVar.f54360x;
    }

    public final int hashCode() {
        int hashCode = (this.f54338b.hashCode() + (this.f54337a.hashCode() * 31)) * 31;
        Integer num = this.f54339c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        k kVar = this.f54340d;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Integer num2 = this.f54341e;
        int d2 = cb.d(this.f54344h, cb.d(this.f54343g, (this.f54342f.hashCode() + ((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f54345i;
        int hashCode4 = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54346j;
        int b13 = ep.b.b(this.f54351o, ep.b.e(this.f54350n, d7.g.e(this.f54349m, ep.b.e(this.f54348l, cb.d(this.f54347k, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31);
        l lVar = this.f54352p;
        int hashCode5 = (b13 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f54353q;
        int hashCode6 = (this.f54357u.hashCode() + ep.b.e(this.f54356t, ep.b.e(this.f54355s, ep.b.e(this.f54354r, (hashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31), 31), 31)) * 31;
        d dVar = this.f54358v;
        return Boolean.hashCode(this.f54360x) + ep.b.e(this.f54359w, (hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegoBoardRepViewModel(boardRepSize=");
        sb3.append(this.f54337a);
        sb3.append(", imageData=");
        sb3.append(this.f54338b);
        sb3.append(", bottomSpacingOverride=");
        sb3.append(this.f54339c);
        sb3.append(", collaboratorDisplayData=");
        sb3.append(this.f54340d);
        sb3.append(", backgroundColor=");
        sb3.append(this.f54341e);
        sb3.append(", primaryTextColor=");
        sb3.append(this.f54342f);
        sb3.append(", titleText=");
        sb3.append(this.f54343g);
        sb3.append(", primaryDescriptor=");
        sb3.append(this.f54344h);
        sb3.append(", secondaryDescriptor=");
        sb3.append(this.f54345i);
        sb3.append(", statusDescriptor=");
        sb3.append(this.f54346j);
        sb3.append(", contentDescription=");
        sb3.append(this.f54347k);
        sb3.append(", shouldShowSensitiveContentWarning=");
        sb3.append(this.f54348l);
        sb3.append(", titleCreatorsSpacing=");
        sb3.append(this.f54349m);
        sb3.append(", hideMetadata=");
        sb3.append(this.f54350n);
        sb3.append(", placeholderColor=");
        sb3.append(this.f54351o);
        sb3.append(", creatorInfoData=");
        sb3.append(this.f54352p);
        sb3.append(", analyticsData=");
        sb3.append(this.f54353q);
        sb3.append(", isConversationBoard=");
        sb3.append(this.f54354r);
        sb3.append(", isConversationBoardThread=");
        sb3.append(this.f54355s);
        sb3.append(", twoLinesTitle=");
        sb3.append(this.f54356t);
        sb3.append(", metadataStyle=");
        sb3.append(this.f54357u);
        sb3.append(", icon=");
        sb3.append(this.f54358v);
        sb3.append(", showUpdateIndicator=");
        sb3.append(this.f54359w);
        sb3.append(", showCreateButton=");
        return a.a.r(sb3, this.f54360x, ")");
    }

    public o(q qVar, g gVar, Integer num, k kVar, Integer num2, vn1.c cVar, String str, String str2, String str3, String str4, String str5, boolean z13, u50.n nVar, boolean z14, int i13, l lVar, n nVar2, boolean z15, boolean z16, boolean z17, f fVar, d dVar, boolean z18, boolean z19, int i14) {
        this(qVar, gVar, num, kVar, num2, (i14 & 32) != 0 ? vn1.c.DEFAULT : cVar, str, str2, str3, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str4, str5, (i14 & 2048) != 0 ? false : z13, (i14 & 4096) != 0 ? new b0(eo1.c.space_200) : nVar, (i14 & 8192) != 0 ? false : z14, (i14 & 16384) != 0 ? ga2.a.color_empty_state_gray : i13, (32768 & i14) != 0 ? null : lVar, (65536 & i14) != 0 ? null : nVar2, (131072 & i14) != 0 ? false : z15, (262144 & i14) != 0 ? false : z16, (524288 & i14) != 0 ? false : z17, (1048576 & i14) != 0 ? f.DEFAULT : fVar, (2097152 & i14) != 0 ? null : dVar, (4194304 & i14) != 0 ? false : z18, (i14 & 8388608) != 0 ? false : z19);
    }
}

package q72;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r72.o1;
import r72.x0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f102798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102800c;

    /* renamed from: d, reason: collision with root package name */
    public final String f102801d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102802e;

    /* renamed from: f, reason: collision with root package name */
    public final String f102803f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f102804g;

    /* renamed from: h, reason: collision with root package name */
    public final e f102805h;

    /* renamed from: i, reason: collision with root package name */
    public final f f102806i;

    /* renamed from: j, reason: collision with root package name */
    public final List f102807j;

    /* renamed from: k, reason: collision with root package name */
    public final c f102808k;

    /* renamed from: l, reason: collision with root package name */
    public final c f102809l;

    /* renamed from: m, reason: collision with root package name */
    public final c f102810m;

    /* renamed from: n, reason: collision with root package name */
    public final a f102811n;

    /* renamed from: o, reason: collision with root package name */
    public final String f102812o;

    /* renamed from: p, reason: collision with root package name */
    public final x0 f102813p;

    /* renamed from: q, reason: collision with root package name */
    public final o1 f102814q;

    public b(String id3, String str, String str2, String str3, String str4, String str5, x0 image, e eVar, f fVar, List list, c cVar, c cVar2, c cVar3, a aVar, String str6, x0 x0Var, o1 o1Var) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f102798a = id3;
        this.f102799b = str;
        this.f102800c = str2;
        this.f102801d = str3;
        this.f102802e = str4;
        this.f102803f = str5;
        this.f102804g = image;
        this.f102805h = eVar;
        this.f102806i = fVar;
        this.f102807j = list;
        this.f102808k = cVar;
        this.f102809l = cVar2;
        this.f102810m = cVar3;
        this.f102811n = aVar;
        this.f102812o = str6;
        this.f102813p = x0Var;
        this.f102814q = o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f102798a, bVar.f102798a) && Intrinsics.d(this.f102799b, bVar.f102799b) && Intrinsics.d(this.f102800c, bVar.f102800c) && Intrinsics.d(this.f102801d, bVar.f102801d) && Intrinsics.d(this.f102802e, bVar.f102802e) && Intrinsics.d(this.f102803f, bVar.f102803f) && Intrinsics.d(this.f102804g, bVar.f102804g) && Intrinsics.d(this.f102805h, bVar.f102805h) && Intrinsics.d(this.f102806i, bVar.f102806i) && Intrinsics.d(this.f102807j, bVar.f102807j) && Intrinsics.d(this.f102808k, bVar.f102808k) && Intrinsics.d(this.f102809l, bVar.f102809l) && Intrinsics.d(this.f102810m, bVar.f102810m) && Intrinsics.d(this.f102811n, bVar.f102811n) && Intrinsics.d(this.f102812o, bVar.f102812o) && Intrinsics.d(this.f102813p, bVar.f102813p) && Intrinsics.d(this.f102814q, bVar.f102814q);
    }

    public final int hashCode() {
        int hashCode = this.f102798a.hashCode() * 31;
        String str = this.f102799b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102800c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f102801d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f102802e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f102803f;
        int hashCode6 = (this.f102804g.hashCode() + ((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        e eVar = this.f102805h;
        int hashCode7 = (hashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.f102806i;
        int hashCode8 = (hashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        List list = this.f102807j;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.f102808k;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f102809l;
        int hashCode11 = (hashCode10 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f102810m;
        int hashCode12 = (hashCode11 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        a aVar = this.f102811n;
        int hashCode13 = (hashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str6 = this.f102812o;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        x0 x0Var = this.f102813p;
        int hashCode15 = (hashCode14 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        o1 o1Var = this.f102814q;
        return hashCode15 + (o1Var != null ? o1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o13 = cb.o("Pin(id=", kh2.d.i1(this.f102798a), ", imageSignature=");
        o13.append(this.f102799b);
        o13.append(", title=");
        o13.append(this.f102800c);
        o13.append(", link=");
        o13.append(this.f102801d);
        o13.append(", cacheableId=");
        o13.append(this.f102802e);
        o13.append(", gridTitle=");
        o13.append(this.f102803f);
        o13.append(", image=");
        o13.append(this.f102804g);
        o13.append(", metadata=");
        o13.append(this.f102805h);
        o13.append(", summary=");
        o13.append(this.f102806i);
        o13.append(", productPinData=");
        o13.append(this.f102807j);
        o13.append(", pinner=");
        o13.append(this.f102808k);
        o13.append(", nativeCreator=");
        o13.append(this.f102809l);
        o13.append(", originPinner=");
        o13.append(this.f102810m);
        o13.append(", linkDomain=");
        o13.append(this.f102811n);
        o13.append(", cutoutId=");
        o13.append(this.f102812o);
        o13.append(", cutoutImage=");
        o13.append(this.f102813p);
        o13.append(", cutout=");
        o13.append(this.f102814q);
        o13.append(")");
        return o13.toString();
    }
}

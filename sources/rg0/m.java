package rg0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final List f108052c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108053d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ArrayList pages, String str, String str2) {
        super(null, null);
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f108052c = pages;
        this.f108053d = str;
        this.f108054e = str2;
    }

    public static final m c(vd0.c cVar) {
        ArrayList arrayList;
        vd0.a aVar;
        int i13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        h hVar;
        String d2;
        vd0.a o13 = n60.o.o(cVar, "json", "pages", "optJsonArray(...)");
        ArrayList arrayList4 = new ArrayList();
        int d13 = o13.d();
        int i14 = 0;
        while (i14 < d13) {
            vd0.c j13 = o13.j(i14);
            String str = "title";
            vd0.c m13 = j13.m("title");
            l lVar = m13 != null ? new l(m13.d("body"), vn1.c.DEFAULT, vn1.g.HEADING_400) : null;
            vd0.c m14 = j13.m("subtitle");
            l lVar2 = m14 != null ? new l(m14.d("body"), vn1.c.DEFAULT, vn1.g.BODY_300) : null;
            vd0.a c13 = j13.c("additional_information_strings");
            if (c13 != null) {
                arrayList = new ArrayList(kotlin.collections.g0.q(c13, 10));
                Iterator it = c13.iterator();
                while (it.hasNext()) {
                    vd0.c cVar2 = (vd0.c) it.next();
                    arrayList.add(cVar2 != null ? new l(cVar2.d("body"), vn1.c.SUBTLE, vn1.g.BODY_200) : null);
                }
            } else {
                arrayList = null;
            }
            String d14 = j13.d("mobile_banner_image_url");
            String d15 = j13.d("button");
            vd0.a c14 = j13.c("information_list");
            if (c14 != null) {
                ArrayList arrayList5 = new ArrayList(kotlin.collections.g0.q(c14, 10));
                Iterator it2 = c14.iterator();
                while (it2.hasNext()) {
                    vd0.c cVar3 = (vd0.c) it2.next();
                    vd0.c m15 = cVar3.m("text");
                    vd0.a aVar2 = o13;
                    int i15 = d13;
                    Iterator it3 = it2;
                    l lVar3 = m15 != null ? new l(m15.d("body"), vn1.c.DEFAULT, vn1.g.BODY_300) : null;
                    vd0.c m16 = cVar3.m("icon");
                    if (m16 != null && (d2 = m16.d("style")) != null) {
                        int hashCode = d2.hashCode();
                        if (hashCode != -2011710186) {
                            if (hashCode == 188520051 && d2.equals("audio_mix")) {
                                hVar = new h(rm1.q.AUDIO_MIX, rm1.c.INFO, rm1.i.XS);
                            }
                        } else if (d2.equals("sparkle")) {
                            hVar = new h(rm1.q.SPARKLE, rm1.c.RECOMMENDATION, rm1.i.XS);
                        }
                        arrayList5.add(new i(lVar3, hVar));
                        it2 = it3;
                        o13 = aVar2;
                        d13 = i15;
                    }
                    hVar = null;
                    arrayList5.add(new i(lVar3, hVar));
                    it2 = it3;
                    o13 = aVar2;
                    d13 = i15;
                }
                aVar = o13;
                i13 = d13;
                arrayList2 = arrayList5;
            } else {
                aVar = o13;
                i13 = d13;
                arrayList2 = null;
            }
            vd0.a c15 = j13.c("selection_list");
            if (c15 != null) {
                ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(c15, 10));
                Iterator it4 = c15.iterator();
                int i16 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    vd0.c cVar4 = (vd0.c) next;
                    vd0.c m17 = cVar4.m(str);
                    Iterator it5 = it4;
                    String str2 = str;
                    l lVar4 = m17 != null ? new l(m17.d("body"), vn1.c.DEFAULT, vn1.g.HEADING_300) : null;
                    vd0.c m18 = cVar4.m("subtitle");
                    arrayList6.add(new k(lVar4, m18 != null ? new l(m18.d("body"), vn1.c.SUBTLE, vn1.g.BODY_300) : null, i16 == 0));
                    i16 = i17;
                    it4 = it5;
                    str = str2;
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            arrayList4.add(new j(lVar, lVar2, arrayList, d14, d15, arrayList2, arrayList3));
            i14++;
            o13 = aVar;
            d13 = i13;
        }
        return new m(arrayList4, cVar.d("success_message"), cVar.d("failure_message"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f108052c, mVar.f108052c) && Intrinsics.d(this.f108053d, mVar.f108053d) && Intrinsics.d(this.f108054e, mVar.f108054e);
    }

    public final int hashCode() {
        int hashCode = this.f108052c.hashCode() * 31;
        String str = this.f108053d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108054e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EuPromptDisplayData(pages=");
        sb3.append(this.f108052c);
        sb3.append(", successMessage=");
        sb3.append(this.f108053d);
        sb3.append(", failureMessage=");
        return a.a.p(sb3, this.f108054e, ")");
    }
}

package l8;

import android.net.Uri;
import android.text.TextUtils;
import d7.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.Set;
import pk.h1;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final z.a f82040f = z.a.n(",");

    /* renamed from: a, reason: collision with root package name */
    public final g f82041a;

    /* renamed from: b, reason: collision with root package name */
    public final h f82042b;

    /* renamed from: c, reason: collision with root package name */
    public final i f82043c;

    /* renamed from: d, reason: collision with root package name */
    public final j f82044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82045e;

    public l(g gVar, h hVar, i iVar, j jVar, int i13) {
        this.f82041a = gVar;
        this.f82042b = hVar;
        this.f82043c = iVar;
        this.f82044d = jVar;
        this.f82045e = i13;
    }

    public final g7.i a(g7.i iVar) {
        pk.x xVar = new pk.x();
        g gVar = this.f82041a;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (gVar.f82006a != -2147483647) {
            arrayList.add("br=" + gVar.f82006a);
        }
        if (gVar.f82007b != -2147483647) {
            arrayList.add("tb=" + gVar.f82007b);
        }
        if (gVar.f82008c != -9223372036854775807L) {
            arrayList.add("d=" + gVar.f82008c);
        }
        if (!TextUtils.isEmpty(gVar.f82009d)) {
            arrayList.add("ot=" + gVar.f82009d);
        }
        arrayList.addAll(gVar.f82010e);
        if (!arrayList.isEmpty()) {
            xVar.e(arrayList, "CMCD-Object");
        }
        h hVar = this.f82042b;
        hVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (hVar.f82011a != -9223372036854775807L) {
            arrayList2.add("bl=" + hVar.f82011a);
        }
        if (hVar.f82012b != -2147483647L) {
            arrayList2.add("mtp=" + hVar.f82012b);
        }
        if (hVar.f82013c != -9223372036854775807L) {
            arrayList2.add("dl=" + hVar.f82013c);
        }
        if (hVar.f82014d) {
            arrayList2.add("su");
        }
        if (!TextUtils.isEmpty(hVar.f82015e)) {
            String str = hVar.f82015e;
            int i13 = n0.f53866a;
            Locale locale = Locale.US;
            arrayList2.add("nor=\"" + str + "\"");
        }
        if (!TextUtils.isEmpty(hVar.f82016f)) {
            String str2 = hVar.f82016f;
            int i14 = n0.f53866a;
            Locale locale2 = Locale.US;
            arrayList2.add("nrr=\"" + str2 + "\"");
        }
        arrayList2.addAll(hVar.f82017g);
        if (!arrayList2.isEmpty()) {
            xVar.e(arrayList2, "CMCD-Request");
        }
        i iVar2 = this.f82043c;
        iVar2.getClass();
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(iVar2.f82018a)) {
            String str3 = iVar2.f82018a;
            int i15 = n0.f53866a;
            Locale locale3 = Locale.US;
            arrayList3.add("cid=\"" + str3 + "\"");
        }
        if (!TextUtils.isEmpty(iVar2.f82019b)) {
            String str4 = iVar2.f82019b;
            int i16 = n0.f53866a;
            Locale locale4 = Locale.US;
            arrayList3.add("sid=\"" + str4 + "\"");
        }
        if (!TextUtils.isEmpty(iVar2.f82020c)) {
            arrayList3.add("sf=" + iVar2.f82020c);
        }
        if (!TextUtils.isEmpty(iVar2.f82021d)) {
            arrayList3.add("st=" + iVar2.f82021d);
        }
        float f13 = iVar2.f82022e;
        if (f13 != -3.4028235E38f && f13 != 1.0f) {
            Object[] objArr = {"pr", Float.valueOf(f13)};
            int i17 = n0.f53866a;
            arrayList3.add(String.format(Locale.US, "%s=%.2f", objArr));
        }
        arrayList3.addAll(iVar2.f82023f);
        if (!arrayList3.isEmpty()) {
            xVar.e(arrayList3, "CMCD-Session");
        }
        j jVar = this.f82044d;
        jVar.getClass();
        ArrayList arrayList4 = new ArrayList();
        if (jVar.f82024a != -2147483647) {
            arrayList4.add("rtp=" + jVar.f82024a);
        }
        if (jVar.f82025b) {
            arrayList4.add("bs");
        }
        arrayList4.addAll(jVar.f82026c);
        if (!arrayList4.isEmpty()) {
            xVar.e(arrayList4, "CMCD-Status");
        }
        int i18 = this.f82045e;
        z.a aVar = f82040f;
        if (i18 != 0) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it = xVar.a().values().iterator();
            while (it.hasNext()) {
                arrayList5.addAll((Collection) it.next());
            }
            Collections.sort(arrayList5);
            Uri.Builder appendQueryParameter = iVar.f63786a.buildUpon().appendQueryParameter("CMCD", aVar.l(arrayList5));
            g7.h a13 = iVar.a();
            a13.f63776a = appendQueryParameter.build();
            return a13.a();
        }
        d7.b0 a14 = h1.a();
        Set<String> set = xVar.f100505a;
        if (set == null) {
            set = xVar.i();
            xVar.f100505a = set;
        }
        for (String str5 : set) {
            Collection collection = (Collection) xVar.f100375d.get(str5);
            if (collection == null) {
                collection = xVar.h();
            }
            List list = (List) collection;
            List nVar = list instanceof RandomAccess ? new pk.n(xVar, str5, list, null) : new pk.s(xVar, str5, list, null);
            Collections.sort(nVar);
            a14.e(str5, aVar.l(nVar));
        }
        return iVar.f(a14.a());
    }
}

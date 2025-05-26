package rr0;

import android.net.Uri;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import m60.g0;
import m60.h0;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f109877a;

    /* renamed from: b, reason: collision with root package name */
    public final as1.c f109878b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(m60.g0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pageSizeProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            as1.b r0 = as1.b.a()
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rr0.b.<init>(m60.g0):void");
    }

    public final String a(String str, int i13, String str2, String str3) {
        String str4;
        List split$default;
        List split$default2;
        String queryParameter;
        if (str != null && j1.d1(str) && j1.d1(str2)) {
            String valueOf = String.valueOf(i13);
            Uri parse = Uri.parse(str);
            try {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                boolean z13 = false;
                for (String str5 : queryParameterNames) {
                    if (!Intrinsics.d(str5, "image_header_links_count")) {
                        if (str5 != null) {
                            int hashCode = str5.hashCode();
                            if (hashCode != -1966910237) {
                                if (hashCode != 883849137) {
                                    if (hashCode == 2005378358 && str5.equals("bookmark")) {
                                        queryParameter = str2;
                                        z13 = true;
                                        clearQuery.appendQueryParameter(str5, queryParameter);
                                    }
                                } else if (str5.equals("page_size")) {
                                    queryParameter = b(parse.getQueryParameter("page_size"));
                                    clearQuery.appendQueryParameter(str5, queryParameter);
                                }
                            } else if (str5.equals("item_count")) {
                                queryParameter = valueOf;
                                clearQuery.appendQueryParameter(str5, queryParameter);
                            }
                        }
                        queryParameter = parse.getQueryParameter(str5);
                        clearQuery.appendQueryParameter(str5, queryParameter);
                    }
                }
                if (!z13) {
                    clearQuery.appendQueryParameter("bookmark", str2);
                }
                str4 = clearQuery.toString();
                Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
                ((as1.b) this.f109878b).getClass();
                if (str4.contains("pin.images[")) {
                    str4 = as1.b.k(str4);
                } else if (str4.contains("pin.images%5B")) {
                    int indexOf = str4.indexOf("pin.images%5B");
                    int indexOf2 = str4.indexOf("%5D", indexOf) + 3;
                    if (indexOf2 == -1) {
                        indexOf2 = str4.length();
                    }
                    str4 = as1.b.l(indexOf, indexOf2, str4);
                }
            } catch (UnsupportedOperationException e13) {
                throw new UnsupportedOperationException("bad uri: '" + parse + "'", e13);
            }
        } else {
            str4 = "";
        }
        if (str3 == null || str3.length() == 0) {
            return str4;
        }
        split$default = StringsKt__StringsKt.split$default(str3, new String[]{"&"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!z.j((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
            str4 = new Regex("[?&;]" + split$default2.get(0) + ".*?(?=$|[?&;])").replace(str4, "");
        }
        return str4.length() != 0 ? z.n(((Object) str4) + str3, "/&", "/?") : "";
    }

    public String b(String str) {
        g0 g0Var = this.f109877a;
        String d2 = g0Var.d();
        String e13 = g0Var.e();
        return Intrinsics.d(str, d2) ? e13 : Intrinsics.d(str, e13) ? g0Var.c() : str;
    }

    public b(g0 pageSizeProvider, as1.c feedUrlFormatter) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(feedUrlFormatter, "feedUrlFormatter");
        this.f109877a = pageSizeProvider;
        this.f109878b = feedUrlFormatter;
    }

    public /* synthetic */ b() {
        this(new h0(hf0.b.q()));
    }
}

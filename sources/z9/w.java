package z9;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f141295q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f141296r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f141297a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141299c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f141300d;

    /* renamed from: e, reason: collision with root package name */
    public final String f141301e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f141302f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f141303g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.k f141304h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f141305i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.k f141306j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f141307k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.k f141308l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f141309m;

    /* renamed from: n, reason: collision with root package name */
    public final String f141310n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f141311o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f141312p;

    public w(String str, String str2, String mimeType) {
        List list;
        this.f141297a = str;
        this.f141298b = str2;
        this.f141299c = mimeType;
        ArrayList arrayList = new ArrayList();
        this.f141300d = arrayList;
        this.f141302f = xk2.m.b(new u(this, 6));
        this.f141303g = xk2.m.b(new u(this, 4));
        xk2.n nVar = xk2.n.NONE;
        this.f141304h = xk2.m.a(nVar, new u(this, 7));
        this.f141306j = xk2.m.a(nVar, new u(this, 1));
        this.f141307k = xk2.m.a(nVar, new u(this, 0));
        this.f141308l = xk2.m.a(nVar, new u(this, 3));
        this.f141309m = xk2.m.b(new u(this, 2));
        this.f141311o = xk2.m.b(new u(this, 5));
        if (str != null) {
            StringBuilder sb3 = new StringBuilder("^");
            if (!f141295q.matcher(str).find()) {
                sb3.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(substring, arrayList, sb3);
            this.f141312p = (StringsKt.E(sb3, ".*", false) || StringsKt.E(sb3, "([^/]+?)", false)) ? false : true;
            sb3.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "uriRegex.toString()");
            this.f141301e = kotlin.text.z.n(sb4, ".*", "\\E.*\\Q");
        }
        if (mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(mimeType).matches()) {
            throw new IllegalArgumentException(a.a.k("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
        }
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List f13 = new Regex("/").f(0, mimeType);
        if (!f13.isEmpty()) {
            ListIterator listIterator = f13.listIterator(f13.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = CollectionsKt.y0(f13, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = kotlin.collections.q0.f80391a;
        this.f141310n = kotlin.text.z.n(a.a.m("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, List list, StringBuilder sb3) {
        Matcher matcher = f141296r.matcher(str);
        int i13 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.g(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i13) {
                String substring = str.substring(i13, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(Pattern.quote(substring));
            }
            sb3.append("([^/]+?)");
            i13 = matcher.end();
        }
        if (i13 < str.length()) {
            String substring2 = str.substring(i13);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(Pattern.quote(substring2));
        }
    }

    public static void d(Bundle bundle, String key, String value, g gVar) {
        if (gVar == null) {
            bundle.putString(key, value);
            return;
        }
        o0 o0Var = gVar.f141184a;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        o0Var.e(bundle, key, o0Var.c(value));
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f141300d;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            String str = (String) next;
            String value = Uri.decode(matcher.group(i14));
            g gVar = (g) linkedHashMap.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                d(bundle, str, value, gVar);
                arrayList2.add(Unit.f80348a);
                i13 = i14;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        String query;
        w wVar = this;
        for (Map.Entry entry : ((Map) wVar.f141304h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            t tVar = (t) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (wVar.f141305i && (query = uri.getQuery()) != null && !Intrinsics.d(query, uri.toString())) {
                queryParameters = kotlin.collections.e0.b(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = tVar.f141288a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i13 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = tVar.f141289b;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                kotlin.collections.f0.p();
                                throw null;
                            }
                            String key = (String) next;
                            String group = matcher.group(i14);
                            if (group == null) {
                                group = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                            }
                            try {
                                g gVar = (g) linkedHashMap.get(key);
                                if (!bundle.containsKey(key)) {
                                    if (!Intrinsics.d(group, '{' + key + '}')) {
                                        d(bundle2, key, group, gVar);
                                    }
                                } else if (gVar != null) {
                                    o0 o0Var = gVar.f141184a;
                                    Object a13 = o0Var.a(key, bundle);
                                    Intrinsics.checkNotNullParameter(bundle, "bundle");
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    if (!bundle.containsKey(key)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    o0Var.e(bundle, key, o0Var.d(group, a13));
                                } else {
                                    continue;
                                }
                                arrayList2.add(Unit.f80348a);
                                i13 = i14;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            wVar = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f141297a, wVar.f141297a) && Intrinsics.d(this.f141298b, wVar.f141298b) && Intrinsics.d(this.f141299c, wVar.f141299c);
    }

    public final int hashCode() {
        String str = this.f141297a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f141298b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141299c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}

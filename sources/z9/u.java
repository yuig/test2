package z9;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141291i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f141292j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i13) {
        super(0);
        this.f141291i = i13;
        this.f141292j = wVar;
    }

    public final Pattern b() {
        int i13 = this.f141291i;
        w wVar = this.f141292j;
        switch (i13) {
            case 2:
                String str = (String) wVar.f141308l.getValue();
                if (str != null) {
                    return Pattern.compile(str, 2);
                }
                return null;
            case 5:
                String str2 = wVar.f141310n;
                if (str2 != null) {
                    return Pattern.compile(str2);
                }
                return null;
            default:
                String str3 = wVar.f141301e;
                if (str3 != null) {
                    return Pattern.compile(str3, 2);
                }
                return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i13 = this.f141291i;
        w wVar = this.f141292j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) wVar.f141306j.getValue();
                return (pair == null || (list = (List) pair.f80346a) == null) ? new ArrayList() : list;
            case 1:
                String str = wVar.f141297a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb3 = new StringBuilder();
                Intrinsics.f(fragment);
                w.a(fragment, arrayList, sb3);
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "fragRegex.toString()");
                return new Pair(arrayList, sb4);
            case 2:
                return b();
            case 3:
                Pair pair2 = (Pair) wVar.f141306j.getValue();
                if (pair2 != null) {
                    return (String) pair2.f80347b;
                }
                return null;
            case 4:
                String str2 = wVar.f141297a;
                return Boolean.valueOf((str2 == null || Uri.parse(str2).getQuery() == null) ? false : true);
            case 5:
                return b();
            case 6:
                return b();
            default:
                wVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) wVar.f141303g.getValue()).booleanValue()) {
                    String str3 = wVar.f141297a;
                    Uri parse = Uri.parse(str3);
                    for (String paramName : parse.getQueryParameterNames()) {
                        StringBuilder sb5 = new StringBuilder();
                        List<String> queryParams = parse.getQueryParameters(paramName);
                        if (queryParams.size() > 1) {
                            throw new IllegalArgumentException(a.a.m("Query parameter ", paramName, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                        String queryParam = (String) CollectionsKt.firstOrNull(queryParams);
                        if (queryParam == null) {
                            wVar.f141305i = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = w.f141296r.matcher(queryParam);
                        t tVar = new t();
                        int i14 = 0;
                        while (matcher.find()) {
                            String name = matcher.group(1);
                            Intrinsics.g(name, "null cannot be cast to non-null type kotlin.String");
                            Intrinsics.checkNotNullParameter(name, "name");
                            tVar.f141289b.add(name);
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String substring = queryParam.substring(i14, matcher.start());
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb5.append(Pattern.quote(substring));
                            sb5.append("(.+?)?");
                            i14 = matcher.end();
                        }
                        if (i14 < queryParam.length()) {
                            Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                            String substring2 = queryParam.substring(i14);
                            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                            sb5.append(Pattern.quote(substring2));
                        }
                        String sb6 = sb5.toString();
                        Intrinsics.checkNotNullExpressionValue(sb6, "argRegex.toString()");
                        tVar.f141288a = kotlin.text.z.n(sb6, ".*", "\\E.*\\Q");
                        Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                        linkedHashMap.put(paramName, tVar);
                    }
                }
                return linkedHashMap;
        }
    }
}

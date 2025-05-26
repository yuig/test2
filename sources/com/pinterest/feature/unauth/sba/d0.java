package com.pinterest.feature.unauth.sba;

import a.cb;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y30.i f48794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48795b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48796c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48797d;

    /* renamed from: e, reason: collision with root package name */
    public final String f48798e;

    /* renamed from: f, reason: collision with root package name */
    public final String f48799f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48800g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48801h;

    /* renamed from: i, reason: collision with root package name */
    public final String f48802i;

    public d0(y30.i article) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.f48794a = article;
        this.f48795b = cb.g("toString(...)");
        this.f48796c = String.valueOf(article.f136743d);
        this.f48797d = String.valueOf(article.f136744e);
        this.f48798e = "";
        this.f48799f = "";
        List list = article.f136742c;
        this.f48800g = String.valueOf(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        this.f48801h = "";
        this.f48802i = "";
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String a() {
        String str;
        String str2;
        y30.i iVar = this.f48794a;
        Boolean bool = iVar.f136747h;
        String str3 = "";
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            String title = iVar.f136743d;
            if (title != null) {
                Intrinsics.checkNotNullParameter(title, "title");
                String id3 = iVar.f136745f;
                Intrinsics.checkNotNullParameter(id3, "id");
                if (booleanValue) {
                    str2 = "shop";
                } else {
                    Integer valueOf = Integer.valueOf(z.SEARCH.getType());
                    Object obj = iVar.f136746g;
                    if (Intrinsics.d(obj, valueOf) || Intrinsics.d(obj, Integer.valueOf(z.HYBRID.getType()))) {
                        str2 = "trending";
                    } else if (Intrinsics.d(obj, Integer.valueOf(z.CURATED.getType()))) {
                        str2 = "best";
                    } else {
                        Intrinsics.d(obj, Integer.valueOf(z.ARTICLE_SECTIONS.getType()));
                        str2 = "article";
                    }
                }
                Intrinsics.checkNotNullParameter(title, "title");
                String lowerCase = title.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String component = new Regex("\\s+").replace(StringsKt.i0(new Regex("[.,/#!?$%\\^&\\*+;:{}=\\-_`~()’'\"]").replace(lowerCase, "")).toString(), "-");
                Intrinsics.checkNotNullParameter(component, "component");
                String encode = URLEncoder.encode(component, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
                str = a.a.p(a.a.w("/today/", str2, "/", kotlin.text.z.n(encode, "+", "%20"), "/"), id3, "/");
            } else {
                str = null;
            }
            if (str != null) {
                str3 = str;
            }
        }
        return a.a.k("https://www.pinterest.com", str3, "?ppm-unauth-android-experience=true");
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String e() {
        return this.f48799f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f48794a, ((d0) obj).f48794a);
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String g() {
        return this.f48801h;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getDescription() {
        return this.f48797d;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getId() {
        return this.f48795b;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String getTitle() {
        return this.f48796c;
    }

    public final int hashCode() {
        return this.f48794a.hashCode();
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String l() {
        return this.f48800g;
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String s() {
        return this.f48802i;
    }

    public final String toString() {
        return "UnauthPreloadExperienceTodayItemVMState(article=" + this.f48794a + ")";
    }

    @Override // com.pinterest.feature.unauth.sba.e0
    public final String u() {
        return this.f48798e;
    }
}

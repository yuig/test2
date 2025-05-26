package br;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wx;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yw;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import df.j1;
import dl1.l;
import dl1.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import pk.a0;
import tb0.g;
import tb0.h;
import z32.n1;

/* loaded from: classes3.dex */
public final class d extends wx implements Comparable, Serializable {
    public List A;

    /* renamed from: a, reason: collision with root package name */
    public String f23703a;

    /* renamed from: b, reason: collision with root package name */
    public String f23704b;

    /* renamed from: c, reason: collision with root package name */
    public String f23705c;

    /* renamed from: d, reason: collision with root package name */
    public String f23706d;

    /* renamed from: e, reason: collision with root package name */
    public c f23707e = c.NONE;

    /* renamed from: f, reason: collision with root package name */
    public String f23708f;

    /* renamed from: g, reason: collision with root package name */
    public String f23709g;

    /* renamed from: h, reason: collision with root package name */
    public String f23710h;

    /* renamed from: i, reason: collision with root package name */
    public String f23711i;

    /* renamed from: j, reason: collision with root package name */
    public int f23712j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23713k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23714l;

    /* renamed from: m, reason: collision with root package name */
    public int f23715m;

    /* renamed from: n, reason: collision with root package name */
    public String f23716n;

    /* renamed from: o, reason: collision with root package name */
    public String f23717o;

    /* renamed from: p, reason: collision with root package name */
    public List f23718p;

    /* renamed from: q, reason: collision with root package name */
    public vh f23719q;

    /* renamed from: r, reason: collision with root package name */
    public yw f23720r;

    /* renamed from: s, reason: collision with root package name */
    public String f23721s;

    /* renamed from: t, reason: collision with root package name */
    public String f23722t;

    /* renamed from: u, reason: collision with root package name */
    public n1 f23723u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23724v;

    /* renamed from: w, reason: collision with root package name */
    public int f23725w;

    /* renamed from: x, reason: collision with root package name */
    public List f23726x;

    /* renamed from: y, reason: collision with root package name */
    public String f23727y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f23728z;

    public static String k(vd0.a aVar) {
        int d2 = aVar.d();
        if (d2 == 0) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < d2; i13++) {
            vd0.c m13 = aVar.j(i13).m("60x60");
            String d13 = m13 != null ? m13.d("url") : null;
            if (d13 != null) {
                sb3.append(",");
                sb3.append(d13);
            }
        }
        return sb3.length() > 0 ? sb3.toString().substring(1) : "";
    }

    public final String a() {
        String str = this.f23710h;
        if (j1.d1(str)) {
            return (String) Arrays.asList(str.split(",")).get(0);
        }
        return null;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f23703a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str;
        if (!(obj instanceof d)) {
            return 0;
        }
        d dVar = (d) obj;
        String str2 = this.f23704b;
        if (str2 == null || (str = dVar.f23704b) == null) {
            return 0;
        }
        return str2.compareTo(str);
    }

    public final String e() {
        return this.f23706d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!v(this) || !v(dVar)) {
            return Objects.equals(this.f23706d, dVar.f23706d) && Objects.equals(this.f23708f, dVar.f23708f) && this.f23707e == dVar.f23707e && Objects.equals(this.f23704b, dVar.f23704b) && Objects.equals(this.f23709g, dVar.f23709g) && Objects.equals(this.f23727y, dVar.f23727y);
        }
        String str = this.f23704b;
        return str != null ? str.equals(dVar.f23704b) : dVar.f23704b == null;
    }

    public final String g() {
        return this.f23708f;
    }

    public final yw h() {
        return this.f23720r;
    }

    public final int hashCode() {
        String str = this.f23704b;
        int hashCode = str != null ? str.hashCode() : 0;
        c cVar = this.f23707e;
        if (cVar == c.PIN || cVar == c.PIN_LOCAL_CACHE || cVar == c.ENRICHED_AUTOCOMPLETE || cVar == c.NONE) {
            return hashCode;
        }
        int i13 = hashCode * 31;
        String str2 = this.f23706d;
        int hashCode2 = (i13 + (str2 != null ? str2.hashCode() : 0)) * 31;
        c cVar2 = this.f23707e;
        int hashCode3 = (hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        String str3 = this.f23708f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 961;
        String str4 = this.f23727y;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String j() {
        return this.f23704b;
    }

    public final void l(vd0.c cVar, ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge, ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge2, ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge3, ke0.a aVar, t tVar) {
        int ordinal;
        String str;
        int i13;
        vd0.c b13;
        try {
            u(cVar);
            ordinal = this.f23707e.ordinal();
        } catch (Exception e13) {
            HashSet hashSet = h.f117076w;
            g.f117075a.p(e13);
            return;
        }
        if (ordinal != 5 && ordinal != 6 && ordinal != 7 && ordinal != 8) {
            switch (ordinal) {
                case 13:
                    this.f23703a = cVar.o("id", "");
                    this.f23704b = cVar.o("query", "");
                    vd0.c m13 = cVar.m("pin");
                    if (m13 != null) {
                        this.f23703a = m13.o("id", "");
                        this.f23708f = m13.o("image_medium_url", "");
                    }
                    this.f23715m = cVar.j(0, "pin_count");
                    this.f23712j = cVar.j(0, "identifier_icon_name");
                    break;
                case 14:
                    this.f23703a = cVar.o("id", "");
                    this.f23706d = cVar.o("username", "");
                    this.f23704b = cVar.o("full_name", "");
                    this.f23705c = cVar.o("first_name", "");
                    this.f23708f = cVar.o("image_medium_url", "");
                    this.f23715m = cVar.j(0, "pin_count");
                    Boolean bool = Boolean.FALSE;
                    this.f23714l = cVar.h("is_verified_merchant", bool).booleanValue();
                    vd0.c m14 = cVar.m("verified_identity");
                    if (m14 != null) {
                        this.f23713k = m14.h("verified", bool).booleanValue();
                    }
                    if (cVar.h("show_creator_profile", bool).booleanValue()) {
                        ((l) tVar).Z((wy0) modelDeserializerWithSaveAndMerge.e(cVar, false, false));
                    }
                    this.f23728z = cVar.h("explicitly_followed_by_me", bool).booleanValue();
                    cVar.h("is_partner", bool).getClass();
                    this.f23725w = cVar.j(0, "avatar_color_index");
                    break;
                case 15:
                    this.f23703a = cVar.o("id", "");
                    this.f23704b = cVar.o("name", "");
                    this.f23706d = cVar.o("url", "");
                    String o13 = cVar.o("image_thumbnail_url", "");
                    String d2 = cVar.d("image_cover_url");
                    if (cVar.e("images") && (b13 = cVar.m("images").k("236x").b(0)) != null) {
                        str = b13.o("url", "");
                    }
                    if (d2 != null) {
                        o13 = d2;
                    } else if (str != null) {
                        o13 = str;
                    }
                    this.f23708f = o13;
                    this.f23715m = cVar.j(0, "pin_count");
                    vd0.c m15 = cVar.m("owner");
                    if (m15 != null) {
                        this.f23716n = m15.o("full_name", "");
                        break;
                    }
                    break;
                case 16:
                    break;
                case 17:
                    this.f23704b = cVar.o("query", "");
                    vd0.a k13 = cVar.k("pins");
                    ArrayList arrayList = new ArrayList();
                    int d13 = k13.d();
                    for (i13 = 0; i13 < d13; i13++) {
                        arrayList.add(((f30) modelDeserializerWithSaveAndMerge2.e(k13.j(i13), true, true)).getId());
                    }
                    this.f23718p = arrayList;
                    break;
                default:
                    switch (ordinal) {
                        case 24:
                            vd0.c m16 = cVar.m("title");
                            this.f23704b = m16 != null ? m16.d("format") : null;
                            this.f23727y = cVar.o("story_type", "");
                            vh vhVar = (vh) modelDeserializerWithSaveAndMerge3.e(cVar, false, false);
                            this.f23719q = vhVar;
                            this.f23726x = vhVar.f42865w;
                            break;
                        case 25:
                            this.f23703a = cVar.o("id", "");
                            this.f23704b = cVar.o("description", "");
                            this.f23721s = cVar.o("action_button_text", "");
                            this.f23722t = cVar.o("action_button_uri", "");
                            break;
                        case 26:
                            this.f23704b = cVar.o("query", "");
                            vd0.c m17 = cVar.m("action");
                            if (m17 != null) {
                                this.f23722t = m17.o("url", "");
                            }
                            this.f23723u = n1.findByValue(cVar.j(-1, "identifier_icon_name"));
                            vd0.a k14 = cVar.k("contextual_images");
                            if (k14.d() > 0) {
                                this.f23710h = k(k14);
                            }
                            this.f23709g = cVar.o("description", "");
                            this.f23724v = cVar.h("skip_dedup", Boolean.FALSE).booleanValue();
                            break;
                        case 27:
                            this.f23703a = cVar.o("id", "");
                            this.f23704b = cVar.o("query", "");
                            vd0.c m18 = cVar.m("pin");
                            if (m18 != null) {
                                this.f23703a = m18.o("id", "");
                                this.f23708f = m18.o("image_medium_url", "");
                            }
                            this.f23715m = cVar.j(0, "pin_count");
                            vd0.c m19 = cVar.m("modified_filter_eligibility");
                            if (m19 != null) {
                                this.f23720r = (yw) aVar.d(m19);
                                break;
                            }
                            break;
                    }
            }
            return;
        }
        this.f23703a = cVar.o("id", "");
        this.f23704b = cVar.o("query", "");
        String o14 = cVar.o("link", "");
        this.f23706d = o14;
        vd0.a k15 = cVar.k("image_preview_pins");
        this.f23711i = k15.d() > 0 ? k15.j(0).o("image_medium_url", "") : null;
        this.f23712j = cVar.j(0, "identifier_icon_name");
        if (a0.x0(o14)) {
            return;
        }
        String[] split = o14.split("\\?");
        if (split.length > 1) {
            String[] split2 = split[1].split("&");
            int length = split2.length;
            int i14 = 0;
            while (true) {
                if (i14 < length) {
                    String[] split3 = split2[i14].split("=");
                    if (split3.length == 2 && split3[0].equals("top_pin_ids")) {
                        str = split3[1];
                    } else {
                        i14++;
                    }
                }
            }
        }
        if (a0.x0(str)) {
            return;
        }
        this.A = Arrays.asList(str.split("(?i)%2C"));
    }

    public final void n() {
        this.f23720r = null;
    }

    public final void q(String str) {
        this.f23717o = str;
    }

    public final void s(String str) {
        this.f23704b = str;
    }

    public final String toString() {
        return this.f23704b;
    }

    public final void u(vd0.c cVar) {
        String o13 = cVar.o("type", "");
        o13.getClass();
        switch (o13) {
            case "enriched_autocomplete":
                this.f23707e = c.ENRICHED_AUTOCOMPLETE;
                break;
            case "recent_user_searches":
                this.f23707e = c.RECENT_HISTORY_PINNER;
                break;
            case "user":
                this.f23707e = c.PINNER;
                break;
            case "autocompleteupsell":
                this.f23707e = c.AUTO_COMPLETE_UPSELL;
                break;
            case "board":
                this.f23707e = c.BOARD;
                break;
            case "query":
            case "recent_query":
                if (cVar.m("modified_filter_eligibility") == null) {
                    this.f23707e = c.PIN;
                    break;
                } else {
                    this.f23707e = c.SEARCH_FILTER_QUERY;
                    break;
                }
            case "story":
                this.f23707e = c.STORY;
                break;
            case "recent_board_searches":
                this.f23707e = c.RECENT_HISTORY_BOARD;
                break;
            case "personal_query":
                this.f23707e = c.PERSONAL_QUERY;
                break;
            case "recent_personal_searches":
                this.f23707e = c.RECENT_HISTORY_MY_PIN;
                break;
            case "recommended_query":
                this.f23707e = c.RECOMMENDED_QUERY;
                break;
            case "recent_pin_searches":
                this.f23707e = c.RECENT_HISTORY_PIN;
                break;
        }
    }

    public final boolean v(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        c cVar = ((d) obj).f23707e;
        return cVar == c.PIN || cVar == c.PIN_LOCAL_CACHE || (cVar == c.ENRICHED_AUTOCOMPLETE && !this.f23724v) || cVar == c.NONE;
    }
}

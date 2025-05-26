package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class md {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40063a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40064b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("catalog_collection_type")
    private Integer f40065c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("collections_header_text")
    private String f40066d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("dpa_layout_type")
    private a f40067e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_dynamic_collections")
    private Boolean f40068f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("item_data")
    private List<st> f40069g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("root_pin_id")
    private String f40070h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("slideshow_collections_aspect_ratio")
    private Double f40071i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f40072j;

    public enum a {
        COLLECTION_HERO_AND_CHIPS(0),
        COLLECTION_TWO_BY_TWO(1),
        COLLECTION_TWO_BY_ONE(2),
        COLLECTION_TWO_BY_THREE(3);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ md(String str, String str2, Integer num, String str3, a aVar, Boolean bool, List list, String str4, Double d2, boolean[] zArr, int i13) {
        this(str, str2, num, str3, aVar, bool, list, str4, d2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        md mdVar = (md) obj;
        return Objects.equals(this.f40071i, mdVar.f40071i) && Objects.equals(this.f40068f, mdVar.f40068f) && Objects.equals(this.f40067e, mdVar.f40067e) && Objects.equals(this.f40065c, mdVar.f40065c) && Objects.equals(this.f40063a, mdVar.f40063a) && Objects.equals(this.f40064b, mdVar.f40064b) && Objects.equals(this.f40066d, mdVar.f40066d) && Objects.equals(this.f40069g, mdVar.f40069g) && Objects.equals(this.f40070h, mdVar.f40070h);
    }

    public final int hashCode() {
        return Objects.hash(this.f40063a, this.f40064b, this.f40065c, this.f40066d, this.f40067e, this.f40068f, this.f40069g, this.f40070h, this.f40071i);
    }

    public final Integer j() {
        Integer num = this.f40065c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String k() {
        return this.f40066d;
    }

    public final a l() {
        return this.f40067e;
    }

    public final List m() {
        return this.f40069g;
    }

    public final Double n() {
        Double d2 = this.f40071i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public md() {
        this.f40072j = new boolean[9];
    }

    private md(@NonNull String str, String str2, Integer num, String str3, a aVar, Boolean bool, List<st> list, String str4, Double d2, boolean[] zArr) {
        this.f40063a = str;
        this.f40064b = str2;
        this.f40065c = num;
        this.f40066d = str3;
        this.f40067e = aVar;
        this.f40068f = bool;
        this.f40069g = list;
        this.f40070h = str4;
        this.f40071i = d2;
        this.f40072j = zArr;
    }
}

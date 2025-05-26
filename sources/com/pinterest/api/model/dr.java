package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class dr implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36915a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36916b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("contributor_id")
    private String f36917c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f36918d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("display_name")
    private String f36919e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("fill_color")
    private String f36920f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("hero_image_signature")
    private String f36921g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("hero_image_url")
    private String f36922h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("tier")
    private Integer f36923i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f36924j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f36925k;

    public /* synthetic */ dr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, num, str9, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36915a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dr drVar = (dr) obj;
        return Objects.equals(this.f36923i, drVar.f36923i) && Objects.equals(this.f36915a, drVar.f36915a) && Objects.equals(this.f36916b, drVar.f36916b) && Objects.equals(this.f36917c, drVar.f36917c) && Objects.equals(this.f36918d, drVar.f36918d) && Objects.equals(this.f36919e, drVar.f36919e) && Objects.equals(this.f36920f, drVar.f36920f) && Objects.equals(this.f36921g, drVar.f36921g) && Objects.equals(this.f36922h, drVar.f36922h) && Objects.equals(this.f36924j, drVar.f36924j);
    }

    public final int hashCode() {
        return Objects.hash(this.f36915a, this.f36916b, this.f36917c, this.f36918d, this.f36919e, this.f36920f, this.f36921g, this.f36922h, this.f36923i, this.f36924j);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36916b;
    }

    public final String s() {
        return this.f36919e;
    }

    public final String u() {
        return this.f36920f;
    }

    public dr() {
        this.f36925k = new boolean[10];
    }

    private dr(@NonNull String str, String str2, String str3, String str4, @NonNull String str5, String str6, String str7, String str8, Integer num, @NonNull String str9, boolean[] zArr) {
        this.f36915a = str;
        this.f36916b = str2;
        this.f36917c = str3;
        this.f36918d = str4;
        this.f36919e = str5;
        this.f36920f = str6;
        this.f36921g = str7;
        this.f36922h = str8;
        this.f36923i = num;
        this.f36924j = str9;
        this.f36925k = zArr;
    }
}

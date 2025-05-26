package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class wd implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43219a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43220b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("display_name")
    private String f43221c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_signature")
    private String f43222d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_url")
    private String f43223e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f43224f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("keywords")
    private List<String> f43225g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("sticker_type")
    private Integer f43226h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("thumbnail_image_signature")
    private String f43227i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("thumbnail_image_url")
    private String f43228j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f43229k;

    public /* synthetic */ wd(String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num, String str7, String str8, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, list, num, str7, str8, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wd wdVar = (wd) obj;
        return Objects.equals(this.f43226h, wdVar.f43226h) && Objects.equals(this.f43219a, wdVar.f43219a) && Objects.equals(this.f43220b, wdVar.f43220b) && Objects.equals(this.f43221c, wdVar.f43221c) && Objects.equals(this.f43222d, wdVar.f43222d) && Objects.equals(this.f43223e, wdVar.f43223e) && Objects.equals(this.f43224f, wdVar.f43224f) && Objects.equals(this.f43225g, wdVar.f43225g) && Objects.equals(this.f43227i, wdVar.f43227i) && Objects.equals(this.f43228j, wdVar.f43228j);
    }

    public final int hashCode() {
        return Objects.hash(this.f43219a, this.f43220b, this.f43221c, this.f43222d, this.f43223e, this.f43224f, this.f43225g, this.f43226h, this.f43227i, this.f43228j);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43220b;
    }

    public final String s() {
        return this.f43221c;
    }

    public final String u() {
        return this.f43223e;
    }

    public final String v() {
        return this.f43228j;
    }

    public wd() {
        this.f43229k = new boolean[10];
    }

    private wd(@NonNull String str, String str2, @NonNull String str3, String str4, String str5, @NonNull String str6, List<String> list, Integer num, String str7, String str8, boolean[] zArr) {
        this.f43219a = str;
        this.f43220b = str2;
        this.f43221c = str3;
        this.f43222d = str4;
        this.f43223e = str5;
        this.f43224f = str6;
        this.f43225g = list;
        this.f43226h = num;
        this.f43227i = str7;
        this.f43228j = str8;
        this.f43229k = zArr;
    }
}

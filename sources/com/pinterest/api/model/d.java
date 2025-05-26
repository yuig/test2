package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36579a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36580b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("first_name")
    private String f36581c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("full_name")
    private String f36582d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_large_url")
    private String f36583e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image_medium_url")
    private String f36584f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_small_url")
    private String f36585g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("image_xlarge_url")
    private String f36586h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("last_name")
    private String f36587i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f36588j;

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36579a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f36579a, dVar.f36579a) && Objects.equals(this.f36580b, dVar.f36580b) && Objects.equals(this.f36581c, dVar.f36581c) && Objects.equals(this.f36582d, dVar.f36582d) && Objects.equals(this.f36583e, dVar.f36583e) && Objects.equals(this.f36584f, dVar.f36584f) && Objects.equals(this.f36585g, dVar.f36585g) && Objects.equals(this.f36586h, dVar.f36586h) && Objects.equals(this.f36587i, dVar.f36587i);
    }

    public final int hashCode() {
        return Objects.hash(this.f36579a, this.f36580b, this.f36581c, this.f36582d, this.f36583e, this.f36584f, this.f36585g, this.f36586h, this.f36587i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36580b;
    }

    public final String q() {
        return this.f36582d;
    }

    public final String s() {
        return this.f36584f;
    }

    public d() {
        this.f36588j = new boolean[9];
    }

    private d(@NonNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean[] zArr) {
        this.f36579a = str;
        this.f36580b = str2;
        this.f36581c = str3;
        this.f36582d = str4;
        this.f36583e = str5;
        this.f36584f = str6;
        this.f36585g = str7;
        this.f36586h = str8;
        this.f36587i = str9;
        this.f36588j = zArr;
    }
}

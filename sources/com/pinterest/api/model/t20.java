package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class t20 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42050a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42051b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f42052c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_urls_prefetch")
    private List<String> f42053d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f42054e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("insight_id")
    private String f42055f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("navigation_url")
    private String f42056g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("query")
    private String f42057h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("title")
    private String f42058i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f42059j;

    public /* synthetic */ t20(String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr, int i13) {
        this(str, str2, list, list2, str3, str4, str5, str6, str7, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42050a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return Objects.equals(this.f42050a, t20Var.f42050a) && Objects.equals(this.f42051b, t20Var.f42051b) && Objects.equals(this.f42052c, t20Var.f42052c) && Objects.equals(this.f42053d, t20Var.f42053d) && Objects.equals(this.f42054e, t20Var.f42054e) && Objects.equals(this.f42055f, t20Var.f42055f) && Objects.equals(this.f42056g, t20Var.f42056g) && Objects.equals(this.f42057h, t20Var.f42057h) && Objects.equals(this.f42058i, t20Var.f42058i);
    }

    public final int hashCode() {
        return Objects.hash(this.f42050a, this.f42051b, this.f42052c, this.f42053d, this.f42054e, this.f42055f, this.f42056g, this.f42057h, this.f42058i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42051b;
    }

    public t20() {
        this.f42059j = new boolean[9];
    }

    private t20(@NonNull String str, String str2, List<String> list, List<String> list2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr) {
        this.f42050a = str;
        this.f42051b = str2;
        this.f42052c = list;
        this.f42053d = list2;
        this.f42054e = str3;
        this.f42055f = str4;
        this.f42056g = str5;
        this.f42057h = str6;
        this.f42058i = str7;
        this.f42059j = zArr;
    }
}

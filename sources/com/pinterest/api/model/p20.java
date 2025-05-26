package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class p20 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40857a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40858b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("category")
    private String f40859c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f40860d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f40861e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("query")
    private String f40862f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("related_styles")
    private List<p20> f40863g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("short_description")
    private String f40864h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("title")
    private String f40865i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("vertical")
    private Integer f40866j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f40867k;

    public /* synthetic */ p20(String str, String str2, String str3, List list, String str4, String str5, List list2, String str6, String str7, Integer num, boolean[] zArr, int i13) {
        this(str, str2, str3, list, str4, str5, list2, str6, str7, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return Objects.equals(this.f40866j, p20Var.f40866j) && Objects.equals(this.f40857a, p20Var.f40857a) && Objects.equals(this.f40858b, p20Var.f40858b) && Objects.equals(this.f40859c, p20Var.f40859c) && Objects.equals(this.f40860d, p20Var.f40860d) && Objects.equals(this.f40861e, p20Var.f40861e) && Objects.equals(this.f40862f, p20Var.f40862f) && Objects.equals(this.f40863g, p20Var.f40863g) && Objects.equals(this.f40864h, p20Var.f40864h) && Objects.equals(this.f40865i, p20Var.f40865i);
    }

    public final int hashCode() {
        return Objects.hash(this.f40857a, this.f40858b, this.f40859c, this.f40860d, this.f40861e, this.f40862f, this.f40863g, this.f40864h, this.f40865i, this.f40866j);
    }

    public final String k() {
        return this.f40859c;
    }

    public final List l() {
        return this.f40860d;
    }

    public final String m() {
        return this.f40861e;
    }

    public final String n() {
        return this.f40862f;
    }

    public final List o() {
        return this.f40863g;
    }

    public final String p() {
        return this.f40864h;
    }

    public final String q() {
        return this.f40865i;
    }

    public final String r() {
        return this.f40857a;
    }

    public final Integer s() {
        Integer num = this.f40866j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public p20() {
        this.f40867k = new boolean[10];
    }

    private p20(@NonNull String str, String str2, String str3, List<String> list, String str4, String str5, List<p20> list2, String str6, String str7, Integer num, boolean[] zArr) {
        this.f40857a = str;
        this.f40858b = str2;
        this.f40859c = str3;
        this.f40860d = list;
        this.f40861e = str4;
        this.f40862f = str5;
        this.f40863g = list2;
        this.f40864h = str6;
        this.f40865i = str7;
        this.f40866j = num;
        this.f40867k = zArr;
    }
}

package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class g9 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37981a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37982b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board")
    private v7 f37983c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("checklist_placeholder")
    private String f37984d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("cover_images")
    private List<Map<String, sr>> f37985e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("created_at")
    private Date f37986f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("creator")
    private wy0 f37987g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("list_item_count")
    private Integer f37988h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("subtitle")
    private String f37989i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("subtitle_placeholder")
    private String f37990j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("subtitle_preview")
    private String f37991k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("title")
    private String f37992l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("title_placeholder")
    private String f37993m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("updated_at")
    private Date f37994n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f37995o;

    public /* synthetic */ g9(String str, String str2, v7 v7Var, String str3, List list, Date date, wy0 wy0Var, Integer num, String str4, String str5, String str6, String str7, String str8, Date date2, boolean[] zArr, int i13) {
        this(str, str2, v7Var, str3, list, date, wy0Var, num, str4, str5, str6, str7, str8, date2, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f37981a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return Objects.equals(this.f37988h, g9Var.f37988h) && Objects.equals(this.f37981a, g9Var.f37981a) && Objects.equals(this.f37982b, g9Var.f37982b) && Objects.equals(this.f37983c, g9Var.f37983c) && Objects.equals(this.f37984d, g9Var.f37984d) && Objects.equals(this.f37985e, g9Var.f37985e) && Objects.equals(this.f37986f, g9Var.f37986f) && Objects.equals(this.f37987g, g9Var.f37987g) && Objects.equals(this.f37989i, g9Var.f37989i) && Objects.equals(this.f37990j, g9Var.f37990j) && Objects.equals(this.f37991k, g9Var.f37991k) && Objects.equals(this.f37992l, g9Var.f37992l) && Objects.equals(this.f37993m, g9Var.f37993m) && Objects.equals(this.f37994n, g9Var.f37994n);
    }

    public final int hashCode() {
        return Objects.hash(this.f37981a, this.f37982b, this.f37983c, this.f37984d, this.f37985e, this.f37986f, this.f37987g, this.f37988h, this.f37989i, this.f37990j, this.f37991k, this.f37992l, this.f37993m, this.f37994n);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37982b;
    }

    public g9() {
        this.f37995o = new boolean[14];
    }

    private g9(@NonNull String str, String str2, v7 v7Var, String str3, List<Map<String, sr>> list, Date date, wy0 wy0Var, Integer num, String str4, String str5, String str6, String str7, String str8, Date date2, boolean[] zArr) {
        this.f37981a = str;
        this.f37982b = str2;
        this.f37983c = v7Var;
        this.f37984d = str3;
        this.f37985e = list;
        this.f37986f = date;
        this.f37987g = wy0Var;
        this.f37988h = num;
        this.f37989i = str4;
        this.f37990j = str5;
        this.f37991k = str6;
        this.f37992l = str7;
        this.f37993m = str8;
        this.f37994n = date2;
        this.f37995o = zArr;
    }
}

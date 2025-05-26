package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class x80 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43618a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43619b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_images")
    private List<Map<String, sr>> f43620c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f43621d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("group_type")
    private String f43622e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f43623f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("owner")
    private wy0 f43624g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("pin_count")
    private Integer f43625h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("preview_pins")
    private List<f30> f43626i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f43627j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f43628k;

    public /* synthetic */ x80(String str, String str2, List list, String str3, String str4, String str5, wy0 wy0Var, Integer num, List list2, String str6, boolean[] zArr, int i13) {
        this(str, str2, list, str3, str4, str5, wy0Var, num, list2, str6, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f43618a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return Objects.equals(this.f43625h, x80Var.f43625h) && Objects.equals(this.f43618a, x80Var.f43618a) && Objects.equals(this.f43619b, x80Var.f43619b) && Objects.equals(this.f43620c, x80Var.f43620c) && Objects.equals(this.f43621d, x80Var.f43621d) && Objects.equals(this.f43622e, x80Var.f43622e) && Objects.equals(this.f43623f, x80Var.f43623f) && Objects.equals(this.f43624g, x80Var.f43624g) && Objects.equals(this.f43626i, x80Var.f43626i) && Objects.equals(this.f43627j, x80Var.f43627j);
    }

    public final int hashCode() {
        return Objects.hash(this.f43618a, this.f43619b, this.f43620c, this.f43621d, this.f43622e, this.f43623f, this.f43624g, this.f43625h, this.f43626i, this.f43627j);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43619b;
    }

    public x80() {
        this.f43628k = new boolean[10];
    }

    private x80(@NonNull String str, String str2, List<Map<String, sr>> list, String str3, String str4, @NonNull String str5, wy0 wy0Var, Integer num, List<f30> list2, @NonNull String str6, boolean[] zArr) {
        this.f43618a = str;
        this.f43619b = str2;
        this.f43620c = list;
        this.f43621d = str3;
        this.f43622e = str4;
        this.f43623f = str5;
        this.f43624g = wy0Var;
        this.f43625h = num;
        this.f43626i = list2;
        this.f43627j = str6;
        this.f43628k = zArr;
    }
}

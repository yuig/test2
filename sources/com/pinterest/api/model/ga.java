package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ga implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38002a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38003b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_images")
    private List<Map<String, sr>> f38004c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f38005d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("name")
    private String f38006e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pins")
    private List<f30> f38007f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38008g;

    public /* synthetic */ ga(String str, String str2, List list, Map map, String str3, List list2, boolean[] zArr, int i13) {
        this(str, str2, list, map, str3, list2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f38002a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ga gaVar = (ga) obj;
        return Objects.equals(this.f38002a, gaVar.f38002a) && Objects.equals(this.f38003b, gaVar.f38003b) && Objects.equals(this.f38004c, gaVar.f38004c) && Objects.equals(this.f38005d, gaVar.f38005d) && Objects.equals(this.f38006e, gaVar.f38006e) && Objects.equals(this.f38007f, gaVar.f38007f);
    }

    public final int hashCode() {
        return Objects.hash(this.f38002a, this.f38003b, this.f38004c, this.f38005d, this.f38006e, this.f38007f);
    }

    public final String k() {
        return this.f38006e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f38003b;
    }

    public ga() {
        this.f38008g = new boolean[6];
    }

    private ga(@NonNull String str, String str2, List<Map<String, sr>> list, Map<String, sr> map, String str3, List<f30> list2, boolean[] zArr) {
        this.f38002a = str;
        this.f38003b = str2;
        this.f38004c = list;
        this.f38005d = map;
        this.f38006e = str3;
        this.f38007f = list2;
        this.f38008g = zArr;
    }
}

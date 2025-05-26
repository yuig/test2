package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ee implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37247a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37248b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image_signatures")
    private String f37249c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("images")
    private List<String> f37250d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("object_ids")
    private List<Integer> f37251e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("tags")
    private List<String> f37252f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("text")
    private String f37253g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f37254h;

    public /* synthetic */ ee(String str, String str2, String str3, List list, List list2, List list3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, list, list2, list3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f37247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ee eeVar = (ee) obj;
        return Objects.equals(this.f37247a, eeVar.f37247a) && Objects.equals(this.f37248b, eeVar.f37248b) && Objects.equals(this.f37249c, eeVar.f37249c) && Objects.equals(this.f37250d, eeVar.f37250d) && Objects.equals(this.f37251e, eeVar.f37251e) && Objects.equals(this.f37252f, eeVar.f37252f) && Objects.equals(this.f37253g, eeVar.f37253g);
    }

    public final int hashCode() {
        return Objects.hash(this.f37247a, this.f37248b, this.f37249c, this.f37250d, this.f37251e, this.f37252f, this.f37253g);
    }

    @Override // dl1.s
    public final String o() {
        return this.f37248b;
    }

    public ee() {
        this.f37254h = new boolean[7];
    }

    private ee(@NonNull String str, String str2, String str3, List<String> list, List<Integer> list2, List<String> list3, String str4, boolean[] zArr) {
        this.f37247a = str;
        this.f37248b = str2;
        this.f37249c = str3;
        this.f37250d = list;
        this.f37251e = list2;
        this.f37252f = list3;
        this.f37253g = str4;
        this.f37254h = zArr;
    }
}

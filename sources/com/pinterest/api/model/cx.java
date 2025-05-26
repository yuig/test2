package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cx {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36544a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36545b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("base_query")
    private String f36546c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("eligible_filters")
    private List<String> f36547d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("filter_options")
    private List<dh0> f36548e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("modifier")
    private String f36549f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("original_query")
    private String f36550g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36551h;

    public /* synthetic */ cx(String str, String str2, String str3, List list, List list2, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, list, list2, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cx cxVar = (cx) obj;
        return Objects.equals(this.f36544a, cxVar.f36544a) && Objects.equals(this.f36545b, cxVar.f36545b) && Objects.equals(this.f36546c, cxVar.f36546c) && Objects.equals(this.f36547d, cxVar.f36547d) && Objects.equals(this.f36548e, cxVar.f36548e) && Objects.equals(this.f36549f, cxVar.f36549f) && Objects.equals(this.f36550g, cxVar.f36550g);
    }

    public final String h() {
        return this.f36546c;
    }

    public final int hashCode() {
        return Objects.hash(this.f36544a, this.f36545b, this.f36546c, this.f36547d, this.f36548e, this.f36549f, this.f36550g);
    }

    public final List i() {
        return this.f36548e;
    }

    public cx() {
        this.f36551h = new boolean[7];
    }

    private cx(@NonNull String str, String str2, @NonNull String str3, List<String> list, List<dh0> list2, String str4, @NonNull String str5, boolean[] zArr) {
        this.f36544a = str;
        this.f36545b = str2;
        this.f36546c = str3;
        this.f36547d = list;
        this.f36548e = list2;
        this.f36549f = str4;
        this.f36550g = str5;
        this.f36551h = zArr;
    }
}

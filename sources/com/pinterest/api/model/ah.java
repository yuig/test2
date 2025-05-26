package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ah {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35736a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35737b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("dimension_type")
    private Integer f35738c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f35739d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("values")
    private List<Object> f35740e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35741f;

    public /* synthetic */ ah(String str, String str2, Integer num, String str3, List list, boolean[] zArr, int i13) {
        this(str, str2, num, str3, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ah ahVar = (ah) obj;
        return Objects.equals(this.f35738c, ahVar.f35738c) && Objects.equals(this.f35736a, ahVar.f35736a) && Objects.equals(this.f35737b, ahVar.f35737b) && Objects.equals(this.f35739d, ahVar.f35739d) && Objects.equals(this.f35740e, ahVar.f35740e);
    }

    public final String f() {
        return this.f35739d;
    }

    public final List g() {
        return this.f35740e;
    }

    public final int hashCode() {
        return Objects.hash(this.f35736a, this.f35737b, this.f35738c, this.f35739d, this.f35740e);
    }

    public ah() {
        this.f35741f = new boolean[5];
    }

    private ah(@NonNull String str, String str2, Integer num, String str3, List<Object> list, boolean[] zArr) {
        this.f35736a = str;
        this.f35737b = str2;
        this.f35738c = num;
        this.f35739d = str3;
        this.f35740e = list;
        this.f35741f = zArr;
    }
}

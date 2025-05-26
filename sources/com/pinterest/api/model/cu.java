package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cu {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36525a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36526b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("email")
    private String f36527c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("line_id")
    private String f36528d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("line_token")
    private String f36529e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36530f;

    public /* synthetic */ cu(String str, String str2, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cu cuVar = (cu) obj;
        return Objects.equals(this.f36525a, cuVar.f36525a) && Objects.equals(this.f36526b, cuVar.f36526b) && Objects.equals(this.f36527c, cuVar.f36527c) && Objects.equals(this.f36528d, cuVar.f36528d) && Objects.equals(this.f36529e, cuVar.f36529e);
    }

    public final int hashCode() {
        return Objects.hash(this.f36525a, this.f36526b, this.f36527c, this.f36528d, this.f36529e);
    }

    public cu() {
        this.f36530f = new boolean[5];
    }

    private cu(@NonNull String str, String str2, String str3, String str4, String str5, boolean[] zArr) {
        this.f36525a = str;
        this.f36526b = str2;
        this.f36527c = str3;
        this.f36528d = str4;
        this.f36529e = str5;
        this.f36530f = zArr;
    }
}

package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cd {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36367a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36368b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("height")
    private Double f36369c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("width")
    private Double f36370d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("x")
    private Double f36371e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("y")
    private Double f36372f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36373g;

    public /* synthetic */ cd(String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cd cdVar = (cd) obj;
        return Objects.equals(this.f36372f, cdVar.f36372f) && Objects.equals(this.f36371e, cdVar.f36371e) && Objects.equals(this.f36370d, cdVar.f36370d) && Objects.equals(this.f36369c, cdVar.f36369c) && Objects.equals(this.f36367a, cdVar.f36367a) && Objects.equals(this.f36368b, cdVar.f36368b);
    }

    public final int hashCode() {
        return Objects.hash(this.f36367a, this.f36368b, this.f36369c, this.f36370d, this.f36371e, this.f36372f);
    }

    public cd() {
        this.f36373g = new boolean[6];
    }

    private cd(@NonNull String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f36367a = str;
        this.f36368b = str2;
        this.f36369c = d2;
        this.f36370d = d13;
        this.f36371e = d14;
        this.f36372f = d15;
        this.f36373g = zArr;
    }
}

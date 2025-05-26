package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class gd {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38041a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38042b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("height")
    private Double f38043c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("width")
    private Double f38044d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38045e;

    public /* synthetic */ gd(String str, String str2, Double d2, Double d13, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gd gdVar = (gd) obj;
        return Objects.equals(this.f38044d, gdVar.f38044d) && Objects.equals(this.f38043c, gdVar.f38043c) && Objects.equals(this.f38041a, gdVar.f38041a) && Objects.equals(this.f38042b, gdVar.f38042b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38041a, this.f38042b, this.f38043c, this.f38044d);
    }

    public gd() {
        this.f38045e = new boolean[4];
    }

    private gd(@NonNull String str, String str2, Double d2, Double d13, boolean[] zArr) {
        this.f38041a = str;
        this.f38042b = str2;
        this.f38043c = d2;
        this.f38044d = d13;
        this.f38045e = zArr;
    }
}

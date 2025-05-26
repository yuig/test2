package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class s60 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41798a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41799b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("thumbnails")
    private Map<String, sr> f41800c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41801d;

    public /* synthetic */ s60(String str, String str2, Map map, boolean[] zArr, int i13) {
        this(str, str2, map, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s60 s60Var = (s60) obj;
        return Objects.equals(this.f41798a, s60Var.f41798a) && Objects.equals(this.f41799b, s60Var.f41799b) && Objects.equals(this.f41800c, s60Var.f41800c);
    }

    public final int hashCode() {
        return Objects.hash(this.f41798a, this.f41799b, this.f41800c);
    }

    public s60() {
        this.f41801d = new boolean[3];
    }

    private s60(@NonNull String str, String str2, Map<String, sr> map, boolean[] zArr) {
        this.f41798a = str;
        this.f41799b = str2;
        this.f41800c = map;
        this.f41801d = zArr;
    }
}

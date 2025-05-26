package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class tu {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("upload_id")
    private String f42299a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("upload_parameters")
    private Map<String, String> f42300b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("upload_url")
    private String f42301c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42302d;

    public /* synthetic */ tu(String str, Map map, String str2, boolean[] zArr, int i13) {
        this(str, map, str2, zArr);
    }

    public final String d() {
        return this.f42299a;
    }

    public final Map e() {
        return this.f42300b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tu tuVar = (tu) obj;
        return Objects.equals(this.f42299a, tuVar.f42299a) && Objects.equals(this.f42300b, tuVar.f42300b) && Objects.equals(this.f42301c, tuVar.f42301c);
    }

    public final String f() {
        return this.f42301c;
    }

    public final int hashCode() {
        return Objects.hash(this.f42299a, this.f42300b, this.f42301c);
    }

    public tu() {
        this.f42302d = new boolean[3];
    }

    private tu(@NonNull String str, Map<String, String> map, @NonNull String str2, boolean[] zArr) {
        this.f42299a = str;
        this.f42300b = map;
        this.f42301c = str2;
        this.f42302d = zArr;
    }
}

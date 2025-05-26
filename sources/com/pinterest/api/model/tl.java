package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class tl {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42231a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42232b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image_url")
    private String f42233c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("label")
    private String f42234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42235e;

    public /* synthetic */ tl(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f42233c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tl tlVar = (tl) obj;
        return Objects.equals(this.f42231a, tlVar.f42231a) && Objects.equals(this.f42232b, tlVar.f42232b) && Objects.equals(this.f42233c, tlVar.f42233c) && Objects.equals(this.f42234d, tlVar.f42234d);
    }

    public final String f() {
        return this.f42234d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42231a, this.f42232b, this.f42233c, this.f42234d);
    }

    public tl() {
        this.f42235e = new boolean[4];
    }

    private tl(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f42231a = str;
        this.f42232b = str2;
        this.f42233c = str3;
        this.f42234d = str4;
        this.f42235e = zArr;
    }
}

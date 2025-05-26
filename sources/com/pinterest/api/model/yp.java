package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class yp implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44093a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44094b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f44095c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("royalty_free_state")
    private Double f44096d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("thumbnail_image_url")
    private String f44097e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("type")
    private String f44098f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44099g;

    public /* synthetic */ yp(String str, String str2, String str3, Double d2, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, d2, str4, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44093a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yp ypVar = (yp) obj;
        return Objects.equals(this.f44096d, ypVar.f44096d) && Objects.equals(this.f44093a, ypVar.f44093a) && Objects.equals(this.f44094b, ypVar.f44094b) && Objects.equals(this.f44095c, ypVar.f44095c) && Objects.equals(this.f44097e, ypVar.f44097e) && Objects.equals(this.f44098f, ypVar.f44098f);
    }

    public final int hashCode() {
        return Objects.hash(this.f44093a, this.f44094b, this.f44095c, this.f44096d, this.f44097e, this.f44098f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44094b;
    }

    public yp() {
        this.f44099g = new boolean[6];
    }

    private yp(@NonNull String str, String str2, @NonNull String str3, Double d2, String str4, String str5, boolean[] zArr) {
        this.f44093a = str;
        this.f44094b = str2;
        this.f44095c = str3;
        this.f44096d = d2;
        this.f44097e = str4;
        this.f44098f = str5;
        this.f44099g = zArr;
    }
}

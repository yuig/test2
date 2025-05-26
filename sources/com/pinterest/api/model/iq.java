package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class iq implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38840a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38841b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f38842c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("tag_type")
    private Integer f38843d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("thumbnail_image_url")
    private String f38844e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("type")
    private String f38845f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38846g;

    public /* synthetic */ iq(String str, String str2, String str3, Integer num, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f38840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        return Objects.equals(this.f38843d, iqVar.f38843d) && Objects.equals(this.f38840a, iqVar.f38840a) && Objects.equals(this.f38841b, iqVar.f38841b) && Objects.equals(this.f38842c, iqVar.f38842c) && Objects.equals(this.f38844e, iqVar.f38844e) && Objects.equals(this.f38845f, iqVar.f38845f);
    }

    public final int hashCode() {
        return Objects.hash(this.f38840a, this.f38841b, this.f38842c, this.f38843d, this.f38844e, this.f38845f);
    }

    @Override // dl1.s
    public final String o() {
        return this.f38841b;
    }

    public iq() {
        this.f38846g = new boolean[6];
    }

    private iq(@NonNull String str, String str2, @NonNull String str3, Integer num, @NonNull String str4, String str5, boolean[] zArr) {
        this.f38840a = str;
        this.f38841b = str2;
        this.f38842c = str3;
        this.f38843d = num;
        this.f38844e = str4;
        this.f38845f = str5;
        this.f38846g = zArr;
    }
}

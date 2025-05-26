package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class gu {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38143a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38144b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("destination_type")
    private Integer f38145c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("destination_url")
    private String f38146d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("secondary_destination_type")
    private Integer f38147e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("secondary_type")
    private Integer f38148f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("secondary_url")
    private String f38149g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f38150h;

    public /* synthetic */ gu(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, boolean[] zArr, int i13) {
        this(str, str2, num, str3, num2, num3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gu guVar = (gu) obj;
        return Objects.equals(this.f38148f, guVar.f38148f) && Objects.equals(this.f38147e, guVar.f38147e) && Objects.equals(this.f38145c, guVar.f38145c) && Objects.equals(this.f38143a, guVar.f38143a) && Objects.equals(this.f38144b, guVar.f38144b) && Objects.equals(this.f38146d, guVar.f38146d) && Objects.equals(this.f38149g, guVar.f38149g);
    }

    public final int hashCode() {
        return Objects.hash(this.f38143a, this.f38144b, this.f38145c, this.f38146d, this.f38147e, this.f38148f, this.f38149g);
    }

    public gu() {
        this.f38150h = new boolean[7];
    }

    private gu(@NonNull String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, boolean[] zArr) {
        this.f38143a = str;
        this.f38144b = str2;
        this.f38145c = num;
        this.f38146d = str3;
        this.f38147e = num2;
        this.f38148f = num3;
        this.f38149g = str4;
        this.f38150h = zArr;
    }
}

package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class la implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39678a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39679b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("icon")
    private String f39680c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("link")
    private String f39681d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("show_badge")
    private Boolean f39682e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("text")
    private String f39683f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("tool")
    private Integer f39684g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f39685h;

    public /* synthetic */ la(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, bool, str5, num, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f39678a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        la laVar = (la) obj;
        return Objects.equals(this.f39684g, laVar.f39684g) && Objects.equals(this.f39682e, laVar.f39682e) && Objects.equals(this.f39678a, laVar.f39678a) && Objects.equals(this.f39679b, laVar.f39679b) && Objects.equals(this.f39680c, laVar.f39680c) && Objects.equals(this.f39681d, laVar.f39681d) && Objects.equals(this.f39683f, laVar.f39683f);
    }

    public final int hashCode() {
        return Objects.hash(this.f39678a, this.f39679b, this.f39680c, this.f39681d, this.f39682e, this.f39683f, this.f39684g);
    }

    public final String l() {
        return this.f39681d;
    }

    public final String n() {
        return this.f39683f;
    }

    @Override // dl1.s
    public final String o() {
        return this.f39679b;
    }

    public final Integer q() {
        Integer num = this.f39684g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public la() {
        this.f39685h = new boolean[7];
    }

    private la(@NonNull String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num, boolean[] zArr) {
        this.f39678a = str;
        this.f39679b = str2;
        this.f39680c = str3;
        this.f39681d = str4;
        this.f39682e = bool;
        this.f39683f = str5;
        this.f39684g = num;
        this.f39685h = zArr;
    }
}

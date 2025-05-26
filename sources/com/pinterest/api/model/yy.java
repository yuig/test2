package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class yy implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44152a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44153b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("content")
    private List<vy> f44154c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("outro")
    private cz f44155d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("pinterest_back_button")
    private String f44156e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f44157f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44158g;

    public /* synthetic */ yy(String str, String str2, List list, cz czVar, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, list, czVar, str3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44152a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yy yyVar = (yy) obj;
        return Objects.equals(this.f44152a, yyVar.f44152a) && Objects.equals(this.f44153b, yyVar.f44153b) && Objects.equals(this.f44154c, yyVar.f44154c) && Objects.equals(this.f44155d, yyVar.f44155d) && Objects.equals(this.f44156e, yyVar.f44156e) && Objects.equals(this.f44157f, yyVar.f44157f);
    }

    public final int hashCode() {
        return Objects.hash(this.f44152a, this.f44153b, this.f44154c, this.f44155d, this.f44156e, this.f44157f);
    }

    public final List k() {
        return this.f44154c;
    }

    public final cz l() {
        return this.f44155d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f44153b;
    }

    public yy() {
        this.f44158g = new boolean[6];
    }

    private yy(@NonNull String str, String str2, List<vy> list, cz czVar, String str3, String str4, boolean[] zArr) {
        this.f44152a = str;
        this.f44153b = str2;
        this.f44154c = list;
        this.f44155d = czVar;
        this.f44156e = str3;
        this.f44157f = str4;
        this.f44158g = zArr;
    }
}

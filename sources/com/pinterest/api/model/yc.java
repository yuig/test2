package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class yc {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44001a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44002b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("bbox")
    private cd f44003c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_base64")
    private String f44004d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("image_size")
    private gd f44005e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("pin")
    private f30 f44006f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44007g;

    public /* synthetic */ yc(String str, String str2, cd cdVar, String str3, gd gdVar, f30 f30Var, boolean[] zArr, int i13) {
        this(str, str2, cdVar, str3, gdVar, f30Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yc ycVar = (yc) obj;
        return Objects.equals(this.f44001a, ycVar.f44001a) && Objects.equals(this.f44002b, ycVar.f44002b) && Objects.equals(this.f44003c, ycVar.f44003c) && Objects.equals(this.f44004d, ycVar.f44004d) && Objects.equals(this.f44005e, ycVar.f44005e) && Objects.equals(this.f44006f, ycVar.f44006f);
    }

    public final int hashCode() {
        return Objects.hash(this.f44001a, this.f44002b, this.f44003c, this.f44004d, this.f44005e, this.f44006f);
    }

    public yc() {
        this.f44007g = new boolean[6];
    }

    private yc(@NonNull String str, String str2, cd cdVar, String str3, gd gdVar, f30 f30Var, boolean[] zArr) {
        this.f44001a = str;
        this.f44002b = str2;
        this.f44003c = cdVar;
        this.f44004d = str3;
        this.f44005e = gdVar;
        this.f44006f = f30Var;
        this.f44007g = zArr;
    }
}

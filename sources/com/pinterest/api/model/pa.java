package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class pa {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40923a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40924b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("creation_board")
    private v7 f40925c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("creation_pin")
    private List<f30> f40926d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_pins_edited")
    private Boolean f40927e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_template_edited")
    private Boolean f40928f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("video_template")
    private ta f40929g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f40930h;

    public /* synthetic */ pa(String str, String str2, v7 v7Var, List list, Boolean bool, Boolean bool2, ta taVar, boolean[] zArr, int i13) {
        this(str, str2, v7Var, list, bool, bool2, taVar, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pa paVar = (pa) obj;
        return Objects.equals(this.f40928f, paVar.f40928f) && Objects.equals(this.f40927e, paVar.f40927e) && Objects.equals(this.f40923a, paVar.f40923a) && Objects.equals(this.f40924b, paVar.f40924b) && Objects.equals(this.f40925c, paVar.f40925c) && Objects.equals(this.f40926d, paVar.f40926d) && Objects.equals(this.f40929g, paVar.f40929g);
    }

    public final int hashCode() {
        return Objects.hash(this.f40923a, this.f40924b, this.f40925c, this.f40926d, this.f40927e, this.f40928f, this.f40929g);
    }

    public pa() {
        this.f40930h = new boolean[7];
    }

    private pa(@NonNull String str, String str2, @NonNull v7 v7Var, @NonNull List<f30> list, Boolean bool, Boolean bool2, ta taVar, boolean[] zArr) {
        this.f40923a = str;
        this.f40924b = str2;
        this.f40925c = v7Var;
        this.f40926d = list;
        this.f40927e = bool;
        this.f40928f = bool2;
        this.f40929g = taVar;
        this.f40930h = zArr;
    }
}

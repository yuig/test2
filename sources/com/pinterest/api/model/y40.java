package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class y40 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43939a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43940b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("decision_pool")
    private e50 f43941c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("mode")
    private a f43942d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("quiz_path")
    private m50 f43943e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("reward_messages")
    private List<String> f43944f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("reward_preview_subtitle")
    private String f43945g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("reward_preview_title")
    private String f43946h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("title")
    private String f43947i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f43948j;

    /* loaded from: classes3.dex */
    public enum a {
        QUIZ(0),
        DECISION(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ y40(String str, String str2, e50 e50Var, a aVar, m50 m50Var, List list, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, e50Var, aVar, m50Var, list, str3, str4, str5, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y40 y40Var = (y40) obj;
        return Objects.equals(this.f43942d, y40Var.f43942d) && Objects.equals(this.f43939a, y40Var.f43939a) && Objects.equals(this.f43940b, y40Var.f43940b) && Objects.equals(this.f43941c, y40Var.f43941c) && Objects.equals(this.f43943e, y40Var.f43943e) && Objects.equals(this.f43944f, y40Var.f43944f) && Objects.equals(this.f43945g, y40Var.f43945g) && Objects.equals(this.f43946h, y40Var.f43946h) && Objects.equals(this.f43947i, y40Var.f43947i);
    }

    public final int hashCode() {
        return Objects.hash(this.f43939a, this.f43940b, this.f43941c, this.f43942d, this.f43943e, this.f43944f, this.f43945g, this.f43946h, this.f43947i);
    }

    @Override // dl1.s
    public final String o() {
        return this.f43940b;
    }

    public final e50 q() {
        return this.f43941c;
    }

    public final a s() {
        return this.f43942d;
    }

    public final m50 u() {
        return this.f43943e;
    }

    public final String v() {
        return this.f43945g;
    }

    public final String w() {
        return this.f43946h;
    }

    public final String x() {
        return this.f43947i;
    }

    public y40() {
        this.f43948j = new boolean[9];
    }

    private y40(@NonNull String str, String str2, e50 e50Var, a aVar, m50 m50Var, List<String> list, String str3, String str4, String str5, boolean[] zArr) {
        this.f43939a = str;
        this.f43940b = str2;
        this.f43941c = e50Var;
        this.f43942d = aVar;
        this.f43943e = m50Var;
        this.f43944f = list;
        this.f43945g = str3;
        this.f43946h = str4;
        this.f43947i = str5;
        this.f43948j = zArr;
    }
}

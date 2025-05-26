package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class hi0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38448a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38449b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("bitmap_mask")
    private Map<String, Object> f38450c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cutout_images")
    private Map<String, sr> f38451d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("item_type")
    private a f38452e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("mask")
    private String f38453f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("pin")
    private f30 f38454g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("type")
    private String f38455h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f38456i;

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        PIN(1),
        TEXT(2),
        IMAGE(3);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ hi0(String str, String str2, Map map, Map map2, a aVar, String str3, f30 f30Var, String str4, boolean[] zArr, int i13) {
        this(str, str2, map, map2, aVar, str3, f30Var, str4, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f38448a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return Objects.equals(this.f38452e, hi0Var.f38452e) && Objects.equals(this.f38448a, hi0Var.f38448a) && Objects.equals(this.f38449b, hi0Var.f38449b) && Objects.equals(this.f38450c, hi0Var.f38450c) && Objects.equals(this.f38451d, hi0Var.f38451d) && Objects.equals(this.f38453f, hi0Var.f38453f) && Objects.equals(this.f38454g, hi0Var.f38454g) && Objects.equals(this.f38455h, hi0Var.f38455h);
    }

    public final int hashCode() {
        return Objects.hash(this.f38448a, this.f38449b, this.f38450c, this.f38451d, this.f38452e, this.f38453f, this.f38454g, this.f38455h);
    }

    public final Map n() {
        return this.f38450c;
    }

    @Override // dl1.s
    public final String o() {
        return this.f38449b;
    }

    public final Map q() {
        return this.f38451d;
    }

    public final String s() {
        return this.f38453f;
    }

    public final f30 u() {
        return this.f38454g;
    }

    public hi0() {
        this.f38456i = new boolean[8];
    }

    private hi0(@NonNull String str, String str2, Map<String, Object> map, Map<String, sr> map2, a aVar, String str3, f30 f30Var, String str4, boolean[] zArr) {
        this.f38448a = str;
        this.f38449b = str2;
        this.f38450c = map;
        this.f38451d = map2;
        this.f38452e = aVar;
        this.f38453f = str3;
        this.f38454g = f30Var;
        this.f38455h = str4;
        this.f38456i = zArr;
    }
}

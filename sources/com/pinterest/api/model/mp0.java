package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class mp0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f40175a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f40176b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("end_time")
    private Double f40177c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_removed")
    private Boolean f40178d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("pin_id")
    private String f40179e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("start_time")
    private Double f40180f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("sticker_style")
    private a f40181g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f40182h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f40183i;

    /* loaded from: classes3.dex */
    public enum a {
        TITLE(0),
        THUMBNAIL(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ mp0(Integer num, zk0 zk0Var, Double d2, Boolean bool, String str, Double d13, a aVar, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, d2, bool, str, d13, aVar, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mp0 mp0Var = (mp0) obj;
        return Objects.equals(this.f40181g, mp0Var.f40181g) && Objects.equals(this.f40180f, mp0Var.f40180f) && Objects.equals(this.f40178d, mp0Var.f40178d) && Objects.equals(this.f40177c, mp0Var.f40177c) && Objects.equals(this.f40175a, mp0Var.f40175a) && Objects.equals(this.f40176b, mp0Var.f40176b) && Objects.equals(this.f40179e, mp0Var.f40179e) && Objects.equals(this.f40182h, mp0Var.f40182h);
    }

    public final int hashCode() {
        return Objects.hash(this.f40175a, this.f40176b, this.f40177c, this.f40178d, this.f40179e, this.f40180f, this.f40181g, this.f40182h);
    }

    public final zk0 i() {
        return this.f40176b;
    }

    public final Double j() {
        Double d2 = this.f40177c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean k() {
        Boolean bool = this.f40178d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String l() {
        return this.f40179e;
    }

    public final Double m() {
        Double d2 = this.f40180f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public mp0() {
        this.f40183i = new boolean[8];
    }

    private mp0(Integer num, zk0 zk0Var, Double d2, Boolean bool, @NonNull String str, Double d13, a aVar, @NonNull String str2, boolean[] zArr) {
        this.f40175a = num;
        this.f40176b = zk0Var;
        this.f40177c = d2;
        this.f40178d = bool;
        this.f40179e = str;
        this.f40180f = d13;
        this.f40181g = aVar;
        this.f40182h = str2;
        this.f40183i = zArr;
    }
}

package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class fo0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f37726a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f37727b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("end_time")
    private Double f37728c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_removed")
    private Boolean f37729d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("start_time")
    private Double f37730e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f37731f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("user_id")
    private String f37732g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f37733h;

    public /* synthetic */ fo0(Integer num, zk0 zk0Var, Double d2, Boolean bool, Double d13, String str, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, d2, bool, d13, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fo0 fo0Var = (fo0) obj;
        return Objects.equals(this.f37730e, fo0Var.f37730e) && Objects.equals(this.f37729d, fo0Var.f37729d) && Objects.equals(this.f37728c, fo0Var.f37728c) && Objects.equals(this.f37726a, fo0Var.f37726a) && Objects.equals(this.f37727b, fo0Var.f37727b) && Objects.equals(this.f37731f, fo0Var.f37731f) && Objects.equals(this.f37732g, fo0Var.f37732g);
    }

    public final zk0 h() {
        return this.f37727b;
    }

    public final int hashCode() {
        return Objects.hash(this.f37726a, this.f37727b, this.f37728c, this.f37729d, this.f37730e, this.f37731f, this.f37732g);
    }

    public final Double i() {
        Double d2 = this.f37728c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean j() {
        Boolean bool = this.f37729d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Double k() {
        Double d2 = this.f37730e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String l() {
        return this.f37732g;
    }

    public fo0() {
        this.f37733h = new boolean[7];
    }

    private fo0(Integer num, zk0 zk0Var, Double d2, Boolean bool, Double d13, @NonNull String str, @NonNull String str2, boolean[] zArr) {
        this.f37726a = num;
        this.f37727b = zk0Var;
        this.f37728c = d2;
        this.f37729d = bool;
        this.f37730e = d13;
        this.f37731f = str;
        this.f37732g = str2;
        this.f37733h = zArr;
    }
}

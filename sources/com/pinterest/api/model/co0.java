package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class co0 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f36482a;

    /* renamed from: b, reason: collision with root package name */
    public zk0 f36483b;

    /* renamed from: c, reason: collision with root package name */
    public Double f36484c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f36485d;

    /* renamed from: e, reason: collision with root package name */
    public Double f36486e;

    /* renamed from: f, reason: collision with root package name */
    public String f36487f;

    /* renamed from: g, reason: collision with root package name */
    public String f36488g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36489h;

    public /* synthetic */ co0(int i13) {
        this();
    }

    public /* synthetic */ co0(fo0 fo0Var, int i13) {
        this(fo0Var);
    }

    private co0() {
        this.f36489h = new boolean[7];
    }

    private co0(@NonNull fo0 fo0Var) {
        Integer num;
        zk0 zk0Var;
        Double d2;
        Boolean bool;
        Double d13;
        String str;
        String str2;
        num = fo0Var.f37726a;
        this.f36482a = num;
        zk0Var = fo0Var.f37727b;
        this.f36483b = zk0Var;
        d2 = fo0Var.f37728c;
        this.f36484c = d2;
        bool = fo0Var.f37729d;
        this.f36485d = bool;
        d13 = fo0Var.f37730e;
        this.f36486e = d13;
        str = fo0Var.f37731f;
        this.f36487f = str;
        str2 = fo0Var.f37732g;
        this.f36488g = str2;
        boolean[] zArr = fo0Var.f37733h;
        this.f36489h = Arrays.copyOf(zArr, zArr.length);
    }
}

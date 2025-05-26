package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h00 {

    /* renamed from: a, reason: collision with root package name */
    public String f38210a;

    /* renamed from: b, reason: collision with root package name */
    public String f38211b;

    /* renamed from: c, reason: collision with root package name */
    public y5 f38212c;

    /* renamed from: d, reason: collision with root package name */
    public List f38213d;

    /* renamed from: e, reason: collision with root package name */
    public String f38214e;

    /* renamed from: f, reason: collision with root package name */
    public px0 f38215f;

    /* renamed from: g, reason: collision with root package name */
    public List f38216g;

    /* renamed from: h, reason: collision with root package name */
    public List f38217h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f38218i;

    /* renamed from: j, reason: collision with root package name */
    public Map f38219j;

    /* renamed from: k, reason: collision with root package name */
    public List f38220k;

    /* renamed from: l, reason: collision with root package name */
    public String f38221l;

    /* renamed from: m, reason: collision with root package name */
    public String f38222m;

    /* renamed from: n, reason: collision with root package name */
    public String f38223n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f38224o;

    public /* synthetic */ h00(int i13) {
        this();
    }

    public final k00 a() {
        return new k00(this.f38210a, this.f38211b, this.f38212c, this.f38213d, this.f38214e, this.f38215f, this.f38216g, this.f38217h, this.f38218i, this.f38219j, this.f38220k, this.f38221l, this.f38222m, this.f38223n, this.f38224o, 0);
    }

    public final void b(String str) {
        this.f38214e = str;
        boolean[] zArr = this.f38224o;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public /* synthetic */ h00(k00 k00Var, int i13) {
        this(k00Var);
    }

    private h00() {
        this.f38224o = new boolean[14];
    }

    private h00(@NonNull k00 k00Var) {
        String str;
        String str2;
        y5 y5Var;
        List list;
        String str3;
        px0 px0Var;
        List list2;
        List list3;
        Integer num;
        Map map;
        List list4;
        String str4;
        String str5;
        String str6;
        str = k00Var.f39224a;
        this.f38210a = str;
        str2 = k00Var.f39225b;
        this.f38211b = str2;
        y5Var = k00Var.f39226c;
        this.f38212c = y5Var;
        list = k00Var.f39227d;
        this.f38213d = list;
        str3 = k00Var.f39228e;
        this.f38214e = str3;
        px0Var = k00Var.f39229f;
        this.f38215f = px0Var;
        list2 = k00Var.f39230g;
        this.f38216g = list2;
        list3 = k00Var.f39231h;
        this.f38217h = list3;
        num = k00Var.f39232i;
        this.f38218i = num;
        map = k00Var.f39233j;
        this.f38219j = map;
        list4 = k00Var.f39234k;
        this.f38220k = list4;
        str4 = k00Var.f39235l;
        this.f38221l = str4;
        str5 = k00Var.f39236m;
        this.f38222m = str5;
        str6 = k00Var.f39237n;
        this.f38223n = str6;
        boolean[] zArr = k00Var.f39238o;
        this.f38224o = Arrays.copyOf(zArr, zArr.length);
    }
}

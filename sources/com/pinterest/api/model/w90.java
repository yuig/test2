package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w90 {

    /* renamed from: a, reason: collision with root package name */
    public String f43199a;

    /* renamed from: b, reason: collision with root package name */
    public String f43200b;

    /* renamed from: c, reason: collision with root package name */
    public Map f43201c;

    /* renamed from: d, reason: collision with root package name */
    public List f43202d;

    /* renamed from: e, reason: collision with root package name */
    public List f43203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43204f;

    public /* synthetic */ w90(int i13) {
        this();
    }

    public final z90 a() {
        return new z90(this.f43199a, this.f43200b, this.f43201c, this.f43202d, this.f43203e, this.f43204f, 0);
    }

    public final void b(Map map) {
        this.f43201c = map;
        boolean[] zArr = this.f43204f;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void c(String str) {
        this.f43200b = str;
        boolean[] zArr = this.f43204f;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void d(List list) {
        this.f43202d = list;
        boolean[] zArr = this.f43204f;
        if (zArr.length > 3) {
            zArr[3] = true;
        }
    }

    public final void e(List list) {
        this.f43203e = list;
        boolean[] zArr = this.f43204f;
        if (zArr.length > 4) {
            zArr[4] = true;
        }
    }

    public final void f(String str) {
        this.f43199a = str;
        boolean[] zArr = this.f43204f;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private w90() {
        this.f43204f = new boolean[5];
    }

    private w90(@NonNull z90 z90Var) {
        String str;
        String str2;
        Map map;
        List list;
        List list2;
        str = z90Var.f44249a;
        this.f43199a = str;
        str2 = z90Var.f44250b;
        this.f43200b = str2;
        map = z90Var.f44251c;
        this.f43201c = map;
        list = z90Var.f44252d;
        this.f43202d = list;
        list2 = z90Var.f44253e;
        this.f43203e = list2;
        boolean[] zArr = z90Var.f44254f;
        this.f43204f = Arrays.copyOf(zArr, zArr.length);
    }
}

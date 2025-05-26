package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class tt {

    /* renamed from: a, reason: collision with root package name */
    public String f42292a;

    /* renamed from: b, reason: collision with root package name */
    public String f42293b;

    /* renamed from: c, reason: collision with root package name */
    public List f42294c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42295d;

    public /* synthetic */ tt(int i13) {
        this();
    }

    public final void a(List list) {
        this.f42294c = list;
        boolean[] zArr = this.f42295d;
        if (zArr.length > 2) {
            zArr[2] = true;
        }
    }

    public final void b(String str) {
        this.f42293b = str;
        boolean[] zArr = this.f42295d;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
    }

    public final void c(String str) {
        this.f42292a = str;
        boolean[] zArr = this.f42295d;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private tt() {
        this.f42295d = new boolean[3];
    }

    private tt(@NonNull wt wtVar) {
        String str;
        String str2;
        List list;
        str = wtVar.f43369a;
        this.f42292a = str;
        str2 = wtVar.f43370b;
        this.f42293b = str2;
        list = wtVar.f43371c;
        this.f42294c = list;
        boolean[] zArr = wtVar.f43372d;
        this.f42295d = Arrays.copyOf(zArr, zArr.length);
    }
}

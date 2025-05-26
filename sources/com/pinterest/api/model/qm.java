package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class qm {

    /* renamed from: a, reason: collision with root package name */
    public String f41334a;

    /* renamed from: b, reason: collision with root package name */
    public List f41335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41336c;

    public /* synthetic */ qm(int i13) {
        this();
    }

    public final tm a() {
        return new tm(this.f41334a, this.f41335b, this.f41336c, 0);
    }

    public final void b(String str) {
        this.f41334a = str;
        boolean[] zArr = this.f41336c;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
    }

    private qm() {
        this.f41336c = new boolean[2];
    }

    private qm(@NonNull tm tmVar) {
        String str;
        List list;
        str = tmVar.f42236a;
        this.f41334a = str;
        list = tmVar.f42237b;
        this.f41335b = list;
        boolean[] zArr = tmVar.f42238c;
        this.f41336c = Arrays.copyOf(zArr, zArr.length);
    }
}

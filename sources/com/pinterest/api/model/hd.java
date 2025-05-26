package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class hd {

    /* renamed from: a, reason: collision with root package name */
    public String f38380a;

    /* renamed from: b, reason: collision with root package name */
    public String f38381b;

    /* renamed from: c, reason: collision with root package name */
    public String f38382c;

    /* renamed from: d, reason: collision with root package name */
    public List f38383d;

    /* renamed from: e, reason: collision with root package name */
    public Double f38384e;

    /* renamed from: f, reason: collision with root package name */
    public Double f38385f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38386g;

    public /* synthetic */ hd(int i13) {
        this();
    }

    private hd() {
        this.f38386g = new boolean[6];
    }

    private hd(@NonNull kd kdVar) {
        String str;
        String str2;
        String str3;
        List list;
        Double d2;
        Double d13;
        str = kdVar.f39396a;
        this.f38380a = str;
        str2 = kdVar.f39397b;
        this.f38381b = str2;
        str3 = kdVar.f39398c;
        this.f38382c = str3;
        list = kdVar.f39399d;
        this.f38383d = list;
        d2 = kdVar.f39400e;
        this.f38384e = d2;
        d13 = kdVar.f39401f;
        this.f38385f = d13;
        boolean[] zArr = kdVar.f39402g;
        this.f38386g = Arrays.copyOf(zArr, zArr.length);
    }
}

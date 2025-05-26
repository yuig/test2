package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class rz {

    /* renamed from: a, reason: collision with root package name */
    public String f41727a;

    /* renamed from: b, reason: collision with root package name */
    public String f41728b;

    /* renamed from: c, reason: collision with root package name */
    public String f41729c;

    /* renamed from: d, reason: collision with root package name */
    public List f41730d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41731e;

    public /* synthetic */ rz(int i13) {
        this();
    }

    private rz() {
        this.f41731e = new boolean[4];
    }

    private rz(@NonNull uz uzVar) {
        String str;
        String str2;
        String str3;
        List list;
        str = uzVar.f42680a;
        this.f41727a = str;
        str2 = uzVar.f42681b;
        this.f41728b = str2;
        str3 = uzVar.f42682c;
        this.f41729c = str3;
        list = uzVar.f42683d;
        this.f41730d = list;
        boolean[] zArr = uzVar.f42684e;
        this.f41731e = Arrays.copyOf(zArr, zArr.length);
    }
}

package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dz {

    /* renamed from: a, reason: collision with root package name */
    public String f36997a;

    /* renamed from: b, reason: collision with root package name */
    public String f36998b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36999c;

    public /* synthetic */ dz(int i13) {
        this();
    }

    private dz() {
        this.f36999c = new boolean[2];
    }

    private dz(@NonNull gz gzVar) {
        String str;
        String str2;
        str = gzVar.f38185a;
        this.f36997a = str;
        str2 = gzVar.f38186b;
        this.f36998b = str2;
        boolean[] zArr = gzVar.f38187c;
        this.f36999c = Arrays.copyOf(zArr, zArr.length);
    }
}

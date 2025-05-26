package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.ec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public String f36717a;

    /* renamed from: b, reason: collision with root package name */
    public String f36718b;

    /* renamed from: c, reason: collision with root package name */
    public String f36719c;

    /* renamed from: d, reason: collision with root package name */
    public ec.a f36720d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36721e;

    public /* synthetic */ dc(int i13) {
        this();
    }

    private dc() {
        this.f36721e = new boolean[4];
    }

    private dc(@NonNull ec ecVar) {
        String str;
        String str2;
        String str3;
        ec.a aVar;
        str = ecVar.f37234a;
        this.f36717a = str;
        str2 = ecVar.f37235b;
        this.f36718b = str2;
        str3 = ecVar.f37236c;
        this.f36719c = str3;
        aVar = ecVar.f37237d;
        this.f36720d = aVar;
        boolean[] zArr = ecVar.f37238e;
        this.f36721e = Arrays.copyOf(zArr, zArr.length);
    }
}

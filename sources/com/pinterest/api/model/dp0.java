package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.pinterest.api.model.ep0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dp0 {

    /* renamed from: a, reason: collision with root package name */
    public String f36912a;

    /* renamed from: b, reason: collision with root package name */
    public ep0.a f36913b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36914c;

    public /* synthetic */ dp0(int i13) {
        this();
    }

    private dp0() {
        this.f36914c = new boolean[2];
    }

    private dp0(@NonNull ep0 ep0Var) {
        String str;
        ep0.a aVar;
        str = ep0Var.f37317a;
        this.f36912a = str;
        aVar = ep0Var.f37318b;
        this.f36913b = aVar;
        boolean[] zArr = ep0Var.f37319c;
        this.f36914c = Arrays.copyOf(zArr, zArr.length);
    }
}

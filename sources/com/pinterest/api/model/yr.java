package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yr {

    /* renamed from: a, reason: collision with root package name */
    public String f44100a;

    /* renamed from: b, reason: collision with root package name */
    public Double f44101b;

    /* renamed from: c, reason: collision with root package name */
    public String f44102c;

    /* renamed from: d, reason: collision with root package name */
    public Double f44103d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f44104e;

    public /* synthetic */ yr(int i13) {
        this();
    }

    private yr() {
        this.f44104e = new boolean[4];
    }

    private yr(@NonNull bs bsVar) {
        String str;
        Double d2;
        String str2;
        Double d13;
        str = bsVar.f36173a;
        this.f44100a = str;
        d2 = bsVar.f36174b;
        this.f44101b = d2;
        str2 = bsVar.f36175c;
        this.f44102c = str2;
        d13 = bsVar.f36176d;
        this.f44103d = d13;
        boolean[] zArr = bsVar.f36177e;
        this.f44104e = Arrays.copyOf(zArr, zArr.length);
    }
}

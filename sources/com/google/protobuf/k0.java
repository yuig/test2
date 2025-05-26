package com.google.protobuf;

/* loaded from: classes3.dex */
public final class k0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f33917a;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f33918b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33919c;

    public k0(int i13, z2 z2Var, boolean z13, boolean z14) {
        this.f33917a = i13;
        this.f33918b = z2Var;
        this.f33919c = z13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33917a - ((k0) obj).f33917a;
    }
}

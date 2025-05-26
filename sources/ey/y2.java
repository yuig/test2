package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y2 extends a2 implements b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60625g;

    /* renamed from: h, reason: collision with root package name */
    public final String f60626h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f60627i;

    /* renamed from: j, reason: collision with root package name */
    public final h32.d4 f60628j;

    /* renamed from: k, reason: collision with root package name */
    public final h32.a4 f60629k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f60630l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(String pinUid, String str, Integer num, h32.d4 d4Var, h32.a4 a4Var, boolean z13) {
        super(pinUid, 1);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f60625g = pinUid;
        this.f60626h = str;
        this.f60627i = num;
        this.f60628j = d4Var;
        this.f60629k = a4Var;
        this.f60630l = z13;
    }

    public final String l() {
        return this.f60625g;
    }

    public final Integer m() {
        return this.f60627i;
    }

    public final String n() {
        return this.f60626h;
    }

    public final h32.a4 o() {
        return this.f60629k;
    }

    public final h32.d4 p() {
        return this.f60628j;
    }

    public final boolean q() {
        return this.f60630l;
    }
}

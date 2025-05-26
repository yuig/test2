package ql1;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final f f104072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f104073c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104074d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f104075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f0 pinnerName, f pinnerType, boolean z13, String str) {
        super(pinnerName);
        Intrinsics.checkNotNullParameter(pinnerName, "pinnerName");
        Intrinsics.checkNotNullParameter(pinnerType, "pinnerType");
        this.f104072b = pinnerType;
        this.f104073c = z13;
        this.f104074d = str;
        this.f104075e = null;
    }
}

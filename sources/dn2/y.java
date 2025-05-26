package dn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes2.dex */
public final class y extends b {

    /* renamed from: c, reason: collision with root package name */
    public final b0 f55637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List value, b0 type) {
        super(value, new e82.l(type, 23));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f55637c = type;
    }
}

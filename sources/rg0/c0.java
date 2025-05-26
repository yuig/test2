package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f107973a;

    public c0(vd0.c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String o13 = json.o("bubble_text", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f107973a = o13;
    }
}

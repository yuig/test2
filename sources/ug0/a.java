package ug0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f122124b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable error) {
        super(str);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f122124b = error;
    }
}

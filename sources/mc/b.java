package mc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f86885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String uncompressedFieldset, Throwable error) {
        super(uncompressedFieldset);
        Intrinsics.checkNotNullParameter(uncompressedFieldset, "uncompressedFieldset");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f86885b = error;
    }
}

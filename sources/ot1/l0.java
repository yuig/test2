package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.v f97605a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.l f97606b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f97607c;

    public l0(et1.v bitReaderFactory, et1.l multiBitReaderFactory, t.a golombCodeReaderFactory) {
        Intrinsics.checkNotNullParameter(bitReaderFactory, "bitReaderFactory");
        Intrinsics.checkNotNullParameter(multiBitReaderFactory, "multiBitReaderFactory");
        Intrinsics.checkNotNullParameter(golombCodeReaderFactory, "golombCodeReaderFactory");
        this.f97605a = bitReaderFactory;
        this.f97606b = multiBitReaderFactory;
        this.f97607c = golombCodeReaderFactory;
    }
}

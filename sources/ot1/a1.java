package ot1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final et1.v f97533a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.l f97534b;

    /* renamed from: c, reason: collision with root package name */
    public final t.a f97535c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f97536d;

    public a1(et1.v bitReaderFactory, et1.l multiBitReaderFactory, t.a golombCodeReaderFactory, e1 vuiParametersParser) {
        Intrinsics.checkNotNullParameter(bitReaderFactory, "bitReaderFactory");
        Intrinsics.checkNotNullParameter(multiBitReaderFactory, "multiBitReaderFactory");
        Intrinsics.checkNotNullParameter(golombCodeReaderFactory, "golombCodeReaderFactory");
        Intrinsics.checkNotNullParameter(vuiParametersParser, "vuiParametersParser");
        this.f97533a = bitReaderFactory;
        this.f97534b = multiBitReaderFactory;
        this.f97535c = golombCodeReaderFactory;
        this.f97536d = vuiParametersParser;
    }

    public static m0 a(int i13, d0 d0Var) {
        if (i13 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ArrayList arrayList = new ArrayList(i13);
        long j13 = 8;
        long j14 = 8;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i13) {
            if (j13 != 0) {
                j13 = ((d0Var.a() + j14) + 256) % 256;
                z13 = i14 == 0 && j13 == 0;
            }
            if (j13 != 0) {
                j14 = j13;
            }
            arrayList.add(Long.valueOf(j14));
            i14++;
        }
        return new m0(arrayList, z13);
    }
}

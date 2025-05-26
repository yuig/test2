package qo2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f104628e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final oo2.g f104629a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f104630b;

    /* renamed from: c, reason: collision with root package name */
    public long f104631c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f104632d;

    public u(oo2.g descriptor, so2.l readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f104629a = descriptor;
        this.f104630b = readIfAbsent;
        int e13 = descriptor.e();
        if (e13 <= 64) {
            this.f104631c = e13 != 64 ? (-1) << e13 : 0L;
            this.f104632d = f104628e;
            return;
        }
        this.f104631c = 0L;
        int i13 = (e13 - 1) >>> 6;
        long[] jArr = new long[i13];
        if ((e13 & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i13 - 1] = (-1) << e13;
        }
        this.f104632d = jArr;
    }
}

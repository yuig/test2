package ot1;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f97641a;

    /* renamed from: b, reason: collision with root package name */
    public int f97642b;

    /* renamed from: c, reason: collision with root package name */
    public int f97643c;

    public x(e outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f97641a = outputStream;
        this.f97642b = 7;
    }

    public final void a(int i13) {
        int i14 = this.f97642b;
        int i15 = ((i13 & 1) << i14) | this.f97643c;
        this.f97643c = i15;
        int i16 = i14 - 1;
        this.f97642b = i16;
        if (i16 < 0) {
            this.f97641a.write(i15);
            this.f97643c = 0;
            this.f97642b = 7;
        }
    }
}

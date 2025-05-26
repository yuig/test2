package ot1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f97560a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f97561b;

    public e(ByteArrayOutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.f97560a = outputStream;
        this.f97561b = new int[]{1, 1};
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        int i14 = i13 & 255;
        int[] iArr = this.f97561b;
        int i15 = iArr[0];
        OutputStream outputStream = this.f97560a;
        if (i15 == 0 && iArr[1] == 0 && i14 >= 0 && i14 <= 3) {
            outputStream.write(3);
            iArr[0] = iArr[1];
            iArr[1] = 3;
        }
        outputStream.write(i14);
        iArr[0] = iArr[1];
        iArr[1] = i14;
    }
}

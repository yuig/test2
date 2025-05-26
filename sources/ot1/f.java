package ot1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f97565a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f97566b;

    /* renamed from: c, reason: collision with root package name */
    public int f97567c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f97568d;

    public f(ByteArrayInputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        this.f97565a = inputStream;
        this.f97566b = new int[3];
        this.f97567c = 3;
        this.f97568d = new int[]{0, 0, 3};
    }

    public final boolean a() {
        int read = this.f97565a.read();
        if (read < 0) {
            return false;
        }
        int[] iArr = this.f97566b;
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = read;
        this.f97567c = Math.max(0, this.f97567c - 1);
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!a()) {
            return -1;
        }
        int[] iArr = this.f97568d;
        int i13 = iArr[0];
        int[] iArr2 = this.f97566b;
        if (i13 != iArr2[0] || iArr[1] != iArr2[1] || iArr[2] != iArr2[2]) {
            return iArr2[2];
        }
        if (a()) {
            return iArr2[2];
        }
        return -1;
    }
}

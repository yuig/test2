package jt1;

import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements et1.b {

    /* renamed from: a, reason: collision with root package name */
    public et1.b f77586a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f77587b;

    @Override // et1.b
    public final void a(int i13, ByteBuffer sourceBuffer, ByteBuffer codecInputBuffer) {
        Intrinsics.checkNotNullParameter(sourceBuffer, "sourceBuffer");
        Intrinsics.checkNotNullParameter(codecInputBuffer, "codecInputBuffer");
        try {
            this.f77586a.a(i13, sourceBuffer, codecInputBuffer);
        } catch (ReadOnlyBufferException e13) {
            if (this.f77587b) {
                throw e13;
            }
            this.f77587b = true;
            a aVar = new a();
            aVar.f77585a = ByteBuffer.allocateDirect(8192);
            this.f77586a = aVar;
            aVar.a(i13, sourceBuffer, codecInputBuffer);
        }
    }
}

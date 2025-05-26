package ads_mobile_sdk;

import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p50 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9558a;

    public p50(byte[] bArr) {
        this.f9558a = bArr;
    }

    @Override // a6.l
    public final Object getDefaultValue() {
        return this.f9558a;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            byte[] b13 = qk.e.b(inputStream);
            Intrinsics.checkNotNullExpressionValue(b13, "toByteArray(...)");
            return b13;
        } catch (IOException e13) {
            Intrinsics.checkNotNullParameter("Cannot read bytes.", "message");
            throw new CorruptionException("Cannot read bytes.", e13);
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        outputStream.write((byte[]) obj);
        return Unit.f80348a;
    }
}

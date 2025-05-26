package ads_mobile_sdk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qv0 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public static final qv0 f10290a = new qv0();

    /* renamed from: b, reason: collision with root package name */
    public static final kv0 f10291b = kv0.s();

    @Override // a6.l
    public final Object getDefaultValue() {
        return f10291b;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            kv0 a13 = kv0.a(inputStream);
            Intrinsics.f(a13);
            return a13;
        } catch (Exception unused) {
            gk0.d("Stored data has been corrupted", null);
            kv0 kv0Var = f10291b;
            Intrinsics.f(kv0Var);
            return kv0Var;
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((kv0) obj).a(outputStream);
        return Unit.f80348a;
    }
}

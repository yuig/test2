package ads_mobile_sdk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hh1 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public static final hh1 f5974a = new hh1();

    /* renamed from: b, reason: collision with root package name */
    public static final ug1 f5975b = ug1.t();

    @Override // a6.l
    public final Object getDefaultValue() {
        return f5975b;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            ug1 a13 = ug1.a(inputStream);
            Intrinsics.f(a13);
            return a13;
        } catch (Exception e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Stored data has been corrupted: " + e13, null);
            ug1 ug1Var = f5975b;
            Intrinsics.f(ug1Var);
            return ug1Var;
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((ug1) obj).a(outputStream);
        return Unit.f80348a;
    }
}

package ads_mobile_sdk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class be2 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public static final be2 f2865a = new be2();

    /* renamed from: b, reason: collision with root package name */
    public static final ae2 f2866b = ae2.s();

    @Override // a6.l
    public final Object getDefaultValue() {
        return f2866b;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            ae2 a13 = ae2.a(inputStream);
            Intrinsics.f(a13);
            return a13;
        } catch (Exception e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Stored data has been corrupted: " + e13, null);
            ae2 ae2Var = f2866b;
            Intrinsics.f(ae2Var);
            return ae2Var;
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((ae2) obj).a(outputStream);
        return Unit.f80348a;
    }
}

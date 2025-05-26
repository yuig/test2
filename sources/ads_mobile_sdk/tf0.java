package ads_mobile_sdk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tf0 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public static final tf0 f11526a = new tf0();

    /* renamed from: b, reason: collision with root package name */
    public static final sf0 f11527b = sf0.t();

    @Override // a6.l
    public final Object getDefaultValue() {
        return f11527b;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            sf0 a13 = sf0.a(inputStream);
            Intrinsics.f(a13);
            return a13;
        } catch (Exception e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Stored data has been corrupted: " + e13, null);
            sf0 sf0Var = f11527b;
            Intrinsics.f(sf0Var);
            return sf0Var;
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((sf0) obj).a(outputStream);
        return Unit.f80348a;
    }
}

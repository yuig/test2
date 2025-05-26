package ads_mobile_sdk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qf implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public static final qf f10061a = new qf();

    /* renamed from: b, reason: collision with root package name */
    public static final gf f10062b = gf.z();

    @Override // a6.l
    public final Object getDefaultValue() {
        return f10062b;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            gf a13 = gf.a(inputStream);
            Intrinsics.f(a13);
            return a13;
        } catch (Exception e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Stored data has been corrupted: " + e13, null);
            gf gfVar = f10062b;
            Intrinsics.f(gfVar);
            return gfVar;
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((gf) obj).a(outputStream);
        return Unit.f80348a;
    }
}

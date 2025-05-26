package ads_mobile_sdk;

import a.ta;
import androidx.datastore.core.CorruptionException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q50 implements a6.l {

    /* renamed from: a, reason: collision with root package name */
    public final a.xe f9946a;

    /* renamed from: b, reason: collision with root package name */
    public final jc0 f9947b;

    public q50(x12 x12Var) {
        this.f9946a = x12Var;
        jc0 a13 = jc0.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getEmptyRegistry(...)");
        this.f9947b = a13;
    }

    @Override // a6.l
    public final Object getDefaultValue() {
        return this.f9946a;
    }

    @Override // a6.l
    public final Object readFrom(InputStream inputStream, bl2.c cVar) {
        try {
            ta taVar = (ta) ((sj0) this.f9946a).a(7, (sj0) null);
            jc0 jc0Var = this.f9947b;
            rj0 rj0Var = (rj0) taVar;
            rj0Var.getClass();
            io a13 = io.a(inputStream);
            sj0 a14 = sj0.a(rj0Var.f10659a, a13, jc0Var);
            a13.a(0);
            if (!sj0.a(a14, true)) {
                throw new e21(new wv2().getMessage());
            }
            Intrinsics.g(a14, "null cannot be cast to non-null type T of com.google.android.libraries.internal.ads.adshield.common.storage.DataStoreStorageDao.Companion.protoSerializer");
            return a14;
        } catch (e21 e13) {
            Intrinsics.checkNotNullParameter("Cannot read proto.", "message");
            throw new CorruptionException("Cannot read proto.", e13);
        }
    }

    @Override // a6.l
    public final Object writeTo(Object obj, OutputStream outputStream, bl2.c cVar) {
        ((g) ((a.xe) obj)).a(outputStream);
        return Unit.f80348a;
    }
}

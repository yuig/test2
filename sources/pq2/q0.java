package pq2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;

/* loaded from: classes2.dex */
public final class q0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f101076c = new q0();

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MultipartBody.Builder builder = x0Var.f101109i;
            builder.getClass();
            Intrinsics.checkNotNullParameter(part, "part");
            builder.f95669c.add(part);
        }
    }
}

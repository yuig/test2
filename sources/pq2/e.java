package pq2;

import kotlin.Unit;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final e f101018a = new e();

    @Override // pq2.p
    public final Object a(Object obj) {
        ((ResponseBody) obj).close();
        return Unit.f80348a;
    }
}

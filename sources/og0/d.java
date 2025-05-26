package og0;

import com.pinterest.error.ServerError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94451i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ServerError f94452j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ServerError serverError, int i13) {
        super(0);
        this.f94451i = i13;
        this.f94452j = serverError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServerError serverError = this.f94452j;
        int i13 = this.f94451i;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return ServerError.a(serverError, false);
    }
}

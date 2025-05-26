package c10;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloHttpException;
import com.apollographql.apollo3.exception.ApolloNetworkException;
import com.apollographql.apollo3.exception.ApolloWebSocketClosedException;
import kl2.l;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24483i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f24484j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(3);
        this.f24483i = i13;
        this.f24484j = dVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i13 = this.f24483i;
        d dVar = this.f24484j;
        str = "";
        switch (i13) {
            case 0:
                ApolloHttpException ex2 = (ApolloHttpException) obj;
                String id3 = (String) obj3;
                Intrinsics.checkNotNullParameter(ex2, "ex");
                Intrinsics.checkNotNullParameter((qz.d) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(id3, "id");
                String message = ex2.getMessage();
                dVar.b(message != null ? message : "", id3, ex2);
                break;
            case 1:
                ApolloNetworkException ex3 = (ApolloNetworkException) obj;
                String id4 = (String) obj3;
                Intrinsics.checkNotNullParameter(ex3, "ex");
                Intrinsics.checkNotNullParameter((qz.d) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(id4, "id");
                String message2 = ex3.getMessage();
                if (message2 == null) {
                    Object obj4 = ex3.f29068a;
                    Throwable th3 = obj4 instanceof Throwable ? (Throwable) obj4 : null;
                    String localizedMessage = th3 != null ? th3.getLocalizedMessage() : null;
                    if (localizedMessage != null) {
                        str = localizedMessage;
                    }
                } else {
                    str = message2;
                }
                dVar.b(str, id4, ex3);
                break;
            case 2:
                ApolloWebSocketClosedException ex4 = (ApolloWebSocketClosedException) obj;
                String id5 = (String) obj3;
                Intrinsics.checkNotNullParameter(ex4, "ex");
                Intrinsics.checkNotNullParameter((qz.d) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(id5, "id");
                String str2 = ex4.f29070b;
                dVar.b(str2 != null ? str2 : "", id5, ex4);
                break;
            default:
                ApolloException ex5 = (ApolloException) obj;
                String id6 = (String) obj3;
                Intrinsics.checkNotNullParameter(ex5, "ex");
                Intrinsics.checkNotNullParameter((qz.d) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(id6, "id");
                String message3 = ex5.getMessage();
                dVar.b(message3 != null ? message3 : "", id6, ex5);
                break;
        }
        return Unit.f80348a;
    }
}

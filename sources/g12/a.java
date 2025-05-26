package g12;

import com.pinterest.api.model.BoardFeed;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63371i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f63372j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f63371i = i13;
        this.f63372j = bVar;
    }

    public final BoardFeed b(List it) {
        int i13 = this.f63371i;
        b bVar = this.f63372j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "boardNameList");
                break;
        }
        return BoardFeed.I(it, bVar.f63377e, (ke0.b) ((bf2.b) bVar.f63380h).get());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63371i) {
        }
        return b((List) obj);
    }
}

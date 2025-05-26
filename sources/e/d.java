package e;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f56670j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f56671k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f56672l = new d(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56673i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f56673i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f56673i) {
            case 0:
                return UUID.randomUUID().toString();
            default:
                return null;
        }
    }
}

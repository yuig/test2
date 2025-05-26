package q91;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f103170j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f103171k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Context context, u uVar, int i13) {
        super(0);
        this.f103169i = i13;
        this.f103170j = context;
        this.f103171k = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103169i;
        Context context = this.f103170j;
        u uVar = this.f103171k;
        switch (i13) {
            case 0:
                return new i(context, new l(uVar, 1));
            default:
                return new g(context, new gv0.b(uVar, 21));
        }
    }
}

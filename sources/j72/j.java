package j72;

import kotlin.jvm.functions.Function0;
import r72.u1;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74878i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1 f74879j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(u1 u1Var, int i13) {
        super(0);
        this.f74878i = i13;
        this.f74879j = u1Var;
    }

    public final String b() {
        int i13 = this.f74878i;
        u1 u1Var = this.f74879j;
        switch (i13) {
            case 0:
                return a.a.j("uploadShuffleAsset(): retrying uploading of ", u1Var.f106669a);
            default:
                return a.a.j("uploadShuffleAssets(): retrying uploading of ", u1Var.f106669a);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f74878i) {
        }
        return b();
    }
}

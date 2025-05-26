package ml1;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f87541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f87542k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f87543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f87544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.q f87545n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, ViewGroup viewGroup, m mVar, com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2, int i13) {
        super(1);
        this.f87540i = i13;
        this.f87541j = uVar;
        this.f87542k = viewGroup;
        this.f87543l = mVar;
        this.f87544m = qVar;
        this.f87545n = qVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.google.firebase.messaging.q qVar = this.f87544m;
        com.google.firebase.messaging.q qVar2 = this.f87545n;
        u uVar = this.f87541j;
        ViewGroup viewGroup = this.f87542k;
        m mVar = this.f87543l;
        int i13 = this.f87540i;
        switch (i13) {
            case 0:
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        u.a(uVar, viewGroup, mVar, qVar, qVar2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        u.a(uVar, viewGroup, mVar, qVar, qVar2);
                        break;
                }
                break;
            default:
                View it2 = (View) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        u.a(uVar, viewGroup, mVar, qVar, qVar2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        u.a(uVar, viewGroup, mVar, qVar, qVar2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}

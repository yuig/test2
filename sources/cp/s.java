package cp;

import kotlin.jvm.internal.Intrinsics;
import lq0.r1;

/* loaded from: classes3.dex */
public final class s implements rb2.r, da2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk1.k f52970b;

    public /* synthetic */ s(wk1.k kVar, int i13) {
        this.f52969a = i13;
        this.f52970b = kVar;
    }

    @Override // rb2.r
    public void l(oo1.a conversation) {
        int i13 = this.f52969a;
        wk1.k kVar = this.f52970b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                rb2.q qVar = ((u) kVar).S0;
                if (qVar != null) {
                    qVar.u2(conversation);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                int i14 = r1.f84415d1;
                ((r1) kVar).getClass();
                break;
        }
    }
}

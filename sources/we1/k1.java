package we1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class k1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re1.e f129451b;

    public /* synthetic */ k1(re1.e eVar, int i13) {
        this.f129450a = i13;
        this.f129451b = eVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f129450a;
        re1.e action = this.f129451b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(action, "$action");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    action.f107576d.invoke();
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(action, "$storyAction");
                Intrinsics.checkNotNullParameter(it, "it");
                action.f107576d.invoke();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(action, "$this_with");
                Intrinsics.checkNotNullParameter(it, "it");
                action.f107576d.invoke();
                break;
            case 3:
                int i14 = w1.f129672g;
                Intrinsics.checkNotNullParameter(action, "$this_with");
                Intrinsics.checkNotNullParameter(it, "it");
                action.f107576d.invoke();
                break;
            default:
                int i15 = w1.f129672g;
                Intrinsics.checkNotNullParameter(action, "$this_with");
                Intrinsics.checkNotNullParameter(it, "it");
                action.f107576d.invoke();
                break;
        }
    }
}

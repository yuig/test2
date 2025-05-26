package o71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l71.s f93231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93232c;

    public /* synthetic */ b(l71.n nVar, String str, int i13) {
        this.f93230a = i13;
        this.f93231b = nVar;
        this.f93232c = str;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f93230a;
        String query = this.f93232c;
        l71.s list = this.f93231b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(list, "$list");
                Intrinsics.checkNotNullParameter(query, "$query");
                rl2.g0.e0(list, query);
                break;
            default:
                Intrinsics.checkNotNullParameter(list, "$list");
                Intrinsics.checkNotNullParameter(query, "$query");
                rl2.g0.e0(list, query);
                break;
        }
    }
}

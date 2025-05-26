package i91;

import android.content.Context;
import h32.f1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class l implements fd1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f71868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f71869b;

    public l(n nVar, Context context) {
        this.f71868a = nVar;
        this.f71869b = context;
    }

    @Override // fd1.c
    public final void cancel() {
        f1 f1Var;
        n nVar = this.f71868a;
        h hVar = nVar.f71877g;
        if (hVar != null) {
            int i13 = i.f71839a[hVar.f71835b.ordinal()];
            if (i13 == 1) {
                f1Var = f1.SHARE_SHEET_DOWNLOAD_EXPORT_CANCELLED;
            } else if (i13 == 2) {
                f1Var = f1.SHARE_SHEET_IG_STORIES_EXPORT_CANCELLED;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f1Var = f1.SHARE_SHEET_FB_STORIES_EXPORT_CANCELLED;
            }
            nx.d0.v(nVar.f71878h, f1Var, hVar.f71834a, false, 12);
        }
        nVar.d(this.f71869b, true);
    }
}
